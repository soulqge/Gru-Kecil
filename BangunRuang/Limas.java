
package BangunRuang;

public class Limas extends BangunRuang {
    
    float sisi;
    float tinggi;
    
    @Override
    public float Volume(){
        float Volume = sisi * sisi * tinggi / 3;
        System.out.println("Volume Limas : "+Volume);
        return Volume;
    }
}
