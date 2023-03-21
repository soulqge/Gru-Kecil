package BangunRuang;

public class Kerucut extends BangunRuang {
    
    float r;
    float t;
    
    @Override
    public float Volume(){
        float Volume = (float) (Math.PI * r * r * t /3);
        System.out.println("Volume Kerucut : "+Volume);
        return Volume;
    }
    
}
