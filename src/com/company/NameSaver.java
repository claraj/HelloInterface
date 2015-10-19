package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class NameSaver implements NameProcessor {

    public void process(String name){

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("yourname.txt"));
            writer.write(name);
            writer.close();
            System.out.println("Saved name to file.");
        } catch (IOException ioe) {
            System.out.println("Sorry, could not save name, this error occurred: " + ioe);
        }

    }

}
