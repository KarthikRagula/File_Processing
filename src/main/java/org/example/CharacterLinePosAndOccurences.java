package org.example;

import java.io.*;
import java.util.*;

public class CharacterLinePosAndOccurences {
    public Map<Integer, String> getLines(String path) {
        Map<Integer, String> lines = new HashMap<>();
        try {
            File f1 = new File(path);
            if (!f1.exists()) {
                throw new FileNotFoundException("File Not found");
            }
            BufferedReader bf = new BufferedReader(new FileReader(path));
            String line;
            int linenor = 1;
            while ((line = bf.readLine()) != null) {
                lines.put(linenor++, line);
            }
        } catch (FileNotFoundException fe) {
            System.out.println(fe.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }

    public Map<Integer, List<Integer>> foundAtLineAndPos(String path, char ch) {
        CharacterLinePosAndOccurences ob=new CharacterLinePosAndOccurences();
        Map<Integer, String> lines = ob.getLines(path);
        Map<Integer, List<Integer>> found = new HashMap<>();
        for (Map.Entry < Integer,String > m :lines.entrySet()){
            List<Integer> li = new ArrayList<>();
            String st=m.getValue();
            for (int i = 0; i < st.length(); i++) {
                if (st.charAt(i) == ch) {
                    li.add(i);
                }
            }
            if (!li.isEmpty()) {
                found.put(m.getKey(), li);
            }
        }
        return found;
    }

    public int occured(String path, char ch) {
        CharacterLinePosAndOccurences ob = new CharacterLinePosAndOccurences();
        Map<Integer, List<Integer>> found = ob.foundAtLineAndPos(path, ch);
        int occured = 0;
        for (Map.Entry<Integer, List<Integer>> m : found.entrySet()) {
            occured += m.getValue().size();
        }
        return occured;
    }
}

