/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author kumar
 */
public class Add
   {
    public static void main(String[] args) {
               
        Scanner n1=new Scanner(System.in);
        System.out.println("Enter First no. ");
        int a=n1.nextInt();
        
        Scanner n2=new Scanner(System.in);
        System.out.println("Enter Second NO. ");
        int b=n2.nextInt();
        
        a=a+b;
        System.out.println("The sum of the given numbers are "+a);        
        
    }
    
    
   }
