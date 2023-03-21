package BangunRuang;

public class Prisma extends BangunRuang {
    
    float alas;
    float tinggi;
    float tinggi_l;
    
    @Override
    public float Volume(){
        float  Volume = ((alas * tinggi)/2)*tinggi_l;
        System.out.println("Volume Prisma : "+Volume);
        return Volume;
    }
}
