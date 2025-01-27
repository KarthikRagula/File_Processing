package org.example;

import java.io.*;
import java.util.*;

public class CharacterLinePosAndOccurences {
    public List<Result> getLines(Input in) {
        List<Result> lines =new ArrayList<>();
        try {
            File f1 = new File(in.getPath());
            if (!f1.exists()) {
                throw new FileNotFoundException("File Not found");
            }
            BufferedReader bf = new BufferedReader(new FileReader(in.getPath()));
            String line;
            int linenor = 1;
            while ((line = bf.readLine()) != null) {
                lines.add(new Result(linenor++, line));
            }
        } catch (FileNotFoundException fe) {
            System.out.println(fe.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }

    public List<Result> foundAtLineAndPos(Input in) {
        List<Result> lines = getLines(in);
        List<Result> found = new ArrayList<>();
        for (int i=0;i<lines.size();i++) {
            List<Integer> li = new ArrayList<>();
            String st = lines.get(i).getLine();
            for (int j = 0; j < st.length(); j++) {
                if (st.charAt(j) == in.getCh()) {
                    li.add(j);
                }
            }
            if (!li.isEmpty()) {
                found.add(new Result(lines.get(i).getLinenor(), li));
            }
        }
        return found;
    }

    public Result occured(Input in) {
        List<Result> found = foundAtLineAndPos(in);
        int occured = 0;
        for (int i = 0; i < found.size(); i++) {
            occured += found.get(i).getPos().size();
        }
        return new Result(occured);
    }
}

