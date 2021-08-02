package test;

import dominio.*;

public class Test_SerVivo {

    public static void main(String[] args) {
        Planta pl = new Planta();
        AnimalCarnivoro ac = new AnimalCarnivoro();
        AnimalHervivoro ah = new AnimalHervivoro();
        
        pl.setClases("Planta");
        System.out.println(pl.getClases());
        pl.Alimentarse();
        
        ac.setClases("Animal");
        ac.setClaseAni("Carnivoro");
        System.out.println(ac.getClases()+" "+ac.getClaseAni());
        ac.Alimentarse();
        
        ah.setClases("Animal");
        ah.setClaseAni("Hervivoro");
        System.out.println(ah.getClases()+" "+ah.getClaseAni());
        ah.Alimentarse();
    }
}
