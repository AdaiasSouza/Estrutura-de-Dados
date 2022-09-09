
public class Lista01 {

	public static void main(String[] args) {
		int[] valores = {1,2,3,100,-3,1000,-3000,1454,7400,-58975};
		int[] vetor = {1,2,3,4,5};
		
		System.out.println("Fatorial 4: "+fatorial(4));
		System.out.println("Somatorio 3: "+somatorio(3));
		System.out.println("Produtorio 3: "+produtorio(3));
		System.out.println("Maior: "+maiorValor(valores, 0, 0));
		System.out.println("Menor: "+menorValor(valores, 0, 0));	
		System.out.println("Media: "+mediaValores(vetor, 0, 0));
	} 

	public static int fatorial(int numero) {		
		if(numero == 0) {
			return 1;
		}
		else {
			return (numero*fatorial(numero-1));
		}
	}
	
	public static int somatorio(int numero) {
		if(numero == 0) {
			return 0;
		}
		else {
			return (numero + somatorio(numero-1));
		}
	}
	
	public static int produtorio(int numero) {
		if(numero == 0) {
			return 0;
		}
		else if(numero == 1) {
			return 1;
		}
		
		else {
			return (numero*produtorio(numero-1));
		}
	}
	
	public static int maiorValor(int[] vetor, int contador, int indice) {
		  if(vetor.length == 0) {
			  return 0;
		  }	  
		  else {		
			  if(contador < vetor.length) {
				  if(vetor[indice] <= vetor[contador] ) {
					  indice = contador;
				  }
				  return maiorValor(vetor, contador+1, indice);
			  }
			  
			  else {
				  return  vetor[indice];
			  }		  		  
		  }
	  }
	  
	public static int menorValor(int[] vetor, int contador, int indice) {
		  if(vetor.length == 0) {
			  return 0;
		  }	  
		  else {		
			  if(contador < vetor.length) {
				  if(vetor[indice] >= vetor[contador] ) {
					  indice = contador;
				  }
				  return menorValor(vetor, contador+1, indice);
			  }
			  
			  else {
				  return  vetor[indice];
			  }		  		  
		  }
	  }
	
	public static double mediaValores(int[] vetor, int contador, int acumulador) {
		if(vetor.length == 0) {
			return 0;
		}		
		else {
			if(contador < vetor.length) {
				acumulador = acumulador + vetor[contador];
				return mediaValores(vetor, contador+1, acumulador);
			}
			
			else {
				return (acumulador/contador); 
			}
		}
	}	
}
