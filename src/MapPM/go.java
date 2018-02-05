package MapPM;

public class go {
	public static void main(String[] args) {
		MojaMapa map = new MojaMapa();
		MockoweDane mockoweDane = new MockoweDane(map);
		mockoweDane.dodajDane();

		String klucz;
		System.out.println(map.size());
		while (map.hasNext()) {
			klucz = map.next();
			System.out.println(klucz + " - " + map.get(klucz));
		}
	}
}
