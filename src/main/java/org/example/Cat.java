package org.example;

// klasa Cat extends Animal klasu sa specifičnom vrstom hrane, implementira interface movable,

// extends Animal<CatHrana> => označava da je Cat potklasa Animal klase, s parametrom CatHrana.
// Cat inherita sve metode kase Animal, i implementira eat() metodu, s tipom hrane CatHrana

// implements Movable => klasa Cat implementira Movable interface. Move() metoda je definirana u Movable interface

public class Cat extends Animal<CatHrana> implements Movable{

    // metoda makeSound() override-a metodu is superklase Animal. Ispis Meow
    @Override
    public void makeSound() {
        System.out.println("meow");
}

    // override-anje move() metode iz interface Movable
    @Override
    public void move() {
        System.out.println("Mićem se");

    }

    // metoda koja vraća string "Fido"
    public String getName() {
        return "Fido";
    }

    // override-a eat is klase Animal.
    @Override
    public void eat(final CatHrana hrana) {

    }
}
