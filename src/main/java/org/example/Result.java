package org.example;

import java.util.List;

public class Result {
    private int linenor;
    private String line;
    private List<Integer> pos;
    private int occured;

    public Result(int occured) {
        this.occured = occured;
    }

    public Result(int linenor, List<Integer> pos) {
        this.linenor = linenor;
        this.pos = pos;
    }

    public Result(int linenor, String line) {
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