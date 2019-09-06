package com.company.files;

public class TextFile extends File {

    private String content;

    @Override
    public void create() {

    }

    @Override
    public void rename() {

    }

    @Override
    public void delete() {

    }

    public void printContent(){
        System.out.println(content);
    }

    public void addContent(String add){
        content = content + " " + add;
    }
}
