public class Personaje {

    //Constructor

    public Personaje(String nombre, int salud, String color){
        this.nombre = nombre;
        this.salud = salud;
        this.color = color;        
    }
    
    public String nombre; //atributo del personaje
    public int salud; //salud del personaje
    public String color; //color del personaje

    //Responsabilidades(m+etodos funciones):
    public void atacarA(Personaje enemigo, int danio){
        enemigo.salud = enemigo.salud - danio;

    }
   
}
