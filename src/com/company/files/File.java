package com.company.files;

public class File {

    private String name;
    private Directory directory;

    public File() {
        name = "null";
        directory = new Directory();
    }

    public File(String name, Directory directory) {
        this.name = name;
        this.directory = directory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    public void create(String name, Directory directory){
        this.name = name;
        this.directory = directory;
    }

    public void rename(String newName){
        name = newName;
    }

    public void delete(){
        name = "null";
        directory = new Directory();
    }

}
