using System;

namespace Portafolio
{
    public class Banco
    {
        public static void registrarTarjeta(){
            
               Console.Write("Número de tarjeta: ");
               string numero = Console.ReadLine();

               if (GestorArchivos.Buscar("Tarjetas.txt", numero)==false)
               {
                     GestorArchivos.Anexar("Tarjetas.txt", numero);
                      Console.WriteLine("Tarjeta creada exitosamente!");
               }
               else
               {
                   Console.WriteLine("ya existe esa targeta");
               }

        }
           
           public static void consultarTarjetas(){
               Console.WriteLine(GestorArchivos.Leer("Tarjetas.txt"));
           }
           
           public static bool realizarCompras(string tarjeta){
               return GestorArchivos.Buscar("Tarjetas.txt", tarjeta);
           } 
    }
}