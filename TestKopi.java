/**
 * Created by ASUS on 6/10/2015.
 */
public class TestKopi {
    public static void main(String[] args) {

        Penikmat noviansyah = new Penikmat ("Moch. Rosid Noviansyah","Bojonegoro","Laki-Laki","Single","WenakTenan");
        System.out.println("Rincian Data : "+ noviansyah.toString());
        System.out.println("Alamat Penikmat Kopi:" + noviansyah.getAlamatPenikmat() );
        System.out.println("Jenis Kelamin :" + noviansyah.getJenisKelamin());
        System.out.println("Status Penikmat :" + noviansyah.getBiodataRinci());
        System.out.println("Penikmat Kopi :" + noviansyah.getPenikmatKopi());

    }
}
