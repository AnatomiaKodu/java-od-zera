package lekcja11.zagniezdzone.petle;

import java.util.Arrays;

class NestedLoopsLesson {

    /**
     *  @formatter:off
     *
     * Zagnieżdżone pętle:
     *  - for w for
     *  - rysowanie kwadratów
     *  - rysowanie trójkąta
     *  - zagnieżdżone tablice - tablica tablic
     *  - operacje na tablicach 2d
     *  - praktyczny przykład
     *
     *  @formatter:on
     */
    public static void main(String[] args) {
        drawingRectangle();
        triangleDrawing();
        drawingTriangleWithCoordinates();
        array2d();
        operationOn2dArray();
        practicalExampleChessBoard();

    }

    private static void practicalExampleChessBoard() {
        System.out.println("Szachy - praktyczny przykład 2d:");
        String[][] chessboard = {
            {"a1", "b1", "c1"},
            {"a2", "b2", "c2"},
            {"a3", "b3", "c3"},
            {"a4", "b4", "c4"},
            {"a5", "b5", "c5"}
        };

        System.out.println(chessboard[3][1]);

        System.out.println();

        System.out.println("================");
    }

    private static void operationOn2dArray() {
        System.out.println("Operacje na tablicy 2d");
        String[][] array2d = {
            {"11", "12", "13"},
            {"21", "22", "23"},
            {"31", "32", "33"},
            {"41", "42", "43"},
            {"51", "52", "53"}
        };

        for (int outerIndex = 0; outerIndex < array2d.length; outerIndex++) {
            String[] array = array2d[outerIndex];
            for (int innerIndex = 0; innerIndex < array.length; innerIndex++) {
                System.out.print("(" + array[innerIndex] + ");");
            }
            System.out.println();
        }
        System.out.println("================");
    }

    private static void array2d() {
        System.out.println("Zagnieżdżone tablice - tablica tablic");

        String[] poem = {"Litwo, Ojczyzno moja! ty jesteś jak zdrowie;",
            "Ile cię trzeba cenić, ten tylko się dowie,",
            "Kto cię stracił. Dziś piękność twą w całej ozdobie",
            "Widzę i opisuję, bo tęsknię po tobie."};

        System.out.println(Arrays.toString(poem));

        String[][] arrayOfArray = new String[10][10];

        String[] array1d = {"1", "2", "3"};
        String[][] array2d = {
            {"11", "12", "13"},
            {"21", "22", "23"},
            {"31", "32", "33"}

        };

        System.out.println("Tablica 2d:");
        for (int i = 0; i < array2d.length; i++) {
            System.out.println(Arrays.toString(array2d[i]));
        }

        String[][] array2dExample2 = {
            array1d,
            array1d
        };

        System.out.println("Tablica 2d - 2. wariant:");
        for (int i = 0; i < array2dExample2.length; i++) {
            System.out.println(Arrays.toString(array2dExample2[i]));
        }

        System.out.println("================");
    }

    private static void drawingTriangleWithCoordinates() {
        System.out.println("Trójkąt na osi x i y");
        for (int length = 1; length < 20; length++) {
            StringBuilder line = new StringBuilder("");
            for (int width = 1; width <= length; width++) {
                line.append("(" + length + ", " + width + ");");
            }
            System.out.println(line);
        }
        System.out.println("================");
    }

    private static void triangleDrawing() {
        System.out.println("Rysowanie trójkąta równoramiennego");

        System.out.println("Trójkąt równoramienny");
        for (int length = 1; length < 20; length++) {
            StringBuilder line = new StringBuilder("");
            for (int width = 1; width < length; width++) {
                line.append("*");
            }
            System.out.println(line);
        }
        System.out.println("");
        System.out.println("Trójkąt szerszy");
        for (int length = 1; length < 50; length = length + 5) {
            StringBuilder line = new StringBuilder("");
            for (int width = 1; width < length; width = width + 1) {
                line.append("*");
            }
            System.out.println(line);
        }

        System.out.println("");
        System.out.println("Trójkąt węższy");
        for (int length = 1; length < 20; length = length + 1) {
            StringBuilder line = new StringBuilder("");
            for (int width = 1; width < length; width = width + 3) {
                line.append("*");
            }
            System.out.println(line);
        }
        System.out.println("");
        System.out.println("=============================");
    }

    private static void drawingRectangle() {
        System.out.println("Rysowanie prostokąta");
        for (int length = 0; length < 12; length++) {
            StringBuilder line = new StringBuilder("");
            for (int width = 0; width < 30; width++) {
                line.append("*");
            }
            System.out.println(line);
        }
        System.out.println("=============================");
    }

}
