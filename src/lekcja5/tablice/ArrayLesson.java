package lekcja5.tablice;

import java.util.Arrays;

class ArrayLesson {

    /**
     *  @formatter:off
     *
     *  Tablice:
     *  - Czym jest tablica?
     *  - Tworzenie referencji i tablicy - 2 sposoby.
     *  - Wielkość tablicy - index
     *  - Jak dodać element do tablicy?
     *  - Pobieranie wartości z tablicy
     *  - Jak usunąć element z tablicy?
     *  - Jak edytować element?
     *  - Dodawanie 2 tablic
     *  - Kopiowanie tablic
     *
     *  docs: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Arrays.html
     *
     *  @formatter:on
     */
    public static void main(String[] args) {
        arrayOfStudents();
        arrayOfPrimitives();
        indexInArray();
        inlineInitialization();
        arraysClass();
    }

    private static void arraysClass() {
        System.out.println("Klasa Arrays");

        System.out.println("Wypełnianie tabeli wartością");
        String[] cloneArmy = new String[10];
        Arrays.fill(cloneArmy, "Clone warrior");
        System.out.println(cloneArmy[1]);
        System.out.println(cloneArmy[3]);
        System.out.println(cloneArmy[7]);

        String[] fiatCars = {"126p", "Panda", "Multipla"};
        String[] fordCars = {"Fiesta", "Mondeo"};

        String[] newFordCars = Arrays.copyOf(fordCars, 2);
        System.out.println(newFordCars[0]);
        System.out.println(newFordCars[1]);

        System.out.println(Arrays.equals(fiatCars, fordCars));
        System.out.println(Arrays.equals(newFordCars, fordCars));

        System.out.println(Arrays.toString(fiatCars));
        System.out.println(Arrays.toString(newFordCars));

        String[] allCars = Arrays.copyOf(fiatCars, fiatCars.length + fordCars.length);
        System.out.println(Arrays.toString(allCars));
        System.arraycopy(fordCars,0, allCars, fiatCars.length, fordCars.length);
        System.out.println(Arrays.toString(allCars));
        System.out.println("=============================");
    }

    private static void inlineInitialization() {
        System.out.println("Szybka initializacja");
        // declaration, instantiation, initialization
        Long[] array1;
        Long[] array2 = new Long[2];
        Long[] array3 = new Long[]{11L, 12L, 13L, 14L, 15L};
        System.out.println(array3.length);
        System.out.println(array3[0]);
        System.out.println(array3[1]);
        System.out.println(array3[2]);
        Boolean[] testAnswers = {true, false, true, true, false};
        System.out.println(testAnswers);
        System.out.println("Odpowiedź na zadanie 1. - " + testAnswers[0]);
        System.out.println("Odpowiedź na zadanie 4. - " + testAnswers[3]);
        System.out.println("=============================");
    }

    private static void indexInArray() {
        // index in array
        System.out.println("Index w Tablicy");
        Integer[] grade = new Integer[2];
        System.out.println(grade.length);
//        grade[-1] = 21;
//        grade[2] = 44;
        String[] cars = new String[2];
        cars = new String[3];
        cars[2] = "Volvo";
        System.out.println(cars[2]);
        System.out.println("=============================");
    }

    private static void arrayOfPrimitives() {
        System.out.println("Tablica z wartościami prymitywnymi");
        int[] arrayOfInt = new int[2];
        arrayOfInt[0] = 1;
        arrayOfInt[1] = 12;
        double[] arrayOfDouble = new double[0];
        System.out.println("=============================");
    }

    private static void arrayOfStudents() {
        System.out.println("Wyjaśnienie na studentach - Create/edit/delete");
        String[] test;
        String[] arrayOfString = new String[10];

        String student1 = "Ola";
        String student2 = "Michal";
        String student3 = "Marek";
        String student4 = "Łukasz";
        String student5 = "Monika";

        String[] students = new String[5];

        System.out.println(students.length);

        students[0] = student1;

        System.out.println(students[0]);
        System.out.println(students[1]);
        students[1] = student2;
        System.out.println(students[1]);
        students[1] = student3;
        System.out.println(students[1]);
        students[1] = null;
        System.out.println(students[1]);
        System.out.println("=============================");

    }
}
