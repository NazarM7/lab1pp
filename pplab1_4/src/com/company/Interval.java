package com.company;

public class Interval {
    private int lower_bound;
    private int upper_bound;
    private int odd_sum, even_sum;

    public int getLower_bound() {
        return lower_bound;
    }

    public int getUpper_bound() {
        return upper_bound;
    }

    public void setLower_bound(int lower_bound) {
        this.lower_bound = lower_bound;
    }

    public void setUpper_bound(int upper_bound) {
        this.upper_bound = upper_bound;
    }

    public void group_and_count(){
        System.out.println();

        //prints odd numbers and counts its sum
        System.out.print("All odd numbers ascending: ");
        int temp=0,first_odd;
        if (lower_bound%2==0)
            first_odd=lower_bound+1;
        else
            first_odd=lower_bound;
        do{
            System.out.print(" " + (first_odd+temp) + " ");
            odd_sum += first_odd+temp;
            temp+=2;
        }while(first_odd+temp<=upper_bound);

        //prints even numbers and counts its sum
        System.out.println();
        System.out.print("All even numbers descending:");
        int last_even;
        if ((temp+first_odd-2) == upper_bound)
            last_even=upper_bound-1;
        else
            last_even=upper_bound;
        temp=0;
        do{
            System.out.print(" " + (last_even-temp) + " ");
            even_sum += last_even-temp;
            temp+=2;
        }while(last_even-temp>=lower_bound);

        System.out.println();
        System.out.println("Sum of odd numbers is: " + odd_sum);
        System.out.println("Sum of even numbers is: " + even_sum);
    }
}
