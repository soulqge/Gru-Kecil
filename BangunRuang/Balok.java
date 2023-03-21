package BangunRuang;

import java.util.Scanner;

public class Balok extends BangunRuang {
    float panjang;
    float lebar;
    float tinggi;
    Scanner scan = new Scanner(System.in);
    
    @Override
    public float Volume(){
        float volume = panjang * lebar * tinggi;
        System.out.println("Volume Balok : "+volume);
        return volume;
    }
}
