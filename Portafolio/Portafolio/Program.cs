using System;

namespace Portafolio
{
    internal class Program
    {
        static byte aux; 
        static byte opc;
        
         static void Main() {
                bool continuar = true;
                do{
                  
                    PedirMenu();
                    
                    switch(opc){
                        case 1: Banco.registrarTarjeta(); break;
                        case 2: Banco.consultarTarjetas(); break;
                        case 3: ConsolaJuegos.comprarJuego(); break;
                        case 4: ConsolaJuegos.jugar(); break;
                        case 5: continuar = false; break;
                        default: Console.WriteLine("Opcion errónea!"); break;
                    }
                }while(continuar);
                Console.WriteLine("\nTenga un buen día!");
            }
            
            static string menu=
                       "\nBienvenido:\n" +
                       "1) Registrar tarjeta (banco).\n" +
                       "2) Consultar tarjetas (banco).\n" +
                       "3) Comprar videojuego (consola).\n" +
                       "4) Jugar videojuego (consola).\n" +
                       "5) Salir.\n" +
                       "Opción elegida: "; 
            
            public static void  PedirMenu()
            {
                try
                {
                    Console.Write(menu); 
                    aux = Convert.ToByte(Console.ReadLine());
                    opc= aux;
                }
                catch (FormatException e)
                {
                    Console.WriteLine("solo se admiten numeros"); 
                    PedirMenu();
                }
            }
            
    }
}
                


              