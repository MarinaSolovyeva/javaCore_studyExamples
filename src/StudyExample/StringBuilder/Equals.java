package StudyExample.StringBuilder;

public class Equals {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = new StringBuilder("123");
        StringBuilder sb3 = sb1;

        System.out.println(sb1 == sb2);// false потому что это два разных объекта
        System.out.println(sb1.equals(sb2));// false - это означает что equals работает в классе не так как в String
        // он не перезаписан и работает также как ==
        System.out.println(sb3); // только в этом случае будет true
    }
}
