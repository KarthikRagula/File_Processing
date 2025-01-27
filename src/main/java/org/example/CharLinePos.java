package org.example;

import java.util.List;

public class CharLinePos {
    private int linenor;
    private List<Integer> pos;

    private List<CharLinePos> ob;
    public CharLinePos(int linenor, List<Integer> pos) {
        this.linenor = linenor;
        this.pos = pos;
    }

    public List<Integer> getPos() {
        return pos;
    }

    public void setPos(List<Integer> pos) {
        this.pos = pos;
    }

    public int getLinenor() {
        return linenor;
    }

    public void setLinenor(int linenor) {
        this.linenor = linenor;
    }
}
