import java.util.Random;
import java.util.Scanner;
public class monjo {

	//constructros
	private static int MisPiedras, piedras;
	private static int dinero;
	private static String nombre ;

	public monjo(){
        this.nombre = null;
        this.dinero = 0;
        this.piedras = 0;
	}

    public monjo(final String elnom, final int dinero, final int piedras, String nombre) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.piedras = piedras;
    }

	public static String GetNombre() {
		nombre += 1;
		return nombre;
	}

	public static int getPiedras() {
		piedras= (int)(Math.random()*(6)+1);
		return piedras;
	}

	public static void setMisPiedras(int misPiedras) {
		MisPiedras = misPiedras;
	}

	public static void setPiedras(int piedras) {
		monjo.piedras = piedras;
	}

	public static int getDinero() {
		return dinero;
	}

	public static void setDinero(int dinero) {
		monjo.dinero = dinero;
	}

	public static int getNombre() {
		return nombre;
	}

	public static void setNombre(int nombre) {
		monjo.nombre = nombre;
	}

	public static int setDinero() {
		dinero= (int) (Math.random()*(10)+1);
		return dinero;
	}

	public static int setPiedras() {

	}

	public String toString(){
		return " MONJO_" + monjo.nombre + " Dinero: " + monjo.dinero + " Piedras: "+ monjo.piedras;
	}


}

//private Random r= new Random();
static Scanner lectura = new Scanner(System.in);

public int NumeroEscoje(){
		MisPiedras = (int) (Math.random()*(6)+1);;
	return MisPiedras;
}
