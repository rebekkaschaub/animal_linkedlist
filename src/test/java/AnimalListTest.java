import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalListTest {
    @Test
    @DisplayName("Method add should add first ListItem")
    public void testFirstItem(){
        //GIVEN
        AnimalList animalList = new AnimalList();
        Animal animal = new Animal("Dog",5,30);
        assertEquals(null, animalList.getHead());

        //WHEN
        animalList.add(animal);

        //THEN
        assertEquals(animalList.getHead().getValue(), animal);
        assertEquals(animalList.getHead().getNext(), null);
    }

    @Test
    @DisplayName("Method add should add two ListItem")
    public void testAddTwoItems(){
        //GIVEN
        AnimalList animalList = new AnimalList();
        Animal animal1 = new Animal("Dog",5,30);
        Animal animal2 = new Animal("Cat",3,7);

        //WHEN
        animalList.add(animal1);
        animalList.add(animal2);

        //THEN
        assertEquals(animalList.getHead().getValue(), animal1);
        assertEquals(animalList.getHead().getNext().getValue(), animal2);
        assertEquals(animalList.getHead().getNext().getNext(), null);
    }

    @Test
    @DisplayName("Method add should add four ListItem")
    public void testAddNextItems(){
        //GIVEN
        AnimalList animalList = new AnimalList();
        Animal animal1 = new Animal("Dog",5,30);
        Animal animal2 = new Animal("Cat",3,7);
        Animal animal3 = new Animal("Ape",50,8);
        Animal animal4 = new Animal("Bird",3,29);

        //WHEN
        animalList.add(animal1);
        animalList.add(animal2);


        //THEN
        assertEquals(animalList.getHead().getValue(), animal1);
        assertEquals(animalList.getHead().getNext().getValue(), animal2);
        assertEquals(animalList.getHead().getNext().getNext(), null);

        animalList.add(animal3);
        assertEquals(animalList.getHead().getNext().getNext().getValue(), animal3);
        assertEquals(animalList.getHead().getNext().getNext().getNext(), null);

        animalList.add(animal4);
        assertEquals(animalList.getHead().getNext().getNext().getNext().getValue(), animal4);
        assertEquals(animalList.getHead().getNext().getNext().getNext().getNext(), null);

    }

    @Test
    @DisplayName("Remove should remove last item")
    public void removeLastItemTest(){
        //GIVEN
        AnimalList animalList = new AnimalList();
        Animal animal1 = new Animal("Dog",5,30);
        Animal animal2 = new Animal("Cat",3,7);
        Animal animal3 = new Animal("Ape",50,8);
        Animal animal4 = new Animal("Bird",3,29);

        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);
        animalList.add(animal4);

        //WHEN
        animalList.remove(animal4);

        //THEN
        AnimalList expected = new AnimalList();
        Animal animal10 = new Animal("Dog",5,30);
        Animal animal20 = new Animal("Cat",3,7);
        Animal animal30 = new Animal("Ape",50,8);

        expected.add(animal10);
        expected.add(animal20);
        expected.add(animal30);

        assertEquals(expected, animalList);
        assertEquals(animalList.getHead().getNext().getNext().getValue(), animal3);
        assertEquals(animalList.getHead().getNext().getNext().getNext(), null);

    }

    @Test
    @DisplayName("Remove should remove first item")
    public void removeFirstItemTest(){
        //GIVEN
        AnimalList animalList = new AnimalList();
        Animal animal1 = new Animal("Dog",5,30);
        Animal animal2 = new Animal("Cat",3,7);
        Animal animal3 = new Animal("Ape",50,8);
        Animal animal4 = new Animal("Bird",3,29);

        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);
        animalList.add(animal4);

        //WHEN
        animalList.remove(animal1);

        //THEN
        AnimalList expected = new AnimalList();
        Animal animal20 = new Animal("Cat",3,7);
        Animal animal30 = new Animal("Ape",50,8);
        Animal animal40 = new Animal("Bird",3,29);

        expected.add(animal20);
        expected.add(animal30);
        expected.add(animal40);

        assertEquals(expected, animalList);
        assertEquals(animalList.getHead().getValue(), animal2);
        assertEquals(animalList.getHead().getNext().getValue(), animal3);

    }

    @Test
    @DisplayName("toString should return all animals in List as String")
    public void testToString(){
        //GIVEN
        AnimalList animalList = new AnimalList();
        Animal animal1 = new Animal("Dog",5,30);
        Animal animal2 = new Animal("Cat",3,7);
        Animal animal3 = new Animal("Ape",50,8);
        Animal animal4 = new Animal("Bird",3,29);

        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);
        animalList.add(animal4);

        //WHEN
          String actual = animalList.toString();

       //THEN
        String expected ="Animal{breed='Dog', size=5, weight=30} -> Animal{breed='Dog', size=5, weight=30} -> Animal{breed='Cat', size=3, weight=7} -> Animal{breed='Ape', size=50, weight=8}";
        assertEquals(expected ,actual);


    }
}
