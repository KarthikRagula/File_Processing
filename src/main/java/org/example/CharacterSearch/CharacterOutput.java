package org.example.CharacterSearch;

import java.util.List;

public class CharacterOutput {
    private int linenor;
    private String line;
    private List<Integer> pos;
    private int occured;

    public CharacterOutput(int occured) {
        this.occured = occured;
    }

    public CharacterOutput(int linenor, List<Integer> pos) {
        this.linenor = linenor;
        this.pos = pos;
    }

    public CharacterOutput(int linenor, String line) {
        this.linenor = linenor;
        this.line = line;
    }

    public int getOccured() {
        return occured;
    }

    public void setOccured(int occured) {
        this.occured = occured;
    }

    public int getLinenor() {
        return linenor;
    }

    public void setLinenor(int linenor) {
        this.linenor = linenor;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public List<Integer> getPos() {
        return pos;
    }

    public void setPos(List<Integer> pos) {
        this.pos = pos;
    }
}