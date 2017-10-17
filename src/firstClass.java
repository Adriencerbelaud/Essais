
public class firstClass {

	public static void main(String[] args) {
		String tab[] = {"Tu as", " ans"};
		int age = 18;
		for (int i = 0; i<tab.length; i++ ){
			if (tab[i] == " ans"){
				System.out.print(" " + age);
			}			
			System.out.print(tab[i]);
		}
	}

}
