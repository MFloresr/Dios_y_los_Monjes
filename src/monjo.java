import java.util.Random;
import java.util.Scanner;
public class monjo {

	//constructros
	private static int MisPiedras, piedras;
	private static int dinero;
	private static String nombre ;
	private Random r= new Random();
	static Scanner lectura = new Scanner(System.in);

	public int NumeroEscoje(){
		MisPiedras = (int) (Math.random()*(6)+1);;
		return MisPiedras;
	}

	public monjo(){

	}

    public monjo(final String elnom, final int dinersquete, final int pedresquete) {
        nombre = elnom;
        dinero = dinersquete;
        piedras = pedresquete;
    }

	public static String getNombre() {
		System.out.println("Introduce el nombre del monje :");
		nombre = lectura.nextLine(); //te pilla toda el string de nombres
		return nombre;
	}

	public static int getDinero() {
		dinero= (int) (Math.random()*(20)+1);
		return dinero;
	}

	public static int getPiedras() {
		piedras= (int)(Math.random()*(6)+1);
		return piedras;
	}

	public String toString(){
		return " nombre: " + this.nombre + " Dinero: " + this.dinero + " Piedras: "+ this.piedras;
	}


}
