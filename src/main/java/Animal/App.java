package Animal;

import java.util.ArrayList;
import java.util.List;

public class App {
    private static double averageAge(ArrayList<? extends Animal> lst){
        int totalAge = 0;
        for(Animal animal:lst){
            totalAge+=animal.getAge();
        }
        return (double)totalAge / lst.size();
    }
    public static void main(String[] args){
        ArrayList<Dog> myDogs = new ArrayList<>();
        ArrayList<Cat> myCats = new ArrayList<>();
        ArrayList<Frog> myFrogs =new ArrayList<>();
        ArrayList<Kitten> myKittens = new ArrayList<>();
        ArrayList<Tomcat> myTomcats = new ArrayList<>();


        myDogs.add(new Dog("kiki",Gender.FEMALE,10));
        myDogs.add(new Dog("kiki1",Gender.MALE,15));
        myDogs.add(new Dog("kiki2",Gender.MALE,5));
        myDogs.add(new Dog("kiki3",Gender.FEMALE,8));
        myCats.add(new Cat("mimi",Gender.FEMALE,15));
        myCats.add(new Cat("mimi1",Gender.MALE,17));
        myCats.add(new Cat("mimi2",Gender.MALE,12));
        myCats.add(new Cat("mimi3",Gender.FEMALE,13));
        myFrogs.add(new Frog("ech",Gender.MALE,3));
        myFrogs.add(new Frog("ech1",Gender.MALE,6));
        myFrogs.add(new Frog("ech2",Gender.FEMALE,5));
        myFrogs.add(new Frog("ech3",Gender.MALE,2));
        myKittens.add(new Kitten("miumiu",1));
        myKittens.add(new Kitten("miumiu1",2));
        myKittens.add(new Kitten("miumiu2",3));
        myKittens.add(new Kitten("miumiu3",4));
        myTomcats.add(new Tomcat("tomtom",4));
        myTomcats.add(new Tomcat("tomtom",6));
        myTomcats.add(new Tomcat("tomtom",7));
        myTomcats.add(new Tomcat("tomtom",8));

        System.out.printf("my Dogs average age: %.1f\n",averageAge(myDogs));
        System.out.printf("my Cats average age: %.1f\n",averageAge(myCats));
        System.out.printf("my Frogs average age: %.1f\n",averageAge(myFrogs));
        System.out.printf("my Kittens average age: %.1f\n",averageAge(myKittens));
        System.out.printf("my Tomcats average age: %.1f\n",averageAge(myTomcats));

    }
}
