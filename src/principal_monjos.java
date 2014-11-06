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
		int sumaDinero = 0;
		int cantidadDeBilletes = 0;
		//INGRESAMOS 5 MONJES
		for (int i =0 ; i<5; i++){

			nombre = sujeto.DarNombre();
			dinero = sujeto.DarDinero();
			piedra = sujeto.DarPiedras();
			monjos.add(sujeto);
			//monjos.add(sujeto.DarNombre(),sujeto.DarDinero(),sujeto.DarPiedras());
			System.out.println(nombre+" "+ dinero+ " " + piedra);
		}

		//PNTAMOS PRECIO BILLETE
		System.out.println("PRECIO DEL BILLETE : " + billet);

		for(monjo o: monjos){
			System.out.println(o.getNombre()+" "+o.getDinero()+" "+o.getPiedras());
		}

		//TOTAL DINERO
		for (int i = 0;i<monjos.size();i++){
			sumaDinero += sujeto.getDinero();
		}
		System.out.println(sumaDinero);

		//CANTIDAD DE BILLETES
		while (!(sumaDinero < billet)){
			sumaDinero = sumaDinero-billet;
			cantidadDeBilletes ++;
		}
		System.out.println(cantidadDeBilletes);

		//PRINCIPAL
		while ( monjos.size() > cantidadDeBilletes){
			numero.TirarDado();
			System.out.println("NUMERO DE LA SUERTE : " + numero.getNumero());
			for (int i = 0; i < monjos.size(); i++){
				if (numero.getNumero() == monjos.get(i).getPiedras()){
					System.out.println(monjos.get(i).getNombre()+" "+monjos.get(i).getDinero()+" "+monjos.get(i).getPiedras());
					monjos.remove(i);
				}
			}
		}

		/*for (int i =0 ; i<monjos.size(); i++){

			System.out.println(sujeto.getNombre()+" "+ sujeto.getDinero()+ " " + sujeto.getPiedras());
			System.out.println(monjos.get(i));
		}*/

    }
}
