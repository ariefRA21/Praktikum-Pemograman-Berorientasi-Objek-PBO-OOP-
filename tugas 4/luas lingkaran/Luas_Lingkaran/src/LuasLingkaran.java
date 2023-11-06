/*
 * NIM: 2103010029
 * Nama: Arief Rois Alamsyah
 * Kelas: Teknik Informatika A
 * ----LUAS LINGKARAN----
 */

 // Membuat interface Bangun_Datar
interface Bangun_Datar{

    // Method luas dengan tipe integer 
    public double luas(int s1, int s2);
}

// Membuat class lingkaran sekaligus mengimplementasikan dari interface Bangun_Datar
class lingkaran implements Bangun_Datar{

    // Mendeklarasikan 2 variabel yang akan digunakan
    int r;
    double phi;

    // Membuat construktor lingkaran
    lingkaran(double inputPhi, int inputjari){
        this.phi = inputPhi;
        this.r = inputjari;
    }

    // Melakukan overriding pada method luas
    @Override
    public double luas(int s1, int s2){
        return 0;
    }

    // Membuat method luas dengan rumus lingkaran
    public double luas(int r){
        return (phi*r*r); 
    }
}

// Membuat class utama
public class LuasLingkaran{
    public static void main( String[] args){

        // Membuat objek baru dan memasukan nilai phi 3.14-
        // dan juga memasukan nilai di inputjari 10
        lingkaran luasLingkaran1 = new lingkaran(3.14,10);

        // Melakukan pemanggilan objek dengan method luas
        luasLingkaran1.luas(luasLingkaran1.r);

        // Menampilkan output dari inputjari
        System.out.println("Luas lingkaran adalah: " + luasLingkaran1.luas(luasLingkaran1.r));
    }    
}