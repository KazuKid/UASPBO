package hotel;

public class Room {
    private String kodeKamar;
    private int nomorKamar;
    private String jenisKamar;
    private double hargaJual;

    // Constructor
    public Room(String kodeKamar, int nomorKamar, String jenisKamar, double hargaJual) {
        this.kodeKamar = kodeKamar;
        this.nomorKamar = nomorKamar;
        this.jenisKamar = jenisKamar;
        this.hargaJual = hargaJual;
    }

    // Getters and setters

    public String getKodeKamar() {
        return kodeKamar;
    }

    public void setKodeKamar(String kodeKamar) {
        this.kodeKamar = kodeKamar;
    }

    public int getNomorKamar() {
        return nomorKamar;
    }

    public void setNomorKamar(int nomorKamar) {
        this.nomorKamar = nomorKamar;
    }

    public String getJenisKamar() {
        return jenisKamar;
    }

    public void setJenisKamar(String jenisKamar) {
        this.jenisKamar = jenisKamar;
    }

    public double getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(double hargaJual) {
        this.hargaJual = hargaJual;
    }

    // CRUD operations

    public void createRoom(Room room) {
        // Implementasi operasi create room
    }

    public Room readRoom(String kodeKamar) {
        // Implementasi operasi read room
        return null;
    }

    public void updateRoom(Room room) {
        // Implementasi operasi update room
    }

    public void deleteRoom(String kodeKamar) {
        // Implementasi operasi delete room
    }
}