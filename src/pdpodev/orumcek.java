package pdpodev;

public class orumcek {

	private boolean zehirlimi;
	private temasinif[] tema;   // Tema S�n�f�ndan T�retilen S�n�f

	//Kurucu Metod ( constructor )
	public orumcek(int temasinifsayisi) {
		tema = new temasinif[temasinifsayisi];
	}
	
	//Y�k�c� Metod ( destructor )
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	//Get ve Set Metodlar�

	public boolean isZehirlimi() {
		return zehirlimi;
	}
	public void setZehirlimi(boolean zehirlimi) {
		this.zehirlimi = zehirlimi;
	}
	public temasinif[] getTema() {
		return tema;
	}
	public void setTema(temasinif[] tema) {
		this.tema = tema;
	}

	
	
}
