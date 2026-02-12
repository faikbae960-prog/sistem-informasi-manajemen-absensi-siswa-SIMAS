import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SiswaDAO {
    public void tambahSiswa(Siswa siswa) throws SQLException {
        String sql = "INSERT INTO siswa (nama_siswa, nis, id_kelas) VALUES (?, ?, ?)";
        try (Connection conn = KoneksiDB.getKoneksi();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, siswa.getNamaSiswa());
            pstmt.setString(2, siswa.getNis());
            pstmt.setInt(3, siswa.getIdKelas());
            pstmt.executeUpdate();
        }
    }

    public List<Siswa> daftarSiswaPerKelas(int idKelas) throws SQLException {
        List<Siswa> daftarSiswa = new ArrayList<>();
        String sql = "SELECT * FROM siswa WHERE id_kelas = ?";
        try (Connection conn = KoneksiDB.getKoneksi();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idKelas);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Siswa siswa = new Siswa(
                        rs.getInt("id_siswa"),
                        rs.getString("nama_siswa"),
                        rs.getString("nis"),
                        rs.getInt("id_kelas")
                );
                daftarSiswa.add(siswa);
            }
        }
        return daftarSiswa;
    }
}
