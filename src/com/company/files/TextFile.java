package com.company.files;

public class TextFile extends File {

    private String content;

    public TextFile() {
        super();
        content = "startContent";
    }

    public TextFile(String name, Directory directory, String content) {
        super(name, directory);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void create(String name, Directory directory) {
        this.setName(name + ".txt");
        this.setDirectory(directory);
    }

    @Override
    public void rename(String newName) {
        super.rename(newName + ".txt");
    }

    @Override
    public void delete() {
        super.delete();
        content = "deletedContent";
    }

    public void printContent(){
        System.out.println(content);
    }

    public void addContent(String add){
        content = content + " " + add;
    }

}
