package com.mycompany.tubes_dpbo.pemesanan;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MobilTest {

    @Test
    public void testTotalHargaCibiru() {
        System.out.println("========== MENGUJI TUJUAN CIBIRU ==========");
        // Arrange
        Mobil mobil = new Mobil("John Doe", "Buah Batu", "Cibiru", "Mobil");
        System.out.println("Pemesan: " + mobil.getName() + " | Tujuan: " + mobil.getDestination());

        // Act
        int harga = mobil.totalHarga();
        System.out.println("Hasil perhitungan totalHarga() = Rp " + harga);

        // Assert
        // Cibiru (14 km) * 5000 = 70000
        assertEquals(70000, harga, "Harga untuk tujuan Cibiru seharusnya 70000");
        System.out.println("TEST CIBIRU BERHASIL! Harga sesuai (Rp 70000)\n");
    }

    @Test
    public void testTotalHargaCimahi() {
        System.out.println("========== MENGUJI TUJUAN CIMAHI ==========");
        // Arrange
        Mobil mobil = new Mobil("Jane Doe", "Bandung", "Cimahi", "Mobil");
        System.out.println("Pemesan: " + mobil.getName() + " | Tujuan: " + mobil.getDestination());

        // Act
        int harga = mobil.totalHarga();
        System.out.println("Hasil perhitungan totalHarga() = Rp " + harga);

        // Assert
        // Cimahi (18 km) * 5000 = 90000
        assertEquals(90000, harga, "Harga untuk tujuan Cimahi seharusnya 90000");
        System.out.println("TEST CIMAHI BERHASIL! Harga sesuai (Rp 90000)\n");
    }

    @Test
    public void testTotalHargaUnknown() {
        System.out.println("========== MENGUJI TUJUAN TIDAK DIKETAHUI ==========");
        // Arrange
        Mobil mobil = new Mobil("Alice", "Dago", "Jakarta", "Mobil");
        System.out.println("Pemesan: " + mobil.getName() + " | Tujuan: " + mobil.getDestination());

        // Act
        int harga = mobil.totalHarga();
        System.out.println("Hasil perhitungan totalHarga() = Rp " + harga);

        // Assert
        // Unknown destination = 0
        assertEquals(0, harga, "Harga untuk tujuan tidak diketahui seharusnya 0");
        System.out.println("TEST TUJUAN TIDAK DIKETAHUI BERHASIL! Harga sesuai (Rp 0)\n");
    }
}
