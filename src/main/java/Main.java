import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<Animal> animals = new LinkedList<>();
        String elements[] = {"Dog", "Cat", "Tiger", "Lion", "Panda"};
        for(int i = 0; i<=20; i++){
            String randEl = elements[(int)Math.floor(Math.random()* elements.length)];
            animals.add( new Animal(randEl) );
        }

        animals.removeFirst();
        animals.removeLast();
        animals.addFirst(new Animal("tiger"));
        animals.addLast(new Animal("lion"));
        ListIterator<Animal> iterator = animals.listIterator();
        while (iterator.hasNext()){
            Animal str = iterator.next();
            System.out.println(str);
        }
    }
}
