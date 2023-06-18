package StudyExample.Array;

public class ExampleTicket {
    public static void main(String[] args) {

        int[] ticketNumber = new int[1000]; //имеется 1000 билетов
        int[] winTickets = new int[10]; // каждый сотый - выигрышный, 1000/100 - итого 10 выигрышных

        for (int i = 0; i < ticketNumber.length; i++) {//начинаем перебирать значения всех билетов
            int value = 1000000 + (int)Math.round(1000000 * Math.random()); // вводим переменную валью,
            // хотим чтобы номера билетов были шестизначные. сначала миллион умножаем на мэф рэндом,
            // а потом округляем значение до инта, так кк рэндом- дабл
            ticketNumber[i] = value;//начинаем водставлять значение билета в валью
            if (i % 100 == 0) { // если остаток от деления на 100 - 0, значит
                winTickets[i / 100] = value;
            }
        }
        for (int winTicketNumber : winTickets) {
            System.out.println(winTicketNumber);
        }
    }
}