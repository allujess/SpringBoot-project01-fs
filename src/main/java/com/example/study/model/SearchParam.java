package com.example.study.model;

public class SearchParam {

    private String account;
    private String email;
    private int page;

    //{"account" :"","email" :"","page" :""}

    //해당 파라미터를 받기위해서는 생성자와 getter/setter를 받아야함
    //code > generate > Getter and Setter

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
