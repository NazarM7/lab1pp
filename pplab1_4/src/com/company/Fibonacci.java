package com.company;

public class Fibonacci {
    private int first_n;
    private int second_n;
    private int size;
    private int odd_sum=1;
    private int even_sum=1;


    public int getFirst_n() {
        return first_n;
    }

    public int getSecond_n() {
        return second_n;
    }

    public int getSize() {
        return size;
    }

    public void setFirst_n(int first_n) {
        this.first_n = first_n;
    }

    public void setSecond_n(int second_n) {
        this.second_n = second_n;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void print_count_fibonacci(){
        System.out.print(" " +this.first_n);
        System.out.print(" " +this.second_n);
        int sum=0, first_temp=0, second_temp;
        for(int i=2;i < this.size;i++) {
            if (i==2) {
                sum = this.first_n + this.second_n;
                first_temp = this.second_n;
            } else {
                sum = first_temp + sum;
                first_temp = sum;
            }

            if(sum %2 == 1)
                even_sum++;
            else
                odd_sum++;

            System.out.print(" " + sum);
        }
    }

    public void probability(){
        System.out.println("\nThe Fibonacci row has " + ((double)(even_sum * 100)/size) + "% of even numbers");
        System.out.println("The Fibonacci row has "  +((double)(odd_sum * 100)/size) + "% of odd numbers");
    }
}
