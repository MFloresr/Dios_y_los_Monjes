
public class dado {

	//contructors
	private int numero;

	public dado(){

	}

	public  int TirarDado(){
		numero = (int) (Math.random()*(6)+1);
		return numero;
	}

	public final int getNumero() {
		return numero;
	}

}
