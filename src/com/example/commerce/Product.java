package com.example.commerce;


//상품 데이터를 표현해주는 역할
public class Product {
    //속성
    //1. 제품에는 이름, 가격, 재고, 설명으로 설정
    //Product(클래스) 통해서 객체 만들거야? 그럼 `이름, 가격, 재고, 설명` 필요해.
    private String name;
    private int price;
    private String explain;
    private int stock;


    //생성자
    //특징. 클래스와 이름이 같음, 반환 타입이 없음, 여러개 존재 가능함.
    //Product(클래스) 통해서 객체 만들거면 `이름, 가격, 재고, 설명` 설정해.
    public Product(String name, int price, String explain, int stock) {
        this.name = name;
        this.price = price;
        this.explain = explain;
        this.stock = stock;

    }


    //기능
    public String getName() {
        //상품 이름 반환
        return this.name;
    }

    public int getPrice() {
        //상품 가격 반환
        return this.price;
    }

    public String getExplain() {
        //상품 설명 반환
        return this.explain;

    }
    //상품 가격 수정
    public void setPrice(int price) {
        this.price = price;

    }
    //상품 이름 수정
    public void setName(String name) {
        this.name = name;

    }
    //상품 설명 수정
    public void setExplain(String explain) {
        this.explain = explain;

    }

}


