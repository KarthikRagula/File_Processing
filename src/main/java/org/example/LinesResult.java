package org.example;

public class LinesResult {
    private int linenor;
    private String line;

    public LinesResult(int linenor, String line){
        this.linenor=linenor;
        this.line=line;
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
}
