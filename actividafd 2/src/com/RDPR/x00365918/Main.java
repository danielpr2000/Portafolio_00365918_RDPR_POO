package com.RDPR.x00365918;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        String autor,nombre,email,isbn;
        char genero;
        int paginas;
        boolean emailv=false,encontrado,autorencontrado=false,libroencontrado=false;
        ArrayList<Autor> autores= new ArrayList();
        ArrayList<Libro> libros= new ArrayList();
        Scanner escaner=new Scanner(System.in);
        int opcion=0;
        do {
            menu();opcion=escaner.nextInt();
            switch (opcion){
                case 1:
                    menuagregar();opcion=escaner.nextInt();escaner.nextLine();
                    switch (opcion){
                        case 1:
                            System.out.println("Ingresa el nombre del autor : ");
                            autor=escaner.nextLine();
                            do{
                                System.out.println("Ingresa el email : ");
                                email=escaner.nextLine();
                                if(validarcorreo(email))
                                    emailv=true;
                            }
                            while(!emailv);
                            do{
                                System.out.println("Ingresa el genero (m o f)");
                                genero=escaner.next().charAt(0);escaner.nextLine();
                                if(genero=='m'|| genero=='f')
                                    emailv=false;
                            }
                            while(emailv);
                            autores.add(new Autor(autor,email,genero));
                            break;
                        case 2:
                            System.out.println("Ingresa el ISBN :");
                            isbn=escaner.nextLine();
                            System.out.println("Ingresa el nombre del libro");
                            nombre=escaner.nextLine();
                            System.out.println("ingresa el numero de paginas : ");
                            paginas=escaner.nextInt();escaner.nextLine();
                            libros.add(new Libro(isbn,nombre,paginas));
                            break;
                    }
                    break;
                case 2:
                    menueliminar();
                    opcion=escaner.nextInt();escaner.nextLine();
                    switch (opcion){
                        case 1:
                            autores.removeAll(autores);
                            System.out.println("eliminados");
                            break;
                        case 2:
                            do{
                                autorencontrado=false;
                                System.out.println("ingresa (m o f)");
                                genero=escaner.next().charAt(0);escaner.nextLine();
                                if(genero=='m') {
                                    autores.removeIf(s->s.getGenero()=='m');
                                    System.out.println("eliminados");
                                    autorencontrado=true;
                                }
                                else if(genero=='f'){
                                    autores.removeIf(s->s.getGenero()=='f');
                                    autorencontrado=true;
                                    System.out.println("eliminados");
                                }
                            }
                            while (!autorencontrado);
                            break;
                        case 3:
                            libros.removeAll(libros);
                            System.out.println("Eliminados");
                            break;
                        case 4:
                            System.out.println("ingresa el ISBN: ");
                            isbn=escaner.nextLine();
                            String auxiliar=isbn;
                            libros.removeIf(s->s.getISBN().equals(auxiliar));
                            System.out.println("Eliminados");
                            break;
                    }
                    break;
                case 3:
                    menumostrar();
                    opcion=escaner.nextInt();escaner.nextLine();
                    switch (opcion){
                        case 1:
                            Iterator iter = autores.iterator();
                            if(!iter.hasNext()){
                                System.out.println("No hay autores registrados ");
                            }
                            else {
                                while (iter.hasNext())
                                    System.out.println(iter.next());
                            }
                            break;
                        case 2:
                            do{
                                emailv=false;encontrado=false;
                                System.out.println("Buscar por genero (m o f)");
                                genero=escaner.next().charAt(0);escaner.nextLine();
                                if(genero=='m'|| genero=='f'){
                                    for(Autor aux:autores){
                                        if(aux.getGenero()==(genero)) {
                                            System.out.println("* Nombre=" +aux.getNombre() + " , Email="+aux.getEmail()
                                                    +" , Genero="+aux.getGenero());
                                            encontrado=true;
                                        }
                                    }
                                    if(!encontrado){
                                        System.out.println("No hay ningun autor con este genero \n");
                                    }
                                    emailv=true;
                                }
                            }
                            while(!emailv);
                            break;
                        case 3:
                            Iterator itera = libros.iterator();
                            if(!itera.hasNext()){
                                System.out.println("No hay libros registrados ");
                            }
                            else {
                                while (itera.hasNext())
                                    System.out.println(itera.next());
                            }
                            break;
                        case 4:
                            do{
                                libroencontrado=false;
                                System.out.println("ingresa el ISBN: ");
                                isbn=escaner.nextLine();
                                for (Libro aux:libros) {
                                    if(aux.getISBN().equals(isbn)){
                                        System.out.println("* Nombre=" +aux.getNombre() + " , ISBN="+aux.getISBN()
                                                +" , Paginas="+aux.getPaginas());
                                        libroencontrado=true;
                                    }
                                }
                            }
                            while (!libroencontrado);
                            break;
                    }
                    break;
            }
        }
        while(opcion!=0);
    }
    static void menueliminar(){
        System.out.println("1)Eliminar todos los autores\n2)Eliminar autores por genero\n3)Eliminar todos los libros\n4)Eliminar libros por ISBN");
    }
    static void menu(){
        System.out.println("Menu principal\n");
        System.out.println("1)Agregar\n2)Eliminar\n3)Mostrar\n4)Salir");
    }
    static void menumostrar(){
        System.out.println("1)Ver autores\n2)Ver autores por genero\n3)Ver libros\n4)Ver libro por ISBN");
    }
    static void menuagregar(){
        System.out.println("1)Agregar autor\n2)Agregar Libro");
    }
    static boolean validarcorreo(String correo){
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(correo);
        if (mather.find() == true) {
            return true;
        } else {
            System.out.println("El email ingresado es inválido");
            return false;
        }
    }
}
