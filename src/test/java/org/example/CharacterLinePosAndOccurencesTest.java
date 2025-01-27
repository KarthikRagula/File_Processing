package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

class CharacterLinePosAndOccurencesTest {

    CharacterLinePosAndOccurences ob = new CharacterLinePosAndOccurences();

    @Test
    void getLines() {
        List<LinesResult> obj=ob.getLines("sample.txt");
        for(int i=0;i<obj.size();i++){
            System.out.println(obj.get(i).getLinenor()+" "+obj.get(i).getLine());
        }
    }

    @Test
    void foundAtLineAndPos() {
        List<CharLinePos> obj=ob.foundAtLineAndPos("sample.txt", 'o');
        for(int i=0;i<obj.size();i++){
            System.out.println(obj.get(i).getLinenor()+" "+obj.get(i).getPos());
        }
    }

    @Test
    void occured() {
        System.out.println(ob.occured("sample.txt", 'o').getOccured());
    }
}