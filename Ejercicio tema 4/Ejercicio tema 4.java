public class control{

	public static void main(String args[]){

        control myControl = new control();
        int numeroIf = 9;
		String analisis = myControl.isValor(numeroIf);
		System.out.println(analisis);
		// ------------------
		int numeroWhile = 0;
		myControl.incrementWhile(numeroWhile);
		// ------------------
		int numeroDoWhile = 2;
		myControl.incrementDoWhile(numeroDoWhile);
		// ------------------
		myControl.incrementFor();
		// ------------------
		myControl.decide("verano");
	}

	public String isValor(int numeroIf){

		String resultado = "";
		if(numeroIf > 0){
			return resultado = "Es Positivo";
		}else if(numeroIf < 0){
			return resultado = "Es Negativo";
		}else {
			return resultado = "Es Cero";
		}
	}
	
	public void incrementWhile(int numeroWhile){
		while (numeroWhile < 3){
			numeroWhile++;
			System.out.println("While: " +numeroWhile);
		}
	}

	public void incrementDoWhile(int numeroDoWhile){

		do{
		    System.out.println("Do While: " +numeroDoWhile);
			numeroDoWhile++;
		}while (numeroDoWhile < 3);
	}

	public void incrementFor(){
		for (int numeroFor=0; numeroFor <= 3; numeroFor++){
			System.out.println("numeroFor is: "+ numeroFor);
		}
	}

	public void decide(String estacion){

		switch(estacion){
			case "verano":
				System.out.println("Estacino de Verano");
				break;
			case "invierno":
				System.out.println("Estacino de Invierno");
				break;
			case "otoño":
				System.out.println("Estacino de Otoño");
				break;
			case "primavera":
				System.out.println("Estacino de Primavera");
			break;
			default:
				System.out.println("Estacion no reconocida");
				break;

		}
	}
}