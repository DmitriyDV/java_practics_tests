/**
 * то же самое что и в задании 5б только используя цикл mfor
 */
package Day1;

public class Task5 {
    public static void main(String[] args) {
        int year = 1980;
        for (int i = year; i<=2020;i+=4){
            System.out.println("Олимпиада "+i+" года");
        }
    }
}
