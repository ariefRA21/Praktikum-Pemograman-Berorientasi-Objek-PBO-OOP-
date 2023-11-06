/*
 * NIM: 2103010029
 * Nama: Arief Rois Alamsyah
 * Kelas: Teknik Informatika A
 * ----LUAS LINGKARAN----
 */
class lingkaran implements Bangun_Datar{
    int r;
    double phi;

    lingkaran(double inputPhi, int inputjari){
        this.phi = inputPhi;
        this.r = inputjari;
    }

    @Override
    public double luas(int s1, int s2){
        return 0;
    }

    public double luas(int r){
        return (phi*r*r);
    }
}