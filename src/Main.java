import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();

        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));

        listInteger.get(-1);
        System.out.println("element -1: " + listInteger.get(-1));
//        listInteger.get(6);
//        System.out.println("element 6: "+listInteger.get(6));
////        List<Animal> list = new ArrayList<>();
//        Animal animal = new Animal("dog",1,"01");
//        Animal animal1 = new Animal("cat",2,"02");
//        Animal animal2 = new Animal("cat",2,"03");

//
//        list.add(animal);
//        list.add(animal1);
//        list.add(animal2);
//        System.out.print( list);

    }
}
