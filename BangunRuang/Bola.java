package BangunRuang;

public class Bola extends BangunRuang {
    float r;
    
    @Override
    public float Volume(){
        float Volume = (float) (Math.PI * r * r * r * 4/3);
        System.out.println("Volume Bola : "+Volume);
        return Volume;
    }
}
