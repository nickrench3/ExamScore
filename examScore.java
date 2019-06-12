//  This program will have the user enter test scores until a -1 is entered, and then give the average score of the exams. 
//  The curve score of the exams is given is average is below 70..
//  Name: Nick Rentschler
//  Date: 06/12/2019


import java.util.*;
class examScore {
    public static void main (String [] args) {
        Scanner scanner;
        scanner = new Scanner (System.in);
        
        final int SIZE=10;
        int i,n,temp,sum;
        double average=0.0, curve=0.0;
        
        int[] exam;
        exam = new int [SIZE];
        
        System.out.print("Enter the exam score: ");
        temp = scanner.nextInt();
        
        i=0;
        sum=0;
        
        while(temp >= 0 && temp <= 100 && i < SIZE){
           exam[i] = temp;
           i++;
           sum = sum + temp;
           System.out.print("Enter the exam score: ");
           temp = scanner.nextInt();
        }
        
        System.out.println();
        n=i;
        
        if(i > 1){
            average = (double)sum / i;
            if(average < 70)
                curve = 70 - (int)average;
        }
        
        System.out.println("The average exam score is " + average);
        System.out.println("The curve is " + curve);
        System.out.println();
        System.out.println("CURVED");
        System.out.println("SCORES");
        System.out.println();
        
        for(i=0; i<n; i++)
                    System.out.println((exam[i] + (int)curve));
    }
}
         
  