package com.domain;

import java.util.Scanner;

public class Project_2 {

		 	public static void main(String[] args) {
		 int num;  
		 Scanner sc=new Scanner(System.in);  
		 System.out.print("How many first odd numbers you want: ");  
		 num = sc.nextInt();    
		 		System.out.println("The First  Odd Natural Numbers are");
		 		for(int i = 1; i <= num; i++) 
		 		{
		 			System.out.println(2 * i - 1);
		 		}
		 	}

	}


