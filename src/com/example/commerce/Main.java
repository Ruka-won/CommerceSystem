package com.example.commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//프로그램에 필요한 객체 생성 역할
public class Main {
    public static void main(String[] args) {
        //main 함수에서 Product 클래스 객체를 생성하여 상품 목록 추가한다. `new`
        //new 생성자를 통해서 객체를 만들었기에 Heap 영역에 주소값으로 저장된다.
        // 1. 전자제품 카테고리와 들어갈 상품 생성
        //List 선언하여 여러 electronicsList 저장 / 상품데이터를 표현해주는 객체 리스트 생성 (Product)
        List<Product> electronicsList = new ArrayList<>(); // 100층 (add해서 - [101,102,103,104] )
        electronicsList.add(new Product("Galaxy S25", 1200000, "최신 안드로이드 스마트폰",50)); // 101층
        electronicsList.add(new Product("iPhone 16", 1350000, "Apple의 최신 스마트폰",50)); // 102층
        electronicsList.add(new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북",50)); // 103층
        electronicsList.add(new Product("Airpods Pro", 350000, "노이즈 캔슬링 무선 이어폰",50)); // 104층


        // 2. 의류 카테고리와 들어갈 상품 생성
        List<Product> clothingList = new ArrayList<>(); // 200층[201,202,203,204]
        clothingList.add(new Product("청바지", 50000, "편안한 데님팬츠", 50));
        clothingList.add(new Product("정장바지", 70000, "깔끔한 슬랙스", 50));
        clothingList.add(new Product("반바지", 35000, "시원한 반바지", 50));
        clothingList.add(new Product("티셔츠", 25000, "시원한 여름티셔츠", 50));

        // 3. 식품 카데고리와 들어갈 상품 생성
        List<Product> foodList = new ArrayList<>(); // 300층[301,302,303,304]
        foodList.add(new Product("피자",36000,"도미노 피자",20));
        foodList.add(new Product("치킨",28000,"BBQ 치킨",20));
        foodList.add(new Product("떡볶이",25000,"엽기 떡볶이",20));
        foodList.add(new Product("햄버거",15000,"맥도날드",20));

        // 4. 전체 카테고리 모음
        // 종류 데이터를 표현해주는 categoryList 생성
        List<Category> categoryList = new ArrayList<>(); // 400층 [100,200,300]
        categoryList.add(new Category("전자제품", electronicsList));
        categoryList.add(new Category("의류", clothingList));
        categoryList.add(new Category("식품", foodList));

        //프로그램 흐름 제어를 위한 객체 생성
        CommerceSystem system = new CommerceSystem(categoryList); // 400[100,200,300] 전달한다.
        system.start(); // 기능 호출




    }
}
