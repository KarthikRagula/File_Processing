package org.example;

import java.io.*;
import java.util.*;

public class CharacterLinePosAndOccurences {
    public List<LinesResult> getLines(String path) {
        List<LinesResult> lines =new ArrayList<>();
        try {
            File f1 = new File(path);
            if (!f1.exists()) {
                throw new FileNotFoundException("File Not found");
            }
            BufferedReader bf = new BufferedReader(new FileReader(path));
            String line;
            int linenor = 1;
            while ((line = bf.readLine()) != null) {
                lines.add(new LinesResult(linenor++, line));
            }
        } catch (FileNotFoundException fe) {
            System.out.println(fe.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }

    public List<CharLinePos> foundAtLineAndPos(String path, char ch) {
        List<LinesResult> lines = getLines(path);
        List<CharLinePos> found = new ArrayList<>();
        for (int i=0;i<lines.size();i++) {
            List<Integer> li = new ArrayList<>();
            String st = lines.get(i).getLine();
            for (int j = 0; j < st.length(); j++) {
                if (st.charAt(j) == ch) {
                    li.add(j);
                }
            }
            if (!li.isEmpty()) {
                found.add(new CharLinePos(lines.get(i).getLinenor(), li));
            }
        }
        return found;
    }

    public CharOccured occured(String path, char ch) {
        List<CharLinePos> found = foundAtLineAndPos(path, ch);
        int occured = 0;
        for (int i = 0; i < found.size(); i++) {
            occured += found.get(i).getPos().size();
        }
        return new CharOccured(occured);
    }
}

