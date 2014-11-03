import java.lang.String;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;


public final class principal_monjos {


    public static void main(String[] args) {

    	//variables

    	int billet = (int) (Math.random()*(20-10+1)+10);
		//ArrayList de monjos
		List<monjo> lista = new ArrayList<monjo>();
		int intervalo = (int) (Math.random()*8+3);
		for (int i =0 ; i <5; i++){
			//agregamos monjos
			lista.add(new monjo(monjo.getNombre(), monjo.getDinero(),monjo.getPiedras()));
			System.out.println(lista.get(i));
		}
		System.out.println("PRECIO DEL BILLETE : " + billet);

		//tirar dado
		dado numero = new dado();
		numero.TirarDado();
		System.out.println("NUMERO DE LA SUERTE" + numero);
		//imprimimos monjos
		//System.out.println(lista.toString());

		//for (int i = 0 ;i<lista.size();i++){
		//	System.out.println(lista.get(i));
		//}
    }
}
