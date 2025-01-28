package org.example.WordSearch;

import java.util.List;

public class WordOutput {
    private int occured;
    private int lineNumber;
    private List<Integer> pos;
    private String line;
    private String absolutePath;
    private List<String> listOfFiles;
    private List<WordOutput> lines;

    public WordOutput(int lineNumber, String line) {
        this.lineNumber = lineNumber;
        this.line = line;
    }

    public WordOutput(String line, int lineNumber, List<Integer> pos) {
        this.line=line;
        this.lineNumber = lineNumber;
        this.pos = pos;
    }

    public WordOutput(int occured) {
        this.occured = occured;
    }

    public WordOutput(List<String> listOfFiles){
        this.listOfFiles=listOfFiles;
    }

    public WordOutput(String absolutePath, List<WordOutput> lines) {
        this.absolutePath =absolutePath;
        this.lines=lines;
    }

    public List<WordOutput> getLines() {
        return lines;
    }

    public void setLines(List<WordOutput> lines) {
        this.lines = lines;
    }

    public String getAbsolutePath() {
        return absolutePath;
    }

    public void setAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
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

    public List<String> getListOfFiles() {
        return listOfFiles;
    }

    public void setListOfFiles(List<String> listOfFiles) {
        this.listOfFiles = listOfFiles;
    }
}
