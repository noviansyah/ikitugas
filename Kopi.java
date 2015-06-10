/**
 * Created by ASUS on 6/10/2015.
 */
public class Kopi {
    private String JenisKopi;
    private int JumlahKopi;
    private double hargaKopi;

    public Kopi(String jenisKopi, int jumlahKopi, double hargaKopi) {
        JenisKopi = jenisKopi;
        JumlahKopi = jumlahKopi;
        this.hargaKopi = hargaKopi;

    }

    public String getJenisKopi() {
        return JenisKopi;
    }

    public void setJenisKopi(String jenisKopi) {
        JenisKopi = jenisKopi;
    }

    public int getJumlahKopi() {
        return JumlahKopi;
    }

    public void setJumlahKopi(int jumlahKopi) {
        JumlahKopi = jumlahKopi;
    }

    public double getHargaKopi() {
        return hargaKopi;
    }

    public void setHargaKopi(double hargaKopi) {
        this.hargaKopi = hargaKopi;
    }

    @Override
    public String toString() {
        return "Kopi{" +
                "JenisKopi='" + JenisKopi + '\'' +
                ", JumlahKopi=" + JumlahKopi +
                ", hargaKopi=" + hargaKopi +
                '}';
    }
}
