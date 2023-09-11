package com.driver;

public class Main {
  public  static void main(String[] args) {
      RWOnly obj=new RWOnly();
     // obj.name="Saurabh";
    //  System.out.println(obj.name);
      obj.setName("saurabh");
      String ans=obj.getName();
      System.out.println(ans);
  }
}