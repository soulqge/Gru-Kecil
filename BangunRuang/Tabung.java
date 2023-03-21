package BangunRuang;

public class Tabung extends BangunRuang {
    
    float r;
    float t;
    
    @Override
    public float Volume(){
        float Volume = (float) (Math.PI * r * r * t);
        System.out.println("Volume Tabung : "+Volume);
        return Volume;
    }
}
