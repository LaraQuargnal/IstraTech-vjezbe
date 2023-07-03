package org.example;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class StringManipulator {

    private  DelimiterProvider delimiterProvider;

    public StringManipulator (final DelimiterProvider delimiterProvider){
        this.delimiterProvider = delimiterProvider;
    }

    // metoda concatenate, uzima dva string parametra
    public  String concatenate(final String str1, final String str2)  {
        if( str1 == null) {      // Objects.isNull(str1)
            throw new IllegalArgumentException("Ne smije biti null");
        }


        Map<String, Osoba> mapa = new HashMap<>();       // mape = koji tip podataka će biti key, a koji value?
        // tip može biti string, a value Osoba

        mapa.put( "Pero", new Osoba ("iop", "sdf", Gender.MALE) );
        // kroz mape se u pravilu ne iterira

        mapa.put("Pero2", new Osoba("sdfsdf", "sdfsdfsdfsdf", Gender.FEMALE));

        final Osoba osoba = mapa.get("Pero");

        // neće stvoriti novi element, već će update-ati stari
        mapa.put ("Pero", new Osoba ("iop", "sdf", Gender.MALE));

        for ( final String key : mapa.keySet()){
            mapa.get(key);
        }

        return str1 + delimiterProvider.getDelimiter() + str2;
    }

}
