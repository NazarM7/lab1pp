package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Interval interval1 = new Interval();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the lower bound please: ");
        int x1 = in.nextInt();

        System.out.print("Enter the upper bound please: ");
        int x2 = in.nextInt();
        interval1.setLower_bound(x1);
        interval1.setUpper_bound(x2);

        interval1.group_and_count();

        System.out.println();
        System.out.print("Enter the length of the fibonacci row: ");
        int length = in.nextInt();
        Fibonacci row = new Fibonacci ();

        //setting
        if (interval1.getUpper_bound()%2==1){
            row.setFirst_n(interval1.getUpper_bound());
            row.setSecond_n(interval1.getUpper_bound()-1);
        }
        else{
            row.setFirst_n(interval1.getUpper_bound()-1);
            row.setSecond_n(interval1.getUpper_bound());
        }
        row.setSize(length);

        row.print_count_fibonacci();
        row.probability();

    }

}

