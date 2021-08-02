package dominio;

public class AnimalHervivoro extends Animal {

    @Override
    public void Alimentarse() {
        System.out.println("Los animales hervivoros se alimentan exclusivamente de plantas, pastos, hierbas y vegetales en general");
    }
}
