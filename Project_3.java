package com.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Project_3 {

	
	public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter user value to find odd numbers"); // Replace '6' with the desired value of 'a'
        int a=scan.nextInt();
        List<Integer> series = generateSeries(a);

        System.out.println("Output:");
        for (int num : series) {
            System.out.print(num + " ");
        }
    }

    private static List<Integer> generateSeries(int a) {
        List<Integer> series = new ArrayList<>();
        int number = 1;
        int increment = 2;

        for (int i = 1; i <= a; i++) {
        	if(a%2!=0||i<a) {
        	series.add(number);
             number += increment;
            
        	}
        	

       
    }
		return series;
}
		 
	}

