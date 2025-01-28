package org.example.WordSearch;

import org.junit.jupiter.api.Test;

import java.util.List;

class WordLinePosAndOccurencesTest {

    WordLinePosAndOccurrences ob = new WordLinePosAndOccurrences();

    @Test
    void getListOfFiles() {
        WordInput input = new WordInput("/home/karthikr_700073/Downloads/Karthik", null);
        List<WordOutput> listOfFiles = ob.getListOfFiles(input);
        for (int i = 0; i < listOfFiles.size(); i++) {
            System.out.println(listOfFiles.get(i).getAbsolutePath());
        }
    }

    @Test
    void getLines() {
        List<WordOutput> list = ob.getLinesAndPostionsOfWord(new WordInput("/home/karthikr_700073/Downloads/Karthik/temp.txt", "m"));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getLine() + " " + list.get(i).getLineNumber() + " " + list.get(i).getPos());
        }
    }
}