package modelo;

public class Coordenada 
{
    //atributos 
    private double x;
    private double y;
    
    //metodos 
    public Coordenada()
    {

    }
    public Coordenada(double x , double y)
    {
        this.x= x;
        this.y =y;
    }

    public double getX() 
    {
        return x;
    }
    public void setX(double x) 
    {
        this.x = x;
    }
    public double getY() 
    {
        return y;
    }
    public void setY(double y) 
    {
        this.y = y;
    }
    
    public String toString() 
    {
        return "Coordenada (x=" + x + ", y=" + y + ")";
    }
    public boolean equals (Object o)
    {
        Coordenada Dife= (Coordenada)o;
        return (x==Dife.x) && (y==Dife.y);
        

    }

    public double getCalcularDistancia(Coordenada c)
    {
        double dX= x - c.getX();
        double dy= y - c.getY();

        double distancia = Math.sqrt(dX*dX + dy*dy);
        return distancia;



    }




    
    
   

    
    


    
    



}