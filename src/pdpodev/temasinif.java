package pdpodev;

public class temasinif {

	//Her S�n�fta Bulunan Ortak De�i�kenler
	private String isim;
	private int agirlik;
	private int ayaksayisi;
	
	public temasinif(String isim,int agirlik,int ayaksayisi){
		//Kurucu Metod ( constructor )
		this.agirlik = agirlik;
		this.ayaksayisi = ayaksayisi;
		this.isim = isim;
	}
	
	//Y�k�c� Metod ( destructor )
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	//Get ve Set Metodlar�
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getAgirlik() {
		return agirlik;
	}
	public void setAgirlik(int agirlik) {
		this.agirlik = agirlik;
	}
	public int getAyaksayisi() {
		return ayaksayisi;
	}
	public void setAyaksayisi(int ayaksayisi) {
		this.ayaksayisi = ayaksayisi;
	}

	
	
	
}
