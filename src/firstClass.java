import java.util.Scanner;


public class firstClass {

	static String isbebe(Integer age){
		return (age > 3)? "enfant": "bébé";
		
	}
	
	public static void main(String[] args) {
		String tab[] = {"Tu as", " ans"};
		int age = 18;
		for (int i = 0; i<tab.length; i++ ){
			if (tab[i] == " ans"){
				System.out.print(" " + age);
			}			
			System.out.print(tab[i]);
		}
				
		System.out.println(age > 18 ?
				isbebe(age)	: "adultes"
				);
		
		
		Scanner sc  = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(i);
		
		System.out.print("Tu es un ");
		System.out.println(
				(age >= 18)? ( (age > 3)? "enfant" : "bébé") : "adulte"
				);
		
	}

}
