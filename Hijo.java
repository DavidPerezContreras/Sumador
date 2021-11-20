
public class Hijo {

	public static void main(String[] args) {
			//Recibe dos argumentos por consola
			//numero1
			//numero2
			
		
			//Realiza la suma de esos numeros y lo imprime por pantalla
		if(args.length==2) {//Comprueba el numero de argumentos
			int suma=0;
			int numero1=Integer.parseInt(args[0]);
			int numero2=Integer.parseInt(args[1]);

			for(int i=numero1;i<=numero2;i++) {
				suma+=i;
				
			}
			
			System.out.println(suma);
		}else {
			System.err.println("Comprueba el numero de argumentos");
		}
		
		
		
		
		
		
		
	}

}
