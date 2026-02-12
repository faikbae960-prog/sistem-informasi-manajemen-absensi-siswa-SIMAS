public class Siswa {
    private int idSiswa;
    private String namaSiswa;
    private String nis;
    private int idKelas;

    // Constructor, Getter, Setter
    public Siswa(int idSiswa, String namaSiswa, String nis, int idKelas) {
        this.idSiswa = idSiswa;
        this.namaSiswa = namaSiswa;
        this.nis = nis;
        this.idKelas = idKelas;
    }

    public int getIdSiswa() { return idSiswa; }
    public void setIdSiswa(int idSiswa) { this.idSiswa = idSiswa; }
    public String getNamaSiswa() { return namaSiswa; }
    public void setNamaSiswa(String namaSiswa) { this.namaSiswa = namaSiswa; }
    public String getNis() { return nis; }
    public void setNis(String nis) { this.nis = nis; }
    public int getIdKelas() { return idKelas; }
    public void setIdKelas(int idKelas) { this.idKelas = idKelas; }
}
