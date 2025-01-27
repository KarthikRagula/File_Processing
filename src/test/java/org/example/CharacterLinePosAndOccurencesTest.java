package org.example;

import org.junit.jupiter.api.Test;

class CharacterLinePosAndOccurencesTest {

    CharacterLinePosAndOccurences ob=new CharacterLinePosAndOccurences();
    @Test
    void getLines() {
        System.out.println(ob.getLines("sample.txt"));
    }

    @Test
    void foundAtLineAndPos() {
        System.out.println(ob.foundAtLineAndPos("sample.txt",'o'));
    }

    @Test
    void occured() {
        System.out.println(ob.occured("sample.txt",'o'));
    }
}