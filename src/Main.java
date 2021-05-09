import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Para tutarýný giriniz:");
		Scanner girdi= new Scanner(System.in);
		double tutar= girdi.nextDouble();
		double sonuc = 0;
		
		if(tutar>=0 && tutar<=1000) {
			sonuc = tutar + (tutar*18)/100;
		}
		else if(tutar>1000){
			sonuc = tutar + (tutar*8)/100;
		}
		
		System.out.println("KDV'li Fiyat :" + sonuc);
		

	}

}
