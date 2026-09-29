package com.example.commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //main 함수에서 Product 클래스 객체를 생성하여 상품 목록 추가한다. `new`
        //new 생성자를 통해서 객체를 만들었기에 Heap 영역에 주소값으로 저장된다.
        Product productA = new Product("Galaxy S25", 1200000, "최신 안드로이드 스마트폰",50);
        Product productB = new Product("iPhone 16", 1350000, "Apple의 최신 스마트폰",50);
        Product productC = new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북",50);
        Product productD = new Product("Airpods Pro", 350000, "노이즈 캔슬링 무선 이어폰",50);

        //List 선언하여 여러 Product 저장 `.add()`
        //ArrayList 동적 배열 생성
        List<Product> products = new ArrayList<>(); // 200층 (add해서 - [101,102,103,104] )
        products.add(productA); // 101층
        products.add(productB); // 102층
        products.add(productC); // 103층
        products.add(productD); // 104층

        CommerceSystem system = new CommerceSystem(products); // 200층 보내기

        system.start();


        // ✅ STEP 1. 객체지향 설계를 적용해 상품관리 프로그래밍 과제 구현 부분 ⬇️

//        Scanner scanner = new Scanner(System.in); // 프로그램 종료 받기위해 미리 선언
//        while (true) {
//            System.out.println("[ 🖥️실시간 커머스 플랫폼 - 전자제품 ]");
//            int i = 1; // 상품 번호 매기기
//            //반복 사용해서 Product 상품 조회
//            // p <- products[101,102,103,104] [0][1][2][3] 하나씩 담는다.
////                String namebox = p.getName();// 101.getName와 같은 것. getName반환 됐어? namebox에 넣어.
////                int pricebox = p.getPrice();
////                String explainbox = p.getExplain();
////                System.out.println(i +  ". " + namebox + "|" + pricebox + "|" + explainbox); // 박스에 담았으면 출력해.
//            for (Product p : products) {
//                System.out.printf("%d. %-15s | %,10d원 | %s%n",
//                        i, p.getName(), p.getPrice(), p.getExplain());
//                i++;
//
//            }
//            System.out.println("0. 종료      | 🛑 프로그램 종료");
//            System.out.print("숫자 입력: ");
//            int choice = scanner.nextInt(); // 숫자 0 입력 시 종료.
//
//            if (choice == 0) {
//                System.out.println("🛑 커머스 플랫폼을 종료합니다.");
//                break;
//
//            } else if (choice >= 1 && choice <= products.size() ) { //product size 배열 크기[4]
//                Product productSelect = products.get(choice-1); // 선택한 상품 조회
//                System.out.println("\n[ ✅ 선택한 상품 정보 ]");
//                System.out.printf("상품명 : %s%n", productSelect.getName()); // 박스에 담지않고 바로 반환받기
//                System.out.printf("가  격 : %,d원%n", productSelect.getPrice());
//                System.out.printf("설  명 : %s%n\n", productSelect.getExplain());
//
//            } else {
//                System.out.println("❌ 잘못된 값을 입력하였습니다.\n"); // 예외처리






    }
}
