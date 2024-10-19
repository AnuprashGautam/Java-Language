package com.example;

public class AccessWithinPackage {
    public static void main(String[] args) {
        DefaultClass defaultClass = new DefaultClass();
        defaultClass.display(); // This will work as it's within the same package
    }
}
