package com.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Project_4 {
 public static List<Integer> generateSeries(int a) {
		        List<Integer> output = new ArrayList<>();
		        int currentNumber = 1;

		        while (currentNumber <= a) {
		            output.add(currentNumber);
		            currentNumber += 2;
		        }

		        return output;
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the value of 'a': ");
		        int a = scanner.nextInt();
		        System.out.println(generateSeries(a));
		    }
		}


