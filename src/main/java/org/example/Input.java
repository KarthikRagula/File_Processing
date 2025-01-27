package org.example;

public class Input {
    private String path;
    private char ch;

    public Input(String path){
        this.path=path;
    }
    public Input(String path, char ch){
        this.path=path;
        this.ch=ch;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }
}
