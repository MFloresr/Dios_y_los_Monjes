import java.lang.String;
import java.util.ArrayList;





public final class principal_monjos {


    public static void main(String[] args) {

    	//VARIABLES
    	int billet = (int) (Math.random()*(20-10+1)+10);
		ArrayList<monjo> monjos = new ArrayList<monjo>();
		dado numero = new dado();
		monjo sujeto = new monjo();
		String nombre;
		int dinero;
		int piedra;
		//INGRESAMOS 5 MONJES
		for (int i =0 ; i<5; i++){

			nombre = sujeto.DarNombre();
			dinero = sujeto.DarDinero();
			piedra = sujeto.DarPiedras();
			monjos.add(sujeto);
			System.out.println(nombre+" "+ dinero+ " " + piedra);
		}

		//PNTAMOS PRECIO BILLETE
		System.out.println("PRECIO DEL BILLETE : " + billet);

		//TIRAMOS DADO y PINTAMOS VALOR
		numero.TirarDado();
		System.out.println("NUMERO DE LA SUERTE : " + numero.getNumero());

		for(monjo o: monjos){
			System.out.println(o);
		}

		/*for (int i =0 ; i<monjos.size(); i++){

			System.out.println(sujeto.getNombre()+" "+ sujeto.getDinero()+ " " + sujeto.getPiedras());
			System.out.println(monjos.get(i));
		}*/

    }
}
