package com.RDPR.x00365918;

public class Guitar {

    private String Color;
    private String marcaG;
    private String TipoDeGuitarra;

    public Guitar(String pMarca,String pColor) {
        marcaG =pMarca;
        TipoDeGuitarra = pColor;
    }

    public Guitar() {


    }

    public void Tocar() {

        System.out.println("Se comenzo a tocar la guitarra");

    }

    public void Aplificador() {

        System.out.println("Se a conectadoa un aplificador");
    }

    public void CabiarPastillas(int numP) {

        System.out.println("Se Cambio a la pasatilla: " + numP);

    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getMarcaG() {
        return marcaG;
    }

    public void setMarcaG(String marcaG) {
        this.marcaG = marcaG;
    }

    public String getTipoDeGuitarra() {
        return TipoDeGuitarra;
    }

    public void setTipoDeGuitarra(String tipoDeGuitarra) {
        TipoDeGuitarra = tipoDeGuitarra;
    }
}
