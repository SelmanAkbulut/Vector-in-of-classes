package pdpodev;

public class orumcek {

	private boolean zehirlimi;
	private temasinif[] tema;   // Tema Sýnýfýndan Türetilen Sýnýf

	//Kurucu Metod ( constructor )
	public orumcek(int temasinifsayisi) {
		tema = new temasinif[temasinifsayisi];
	}
	
	//Yýkýcý Metod ( destructor )
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	//Get ve Set Metodlarý

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
