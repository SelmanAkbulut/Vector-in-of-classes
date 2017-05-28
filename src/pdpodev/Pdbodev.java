package pdpodev;

import java.util.Scanner;
import java.util.Vector;


public class Pdbodev {

	static Vector<kopek> kopekvektor = new Vector<kopek>();
	static Vector<balik> balikvektor = new Vector<balik>();
	static Vector<orumcek> orumcekvektor = new Vector<orumcek>();
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner okuman = new Scanner(System.in);
		String isim;
		int agirlik,ayaksayisi,sayi;
		boolean zehir;
		kopekEkle("Labrador",50,4,12);
		kopekEkle("Golden",60,4,14);
		balikEkle("Hamsi", 150, 0, 2);
		balikEkle("Levrek", 180, 0, 2);
		orumcekEkle("Sparassidae", 20, 8, true);
		orumcekEkle("Nephila", 12, 10, false);
		
		while(true){
			int secim = 0;
			System.out.println("Programlama Dillerinin Prensipleri Class Odevi\n");
			System.out.println("Köpek Sýnýfýný Listelemek Ýçin : 1 ");
			System.out.println("Köpek Sýnýfýna Veri Eklemek Ýçin : 2 ");
			System.out.println("Balik Sýnýfýný Listelemek Ýçin : 3 ");
			System.out.println("Balik Sýnýfýna Veri Eklemek Ýçin : 4 ");
			System.out.println("Orumcek Sýnýfýný Listelemek Ýçin : 5 ");
			System.out.println("Orumcek Sýnýfýna Veri Eklemek Ýçin : 6 ");
			System.out.println("Bütün Class Verilerini Yazdir : 7");
			System.out.println("Programdan Cýkýs : 8");
			System.out.print("\nSecim : " );

			secim = okuman.nextInt();
			
			switch (secim){
				case 1:
					kopekYazdir(kopekvektor);
					break;
				case 2:
					System.out.print("Kopek Ýsmi : ");
					isim = okuman.next();
					System.out.print("Kopek Agirlik : ");
					agirlik = okuman.nextInt();
					System.out.print("Kopek Ayak Sayisi : ");
					ayaksayisi = okuman.nextInt();
					System.out.print("Kopek Pence Sayisi : ");
					sayi = okuman.nextInt();
					kopekEkle(isim,agirlik,ayaksayisi,sayi);
					break;
				case 3:
					balikYazdir(balikvektor);
					break;
				case 4:
					System.out.print("Balýk Ýsmi : ");
					isim = okuman.next();
					System.out.print("Balýk Agirlik : ");
					agirlik = okuman.nextInt();
					System.out.print("Balýk Ayak Sayisi : ");
					ayaksayisi = okuman.nextInt();
					System.out.print("Balýk Solungac Sayisi : ");
					sayi = okuman.nextInt();
					balikEkle(isim,agirlik,ayaksayisi,sayi);
					break;
				case 5:
					orumcekYazdir(orumcekvektor);
					break;
				case 6:
					System.out.print("Orumcek Ýsmi : ");
					isim = okuman.next();
					System.out.print("Orumcek Agirlik : ");
					agirlik = okuman.nextInt();
					System.out.print("Orumcek Ayak Sayisi : ");
					ayaksayisi = okuman.nextInt();
					System.out.print("Orumcek Zehirli Mi(true / false) : ");
					zehir = okuman.nextBoolean();
					orumcekEkle(isim,agirlik,ayaksayisi,zehir);
					break;
				case 7:
					System.out.println("Kopek Sýnýfý ");
					kopekYazdir(kopekvektor);
					System.out.println("Balýk Sýnýfý ");
					balikYazdir(balikvektor);
					System.out.println("Orumcek Sýnýfý ");
					orumcekYazdir(orumcekvektor);
					break;
				case 8:
					System.exit(1);
			}
		}
		
	}
	
	public static void kopekYazdir(Vector<kopek> vektor){
		
		int boyut = vektor.size();
		for(int i = 0 ; i < boyut ; i++){
			System.out.println("Köpek Isim : " + ((kopek) vektor.elementAt(i)).getTema()[0].getIsim());
			System.out.println("Köpek Agirlik : " + ((kopek) vektor.elementAt(i)).getTema()[0].getAgirlik() +"kg");
			System.out.println("Köpek Ayak Sayisi : " + ((kopek) vektor.elementAt(i)).getTema()[0].getAyaksayisi());
			System.out.println("Köpek Pence : " + ((kopek) vektor.elementAt(i)).getPence());
			System.out.println();
		}
		
	}
	
	public static void kopekEkle(String isim,int agirlik,int ayak,int pence){
		
		kopek kopeksinif = new kopek(1);
		kopeksinif.getTema()[0] = new temasinif(isim, agirlik , ayak);
		kopeksinif.setPence(pence);
		kopekvektor.add(kopeksinif);
		kopeksinif = null;
		System.gc();
	}
	
	public static void balikYazdir(Vector<balik> vektor){
		
		int boyut = vektor.size();
		for(int i = 0 ; i < boyut ; i++){
			System.out.println("Balýk Isim : " + ((balik) vektor.elementAt(i)).getTema()[0].getIsim());
			System.out.println("Balýk Agirlik : " + ((balik) vektor.elementAt(i)).getTema()[0].getAgirlik() +"gram");
			System.out.println("Balýk Ayak Sayisi : " + ((balik) vektor.elementAt(i)).getTema()[0].getAyaksayisi());
			System.out.println("Balýk Solungaç Sayýsý : " + ((balik) vektor.elementAt(i)).getSolungacsayisi());
			System.out.println();
		}
		
	}
	
	public static void balikEkle(String isim,int agirlik,int ayak,int solungac){
		
		balik baliksinif = new balik(1);
		baliksinif.getTema()[0] = new temasinif(isim, agirlik , ayak);
		baliksinif.setSolungacsayisi(solungac);
		balikvektor.add(baliksinif);
		baliksinif = null;
		System.gc();
	}
	
	public static void orumcekYazdir(Vector<orumcek> vektor){
		
		int boyut = vektor.size();

		for(int i = 0 ; i < boyut ; i++){
			System.out.println("Orumcek Isim : " + ((orumcek) vektor.elementAt(i)).getTema()[0].getIsim());
			System.out.println("Orumcek Agirlik : " + ((orumcek) vektor.elementAt(i)).getTema()[0].getAgirlik() + "gram");
			System.out.println("Orumcek Ayak Sayisi : " + ((orumcek) vektor.elementAt(i)).getTema()[0].getAyaksayisi());
			System.out.println("Orumcek Pence : " + ((orumcek) vektor.elementAt(i)).isZehirlimi());
			System.out.println();
		}
		
	}
	
	public static void orumcekEkle(String isim,int agirlik,int ayak,boolean zehirlimi){
		
		orumcek orumcesinif = new orumcek(1);
		orumcesinif.getTema()[0] = new temasinif(isim, agirlik , ayak);
		orumcesinif.setZehirlimi(zehirlimi);
		orumcekvektor.add(orumcesinif);
		orumcesinif = null;
		System.gc();
	}


}
