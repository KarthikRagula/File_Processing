package org.example;

import java.io.File;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class CreateFileInputTextAndSearch {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter the file name you want to create");
            String path = s.nextLine();
            File f1 = new File(path);
            if (f1.createNewFile()) {
                System.out.println("created new file");
            } else {
                throw new FileAlreadyExistsException("File already exists");
            }
        } catch (FileAlreadyExistsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
