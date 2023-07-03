package org.example;

// funkcijski interface - ima samo jednu apstraktnu metodu
@FunctionalInterface
public interface Test extends Comparable {      // ne može implements nego nasljeđivanje
    // interface sam po sebi ne implementira
    // default i static metode nisu zamišljenje za nasljeđivanje

    // apstraktna metoda
    void Test();

    // String getName(); // ne možemo dodati još metoda jer funkcijski interface ne dozvoljava više metoda

    default String getName() {
        return "Pero";
    }

}
