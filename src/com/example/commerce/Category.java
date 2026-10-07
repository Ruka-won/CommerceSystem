package com.example.commerce;

import java.util.List;

//종류(카테고리) 데이터를 표현해주는 역할
public class  Category {

    //속성
    private String name; // 1. 카테고리 이름
    private List<Product> products; // 2. 제품 관리 리스트

    //생성자
    public Category(String name, List<Product> products) { // 카테고리명과 제품 리스트 받아오기
        this.name = name;
        this.products = products;
    }

    //기능
    public String getName() {
        return this.name;
    }

    //복제본 방법 : 원본 유지 ( return List.copyOf(this.products); )
    public List<Product> getProducts() {
        return this.products;
    }










}
