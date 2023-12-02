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
public class Assignment14 {
    public static void main(String[] args) {
        String id;
        String title;
        double price;
        String description;
        String category;
        
        Scanner inputId=new Scanner(System.in);
        System.out.print("Enter product id: ");
        id=inputId.nextLine();
        
        Scanner inputTitle=new Scanner(System.in);
        System.out.print("Enter product title: ");
        title=inputTitle.nextLine();
        
        Scanner inputPrice=new Scanner(System.in);
        System.out.print("Enter product price: ");
        price =inputPrice.nextDouble();
        
        Scanner inputDesc=new Scanner(System.in);
        System.out.print("Enter product description here: ");
        description=inputDesc.nextLine();
        
        Scanner inputCate=new Scanner(System.in);
        System.out.print("Enter product category here: ");
        category=inputCate.nextLine();
        
        System.out.println("Product Id: "+id);
        System.out.println("Product title: "+title);
        System.out.println("Product description: "+description);
        System.out.println("Product category: "+category);
    }
}
