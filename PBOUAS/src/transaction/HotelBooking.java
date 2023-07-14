package transaction;

import hotel.Room;

import java.time.LocalDate;

public class HotelBooking {
    private LocalDate tanggal;
    private Room kamar;
    private int lamaMenginap;

    // Constructor
    public HotelBooking(LocalDate tanggal, Room kamar, int lamaMenginap) {
        this.tanggal = tanggal;
        this.kamar = kamar;
        this.lamaMenginap = lamaMenginap;
    }

    // Getters and setters

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public Room getKamar() {
        return kamar;
    }

    public void setKamar(Room kamar) {
        this.kamar = kamar;
    }

    public int getLamaMenginap() {
        return lamaMenginap;
    }

    public void setLamaMenginap(int lamaMenginap) {
        this.lamaMenginap = lamaMenginap;
    }

    // Metode perhitungan total harga pemesanan

    public double calculateTotalPrice() {
        double hargaPerMalam = kamar.getHargaJual();
        return hargaPerMalam * lamaMenginap;
    }
}