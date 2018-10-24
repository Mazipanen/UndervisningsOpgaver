/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commandline_interface_og_tekst_io.newpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author L530
 */
public class ScannerOpg {

    public static void main(String[] args) {
        String input = "1,2,red,blue";
        Scanner s = new Scanner(input).useDelimiter(",");
        File myFile = new File("c:\\Users\\L530\\Documents\\twocolors.csv");

        //print to .txt
        PrintWriter pw;
        try {
            pw = new PrintWriter(myFile);
            pw.println(input);
            pw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Nope dosent exist");
        }

        //reader
        Scanner reader;
        try {
            reader = new Scanner(myFile).useDelimiter(",");
            while (reader.hasNext()) { //print next line if there is one
                System.out.println(reader.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nope dosent exist");
        }
    }
}
