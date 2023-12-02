/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javabasic;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class UserInputString13 {
    public static void main(String[] args) {
        String name;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name: ");
//        nextLine keywords ignore space and give real output what user give
        name=input.nextLine();
        System.out.println("your name is:"+name);
    }
}
