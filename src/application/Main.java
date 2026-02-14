package application;

import java.util.ArrayList;
import java.util.List;

public class Main {

    final static int CURRENT_YEAR = 2026;

    public static void main(String[] args) {

        final String GREETING_MESSAGE = "Saludos estudiantes de java";

        String[] namesStudents = {"Laura", "Pablo", "Maria", "Juan", "Ana"};
        int[] birthYears = {2000, 2004, 2008, 1991, 1997};

        List<Integer> agesStudentList = fillAgesList(birthYears);

        showMessage(GREETING_MESSAGE);

        listStudents(namesStudents, agesStudentList);
    }

    static void showMessage(String message) {
        System.out.println(message);
    }

    static int calculateAge(int birthYear) {
        return CURRENT_YEAR - birthYear;
    }

    static List<Integer> fillAgesList(int[] birthYears) {
        List<Integer> list = new ArrayList<>();
        for (int year : birthYears) {
            int age = calculateAge(year);
            list.add(age);
        }
        return list;
    }

    static void listStudents(String[] namesStudents, List<Integer> agesStudents) {
        showMessage("Lista de estudiantes:");
        for (int i = 0; i < namesStudents.length; i++) {
            System.out.println(namesStudents[i] + " - edad: " + agesStudents.get(i));
        }
    }
}