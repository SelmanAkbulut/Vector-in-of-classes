package pdpodev;

public class kopek {

	private int pence; 			// K�pek S�n�f� Yerel De�i�keni
	private temasinif[] tema;   // Tema S�n�f�ndan T�retilen S�n�f

	
	public kopek(int temasinifsayisi) {
		tema = new temasinif[temasinifsayisi]; // Tema S�n�f�ndan T�retilen s�n�f�n kullan�lmas�
	}
	

	//Get ve Set Metodlar�

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
