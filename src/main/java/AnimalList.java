import java.util.LinkedList;
import java.util.Objects;

public class AnimalList {

    private AnimalListItem head;

    public AnimalList() {
        head = null;
    }


    @Override
    //To-Do
    public String toString() {
        String animals = "";
        if(head == null){
            return animals;
        }
        animals = head.getValue().toString();
        AnimalListItem item = head;

        while(item.getNext()!=null){
           animals = animals + " -> " + item.getValue().toString();
           item = item.getNext();
        }
          return animals ;
    }


    public void add(Animal animal){
        if(head==null) {
            head = new AnimalListItem(animal, null);
        }else{
            AnimalListItem item = head;

            while(item.getNext()!=null){
                item = item.getNext();
            }

            AnimalListItem newItem = new AnimalListItem(animal,null);
            item.setNext(newItem);
        }
    }


    public void remove(Animal animal){
        if(head==null){
            return;
        }

        AnimalListItem item = head;
        if(item.getValue()==animal){
            head = item.getNext();
        }else{
            while(item.getNext().getValue()!=animal){
                item = item.getNext();
            }

            item.setNext(item.getNext().getNext());
        }

    }

    public AnimalListItem getHead() {
        return head;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalList that = (AnimalList) o;
        return Objects.equals(head, that.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head);
    }
}
