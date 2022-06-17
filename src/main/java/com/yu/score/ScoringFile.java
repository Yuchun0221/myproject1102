package com.yu.score;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoringFile {
    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader("scores.txt");
            int data = fileReader.read();
            System.out.println(data);
        }catch (FileNotFoundException e){
            System.out.println("File error");
        }catch (IOException e){
            System.out.println("source error");
        }
        System.out.println("Testing");
    }
}
