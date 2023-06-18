package StudyExample.ConditionalOperator;

import java.util.Scanner;

public class IF_Enough_money {
    public static void main(String[] args) {
        /*Человек идёт в магазин купить хлеб, который стоит 50 рублей.
        Сумма денег, которая есть у человека, задаётся в начале программы.
        Необходимо посчитать, хватает ли ему денег.
        Если хватает, то будет ли остаток (и в каком размере). Если не хватает, то сколько не хватает.
        Если у человека денег ровно на хлеб (не больше и не меньше), то необходимо выдать соответствующее сообщение.*/

        System.out.println("Введите начальную сумму денежных средств");
        int money = new Scanner(System.in).nextInt();
        int priceBread = 50;
        int surplus = 0;
        int lack = 0;

        if (money > 50 ) {surplus = money - priceBread;
            System.out.println("Денежных средств достаточно для приобретения покупки, Ваш остаток составит "+surplus+"руб.");}
        else if (money < 50) {lack = priceBread - money;
            System.out.println("Вам недостаточно денежных средств в размере "+lack+" руб. для приобретения покупки" );}
        else if (money == 50) System.out.println("Денежных средств достаточно ровно на приобретения покупки");

    }
}
