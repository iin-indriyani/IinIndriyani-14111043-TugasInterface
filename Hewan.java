//buktikan kelas abstract bebas menentukna method abstract dalam interface
public interface Hewan {
	String jenis = "Unggas";
	abstract void printJenis();
}

//buktikan interface tidak dapat di instansi
public interface Hewan {
	Hewan hwn = new Hewan();
}

//buktikan variabel static diimplementasi didalam program utama
public static void main (String [] args) {
	Interface hwn = new Interface();
	hwn.jenis();
}

//buktikan interface dapat mengekstends lebih dari satu interface
public interface AyamKampung extends Ayam, Hewan{

}

//buktikan interface tidak dapat mengimplementasi interface lain
public interface Hewan implements Ayam{

}