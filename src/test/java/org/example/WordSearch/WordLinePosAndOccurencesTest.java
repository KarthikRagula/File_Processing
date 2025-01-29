package org.example.WordSearch;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

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
    void getLinesAndPostionsOfWord() {
        WordOutput output = ob.getLinesAndPostionsOfWord(new WordInput("/home/karthikr_700073/Downloads/Karthik", "the"));
        Map<String,List<WordOutput>> finalOutput=output.getFinalOutput();
        for(Map.Entry<String,List<WordOutput>> map:finalOutput.entrySet()){
            System.out.println(map.getKey());
            List<WordOutput> list=map.getValue();
            for(int i=0;i< list.size();i++){
                System.out.println(list.get(i).getLine());
                System.out.println(list.get(i).getLineNumber()+" "+list.get(i).getPos());
            }
            System.out.println();
        }
    }

    @Test
    void getOccurrences(){
        int times=0;
        List<WordOutput> list=ob.getOccurrences(new WordInput("/home/karthikr_700073/Downloads/Karthik","the"));
        for(int i=0;i<list.size();i++){
            times+=list.get(i).getOccurred();
            System.out.println(list.get(i).getAbsolutePath()+" "+list.get(i).getOccurred());
        }
        System.out.println("Total Occurred times :"+times);
    }
}