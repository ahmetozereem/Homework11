package Homework11;

public class Muhasebe extends Personel{
	
	int saatlikUcret;
	String statu;
	int maas;
	
	public Muhasebe(int id, String isim, String soyIsim, String adres, int telefon,int saatlikUcret,String statu, int maas) {
		super(id, isim, soyIsim, adres, telefon);
		this.saatlikUcret=saatlikUcret;
		this.statu=statu;
		this.maas=maas;
	}
	
	public Muhasebe() {
		super();
	}

	public int maasHesapla (int maas) {
		
		return this.maas=this.saatlikUcret*8*30;
	}

	public void showInfos() {
		
		super.showInfos();
		System.out.println("Personel saat ücreti: "+saatlikUcret+" Euro");
		System.out.println("Personel statüsü: " + statu);
		System.out.println("Personel maas: " + maas+" Euro");
	}

}
