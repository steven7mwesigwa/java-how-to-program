package chapter2.drawshapes;

/**
 *
 * @author jaguar
 */
public class Main {

    public static void main(String[] args) {
        describeQuestion();
        DrawShape box = new Box();
        DrawShape diamond = new Diamond();
        System.out.println("\nSOLUTION :");
        System.out.println("\n=================");
        System.out.println("\nDRAW THE BOX");
        System.out.println("\n=================\n");
        box.drawShape();
        System.out.println("\nDRAW THE DIAMOND");
        System.out.println("\n=================\n");
        diamond.drawShape();

    }

    /**
     */
    static void describeQuestion() {
        System.out.println("\n\nChapter 2: Introduction to Java Applications; Input/Output and Operators");
        System.out.println("Page: 109");
        System.out.println("QUESTION\n");
        System.out.println("=============");
        System.out.println("2.18 (Displaying Shapes with Asterisks) Write an application that displays a box, an oval, an ar-\n"
                + "row and a diamond using asterisks ( * ), as follows:\n");
        System.out.println("*********      ***        *        *");
        System.out.println("*       *    *     *     ***      * *");
        System.out.println("*       *   *       *   *****    *   *");
        System.out.println("*       *   *       *     *     *     *");
        System.out.println("*       *   *       *     *    *       *");
        System.out.println("*       *   *       *     *     *     *");
        System.out.println("*       *   *       *     *      *   *");
        System.out.println("*       *    *     *      *       * *");
        System.out.println("*********      ***        *        *");

    }

}
