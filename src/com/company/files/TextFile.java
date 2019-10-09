package com.company.files;

public class TextFile extends File {

    private String content;

    //constructor
    public TextFile() {
        super();
        content = "startContent";
    }

    //constructor
    public TextFile(String name, Directory directory, String content) {
        super(name, directory);
        this.content = content;
    }

    //get method
    public String getContent() {
        return content;
    }

    //set method
    public void setContent(String content) {
        this.content = content;
    }

    //create
    @Override
    public void create(String name, Directory directory) {
        this.setName(name + ".txt");
        this.setDirectory(directory);
    }

    //rename
    @Override
    public void rename(String newName) {
        super.rename(newName + ".txt");
    }

    //delete
    @Override
    public void delete() {
        super.delete();
        content = "deletedContent";
    }

    //print content
    public void printContent(){
        System.out.println(content);
    }

    //add content
    public void addContent(String add){
        content = content + " " + add;
    }

}
