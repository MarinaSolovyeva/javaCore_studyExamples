package StudyExample.Methods;
/*В класс BankAccount добавьте 2 метода . Первый метод называется popolnenieScheta и увеличивает баланс
на сумму , которая указана в параметре этого метода . Второй метод называется snyatieSoScheta
И уменьшает баланс на сумму , которая указана в параметре этого метода . */

import java.util.Scanner;

public class BankAccount implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    double accountBalance = 200.00;


    double refill(double sumRefill) {
        return accountBalance + sumRefill;
    }

    double withdrawal(double sumWithdrawal) {
        return accountBalance - sumWithdrawal;
    }
}

class BankAccountTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        BankAccount bankaccount = new BankAccount();



        System.out.println("Если вы хотите снять средства, введите 1. Если хотите пополнить счет, введите 2");
        int sum = new Scanner(System.in).nextInt();

        if (sum == 1) {
            System.out.println("Введите сумму");
            double sumWithdrawal = new Scanner(System.in).nextInt();
            System.out.println("Ваш остаток на счете теперь состаляет " + bankaccount.withdrawal(sumWithdrawal));
        } else {
            System.out.println("Введите сумму");
            double sumRefill = new Scanner(System.in).nextInt();
            System.out.println("Ваш остаток на счете теперь состаляет " + bankaccount.refill(sumRefill));
        }

        BankAccount bankaccount1 = (BankAccount) bankaccount.clone();
        System.out.println(bankaccount1.accountBalance);
        System.out.println(bankaccount == bankaccount1);




    }
}



