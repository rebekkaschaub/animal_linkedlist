import java.util.Objects;

public class Animal {

    private String breed;
    private int size;
    private int weight;

    public Animal(String breed, int size, int weight) {
        this.breed = breed;
        this.size = size;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return size == animal.size && weight == animal.weight && Objects.equals(breed, animal.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, size, weight);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", size=" + size +
                ", weight=" + weight +
                '}';
    }
}
