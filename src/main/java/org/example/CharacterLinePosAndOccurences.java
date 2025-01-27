package org.example;

import java.io.*;
import java.util.*;

public class CharacterLinePosAndOccurences {
    public Map<Integer,String> getLines(String path){
        Map<Integer,String> lines=new HashMap<>();
        try {
            File f1=new File(path);
            if(!f1.exists()){
                throw new FileNotFoundException("File Not found");
            }
            BufferedReader bf = new BufferedReader(new FileReader(path));
            String line;
            int linenor = 1;
            while ((line = bf.readLine()) != null) {
                lines.put(linenor++,line);
            }
        }
        catch (FileNotFoundException fe){
            System.out.println(fe.getMessage());
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }

    public Map<Integer,List<Integer>> foundAtLineAndPos(String path, char ch) {
        Map<Integer,List<Integer>> found=new HashMap<>();
        try {
            File f1=new File(path);
            if(!f1.exists()){
                throw new FileNotFoundException("File Not found");
            }
            BufferedReader bf = new BufferedReader(new FileReader(path));
            String line;
            int linenor = 1;
            while ((line = bf.readLine()) != null) {
                List<Integer> li=new ArrayList<>();
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == ch) {
                        li.add(i);
                    }
                }
                if(li.size()>0){
                    found.put(linenor,li);
                }
                linenor++;
            }
        }
        catch (FileNotFoundException fe){
            System.out.println(fe.getMessage());
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        return found;
    }

    public int occured(String path,char ch){
        CharacterLinePosAndOccurences ob=new CharacterLinePosAndOccurences();
        Map<Integer,List<Integer>> found= ob.foundAtLineAndPos(path,ch);
        int occured=0;
        for(Map.Entry<Integer,List<Integer>> m: found.entrySet()){
            occured+=m.getValue().size();
        }
        return occured;
    }
}

