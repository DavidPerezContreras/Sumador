import java.io.IOException;
import java.util.Scanner;

public class Padre{

	public static void main(String[]args){
		//El hijo recibe dos numeros por consola 
		
		//El padre(Este programa) tambien.
		if(args.length==2) {
			int numero1=Integer.parseInt(args[0]);
			int numero2=Integer.parseInt(args[1]);
			
			int diferencia=numero2-numero1;
			int resto=diferencia%4;
			//System.out.println("Resto= "+resto);
			int rango1=diferencia/4+(resto>=1?1:0);
			int rango2=diferencia/4+(resto>=2?1:0);
			int rango3=diferencia/4+(resto>=3?1:0);
			int rango4=diferencia/4;
			
			
			//System.out.printf("Rango 1= %d%n",rango1);
			//System.out.printf("Rango 2= %d%n",rango2);
			//System.out.printf("Rango 3= %d%n",rango3);
			//System.out.printf("Rango 4= %d%n",rango4);
			
			
			ProcessBuilder[] pbHijo = new ProcessBuilder[4];
			pbHijo[0]=new ProcessBuilder("java","Hijo",Integer.toString(numero1),Integer.toString(numero1+rango1));
			pbHijo[1]=new ProcessBuilder("java","Hijo",Integer.toString(numero1+rango1+1),Integer.toString(numero1+rango1+rango2));
			pbHijo[2]=new ProcessBuilder("java","Hijo",Integer.toString(numero1+rango1+rango2+1),Integer.toString(numero1+rango1+rango2+rango3));
			pbHijo[3]=new ProcessBuilder("java","Hijo",Integer.toString(numero1+rango1+rango2+rango3+1),Integer.toString(numero1+rango1+rango2+rango3+rango4));
			
			try {
				Process p0 =pbHijo[0].start();
				Process p1 =pbHijo[1].start();
				Process p2 =pbHijo[2].start();
				Process p3 =pbHijo[3].start();
				
				
				Scanner scHijo0 = new Scanner(p0.getInputStream());
				Scanner scHijo1 = new Scanner(p1.getInputStream());
				Scanner scHijo2 = new Scanner(p2.getInputStream());
				Scanner scHijo3 = new Scanner(p3.getInputStream());
				
				
				int suma=0;
				suma+=Integer.parseInt(scHijo0.nextLine());
				suma+=Integer.parseInt(scHijo1.nextLine());
				suma+=Integer.parseInt(scHijo2.nextLine());
				suma+=Integer.parseInt(scHijo3.nextLine());
				
				
				
				System.out.println("Suma= "+suma);
				p0.destroy();
				p1.destroy();
				p2.destroy();
				p3.destroy();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
		}else {
			System.err.println("Comprueba el numero de argumentos");
		}
	}


}
