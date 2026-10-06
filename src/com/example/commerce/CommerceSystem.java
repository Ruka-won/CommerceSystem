package com.example.commerce;

import java.util.List;
import java.util.Scanner;

//프로그램 흐름 제어 역할
public class CommerceSystem {

    //속성 (접근제어자 데이터타입 변수명)
    private List<Category> categoryList; // 400층 저장
    private Scanner scanner;

    //생성자
    public CommerceSystem(List<Category> categoryList) { // 400층 받기
        this.categoryList = categoryList;// 400층 넣기
        this.scanner = new Scanner(System.in);
    }


    //기능
    //1. 메인 화면 출력
    public void start() {
        while (true) {
            //1.1 메인 카테고리 출력
            System.out.println("[ 🖥️ 실시간 커머스 플랫폼 메인 ]");
            for (int i = 0; i < categoryList.size(); i++) { // 400[100,200,300] = 400[전자,의류,식품]
                Category category = categoryList.get(i); //전자, 의류, 식품
                System.out.printf("%d. %s%n", (i + 1), category.getName());
            }
            System.out.println("0. 종료            | 🛑 프로그램 종료");
            System.out.print("숫자 입력: ");

            // 입력 받기
            int choice = scanner.nextInt();

            // 종료 처리
            if (choice == 0) {
                System.out.println("🛑 커머스 플랫폼을 종료합니다.");
                break;
            }

            // 잘못된 입력 처리
            if (choice < 1 || choice > categoryList.size()) {
                System.out.println("❌ 잘못된 값을 입력하였습니다.\n");
                continue;
            }

            // 1.2 선택된 카테고리로 상세 처리 이동
            Category selectedCategory = categoryList.get(choice - 1); // 400[100,200,300]
            handleCategoryMenu(selectedCategory); // 100,200,300 중 전달
        }
    }

    // 2. 선택된 카테고리 내부 상품 목록
    private void handleCategoryMenu(Category category) {
        List<Product> products = category.getProducts(); // 100,200,300 (전자,의류,식품) 상품 데이터 표현을 위한 저장

        while (true) {
            // 2.1 상품 목록 화면 출력
            System.out.println("\n[ 📦 " + category.getName() + " 카테고리 상품 목록 ]"); //100[Galaxy, iPhone 등)
            for (int i = 0; i < products.size(); i++) {
                Product product = products.get(i);
                System.out.printf("%d. %-15s | %,10d원 | %s%n",
                        (i + 1), product.getName(), product.getPrice(), product.getExplain());
            }
            System.out.println("0. 🔙뒤로가기");
            System.out.print("숫자 입력: ");

            int backChoice = scanner.nextInt();

            // 뒤로가기 (메인으로 복귀)
            if (backChoice == 0) {
                System.out.println("메인 메뉴로 돌아갑니다.\n");
                break;
            }

            // 잘못된 입력 처리
            if (backChoice < 1 || backChoice > products.size()) {
                System.out.println("❌ 잘못된 값을 입력하였습니다.\n");
                continue;
            }

            // 2.2 선택한 상품 상세 정보 출력
            Product selectedProduct = products.get(backChoice - 1);
            System.out.println("\n[ ✅ 선택한 상품 정보 ]");
            System.out.printf("상품명 : %s%n", selectedProduct.getName());
            System.out.printf("가  격 : %,d원%n", selectedProduct.getPrice());
            System.out.printf("설  명 : %s%n\n", selectedProduct.getExplain());
        }
    }
}




//    //기능 [코드 깊이 문제로 리팩토링 하기 전]
//    //1. 메인 실행
//    public void start() {
//        while (true)
//            System.out.println("[ 🖥️실시간 커머스 플랫폼 메인 ]");
//            for (int i = 0; i < categoryList.size(); i++) { // 400층[100,200,300] - 전자, 의류, 식품
//                Category category = categoryList.get(i); // 각각 100,200,300을 넣기.
//                System.out.printf("%d. %s%n", (i + 1), category.getName()); // 카테고리 항목 출력
//
//            }
//            System.out.println("0. 종료            | 🛑 프로그램 종료");
//            System.out.print("숫자 입력: ");
//            int choice = scanner.nextInt();
//
//            if (choice == 0) {
//                System.out.println("🛑 커머스 플랫폼을 종료합니다.");
//                break;
//            } else if (choice >= 1 && choice <= categoryList.size()) {
//                // 카테고리 선택 값에 대한 반환 400[100,200,300]
//                Category selectedCategory = categoryList.get(choice - 1);
//                List<Product> products = selectedCategory.getProducts();
//                while (true) {
//                    System.out.println("\n[ 📦 " + selectedCategory.getName() + " 카테고리 상품 목록 ]");
//                    // 100층 넣기 카테고리 클래스에서 제품 클래스로 넣어줘서 각 명칭을 다 불러오기 위함
//
//                    for (int i = 0; i < products.size(); i++) { // 100[101,102,103,104] 각 제품 불러오기
//                        Product product = products.get(i);
//                        System.out.printf("%d. %-15s | %,10d원 | %s%n",
//                                (i + 1), product.getName(), product.getPrice(), product.getExplain());
//                    }
//                    System.out.println("0. 🔙뒤로가기");
//                    System.out.print("숫자 입력: ");
//                    int backChoice = scanner.nextInt();
//
//                    if (backChoice == 0) {
//                        System.out.println("메인 메뉴로 돌아갑니다.\n");
//                        break;
//                    } else if (backChoice >= 1 && backChoice <= products.size()) {
//                        Product product = products.get(backChoice-1);
//                        System.out.println("\n[ ✅ 선택한 상품 정보 ]");
//                        System.out.printf("상품명 : %s%n", product.getName());
//                        System.out.printf("가  격 : %,d원%n", product.getPrice());
//                        System.out.printf("설  명 : %s%n\n", product.getExplain());
//
//                    } else {
//                        System.out.println("❌ 잘못된 값을 입력하였습니다.\n");
//
//                    }
//                }
//
//            } else{
//                System.out.println("❌ 잘못된 값을 입력하였습니다.\n");
//
//
//
//                }
//            }
//        }
//    }
//
//








