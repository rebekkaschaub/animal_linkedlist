import java.util.LinkedList;

public class AnimalList {

    private AnimalListItem head;

    public AnimalList() {
        head = null;
    }


    @Override
    //To-Do
    public String toString() {
        return head +"->" ;
    }

    public void add(Animal animal){
        head = new AnimalListItem(animal, head);
    }

    public void remove(Animal animal){

    }


}
