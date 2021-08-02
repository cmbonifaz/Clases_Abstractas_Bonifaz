package dominio;

public class AnimalCarnivoro extends Animal {

    @Override
    public void Alimentarse() {
        System.out.println("Los animales carnivoros se alimentan de carne, cazando su presa para luego comerla");
    }
}
