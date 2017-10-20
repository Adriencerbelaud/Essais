import java.util.Scanner;

public class dateBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dateBuilder[][] = {
				{"janvier", "fevrier", "mars", "avril", "mai", "juin", "juillet", "aout", "septembre", "octobre", "novembre", "decembre"},
				{"dimanche", "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche"}
			};
				
		Scanner sc  = new Scanner(System.in);
		int dday = sc.nextInt();
		int ind = 999;
		int num = 0;
		int jone = 5; //lundi:0 dimanche:6
		
		int nbjours[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int max = 0;
		int min = 0;
		boucle: for (int i = 0 ; i < 12; i++){
			max += nbjours[i];
			if (dday < max){
				ind = i;
				num = dday - min;
				break boucle;
			}
			min += nbjours[i];
			}
		
		/*
		if (i < 32){
				ind = 0;
				num = i; 
		}else if(i < 61){
				ind = 1;
				num = i - 31;
		}else if(i < 92){
				ind = 2;
				num = i - 60;
		}else if(i < 122){
				ind = 3;
				num = i - 91;
		}else if(i < 153){
				ind = 4;
				num = i - 121;
		}else if(i < 183){
				ind = 5;
				num = i - 152;
		}else if(i < 214){
				ind = 6;
				num = i - 182;
		}else if(i < 245){
				ind = 7;
				num = i - 213;
		}else if(i < 275){
				ind = 8;
				num = i - 244;
		}else if(i < 306){
				ind = 9;
				num = i - 274;
		}else if(i < 337){
				ind = 10;
				num = i - 305;
		}else if(i < 367){
				ind = 11;
				num = i - 335;
		}
		*/
		
		int indj = (dday+ jone) % 7;
		System.out.print(dateBuilder[1][indj]);
		System.out.print(" " + num + " ");
		System.out.println(dateBuilder[0][ind]);
	}

}
