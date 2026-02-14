package application;

import java.util.ArrayList;
import java.util.List;

public class Main {


    final static int CURRENT_YEAR = 2026;

    public static void main(String[] args) {

        final String GREETING_MESSAGE = "Welcome to the Java student system";

        String[] namesStudents = {"Laura", "Pablo", "Maria", "Juan", "Ana"};
        int[] birthYears = {2000, 2004, 2008, 1991, 1997};

        List<Integer> agesStudentList = new ArrayList<>();

        showMessage(GREETING_MESSAGE);

        fillAgesList(agesStudentList, birthYears);

        listStudents(namesStudents, agesStudentList);
    }

    static void showMessage(String message) {
        System.out.println(message);
    }

    static int calculateAge(int birthYear) {
        return CURRENT_YEAR - birthYear;
    }

    static void List<Integer> fillAgesList(int[] birthYears) {
        for (int birthYears : birthYears) {
            int age = calculateAge(birthYears);
            agesStundentList.add(age);
        }
        return agesStudenList;
    }

    }

    static void listStudents(String[] namesStudents, List<Integer> agesStudents) {
        showMessage("Lista de estudiantes:");
        for (int i = 0; i < namesStudentes.length; i++) {
            System.out.println("namesStudentes[i] + " - edad: " + agesStudents.get(i));
        }
    }
