package com.company.files;

public class Directory {

    private String directory;

    //constructor
    public Directory() {
        directory = "null";
    }

    //constructor
    public Directory(String directory) {
        this.directory = directory;
    }

    //to string
    @Override
    public String toString() {
        return "Directory{" +
                "directory='" + directory + '\'' +
                '}';
    }

}
