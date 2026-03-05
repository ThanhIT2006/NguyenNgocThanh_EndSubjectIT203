package Cau3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi:");
        String n = sc.nextLine();
        cau3Stack stack = new cau3Stack();
        if (stack.isValid(n)) {
            System.out.println("Chuỗi hợp lệ");
        } else {
            System.out.println("Chuỗi không được để trống");
        }
    }
}
