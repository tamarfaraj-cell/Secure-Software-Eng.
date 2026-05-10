/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.secureproject;
import java.util.Scanner;
/**
 *
 * @author denad
 */
public class SecureProject {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        String username;
        String password;
        while (true) {
            System.out.print("Enter student ID: ");
            username = scan.nextLine();
            if (!username.matches("[0-9]+")) {
                System.out.println("Error: Student ID must only contain numbers");
                continue;
            }
            if (username.length() != 9) {
                System.out.println("Error: Student ID must be 9 digits!");
                continue;
            }
            break;
        }
        while (true) {
            System.out.print("Enter password: ");
            password = scan.nextLine();
            if (password.length() < 8) {
                System.out.println("Error: Password is too short.");
                continue;
            }
            if (password.length() > 20) {
                System.out.println("Error: Password is too long.");
                continue;
            }
            break;
        }
        if (username.contains("'") ||
            username.contains("=") ||
            password.contains("'") ||
            password.contains("=")) {
            System.out.println("Error: Possible SQL injection detected.");
            return;
        }
        if (
    (username.equals("202300112") && password.equals("12345678!")) ||
    (username.equals("202301258") && password.equals("clouds@22")) ||
    (username.equals("202201658") && password.equals("cherry50")) ||
    (username.equals("202478939") && password.equals("password!")) ||
    (username.equals("202308356") && password.equals("pass2424"))
   ) {
    System.out.println("Login successful!");
} else {
    System.out.println("Error: Invalid username or password.");
        }
        scan.close();
    }
}
