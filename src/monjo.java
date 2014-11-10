import java.util.ArrayList;

public class monjo {

	//VARIABLES
	private int dinero;
	private String nombre;
	private int piedras;

	//CONSTRUCTORES
	public monjo(){
        this.nombre = null;
        this.dinero = 0;
        this.piedras = 0;
	}

    public monjo(final String nombre, final int dinero, final int piedras) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.piedras = piedras;
    }

	//GETTERS
    public final int getDinero() {
		return dinero;
	}

	public final String getNombre() {
		return nombre;
	}

	public final int getPiedras() {
		return piedras;
	}

	// ACCIONES
	public final int DarPiedras() {
		piedras= (int)(Math.random()*(6)+1);
		return piedras;
	}

	public final int DarDinero() {
		dinero= (int) (Math.random()*(10)+1);
		return dinero;
	}

	public final String DarNombre() {
		ArrayList<Integer>repetidos = new ArrayList();
		ArrayList<Integer>numerosCorrectos = new ArrayList();
		int i= (int) (Math.random()*(100)+1);
		for()
		if (){
			repetidos.add(i);
		}

		nombre = String.format("Monje_%s", i);
		return nombre;
	}


}

