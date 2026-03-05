package Cau2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi: ");
        String n = sc.nextLine();
        cau2Map map = new cau2Map(n);
        if (!map.isValid()) {
            System.out.println("Chuỗi không được để trống");
            return;
        }
        map.process();
        map.display();
    }
}
