import java.lang.String;
import java.util.ArrayList;





public final class principal_monjos {


    public static void main(String[] args) throws InterruptedException {

    	//VARIABLES
    	int billet = (int) (Math.random()*(20-10+1)+10);
		ArrayList<monjo> monjos = new ArrayList<monjo>();
		dado numero = new dado();
		int sumaDinero = 0;
		int cantidadDeBilletes = 0;

		//INGRESAMOS 5 MONJES
		for (int i =0 ; i<20; i++){
			monjo sujeto = new monjo();
			String nombre = sujeto.DarNombre();
			int dinero = sujeto.DarDinero();
			int piedra = sujeto.DarPiedras();
			monjos.add(sujeto);
		}

		//MONJOS QUE TENEMOS
		for(monjo o: monjos){
			System.out.println(o.getNombre()+" "+o.getDinero()+" "+o.getPiedras());
		}
		//PNTAMOS PRECIO BILLETE
		System.out.println("PRECIO DEL BILLETE : " + billet);

		//TOTAL DINERO
		for(monjo o: monjos){
			sumaDinero += o.getDinero() ;
		}
		System.out.println("TOTAL DINERO: "+sumaDinero);

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
					System.out.println(monjos.get(i).getNombre()+" HA MUERTO");
					monjos.remove(i);
				}
			}
		}
		for(monjo o: monjos){
			System.out.println(o.getNombre()+" TIENE BILLETE DE VIAJE"); ;
		}
    }
}
