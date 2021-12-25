
import java.util.InputMismatchException;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.x.protobuf.MysqlxConnection.Close;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;  

public class App {

    static Connection conn;

    public static void main(String[] args) throws Exception {
        
        Transaksi a = new Transaksi();
        Scanner terimaInput = new Scanner (System.in);
        int pilihan;

        System.out.println("=====================================================\n");
        System.out.println("                      SELAMAT DATANG ");
        System.out.println("\n=====================================================\n");
        a.Antri();
        
        while(a.penjualan){
            a.Queue();
            while (a.penjualan) {

                System.out.println("\n1.Transaksi\n2.Input db\n3.Ubah Data db\n4.Hapus Data db\n5.Cari Data db\n6.View Data db");
            pilihan = terimaInput.nextInt();
            switch (pilihan) {

                case 1:
                a.TransaksiJual();
                    
                    break;

                case 2:
                a.inputData();
                    
                    break;
                    
                case 3:
                a.Update();
                    
                    break;
                    
                case 4:
                a.hapusdata();
                    break;
                    
                case 5:
                a.Search();
                    
                    break;
                    
                case 6:
                a.View();
                    
                    break;

                default:
                System.err.println("\nInput anda tidak ditemukan\nSilakan pilih [1-6]");

                    break;
            }
    
            
        System.out.println("\n\n\n\n");
        System.out.println("********************************************************");
        System.out.println("Lanjutkan pilihan  ? [ y/n ]");
        a.pilihan = a.input.next();
		a.penjualan = a.pilihan.equalsIgnoreCase("y");
        System.out.println("********************************************************");
                
            }
            
        System.out.println("\n\n\n\n");
        System.out.println("********************************************************");
        System.out.println("Lanjut ke Costumer Selanjutnya ? [ y/n ]");
        a.pilihan = a.input.next();
		a.penjualan = a.pilihan.equalsIgnoreCase("y");
        System.out.println("********************************************************");

        } System.out.println("\nBye.... Selamat Berjumpa Kembali!!!");
    } 
}
