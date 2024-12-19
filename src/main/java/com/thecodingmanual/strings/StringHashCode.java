package com.thecodingmanual.strings;

public class StringHashCode {

  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "Hello";
    String s3 = new String("Hello");
    if(s1.hashCode() == s2.hashCode() && s2.hashCode() == s3.hashCode() && s1.hashCode() == s3.hashCode()) {
      System.out.println("All hashcodes are same");
      // all the hashcodes are same because of content being same and hashcode is generated based
      // on a certain algorithm
    }
    System.out.println("Check");
    System.out.println(s1 == s3); // False S3 is created in Heap memory not in String Pool
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s3.hashCode());
    System.out.println(s1.equals(s2));
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s3));
    System.out.println(s1 == s3);
  }
}
