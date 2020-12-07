 import java.util.Scanner;

 public class Peminjaman{
 public static void main(String[] args) {
        // TODO code application logic here
        Scanner kode=new Scanner (System.in);
        System.out.println("masukan nama peminjam");
        String nama=kode.next();
        System.out.println("masukan kode = ");
        int angka=kode.nextInt();
        if (angka==1){
            System.out.println("Laskar Pelangi");
            System.out.println("Andrea Hirata");
            System.out.println("Gramedia");
        }else if(angka==2){
            System.out.println("Avatar");
            System.out.println("Hiroku");
            System.out.println("Maxindo");
        }else if(angka==3){
            System.out.println("Kambing jantan");
            System.out.println("Raditya Dika");
            System.out.println("Gramedia");
        }
        else{
        	System.out.println("Buku Tidak Tersedia");
        }
        System.out.println();
        System.out.println("Lama peminjaman = ");
        int lama=kode.nextInt();
        if (lama==1){
            System.out.println("Biaya Peminjaman 1 Bulan = Rp.10.000");
        }else if (lama<=3){
            System.out.println("Biaya peminjaman 2 dan 3 bulan = Rp.50.000");
        }else if(lama>=3){
            System.out.println("Biaya peminjaman lebih dari 3 bulan= Rp.100.000");
        }
     }
 }