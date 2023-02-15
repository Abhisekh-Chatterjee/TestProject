package com.test.test;
public class Child extends Parent{
public Child() {
System.out.println("Child Class");
}
public static void main(String[] args) {
Parent c1=new Child();
}
}

abstract class Parent{
public Parent() {
System.out.println("Parent Class");
}
}