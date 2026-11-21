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
        int c=a*100;
        int d=a*18;
        System.out.println("USD for given INR: "+b+"$");
        System.out.println("Euro for given INR: "+c);
        System.out.println("Dinar for given INR: "+d);

    }
}