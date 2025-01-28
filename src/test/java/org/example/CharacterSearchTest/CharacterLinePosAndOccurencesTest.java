package org.example.CharacterSearchTest;

import org.example.CharacterSearch.CharacterLinePosAndOccurences;
import org.example.CharacterSearch.CharacterInput;
import org.example.CharacterSearch.CharacterOutput;
import org.junit.jupiter.api.Test;

import java.util.List;

class CharacterLinePosAndOccurencesTest {

    CharacterLinePosAndOccurences ob = new CharacterLinePosAndOccurences();

    @Test
    void getLines() {
        List<CharacterOutput> obj=ob.getLines(new CharacterInput("sample1.txt"));
        for(int i=0;i<obj.size();i++){
            System.out.println(obj.get(i).getLinenor()+" "+obj.get(i).getLine());
        }
    }

    @Test
    void foundAtLineAndPos() {
        List<CharacterOutput> obj=ob.foundAtLineAndPos(new CharacterInput("sample1.txt", 'o'));
        for(int i=0;i<obj.size();i++){
            System.out.println(obj.get(i).getLinenor()+" "+obj.get(i).getPos());
        }
    }

    @Test
    void occured() {
        System.out.println(ob.occured(new CharacterInput("sample1.txt", 'o')).getOccured());
    }
}