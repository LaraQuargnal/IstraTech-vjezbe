package org.example;

// import static org.example.Osoba.Gender.F;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


    public class Main {

        public static void main(String[] args) {

            // izbroji samoglasnike
        System.out.print("Unesi string: ");
        Scanner unos = new Scanner(System.in);
        String tekst = unos.nextLine();

        int brojSamoglasnika = 0;

        for (int i = 0; i < tekst.length(); i++) {
            char slovo = Character.toLowerCase(tekst.charAt(i));

            if (slovo == 'a' || slovo == 'e' || slovo == 'i' || slovo == 'o' || slovo == 'u') {
                brojSamoglasnika++;
            }
        }

        System.out.println("Broj samoglasnika: " + brojSamoglasnika);
    }

}

            /*
            // ispiši sva slova
            System.out.print("dfg: ");
            Scanner input = new Scanner(System.in);
            String tekst = input.nextLine();

            for (int i = 0; i< tekst.length(); i++){
            char slova = tekst.charAt(i);
            System.out.println("Slovo= " + i + ": " + slova);
        }

            for (char c : tekst.toCharArray()) {
                System.out.println(c);
            }


        }

    }

*/

/*


        Animal myCat = new Cat();
        myCat.makeSound();
        Movable myCat2 = new Cat();

        myCat2.move();

        // kastanje podataka, za pristup svim metodama. Zaobilaženje, downcastanje - izbjegavati
        // ((Cat)myCat2).getName()

        Movable myCat3 = () -> {

        };

        Cat myCat4 = new Cat();
        myCat4.eat(new CatHrana());

        // Liste u generic java - kolekcije

        List myList2 = new ArrayList();

        myList2.add("Tekst");
        myList2.add(1);
        myList2.add(myCat);
        myList2.add(new StringManipulator((null)));

        List<String> myList = new ArrayList<>(); //String ne dozvoljava unos u listu elementa koji nisu string

        myList.add("Tekst1");
        myList.add("Tekst2");
        myList.add("Tekst3");
        myList.add("Tekst4");

        // myList.add(1);
        // myList.add(myCat);
        // myList.add(new StringManipulator((null)));

        // Sets u generic java - kolekcije

        Set<String> mySet = new HashSet<>();

        // Mape
        Map<String, String> myMap = new HashMap<>();

        for (final String s : myList) {
        }

        // isto kao i ovo dolje
        for (int i = 0; i < myList.size(); i++) {
            final String str = myList.get(i);
        }

        // koliko je svaki string dugačak? Želimo mapirati string u integer
        // -> je ključna riječ za lambda izraz

        myList.stream().map((rijec) -> rijec.length());

        // ili

        final List<Integer> duzina = new ArrayList<>();
        for (final String rijec: myList
             ) { duzina.add(rijec.length());
        }

        final Stream<Integer> integerStream = myList.stream().map((rijec) -> rijec.length()).filter((duz) -> duz > 5);

        // ili
        myList.parallelStream().map(String::length).filter((duz) -> duz > 5).peek((rijec) -> System.out.println(rijec))
                .collect(Collectors.toList());

        // for(final Integer integer:collect) {

        // }


        // stream trace

        // ili

        for (final String rijec: myList
        ) { final int duzina1 = rijec.length();
            if (duzina1>5) {
                duzina.add(duzina1);
            };
        }


        // Osoba osoba = new Osoba("Lara", "Q", Gender.MALE );
        // System.out.println( Osoba.getGreetings());
        // System.out.println(Osoba.getGenderCroatian());

        // System.out.println(Osoba.NumberIterator());

        // System.out.println(StringManipulator.concatenate(null, "dfg"));

    }
}




/*
public class Main {

    public Main(String test) {
        this.test = test;
    }

    public static void main(String[] args) {    // main
        // String nekaVarijabla = new String("nesto"); // string redundantno
        String nekaVarijabla = "nesto";

        if (1 == 2){
            return;
        }

        nekaVarijabla = nekaVarijabla + "as";
        System.out.println(nekaVarijabla);


        new Double ("12");
        Double.valueOf("12");
        double xx = 15.5;
        // double xx1 = "15.1"; nope
        System.out.println(Integer.MAX_VALUE);


    }


    public String getTest() {
        return test;
    }

     String test = "sdf";



    public String test(Main obj, String test){ //povratni tip,
        System.out.println( test);
        return "";
    }


    public static String test3 = "test";
    public String test (String test, String dva, Double tri) {
        String test31 = Main.test3;
        return "";
    }


}
*/

/*
public static void main(String[] args) {
        Person person = new Person("Lara", "Q");
        System.out.println(person.getFullName());

        person.setFirstName("Lara");
        person.setLastName("Q");
        System.out.println(person.getFullName());
    }
 */

/*

public static void main(String[] args) {
        Osoba osoba1 = new Osoba("Lara", "Q", Osoba.Gender.F);
        System.out.println(osoba1.ispis());

    }
 */