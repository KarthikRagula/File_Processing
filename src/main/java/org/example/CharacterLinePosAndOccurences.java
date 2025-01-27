package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharacterLinePosAndOccurences {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the path of the file :");
        String path = s.nextLine();
        System.out.println("enter the character you want to search :");
        char ch = s.next().charAt(0);
        try {
            BufferedReader bf = new BufferedReader(new FileReader(path));
            String line;
            int linenor = 0;
            int occured = 0;
            while ((line = bf.readLine()) != null) {
                System.out.println(line);
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == ch) {
                        occured++;
                        System.out.println(ch + " found in line " + linenor + " and pos is " + (i));
                    }
                }
                linenor++;
            }
            System.out.println(ch + " occured " + occured + " times");

        }
        catch (FileNotFoundException fe){
            System.out.println("File not found");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

