package com.company.files;

public class Directory {

    private String directory;

    public Directory() {
        directory = "null";
    }

    public Directory(String directory) {
        this.directory = directory;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "directory='" + directory + '\'' +
                '}';
    }
}
