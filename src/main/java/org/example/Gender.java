package org.example;

// enum => vrsta klase, označava predefinirane vrijednsoti.
public enum Gender {

    MALE("Muško"),
    FEMALE("Žensko");

    private final String genderCro;

    Gender(String genderCro) {
        this.genderCro = genderCro;
    }

    public String GenderCro() {
        return genderCro;
    }
}
