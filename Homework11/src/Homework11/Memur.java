package Homework11;

public class Memur extends Muhasebe {

	public Memur(int id, String isim, String soyIsim, String adres, int telefon, int saatlikUcret, String statu,
			int maas) {
		
		super(id, isim, soyIsim, adres, telefon, saatlikUcret, statu, maas);
		
	}

public static void main(String[] args) {
		
		Muhasebe person = new Muhasebe ();
		
		// Birinci memur nesnesi: 
		
		System.out.println ("Birinci memur için id numarasını giriniz, id 6 rakamdan olusmalıdır");
		int idSon1= person.idAtama();
		person.saatlikUcret=25;
		int maas1 =person.maasHesapla(person.saatlikUcret);
		Isci memur1 = new Isci(idSon1, "Ahmet", "Oz", "Almanya", 1234567, person.saatlikUcret, "Memur",maas1);
		System.out.println("");
		
		// Ikinci memur nesnesi:
		
		System.out.println ("Ikinci işci için id numarasını giriniz, id 6 rakamdan olusmalıdır");
		int idSon2= person.idAtama();
		person.saatlikUcret=10;
		int maas2 =person.maasHesapla(person.saatlikUcret);
		Isci memur2 = new Isci(idSon2, "Mehmet", "Ay", "Türkiye", 258967, person.saatlikUcret, "Memur",maas2);
		System.out.println("");
				
		// Ucuncu memur nesnesi:
		
		System.out.println ("Ucuncu işci için id numarasını giriniz, id 6 rakamdan olusmalıdır");
		int idSon3= person.idAtama();
		person.saatlikUcret=27;
		int maas3 =person.maasHesapla(person.saatlikUcret);
		Isci memur3 = new Isci(idSon3, "Mustafa", "Kara", "Hollanda", 2368748, person.saatlikUcret, "Memur",maas3);
		System.out.println("");
		
		
		Isci [] obj1 = new Isci [3];
		
		obj1[0]= memur1;
		obj1[1]= memur2;
		obj1[2]= memur3;
		
		memur1.showInfos();
		System.out.println("");
		memur2.showInfos();
		System.out.println("");
		memur3.showInfos();
		System.out.println("");
		
	}
}
