// abstract class Animal
// potklase mogu extend-ati ovu klasu i implementirati metodu eat()
// Primjerice potklasa Catmoći će implementirati metodu eatFish
// Metodu makeSound() moći će se override-ati

package org.example;

// T je generički tip
public abstract class Animal <T>{

    // metoda makeSound, nije apstraktna, print zvuk životinje.
    // Podklase mogu override-ati metodu kako bi implementirali vlastiti zvuk
    public void makeSound() {
        System.out.println("dfg");
    }

    // apstraktna metoda eat, koja uzima parametar T - vrsta hrane.
    // kako se radi o apstraktnoj metodi, nema implementacije u Animal klasi.
    // Podklase klase Animal, morati će implementirati metodu
    public abstract void eat(T hrana);

}
