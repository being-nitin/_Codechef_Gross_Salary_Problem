package com.codechef;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* In a company an employee is paid as under: If his basic salary is less than Rs. 1500,
	   then HRA = 10% of base salary and DA = 90% of basic salary.
       If his salary is either equal to or above Rs. 1500, then HRA = Rs. 500 and DA = 98% of
       basic salary. If the Employee's salary is input, write a program to find his gross salary.

       NOTE: Gross Salary = Basic Salary + HRA + DA

       Input
       The first line contains an integer T, total number of testcases. Then follow T lines, each line contains
       an integer salary.

       Output
       For each test case, output the gross salary of the employee in a new line. Your answer will be considered
       correct if the absolute error is less than 10-2.

       Constraints
       1 ≤ T ≤ 1000
       1 ≤ salary ≤ 100000
       Example
       Input
       3
       1203
       10042
       1312

       Output
       2406.00
       20383.16
       2624
                   */
    Scanner sc = new Scanner(System.in);
    int t,n;
    double grossSalary;
    t = sc.nextInt();
    while(t-->0){
        n = sc.nextInt();
        if(n<1500){
            grossSalary = (n + 0.1*n + 0.9*n);
            System.out.println(grossSalary);
        }
        else if(n>=1500){
            grossSalary = (n + 500 +0.98*n);
            System.out.println(grossSalary);
        }
    }
    }
}
