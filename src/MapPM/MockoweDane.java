package MapPM;

public class MockoweDane {
	MojaMapa map;
	public MockoweDane(MojaMapa mojaMapa) {
		this.map = mojaMapa;
	}
	public void dodajDane() {
		Rekord rekord;

		rekord = new Rekord();
		rekord.setImie("Piotr");
		rekord.setNazwisko("Michalski");
		rekord.setWiek(2);
		map.put(Integer.toString(map.size() + 1), rekord);

		rekord = new Rekord();
		rekord.setImie("Piotr");
		rekord.setNazwisko("Chmielewski");
		rekord.setWiek(45);
		map.put(Integer.toString(map.size() + 1), rekord);

		rekord = new Rekord();
		rekord.setImie("Grzegorz");
		rekord.setNazwisko("Augustyn");
		rekord.setWiek(44);
		map.put(Integer.toString(map.size() + 1), rekord);

		rekord = new Rekord();
		rekord.setImie("Marcin");
		rekord.setNazwisko("Rusnak");
		rekord.setWiek(34);
		map.put(Integer.toString(map.size() + 1), rekord);

		rekord = new Rekord();
		rekord.setImie("Marek");
		rekord.setNazwisko("Ocha�");
		rekord.setWiek(45);
		map.put(Integer.toString(map.size() + 1), rekord);
		
		rekord = new Rekord();
		rekord.setImie("Pawe�");
		rekord.setNazwisko("Kwinta");
		rekord.setWiek(44);
		map.put(Integer.toString(map.size() + 1), rekord);
		
		rekord = new Rekord();
		rekord.setImie("Irek");
		rekord.setNazwisko("Szala");
		rekord.setWiek(44 );
		map.put(Integer.toString(map.size() + 1), rekord);

		rekord = new Rekord();
		rekord.setImie("Ada�");
		rekord.setNazwisko("Ozga");
		rekord.setWiek(44 );
		map.put(Integer.toString(map.size() + 1), rekord);
		
		rekord = new Rekord();
		rekord.setImie("Krzysio");
		rekord.setNazwisko("Bana�");
		rekord.setWiek(44 );
		map.put(Integer.toString(map.size() + 1), rekord);
		
		rekord = new Rekord();
		rekord.setImie("Grze�");
		rekord.setNazwisko("Chor��yk");
		rekord.setWiek(44 );
		map.put(Integer.toString(map.size() + 1), rekord);
				
	}
}
