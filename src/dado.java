import java.util.Random;

public class dado {

	//contructors
	private int NumeroDado;
	private Random r= new Random();

	public dado(){

	}

	public  int TirarDado(){
		NumeroDado = (int) (Math.random()*(10)+1);
		return NumeroDado;
	}


}
