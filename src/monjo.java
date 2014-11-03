import java.util.Random;
import java.util.Scanner;
public class monjo {

	//constructros
	private static int MisPiedras, piedras;
	private static int dinero;
	private static int nombre ;

	//private Random r= new Random();
	static Scanner lectura = new Scanner(System.in);

	public int NumeroEscoje(){
		MisPiedras = (int) (Math.random()*(6)+1);;
		return MisPiedras;
	}

	public monjo(){

	}

    public monjo(final int elnom, final int dinersquete, final int pedresquete) {
        nombre = elnom;
        dinero = dinersquete;
        piedras = pedresquete;
    }

	public static int getNombre() {
		nombre += 1;
		return nombre;
	}

	public static int getDinero() {
		dinero= (int) (Math.random()*(10)+1);
		return dinero;
	}

	public static int getPiedras() {
		piedras= (int)(Math.random()*(6)+1);
		return piedras;
	}

	public String toString(){
		return " MONJO_" + monjo.nombre + " Dinero: " + monjo.dinero + " Piedras: "+ monjo.piedras;
	}


}
