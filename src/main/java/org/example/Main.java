package org.example;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String memberstat;
        int age;
        double price = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter membership status (Regular, VIP, Premium): ");
        memberstat = sc.next().toLowerCase();
        System.out.print("Enter age: ");
        age = sc.nextInt();

        String status = "";
        switch (memberstat){
            case "regular" : {
                if (age <= 17){
                    price = 50;
                }else if (age <= 64){
                    price = 100;
                }else {
                    price = 75;
                }
            }
            break;
            case "vip": {
                if (age <= 17){
                    price = 75;
                }else if (age <= 64){
                    price = 150;
                }else {
                    price = 112.5;
                }
            }
            break;
            case "premium": {
                if (age <= 17){
                    price = 100;
                }else if (age <= 64){
                    price = 200;
                }else {
                    price = 150;
                }
            }
            break;
            default:
                System.out.println("Invalid membership status entered.");
        }
        System.out.printf("Price: $%.2f", price);
    }
}