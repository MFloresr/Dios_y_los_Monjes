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
		ArrayList<monjo> monjos = new ArrayList<monjo>();
		int intervalo = (int) (Math.random()*8+3);
		for (int i =0 ; i<5; i++){
			//agregamos monjos
			monjo sujeto = new monjo();
			monjos.add(new monjo(monjo.DarNombre(), monjo.DarDinero(), monjo.DarPiedras()));
			System.out.println(monjos.get(i));
		}
		System.out.println("PRECIO DEL BILLETE : " + billet);

		System.out.println(intervalo);

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
