/*
 * NIM: 2103010029
 * Nama: Arief Rois Alamsyah
 * Kelas: Teknik Informatika A
 * ----Negara dan Ibukota----
 */

 // Membuat nama class
class array{ 
    
    // Isi variabel array
    String[][] negara =
    {{"Irak","Austria","Indonesia","Iran","Jepang"},
    {"Bagdad","Wina","Jakarta","Teheran","Tokyo"}};

    // Membuat construktor
    array(){

        // Menampilkan output dari isi variabel array
        System.out.println(negara[0][0]+" ibukotanya adalah "+negara[1][0]);
        System.out.println(negara[0][1]+" ibukotanya adalah "+negara[1][1]); 
        System.out.println(negara[0][2]+" ibukotanya adalah "+negara[1][2]); 
        System.out.println(negara[0][3]+" ibukotanya adalah "+negara[1][3]); 
        System.out.println(negara[0][4]+" ibukotanya adalah "+negara[1][4]); 
    }
}

// Membuat class utama
public class NegaradanIbukota { 
    public static void main(String[] args) {

        // Memanggil object array
        array kota = new array();
    }
}
