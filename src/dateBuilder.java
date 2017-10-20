import java.util.Scanner;

public class dateBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dateBuilder[][] = {
				{"janvier", "fevrier", "mars", "avril", "mai", "juin", "juillet", "aout", "septembre", "octobre", "novembre", "decembre"
				},
				{"lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche"}
			
			}
				
		Scanner sc  = new Scanner(System.in);
		int i = sc.nextInt(sc);
		Switch (i){
			case i < 32:
				ind = 0;
				break;
			case i < 61:
				ind = 0;
				break;
			case i < 92:
				ind = 0;
				break;
			case i < 122:
				ind = 0;
				break;
			case i < 153:
				ind = 0;
				break;
			case i < 183:
				ind = 0;
				break;
			case i < 214:
				ind = 0;
				break;
			case i < 245:
				ind = 0;
				break;
			case i < 275:
				ind = 0;
				break;
			case i < 306:
				ind = 0;
				break;
			case i < 337:
				ind = 0;
				break;
			case i < 367:
				ind = 0;
				break;
		}
		System.out.println(datebuiler[ind]);
	}

}
