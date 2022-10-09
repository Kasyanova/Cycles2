/*Напишите программу, где пользователь вводит любое целое положительное число n. А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
 */

package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число n");
        int num = in.nextInt();
        int sum = 0; //вспомогательная переменная для результата

        //прибавить к sum все значения, где остаток от деления на 2 отсутствует, т.е нечетные
        for (int i=1;i<num;i++){
            if (i%2!=0) {
                sum = sum+i;
            }
        }

        System.out.println(sum);
    }
}