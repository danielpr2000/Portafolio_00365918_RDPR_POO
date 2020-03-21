package com.RDPR.x00365918;

public class Laptop {
    private String SO;
    private String marca;
    private String DiscoDuro;

    public Laptop(String pMarca,String pSO) {
        marca =pMarca;
        SO = pSO;
    }

    public Laptop() {

    }


    public void encender() {

        System.out.println("La computadora se encendido");

    }

    public void apagar() {

        System.out.println("La computadora se  apagado");
    }

    public void procesador(String CPU) {
        System.out.println("El procesador es: " + CPU);


    }

    public void ram(float memoriaRAM) {
        System.out.println("La memoria RAM de la computadora es: " + memoriaRAM + "GB");
    }
    public void setDiscoD(String disco){
        DiscoDuro = disco;
    }
    public String getDiscoD(){
        return DiscoDuro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String pMarca) {
        marca = pMarca;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String pSO) {
        SO = pSO;
    }


}

