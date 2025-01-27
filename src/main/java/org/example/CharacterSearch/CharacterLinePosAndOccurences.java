package org.example.CharacterSearch;

import java.io.*;
import java.util.*;

public class CharacterLinePosAndOccurences {
    public List<CharacterOutput> getLines(CharacterInput in) {
        List<CharacterOutput> lines =new ArrayList<>();
        try {
            File f1 = new File(in.getPath());
            if (!f1.exists()) {
                throw new FileNotFoundException("File Not found");
            }
            BufferedReader bf = new BufferedReader(new FileReader(in.getPath()));
            String line;
            int linenor = 1;
            while ((line = bf.readLine()) != null) {
                lines.add(new CharacterOutput(linenor++, line));
            }
        } catch (FileNotFoundException fe) {
            System.out.println(fe.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }

    public List<CharacterOutput> foundAtLineAndPos(CharacterInput in) {
        List<CharacterOutput> lines = getLines(in);
        List<CharacterOutput> found = new ArrayList<>();
        for (int i=0;i<lines.size();i++) {
            List<Integer> li = new ArrayList<>();
            String st = lines.get(i).getLine();
            for (int j = 0; j < st.length(); j++) {
                if (st.charAt(j) == in.getCh()) {
                    li.add(j);
                }
            }
            if (!li.isEmpty()) {
                found.add(new CharacterOutput(lines.get(i).getLinenor(), li));
            }
        }
        return found;
    }

    public CharacterOutput occured(CharacterInput in) {
        List<CharacterOutput> found = foundAtLineAndPos(in);
        int occured = 0;
        for (int i = 0; i < found.size(); i++) {
            occured += found.get(i).getPos().size();
        }
        return new CharacterOutput(occured);
    }
}

