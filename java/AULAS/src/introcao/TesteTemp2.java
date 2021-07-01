package introcao;

public class TesteTemp2 {
	
	public static void main(String[] args) {
		
		String nome = "João"; //%s
		double tempCelsius, tempFarenheit = 46.4, tempKelvin; //%f
		//(46 °F − 32) × 5/9 = 8 °C
		//8 °C + 273,15 = 281,15 K

		tempCelsius = (tempFarenheit - 32) * 5/9;
		tempKelvin = tempCelsius + 273.15;
		
		System.out.println(nome+", onde você mora está fazendo "+tempCelsius+" °F, equivalente a "+tempKelvin+"°K.\n");
		System.out.printf("%s, onde você mora está fazendo 2%f°F, equivalente a 2%f°K.", nome, tempFarenheit, tempKelvin);
		
	}	
}
