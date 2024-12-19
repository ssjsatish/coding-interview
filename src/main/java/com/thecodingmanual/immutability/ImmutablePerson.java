package com.thecodingmanual.immutability;

import java.util.Collections;
import java.util.List;

public final class ImmutablePerson {
  private final String name;
  private final int age;
  private final List<String> hobbies;

  public ImmutablePerson(String name, int age, List<String> hobbies) {
    this.name = name;
    this.age = age;
    this.hobbies = hobbies;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public List<String> getHobbies() {
    return Collections.unmodifiableList(hobbies);
  }

  @Override
  public String toString() {
    return "ImmutablePerson{name='" + name + "', age=" + age + ", hobbies=" + hobbies + "}";
  }
}
