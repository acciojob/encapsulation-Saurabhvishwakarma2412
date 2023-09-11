package com.driver;

public class Main {
  public  static void main(String[] args) {
      RWOnly obj=new RWOnly();
     // obj.name="Saurabh";
    //  System.out.println(obj.name);
      obj.setter("saurabh");
      String ans=obj.getter();
      System.out.println(ans);
  }
}