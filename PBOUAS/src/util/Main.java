package util;

import hotel.Room;
import transaction.HotelBooking;
import user.User;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Contoh penggunaan kelas-kelas yang telah dibuat

        // Membuat objek Room
        Room room1 = new Room("R001", 101, "Deluxe", 150.0);

        // Membuat objek User
        User user1 = new User("user", "password", "admin");
        User.createUser(user1);

        // Membuat objek HotelBooking
        LocalDate tanggalPemesanan = LocalDate.now();
        HotelBooking booking1 = new HotelBooking(tanggalPemesanan, room1, 3);

        // Menghitung total harga pemesanan
        double totalHarga = booking1.calculateTotalPrice();

        // Menampilkan informasi pemesanan
        System.out.println("Informasi Pemesanan:");
        System.out.println("Tanggal Pemesanan: " + tanggalPemesanan);
        System.out.println("Kode Kamar: " + room1.getKodeKamar());
        System.out.println("Jenis Kamar: " + room1.getJenisKamar());
        System.out.println("Harga Per Malam: " + room1.getHargaJual());
        System.out.println("Lama Menginap: " + booking1.getLamaMenginap());
        System.out.println("Total Harga: " + totalHarga);

        // Interaksi dengan pengguna
        System.out.println("Selamat datang di sistem pemesanan hotel!");

        // Halaman Login
        boolean loggedIn = false;
        User loggedInUser = null;

        while (!loggedIn) {
            System.out.println("Silakan login untuk melanjutkan.");
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            loggedInUser = User.readUser(username);
            if (loggedInUser != null && loggedInUser.getPassword().equals(password)) {
                System.out.println("Login berhasil!");
                System.out.println("Selamat datang, " + loggedInUser.getUsername() + "!");
                System.out.println();
                loggedIn = true;
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        }

        // Operasi pengelolaan kamar
        System.out.println("Operasi Pengelolaan Kamar");
        System.out.println("1. Tambah Kamar");
        System.out.println("2. Lihat Kamar");
        System.out.println("3. Update Kamar");
        System.out.println("4. Hapus Kamar");
        System.out.print("Pilih operasi (1-4): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Membersihkan baris

        switch (choice) {
            case 1:
                System.out.println("Tambah Kamar");
                // Tambahkan logika untuk menambahkan kamar
                break;
            case 2:
                System.out.println("Lihat Kamar");
                // Tambahkan logika untuk melihat kamar
                break;
            case 3:
                System.out.println("Update Kamar");
                // Tambahkan logika untuk mengupdate kamar
                break;
            case 4:
                System.out.println("Hapus Kamar");
                // Tambahkan logika untuk menghapus kamar
                break;
            default:
                System.out.println("Operasi tidak valid!");
                break;
        }

        scanner.close();
    }
}