public class ejercicio3{
	public static void main (String args[]){
		int valor = suma(1,2,3);
		System.out.println("Suma es: " + valor);
	}

	public static int suma(int a, int b, int c){
		int resultado = a + b + c;
		return resultado;
	}
}

public class coche{
    
    public static void main(String args[]){
        coche miCoche = new coche();
        int resultado = c.incrementar(4);
        System.out.println("Resultado es: " + resultado);
    }

	int noPuertas = 0;

	public int incrementar(int no){
		for(int i=0; i<no; i++){
		    System.out.println(i);
			noPuertas++;
		}

		return noPuertas;
	}

}