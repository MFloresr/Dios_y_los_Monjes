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
    public int getDinero() {
		return dinero;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPiedras() {
		return piedras;
	}

	// ACCIONES
	public int DarPiedras() {
		piedras= (int)(Math.random()*(6)+1);
		return piedras;
	}

	public int DarDinero() {
		dinero= (int) (Math.random()*(10)+1);
		return dinero;
	}

	public String DarNombre() {
		int i= (int) (Math.random()*(10)+1);
		nombre = String.format("Monje_%s", i);
		return nombre;
	}


}

