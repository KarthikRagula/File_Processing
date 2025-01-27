package org.example.WordSearch;

import java.util.List;

public class WordOutput {
    private int occured;
    private int lineNumber;
    private List<Integer> pos;
    private String line;

    public WordOutput(int lineNumber, String line) {
        this.lineNumber = lineNumber;
        this.line = line;
    }

    public WordOutput(int lineNumber, List<Integer> pos) {
        this.lineNumber = lineNumber;
        this.pos = pos;
    }

    public WordOutput(int occured) {
        this.occured = occured;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public int getOccured() {
        return occured;
    }

    public void setOccured(int occured) {
        this.occured = occured;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public List<Integer> getPos() {
        return pos;
    }

    public void setPos(List<Integer> pos) {
        this.pos = pos;
    }
}
