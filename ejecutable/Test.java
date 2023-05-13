package ejecutable;

import modelo.Coordenada;

public class Test
{
    
    public static void main(String[] args) 
    {
        Coordenada cor1  = new Coordenada(5, 2);
      
        System.out.println(cor1);
        


        Coordenada cor2 = new Coordenada(2,6);
       
        System.out.println(cor2);

        if(cor1.equals(cor2))
        {
            System.out.println("son iguales");
        }
        else
        {
            System.out.println("no son iguales");   
        }
        

        System.out.println("La distancia es = "+ cor1.getCalcularDistancia(cor2) );

    
    }

    
}
