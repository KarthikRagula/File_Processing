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
            int linenor = 1;
            int occured = 0;
            while ((line = bf.readLine()) != null) {
                System.out.println(linenor +" "+ line);
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == ch) {
                        occured++;
                        System.out.println(ch + " found in line " + linenor + " and pos is " + (i));
                    }
                }
                linenor++;
            }
            if (occured > 0) {
                System.out.println(ch + " occurred a total of " + occured + " times in the file.");
            } else {
                System.out.println("The character '" + ch + "' was not found in the file.");
            }
        }
        catch (FileNotFoundException fe){
            System.out.println("File not found");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

