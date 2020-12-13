package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Nhập vào độ dài mảng: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
//        System.out.println("Nhập vào các value trong mảng");
//        for (int i = 0; i<N;i++){
//            arr[i]= sc.nextInt();
//        }
        System.out.println("Nhập vào giá trị cần chèn:");
        int X = sc.nextInt();
        int index;
        do {
            System.out.println("Nhập vào vị trí cần thay đổi: ");
            index = sc.nextInt();
            if (index < 1 || index > arr.length) {
                System.out.println("Không chèn được phần tử vào mảng.");
            }
        } while (index < 1 || index > arr.length);

        for (int i = 0; i < arr.length; i++) {
            if (index == i) {
                for (int j = arr.length - 1; j > index; j--) {
                    arr[arr.length - 1] = arr[arr.length - 2];
                    arr[index] = X;
                }
            }
            System.out.print(arr[i] + " ");

        }
    }
}

