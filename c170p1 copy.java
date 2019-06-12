
//  Name: Nick Rentschler
// Class: CS 170
//  Prog: One
//  Date: 01/31/2017


import java.util.*;
class c170p1 {
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
        
        while(temp>=0 && temp <= 100 && i< SIZE){
           exam[i] = temp;
           i++;
           sum = sum + temp;
           System.out.print("Enter the exam score: ");
           temp = scanner.nextInt();
        }
        
        System.out.println();
        n=i;
        
        if(i>1){
            average = (double)sum / i;
            if(average <70)
                curve = 70 - (int)average;
        }
        
        System.out.println("The average exam score is " + average);
        System.out.println("The curve is " + curve);
        System.out.println();
        System.out.println("CURVED");
        System.out.println("SCORES");
        System.out.println();
        
        for(i=0;i<n;i++)
                    System.out.println((exam[i] + (int)curve));
    }
}
         
       
