package com.another;

import com.example.DefaultClass; // This import will cause an error

public class AccessOutsidePackage {
    public static void main(String[] args) {
        // This will cause a compilation error
        // DefaultClass defaultClass = new DefaultClass();
        // defaultClass.display();
        
        System.out.println("Cannot access DefaultClass from a different package");
    }
}
