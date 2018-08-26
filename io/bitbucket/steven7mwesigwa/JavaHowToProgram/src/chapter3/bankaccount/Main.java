
package chapter3.bankaccount;

/**
 *
 * @author jaguar
 */
public class Main {
    public static void main(String[] args) {
        describeCaseStudy();
        
    }
    public static void describeCaseStudy() {
     System.out.println("\n\nChapter 3: Introduction to Classes, Objects, Methods and Strings");
        System.out.println("Page: 114");
        System.out.println("CASE STUDY\n");
        System.out.println("=============");
        System.out.println("We present a case study on creating and using a simple, real-world bank account\n" +
"class— Account .");
        System.out.println("Such a class should maintain as instance variables attributes such as its name\n" +
"and balance , and provide methods for tasks such as querying the balance ( getBalance ),\n" +
"making deposits that increase the balance ( deposit ) and making withdrawals that decrease\n" +
"the balance ( withdraw ).");
        System.out.println("We’ll build the getBalance and deposit methods into the class in\n" +
"the chapter’s examples and you’ll add the withdraw method in the exercises.");
        System.out.println("In Chapter 2 we used the data type int to represent integers. In this chapter, we intro-\n" +
"duce data type double to represent an account balance as a number that can contain a dec-\n" +
"imal point—such numbers are called floating-point numbers.");
        System.out.println("[In Chapter 8, when we get a\n" +
"bit deeper into object technology, we’ll begin representing monetary amounts precisely with\n" +
"class BigDecimal (package java.math ) as you should do when writing industrial-strength\n" +
"monetary applications.]");
    
    }
    
}
