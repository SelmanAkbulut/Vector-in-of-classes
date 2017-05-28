package pdpodev;

public class balik {

	private int solungacsayisi; // Köpek Sýnýfý Yerel Deðiþkeni
	private temasinif[] tema;   // Tema Sýnýfýndan Türetilen Sýnýf
	
	//Kurucu Metod ( constructor )
	public balik(int temasinifsayisi) {
		tema = new temasinif[temasinifsayisi]; // Tema Sýnýfýndan Türetilen sýnýfýn kullanýlmasý
	}
	
	//Yýkýcý Metod ( destructor )
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}


	public int getSolungacsayisi() {
		return solungacsayisi;
	}
	public void setSolungacsayisi(int solungacsayisi) {
		this.solungacsayisi = solungacsayisi;
	}
	public temasinif[] getTema() {
		return tema;
	}
	public void setTema(temasinif[] tema) {
		this.tema = tema;
	}
	
	
	
	
}
