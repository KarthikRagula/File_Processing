package org.example.WordSearch;

import org.junit.jupiter.api.Test;

import java.util.List;

class WordLinePosAndOccurencesTest {

    WordLinePosAndOccurences ob=new WordLinePosAndOccurences();
    @Test
    void getLines() {
        List<WordOutput> obj=ob.getLines(new WordInput("sample.txt"));
        for(int i=0;i<obj.size();i++){
            System.out.println(obj.get(i).getLineNumber()+" "+obj.get(i).getLine());
        }
    }

    @Test
    void foundAtLineAndPos() {
        List<WordOutput> obj=ob.foundAtLineAndPos(new WordInput("sample.txt", "karthik"));
        for(int i=0;i<obj.size();i++){
            System.out.println(obj.get(i).getLineNumber()+" "+obj.get(i).getPos());
        }
    }

    @Test
    void occured() {
        System.out.println(ob.occured(new WordInput("sample.txt", "karthik")).getOccured());
    }
}