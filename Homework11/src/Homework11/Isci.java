package Homework11;


public class Isci extends Muhasebe{

	public Isci(int id, String isim, String soyIsim, String adres, int telefon, int saatlikUcret, String statu,
			int maas) {
		super(id, isim, soyIsim, adres, telefon, saatlikUcret, statu, maas);
		
		
	}
	
	public static void main(String[] args) {
		
		Muhasebe person = new Muhasebe ();
		
		// Birinci isci nesnesi: 
		
		System.out.println ("Birinci işci için id numarasını giriniz, id 6 rakamdan olusmalıdır");
		int idSon1= person.idAtama();
		person.saatlikUcret=25;
		int maas1 =person.maasHesapla(person.saatlikUcret);
		Isci isci1 = new Isci(idSon1, "Ahmet", "Oz", "Almanya", 1234567, person.saatlikUcret, "isci",maas1);
		
		// Ikinci isci nesnesi:
		
		System.out.println ("Ikinci işci için id numarasını giriniz, id 6 rakamdan olusmalıdır");
		int idSon2= person.idAtama();
		person.saatlikUcret=10;
		int maas2 =person.maasHesapla(person.saatlikUcret);
		Isci isci2 = new Isci(idSon2, "Mehmet", "Ay", "Türkiye", 258967, person.saatlikUcret, "isci",maas2);
				
		// Ucuncu isci nesnesi:
		
		System.out.println ("Ucuncu işci için id numarasını giriniz, id 6 rakamdan olusmalıdır");
		int idSon3= person.idAtama();
		person.saatlikUcret=27;
		int maas3 =person.maasHesapla(person.saatlikUcret);
		Isci isci3 = new Isci(idSon3, "Mustafa", "Kara", "Hollanda", 2368748, person.saatlikUcret, "isci",maas3);
		System.out.println("");
		
		
		Isci [] obj1 = new Isci [3];
		
		obj1[0]= isci1;
		obj1[1]= isci2;
		obj1[2]= isci3;
		
		isci1.showInfos();
		System.out.println("");
		isci2.showInfos();
		System.out.println("");
		isci3.showInfos();
		
	}


}
