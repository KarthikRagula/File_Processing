package org.example.WordSearch;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WordLinePosAndOccurences {
    public List<WordOutput> getLines(WordInput in){
        List<WordOutput> lines=new ArrayList<>();
        try{
            File f0=new File(in.getPath());
            if(!f0.exists()){
                throw new FileNotFoundException("File not found");
            }
            BufferedReader bf=new BufferedReader(new FileReader(in.getPath()));

            String line;
            int lineNumber=1;
            while((line=bf.readLine()) !=null){
                lines.add(new WordOutput(lineNumber++,line));
            }
        }
        catch (FileNotFoundException fe){
            System.out.println(fe.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }

    public List<WordOutput> foundAtLineAndPos(WordInput in) {
        List<WordOutput> lines = getLines(in);
        List<WordOutput> found = new ArrayList<>();
        for (int i=0;i<lines.size();i++) {
            List<Integer> li = new ArrayList<>();
            String st = lines.get(i).getLine();
            int index = st.indexOf(in.getWord());
            while (index != -1) {
                li.add(index);
                index = st.indexOf(in.getWord(), index + 1);
            }
            if (!li.isEmpty()) {
                found.add(new WordOutput(lines.get(i).getLineNumber(), li));
            }
        }
        return found;
    }

    public WordOutput occured(WordInput in) {
        List<WordOutput> found = foundAtLineAndPos(in);
        int occured = 0;
        for (int i = 0; i < found.size(); i++) {
            occured += found.get(i).getPos().size();
        }
        return new WordOutput(occured);
    }
}
