package com.RDPR.x00365918;

public class Main {

    public static void main(String[] args) {

        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop("Msi", "Window 7");

        System.out.println();
        System.out.println("Latop 1");
        System.out.println();

        laptop1.encender();
        laptop1.procesador("Intel Core Duo");
        laptop1.ram(16);
        laptop1.apagar();

        laptop1.setMarca("Asus");
        laptop1.setSO("Windows 98");
        laptop1.setDiscoD("1 T");


        System.out.println("La marca es: " + laptop1.getMarca());
        System.out.println("El sistema es: " + laptop1.getSO());
        System.out.println("El disco duro tiene capacidad de : " + laptop1.getDiscoD());


        System.out.println();
        System.out.println("Laptop 2");
        System.out.println();

        laptop2.encender();
        laptop2.procesador("Intel core i7");
        laptop2.ram(4);
        laptop2.apagar();
        laptop2.setDiscoD("500 GB");


        System.out.println("La marca es: " + laptop2.getMarca());
        System.out.println("El sistema  es: " + laptop2.getSO());
        System.out.println("EL disco duro tiene capacidad de: " + laptop2.getDiscoD());

        System.out.println();
        System.out.println("guitarra 1");
        System.out.println();

        Guitar guitar1= new Guitar();
        Guitar guitar2= new Guitar("Jackson","Negro");

        guitar1.Tocar();
        guitar1.Aplificador();
        guitar1.CabiarPastillas(3);

        guitar1.setColor("Rojo");
        guitar1.setMarcaG("Fender");
        guitar1.setTipoDeGuitarra("Acustica");

        System.out.println("La marca de la guitarrra es: "+guitar1.getMarcaG());
        System.out.println("el color de la guitarra es: "+guitar1.getColor());
        System.out.println("el tipos de guitarra es: "+guitar1.getTipoDeGuitarra());

        System.out.println();
        System.out.println("guitarra 2");
        System.out.println();

        guitar2.Tocar();
        guitar2.Aplificador();
        guitar2.CabiarPastillas(1);
        guitar2.setTipoDeGuitarra("Electrica");
        guitar2.setColor("Negro");

        System.out.println("La marca de la guitarrra es"+guitar2.getMarcaG());
        System.out.println("el color de la guitarra es: "+guitar2.getColor());
        System.out.println("el tipos de guitarra es: "+guitar2.getTipoDeGuitarra());
    }

}