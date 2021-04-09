public class App {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) throws Exception {
        //Jueguito donde 2 personajes de MK, peleen entre si
        //por turnos

        //Es instanciar un objeto
        // a partir del molde personaje
        //crea en memoria uno.
        Personaje p1 = new Personaje("SubZero", 100, ANSI_PURPLE);

        Personaje p2 = new Personaje("Scorpion", 100, ANSI_GREEN);

        boolean turnoP1 = true;

        System.out.println(ANSI_RED + "COMIENZA EL COMBATE. ¡¡¡¡FIGHT!!!!");
        
        //mientras ambos tengan salud, pelear entre sí
        //gameloop
        while(p1.salud > 0 && p2.salud > 0){
            Personaje atacante;
            Personaje oponente;

            if (turnoP1){
                atacante = p1;
                oponente = p2;
            }
            else{
                atacante = p2;
                oponente = p1;
            }

            int max = 10;
            int min = 2;
            //genera un valor random entre 2 y 10
            int danio = (int) (Math.random() * ((max - min) + 1)) + min;

            System.out.println(atacante.color + atacante.nombre + " ataca a "+ oponente.nombre);
            
            atacante.atacarA(oponente, danio);
            
            System.out.println("A "+ oponente.nombre + " le queda "+ oponente.salud + " de salud");

            turnoP1 = !turnoP1;

            //Pausa el programa por 2 segundos(2000 milisegundos = 2 segundos)
            Thread.sleep(2000);
        }

        if (p1.salud > 0){
            System.out.println(p1.color + p1.nombre + " ganó!!!");
        }
        else{
            System.out.println(p2.color + p2.nombre + " ganó!!!");
        }

    }
}