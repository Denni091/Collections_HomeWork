import java.util.ArrayList;

public class Main {
    public static Information process(ArrayList<? extends Number> numbers, Information information) {
        String mail = "gmail.com";
        String emptyEmail = "";

        for (int i = 0; i < numbers.size(); i++) {
            emptyEmail = numbers.get(i) + mail;
            if (!information.getEmailList().contains(emptyEmail)) {
                information.getAlias().add(String.valueOf(numbers.get(i)));
                information.getEmailList().add(numbers.get(i) + emptyEmail);
                information.getUserKey().put(String.valueOf(numbers.get(i)), emptyEmail);
            }
        }
        System.out.println(information.getAlias()); // Вывел результат Псевдонимов
        System.out.println(information.getEmailList()); // Вывел результат емайла
        return information;
    }
    public static void main(String[] args) {
        InitializationData initializationData = new InitializationData();
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            number.add(i);
        }
        process(number, initializationData.validSize());
    }
}

