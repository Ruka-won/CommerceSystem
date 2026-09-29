package com.example.commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommerceSystem {

    //속성
    //접근제어자 데이터타입 변수명
    private List<Product> products; // 300층
    //생성자
    public CommerceSystem(List<Product> products) { // 200층 받기
        this.products = products; // 200층을 300층에 넣기
    }

    //기능
    public void start() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("[ 🖥️실시간 커머스 플랫폼 - 전자제품 ]");

            for (int i = 0; i < products.size(); i++ ) {
                Product p = products.get(i);
                System.out.printf("%d. %-15s | %,10d원 | %s%n",
                        (i + 1), p.getName(), p.getPrice(), p.getExplain());


            }
            System.out.println("0. 종료            | 🛑 프로그램 종료");
            System.out.print("숫자 입력: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("🛑 커머스 플랫폼을 종료합니다.");
                break;

            } else if (choice >= 1 && choice <= products.size() ) {
                Product productSelect = products.get(choice-1);
                System.out.println("\n[ ✅ 선택한 상품 정보 ]");
                System.out.printf("상품명 : %s%n가  격 : %,d원%n설  명 : %s%n\n",
                        productSelect.getName(), productSelect.getPrice(),
                        productSelect.getExplain());

            } else {
                System.out.println("❌ 잘못된 값을 입력하였습니다.\n");
            }

        }
        scanner.close();



    }
}
