package Fd5;

import java.util.Scanner;

public class MainTamu {
    public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    
    System.out.println("==========WELCOME TO FD'S MANSION=========");
        System.out.print("Banyak Tamu : ");
        int b = in.nextInt();
        Tamu buku[] = new Tamu[b];
        int t=0;
        do{
            System.out.print("Masukan nama\t\t\t: ");
            String x = in.next();
            System.out.print("Masukan No Telepon/HP\t\t: ");
            long y = in.nextLong();
            System.out.print("Masukkan asal kota\t\t: ");
            String z = in.next();
            buku[t]=new Tamu(x,y,z);
            t++;
            System.out.println("ID anda \t\t\t: "+Tamu.getTamu());
            System.out.println("==========================================");
        }
        while(t<b);{
        System.out.println("=============DATA  PENGUNJUNG=============\n");
        for(int i=0;i<b;i++){
            buku[i].Display();
        }
        System.out.println("================= ENJOY! ===================");
    }
        }
}
    

