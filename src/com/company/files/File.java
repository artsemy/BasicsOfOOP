package com.company.files;

public class File {

    private String name;
    private Directory directory;

    //constructor
    public File() {
        name = "null";
        directory = new Directory();
    }

    //constructor
    public File(String name, Directory directory) {
        this.name = name;
        this.directory = directory;
    }

    //get method
    public String getName() {
        return name;
    }

    //set method
    public void setName(String name) {
        this.name = name;
    }

    //get method
    public Directory getDirectory() {
        return directory;
    }

    //set method
    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    //create
    public void create(String name, Directory directory){
        this.name = name;
        this.directory = directory;
    }

    //rename
    public void rename(String newName){
        name = newName;
    }

    //delete
    public void delete(){
        name = "null";
        directory = new Directory();
    }

}
