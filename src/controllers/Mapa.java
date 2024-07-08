package controllers;

import java.util.HashMap;

public class Mapa {
    public Mapa() {
        HashMap<String, Integer> mapita = new HashMap<>();
        mapita.put("manzana", 20);
        mapita.put("pera", 25);
        mapita.put("mandarina", 20);
        mapita.put("mandarina", 20);

        System.out.println(mapita);
        mapita.remove("pera");
        System.out.println(mapita);
        System.out.println("Existe Mandarina --------> " + mapita.containsKey("mandarina"));
        System.out.println("Existe Pera  --------> " + mapita.containsKey("pera"));

        int valorManzana = mapita.get("manzana");
        System.out.println("Valor de manzana es: " + valorManzana);
        System.out.println("Esta vacío? " + mapita.isEmpty());

        System.out.println("\n Claves del mapa");
        for(String clave : mapita.keySet()){
            System.out.println(" -  " + clave);
        }

        System.out.println("\n Valores del mapa");
        for(Integer value: mapita.values()){
            System.out.println(" -  " + value);

        }
        System.out.println(mapita);
        mapita.replaceAll((k,v) -> v*2);
        System.out.println(mapita);
        
        mapita.clear();
        System.out.println(mapita);



    }

}
