package com.thecodingmanual.immutability;

import java.util.Arrays;
import java.util.List;

public class TestImmutable {

  public static void main(String[] args) {
    ImmutablePerson person = new ImmutablePerson("Satish Patel", 35, Arrays.asList("Reading", "Coding", "Singing", "Cooking"));
    List<String> hobbies = person.getHobbies();
    try {
      hobbies.add("Teaching");
    } catch (UnsupportedOperationException e) {
      System.out.println("Hobbies list is immutable");
    }
    System.out.println(person);
  }


}
