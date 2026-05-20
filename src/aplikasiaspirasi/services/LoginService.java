package aplikasiaspirasi.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginService {

    public static boolean loginSiswa(
        String nisInput
    ) {

        try {

            Connection conn =
                Database.connect();

            String sql =
                "SELECT * FROM sim_siswa WHERE nis = ?";

            PreparedStatement ps =
                conn.prepareStatement(sql);

            ps.setString(1, nisInput);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {

                Session.setSession(
                    rs.getString("nis"),
                    rs.getString("kelas")
                );

                return true;
            }

        } catch(Exception e) {

            e.printStackTrace();
        }

        return false;
    }
    
    public static boolean loginAdmin(
    String username,
    String password
) {

    try {

        Connection conn =
            Database.connect();

        String sql =
            "SELECT * FROM sim_admin " +
            "WHERE username = ? " +
            "AND password = ?";

        PreparedStatement ps =
            conn.prepareStatement(sql);

        ps.setString(1, username);

        ps.setString(2, password);

        ResultSet rs = ps.executeQuery();

        if(rs.next()) {

            return true;
        }

    } catch(Exception e) {

        e.printStackTrace();
    }

    return false;
}
}