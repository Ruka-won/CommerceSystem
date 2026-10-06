package com.example.commerce;

public class Customer {


    //속성
    private String name;
    private String email;
    private String tier;

    //생성자
    public Customer(String name, String email, String tier) {
        this.name = name;
        this.email = email;
        this.tier = tier;
    }

    //기능
    //고객 이름 조회
    public String getName() {
        return this.name;

    }
    //고객 이메일 조회
    public String getEmail() {
        return this.email;
    }


    //고객 등급 조회
    public String getTier() {
        return this.tier;
    }
}
