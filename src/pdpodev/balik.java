package pdpodev;

public class balik {

	private int solungacsayisi; // K�pek S�n�f� Yerel De�i�keni
	private temasinif[] tema;   // Tema S�n�f�ndan T�retilen S�n�f
	
	//Kurucu Metod ( constructor )
	public balik(int temasinifsayisi) {
		tema = new temasinif[temasinifsayisi]; // Tema S�n�f�ndan T�retilen s�n�f�n kullan�lmas�
	}
	
	//Y�k�c� Metod ( destructor )
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
