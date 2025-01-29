package org.example.CharacterSearch;

public class CharacterInput {
    private String path;
    private char ch;

    public CharacterInput(String path) {
        this.path = path;
    }

    public CharacterInput(String path, char ch) {
        this.path = path;
        this.ch = ch;
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
