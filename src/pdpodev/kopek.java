package pdpodev;

public class kopek {

	private int pence; 			// Köpek Sýnýfý Yerel Deðiþkeni
	private temasinif[] tema;   // Tema Sýnýfýndan Türetilen Sýnýf

	
	public kopek(int temasinifsayisi) {
		tema = new temasinif[temasinifsayisi]; // Tema Sýnýfýndan Türetilen sýnýfýn kullanýlmasý
	}
	

	//Get ve Set Metodlarý

	public temasinif[] getTema() {
		return tema;
	}

	public void setTema(temasinif[] tema) {
		this.tema = tema;
	}

	public int getPence() {
		return pence;
	}

	public void setPence(int pence) {
		this.pence = pence;
	}
	
}
