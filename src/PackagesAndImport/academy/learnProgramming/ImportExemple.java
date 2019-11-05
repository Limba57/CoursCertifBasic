package PackagesAndImport.academy.learnProgramming;

import PackagesAndImport.a.b.c.d.*; // import all the classes in d package

import java.util.Random;

import java.lang.System; //redondant, java.lang is always import by default

public class ImportExemple {


    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(5));
        MyClass myClass = new MyClass();
        ExempleClass exempleClass = new ExempleClass();

    }

}
