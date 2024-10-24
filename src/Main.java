public class Main {
    public static void main(String[] args) {
        // Объявляем переменные для входных данных
        int initialBalance = 100; // начальный счет клиента
        int topUpAmount = 1100; // сумма пополнения

        // Переменные для расчета бонусов и итогового счета
        int bonus = 0;
        int finalBalance;

        // Проверяем, превышает ли сумма пополнения порог
        if (topUpAmount > 1000) {
            // Если сумма пополнения больше 1000 рублей, рассчитываем бонус
            bonus = (topUpAmount / 100); // начисляем 1 рубль за каждые полные 100 рублей
        }

        // Рассчитываем итоговый счет
        finalBalance = initialBalance + topUpAmount + bonus;

        // Выводим результаты на экран
        System.out.println("Сумма пополнения: " + topUpAmount + " рублей");
        System.out.println("Начальный счет: " + initialBalance + " рублей");
        System.out.println("Бонусные рубли: " + bonus + " рублей");
        System.out.println("Итоговый счет: " + finalBalance + " рублей");
    }
}