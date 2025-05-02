/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author BLC3
 */
public class SaveableDictionary {

    private Map<String, String> finToEng;
    private Map<String, String> engToFin;
    private String file;

    public SaveableDictionary(String file) {
        this.finToEng = new HashMap<>();
        this.engToFin = new HashMap<>();
        this.file = file;
    }

    public SaveableDictionary(){
        this.finToEng = new HashMap<>();
        this.engToFin = new HashMap<>();
    }

    public boolean save(){
        try(PrintWriter writer = new PrintWriter(file)){

            for(String word: finToEng.keySet()){
                writer.println(word+":"+finToEng.get(word));
            }
            return true;

        }
        catch(Exception e){

            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean load() {

        try ( Scanner fileReader = new Scanner(Paths.get(file))) {

            while (fileReader.hasNextLine()) {

                String line = fileReader.nextLine();
                String[] parts = line.split(":");

                String word = parts[0];
                String translation = parts[1];

                this.add(word, translation);

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return true;
    }

    public void delete(String word) {
        if (finToEng.containsKey(word)) {
            String translation = finToEng.get(word);

            finToEng.remove(word);
            engToFin.remove(translation);
        } else if (engToFin.containsKey(word)) {
            String translation = engToFin.get(word);

            engToFin.remove(word);
            finToEng.remove(translation);
        }
    }

    public void add(String word, String translation) {
        if (finToEng.containsKey(word) || engToFin.containsKey(translation)) {
            return;
        }

        finToEng.put(word, translation);
        engToFin.put(translation, word);

    }

    public String translate(String word) {

        if (finToEng.keySet().contains(word)) {
            return finToEng.get(word);
        } else if (engToFin.keySet().contains(word)) {
            return engToFin.get(word);
        } else {
            return null;
        }
    }

}
