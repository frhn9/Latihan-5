package Fd5;

public class Tamu {
    private static int jumlahtamu = 22041600;
    private final long telp;
    private final String nama, asalkota;
    
    public Tamu (String n, long t, String ak){
        this.telp = t;
        this.nama = n;
        this.asalkota = ak;
        jumlahtamu++;
    }
    
    public static int getTamu(){
        return jumlahtamu;
    }
    
    public void Display(){
        System.out.println("Nama\t\t\t : "+nama);
        System.out.println("No.Telepon \t\t : "+telp);
        System.out.println("Asal Kota\t\t : "+asalkota);
    }
    
}
