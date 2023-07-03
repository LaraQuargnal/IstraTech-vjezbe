package org.example;

// nova klasa person. first name, last name, gender
// gettere, settere, konstruktor
// metoda koja vraća ime i prezime skupa
// enumeratori sutra - za gender / koji može biti samo vrijednsoti M i F.
// tip podataka neće biti bilo koji
public class Osoba {

    // statičke varijable
    private static String imeOsobe;
    private static String prezimeOsobe;
    private static Gender gender;


    public String getImeOsobe() {
        return imeOsobe;
    }

    public String getPrezimeOsobe() {
        return prezimeOsobe;
    }

    public Gender getGender() {
        return gender;
    }

    public void setImeOsobe(String imeOsobe) {
        this.imeOsobe = imeOsobe;
    }

    public void setPrezimeOsobe(String prezimeOsobe) {
        this.prezimeOsobe = prezimeOsobe;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Osoba(String imeOsobe, String prezimeOsobe, Gender gender) {
        this.imeOsobe = imeOsobe;
        this.prezimeOsobe = prezimeOsobe;
        this.gender = gender;
    }

    // metoda koja vraća ime i prezime skupa + gender
    public static String getImePrezime() {
        return(imeOsobe + " " + prezimeOsobe + " " + gender);
    }

    //metoda koja vraca ovisno o spolu postovana ili postovani
    public static String getGreetings(){

        final String  greet = gender.equals(Gender.MALE) ? "Postovani" :
                gender.equals(Gender.FEMALE) ? "Postovana":
                        "Postovano";

        return greet + " " + getImePrezime();
    }

    public static String getGenderCroatian(){

        return gender.GenderCro();


    }

    // brojevi od nula do 50, sa zarezom.
    public static String NumberIterator(){

        StringBuilder ConcatedNumbers = new StringBuilder();
        ConcatedNumbers.append("0");

        for(int i = 2; i <= 50; i += 2){

            ConcatedNumbers.append(", ").append(i);

        }
        ConcatedNumbers.append(".");

        return  ConcatedNumbers.toString();

    }
}