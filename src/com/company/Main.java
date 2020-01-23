package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap contact = new HashMap();
        contact.put("objet", "Candidature");
        contact.put("email", "toto@toto.fr");
        contact.put("message", "Bonjour, j'aimerais bien travailler dans votre entreprise.");

        System.out.println(contact.get("objet"));
        System.out.println(formatToCsv(contact));
    }

    public static String formatToCsv(HashMap contact){
        return contact.get("objet").toString() +
                ";" +
                contact.get("email").toString() +
                ";" +
                contact.get("objet").toString() ;
    }
}
