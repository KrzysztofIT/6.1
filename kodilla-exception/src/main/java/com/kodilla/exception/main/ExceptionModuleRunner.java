package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

public class ExceptionModuleRunner {
    public static void main(String args[]){

        FileReader filereader = new FileReader();
        //filereader.readFile();*/
        //FileReaderWithoutHandling filereader = new FileReaderWithoutHandling ();
        try {
            filereader.readFile();
        } catch(FileReaderException e){

            System.out.println("Problem with reading a file!");
        }
    }
}
