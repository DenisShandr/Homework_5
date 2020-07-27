package com.academy;

public class MainApp {

    public static void main(String[] args) {
        OuterClass<String> objectOfOuterClass = new OuterClass<>("Outer class");
        OuterClass<Integer> objectOfOuterClass2 = new OuterClass<>("Outer class 2");

        objectOfOuterClass.setId("ID field");
        objectOfOuterClass2.setId(1234567);

        System.out.println(objectOfOuterClass);
        System.out.println(objectOfOuterClass2);
        objectOfOuterClass.outerMethod();
        objectOfOuterClass.outerInnerMethod();

        objectOfOuterClass.genericMethod("New ID");
        objectOfOuterClass2.genericMethod(7654321);

    }
}
