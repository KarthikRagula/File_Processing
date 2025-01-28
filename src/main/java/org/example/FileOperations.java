package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {
    public static void main(String args[]) {
        try {
            File f0 = new File("sample1.txt");
            if (f0.createNewFile()) {
                System.out.println("File " + f0.getName() + " is created successfully.");
            } else {
                System.out.println("File is already exist in the directory.");
            }
            File f1= new File("sample1.txt");
            if(f1.exists()){
                System.out.println(f1.getName());
                System.out.println(f1.canRead()+" "+f1.canWrite());

                FileWriter f2=new FileWriter("sample1.txt");

                f2.write("Hi this is karthik from wavemaker\n");
                f2.write("hello i am from kadapa andhra pradesh\n");
                f2.write("i am working on the file operations in java\n");
                f2.close();
                File f3= new File("sample1.txt");
                System.out.println(f3.getAbsolutePath()+" "+f3.length());

                Scanner data=new Scanner(f3);
                System.out.println(data.hasNextLine());
                while(data.hasNextLine()){
                    String str=data.nextLine();
                    System.out.println(str+" ");
                }
                data.close();
//                if(f3.delete()){
//                    System.out.println("file "+f3.getAbsolutePath()+" has been deleted");
//                }
            }
        } catch (IOException exception) {
            System.out.println("An unexpected error is occurred.");
            exception.printStackTrace();
        }
    }
}
