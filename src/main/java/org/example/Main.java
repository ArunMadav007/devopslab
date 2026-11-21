package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Amount in INR:");
        int a=s.nextInt();
        int b=a*98;
        System.out.print("USD for given INR: "+b+"$");

    }
}