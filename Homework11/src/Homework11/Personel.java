package Homework11;

import java.util.Scanner;

public class Personel {
	
	int id;
	String isim;
	String soyIsim;
	String adres;
	int telefon;
	
	public Personel() {
		super();
	}

	public Personel(int id, String isim, String soyIsim, String adres, int telefon) {
		super();
		this.id = id;
		this.isim = isim;
		this.soyIsim = soyIsim;
		this.adres = adres;
		this.telefon = telefon;
	}
	
	public int idAtama () {
		
		Scanner scan = new Scanner(System.in);
				
		String id1=scan.nextLine();	
		for (; ;) {
					
		if (id1.length()!=6) {
			
		System.out.println("id 6 rakamdan oluşmalıdır");
		System.out.println("Personelin id numarasını tekrar giriniz:");
		
		id1=scan.nextLine();
									
		}
		else if (id1.length()==6) {
			
		break;										
			}
			
		
	}
		int idSon1= Integer.parseInt(id1);
		return this.id=idSon1;
		
		
	}
	
	
	public void showInfos () {
		
		System.out.println("Personel Bilgileri: ");
		System.out.println("Personel id: " + id);
		System.out.println("Personel ismi: " + isim);
		System.out.println("Personel  soy ismi: " + soyIsim);
		System.out.println("Personel adresi: " + adres);
		System.out.println("Personel TEL. NO: " + telefon);
		
	}
	
	
}
