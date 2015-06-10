/**
 * Created by ASUS on 6/10/2015.
 */
public class Penikmat {

    private String NamaPenikmat;
    private String AlamatPenikmat;
    private String JenisKelamin;
    private String BiodataRinci;
    private String PenikmatKopi;

    public Penikmat(String namaPenikmat, String alamatPenikmat, String jenisKelamin, String biodataRinci, String penikmatKopi) {
        NamaPenikmat = namaPenikmat;
        AlamatPenikmat = alamatPenikmat;
        JenisKelamin = jenisKelamin;
        BiodataRinci = biodataRinci;
        PenikmatKopi = penikmatKopi;
    }

    public String getNamaPenikmat() {
        return NamaPenikmat;
    }

    public void setNamaPenikmat(String namaPenikmat) {
        NamaPenikmat = namaPenikmat;
    }

    public String getAlamatPenikmat() {
        return AlamatPenikmat;
    }

    public void setAlamatPenikmat(String alamatPenikmat) {
        AlamatPenikmat = alamatPenikmat;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        JenisKelamin = jenisKelamin;
    }

    public String getBiodataRinci() {
        return BiodataRinci;
    }

    public void setBiodataRinci(String biodataRinci) {
        BiodataRinci = biodataRinci;
    }

    public String getPenikmatKopi() {
        return PenikmatKopi;
    }

    public void setPenikmatKopi(String penikmatKopi) {
        PenikmatKopi = penikmatKopi;
    }

    @Override
    public String toString() {
        return "Penikmat{" +
                "NamaPenikmat='" + NamaPenikmat + '\'' +
                ", AlamatPenikmat='" + AlamatPenikmat + '\'' +
                ", JenisKelamin='" + JenisKelamin + '\'' +
                ", BiodataRinci='" + BiodataRinci + '\'' +
                ", PenikmatKopi='" + PenikmatKopi + '\'' +
                '}';
    }
}
