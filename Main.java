package ivan.samoylov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        class Person {
            int personId;
            String personName;

            Person(int id, String name){
                this.personId = id;
                this.personName = name;
            }
        }

        List<Person> employe = new ArrayList<Person>();

        employe.add(new Person(123, "John"));
        employe.add(new Person(173, "Maria"));
        employe.add(new Person(169, "Patrick"));
        employe.add(new Person(477, "Veronica"));
        employe.add(new Person(123, "Jack"));
        employe.add(new Person(173, "Bob"));
        employe.add(new Person(249, "Susie"));
        employe.add(new Person(169, "Mark"));

        for (int i = 0; i < employe.size(); i++) {
            for (int j = 0; j < employe.size(); j++){
                if(employe.get(i).personId == employe.get(j).personId && i != j){
                    employe.remove(employe.get(i));
                }
            }
            System.out.println("remained in the list: " + employe.get(i).personName);
        }
  }
}
