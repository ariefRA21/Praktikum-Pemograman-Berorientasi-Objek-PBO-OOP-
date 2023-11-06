import java.util.Arrays;

class array{
    String[][] negara;

    array(String[][] dataArray){
        this.negara = dataArray;
    }

}
public class NegaraIbukota {
    public static void main(String[] args) {
        String[][] negara = new String[5][2];
        negara[0][0] = "Irak";      negara[0][1] = "Bagdad";
        negara[1][0] = "Austria";   negara[1][1] = "Wina";
        negara[2][0] = "Indonesia"; negara[2][1] = "Jakarta";
        negara[3][0] = "Iran";      negara[3][1] = "Teheran";
        negara[4][0] = "Jepang";    negara[4][1] = "Tokyo";
        String Negara;
        int baris;
        for(baris = 0; baris < negara.length;baris++){
            Negara = negara [baris][0];
            System.out.println("Ibukota " + negara[baris][0] + " adalah "+ negara[baris][1]);
        }
    }
}
