
public class firstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String salut = "Bonjour";
		String qui = " à tous";
		System.out.println(salut + qui);
		
		String tab[] = {"Salut", " à tous"};
		System.out.println(tab[0] + tab[1]);
		
		for (String each : tab){
			System.out.print(each);
		}
	}

}
