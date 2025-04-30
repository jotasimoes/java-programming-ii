/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BLC3
 */
public class Literacy implements Comparable<Literacy>{
    
    private String theme;
    private String ageGroup;
    private String gender;
    private String country;
    private int year;
    private double litPercent;

    public Literacy(String theme, String ageGroup, String gender, String country, int year, double litPercent) {
        this.theme = theme;
        this.ageGroup = ageGroup;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.litPercent = litPercent;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getLitPercent() {
        return litPercent;
    }

    public void setLitPercent(double litPercent) {
        this.litPercent = litPercent;
    }
    
    public String toString(){
        return country + " (" + year + ")," + gender + ", " + litPercent;
    }

    @Override
    public int compareTo(Literacy literacy) {
        
         if (this.getLitPercent() < literacy.getLitPercent()) return -1;
        if (this.getLitPercent() >literacy.getLitPercent()) return 1;
        return 0;
    }
    
    
    
}
