package pl.sda.school;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    //   Stworz klasę School:
    //                           - String name
    //                           - String city
    //            Stworz klase Student:
    //                           - String name
    //                           - String lastname
    //
    //            Stworz klika szkół i kilkanaście studentów
    //            Stwórz mapę w której kluczem będzie obiekt szkoly, a wartością lista studentów
    //
    //            Map<School, List<Student>>
    //
    //            Iteracja po mapie:
    //                - Szkoła1:
    //                        - Student1
    //                        - Student2
    //                - Szkoła2:
    //                        -Student1
    //                        -Student2

    public static void main(String[] args) {

        School school1 = new School("Szkoła1", "Toruń");
        School school2 = new School("Szkoła2", "Toruń");
        School school3 = new School("Szkoła3", "Toruń");
        School school4 = new School("Szkoła4", "Bydgoszcz");

        Student student1 = new Student("Jan", "Kowalski");
        Student student2 = new Student("Piotr", "Kowalski");
        Student student3 = new Student("Wojtek", "Kowalski");
        Student student4 = new Student("Zbyszek", "Kowalski");
        Student student5 = new Student("Janusz", "Kowalski");
        Student student6 = new Student("Jan", "Nowak");
        Student student7 = new Student("Piotr", "Nowak");
        Student student8 = new Student("Wojtek", "Nowak");
        Student student9 = new Student("Zbyszek", "Nowak");
        Student student10 = new Student("Jan", "Kamiński");
        Student student11 = new Student("Piotr", "Kamiński");
        Student student12 = new Student("Wojtek", "Kamiński");

        ArrayList<Student> listaStudentow1 = new ArrayList<Student>();
        listaStudentow1.add(student1);
        listaStudentow1.add(student2);
        listaStudentow1.add(student3);


        ArrayList<Student> listaStudentow2 = new ArrayList<Student>();
        listaStudentow2.add(student4);
        listaStudentow2.add(student5);
        listaStudentow2.add(student6);


        ArrayList<Student> listaStudentow3 = new ArrayList<Student>();
        listaStudentow3.add(student7);
        listaStudentow3.add(student8);
        listaStudentow3.add(student9);


        ArrayList<Student> listaStudentow4 = new ArrayList<Student>();
        listaStudentow4.add(student10);
        listaStudentow4.add(student11);
        listaStudentow4.add(student12);

        Map<School, List<Student>> mapa = new HashMap<School, List<Student>>();

        mapa.put(school1, listaStudentow1);
        mapa.put(school2, listaStudentow2);
        mapa.put(school3, listaStudentow3);
        mapa.put(school4, listaStudentow4);

        for(Map.Entry<School, List<Student>> entry : mapa.entrySet()){

          System.out.println("Szkoła: " + entry.getKey());
          System.out.println();
          System.out.println(" Studenci: " + entry.getValue());
            System.out.println();
        }

    }
}
