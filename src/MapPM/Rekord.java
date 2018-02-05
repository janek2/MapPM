package MapPM;

public class Rekord {
	private String imie;
	private String nazwisko;
	private int wiek;
	
	public void setImie(String imie) {
		this.imie = imie;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public void setWiek(int wiek) {
		this.wiek = wiek;
	}

	@Override
	public String toString() {
		return imie + " " + nazwisko + " (" + wiek + ")";
	}

}
