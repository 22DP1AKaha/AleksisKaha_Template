package rvt.excercises;

public class CD implements Packable {
    String artist;
    String NameOfCD;
    int year;

    public CD(String artist, String NameOfCD, int year){
        this.artist = artist;
        this.NameOfCD = NameOfCD;
        this.year = year;
    }
    public String artist(){
        return artist;
    }
    public String NameOfCD(){
        return NameOfCD;
    }
    public int year(){
        return year;
    }

    public double weight() {
        return 0.1;
    }

    public String toString() {
        return this.artist + " " + this.NameOfCD + " " + this.year;
    }
}
