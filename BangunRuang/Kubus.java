package BangunRuang;

public class Kubus extends BangunRuang {
    float sisi;
    
    @Override
    public float Volume(){
        float volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus : "+volume);
        return volume;
    }
}
