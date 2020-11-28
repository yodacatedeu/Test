/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aron
 */
//import java.util.Scanner;
//import java.util.stream.*;
//import java.util.*;
import java.util.ArrayList; 
import java.util.Arrays; 
import java.util.List; 
import java.util.stream.Collectors; 
import static java.util.stream.Collectors.toList;
      
public class app {
    public static void main(String [] args) {
        
        List<Integer> L = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> sqr = L.stream().map( x -> x*x).collect(Collectors.toList());
        List<Integer> dbl = L.stream().map( x -> 2*x).collect(Collectors.toList());
        
        System.out.println("Original list L: " + L);
        System.out.println("Squares of L: " + sqr);
        System.out.println("Doubles of L: " + dbl);


        

//        int [] x;
//        Scanner reader = new Scanner(System.in);
//        
//        System.out.println("Enter size: ");
//        int size = reader.nextInt();
//        
//        x = new int[size];
//        
//        System.out.println("Enter " + size + " numbers: ");
//        for (int i = 0; i < size; i++)
//            x[i] = reader.nextInt();
//        System.out.println();
//        
//        
//        System.out.println("Main before func");
//        for (int a : x)
//            System.out.print(a + " ");
//        System.out.println("\n");
//        
//        reverse(x, 0, x.length-1);
//        System.out.println("Main after func");
//        for (int a : x)
//            System.out.print(a + " ");
//        System.out.println("");
        
        
    }
    
    public static void reverse(int [] x, int index1, int index2) {
        // At first call from main, index 1 should be 0, and index 2 should be x.length-1
        if (index1 != index2 && index1 < index2) {
            int temp = x[index1];
            x[index1] = x[index2];
            x[index2] = temp;
            //System.out.println("Step " + index1 + " " + index2);
            //for (int a : x)
            //    System.out.print(a + " ");
            //System.out.println("\n");
            reverse(x, index1+1, index2-1);
        }
    }
}
