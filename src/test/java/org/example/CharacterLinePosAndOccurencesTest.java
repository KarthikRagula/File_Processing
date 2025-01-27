package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

class CharacterLinePosAndOccurencesTest {

    CharacterLinePosAndOccurences ob = new CharacterLinePosAndOccurences();

    @Test
    void getLines() {
        List<Result> obj=ob.getLines(new Input("sample.txt"));
        for(int i=0;i<obj.size();i++){
            System.out.println(obj.get(i).getLinenor()+" "+obj.get(i).getLine());
        }
    }

    @Test
    void foundAtLineAndPos() {
        List<Result> obj=ob.foundAtLineAndPos(new Input("sample.txt", 'o'));
        for(int i=0;i<obj.size();i++){
            System.out.println(obj.get(i).getLinenor()+" "+obj.get(i).getPos());
        }
    }

    @Test
    void occured() {
        System.out.println(ob.occured(new Input("sample.txt", 'o')).getOccured());
    }
}