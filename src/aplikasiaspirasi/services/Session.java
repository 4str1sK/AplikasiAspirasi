package aplikasiaspirasi.services;

public class Session {

    private static String nis;
    private static String kelas;

    public static void setSession(
        String nisValue,
        String kelasValue
    ) {

        nis = nisValue;
        kelas = kelasValue;
    }

    public static String getNis() {
        return nis;
    }

    public static String getKelas() {
        return kelas;
    }

    public static void clear() {

        nis = null;
        kelas = null;
    }
}