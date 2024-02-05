import java.time.LocalDate;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {
        
        System.out.print("Доступные действия программы: \n1. Приветствие\n2. Ввод возраста 3.Проверка возраста\n\n ДЛя выбора действия введите цифровое значение");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите выбранное действие: ");
        String switchchoice = in.next();
        while (true){
            switch (switchchoice){
                case "1":
                    System.out.print("\nЗдравствуйте! Это приветсвие. Программа закроется, если вы введете esc в ввод");
                    System.out.print("\nВедите следующую операцию: ");
                    switchchoice = in.next();
                    break;
                case "2":
                    System.out.print("\nВведите дату своего рождения в формате гггг-мм-дд");
                    LocalDate birthday = LocalDate.parse(in.next());
                    LocalDate now = LocalDate.now();
                    int intbirh = birthday.getYear();
                    int intnow = now.getYear();
                    int check = intnow - intbirh;

                    if (check>=18){
                        System.out.print("\nВам есть 18 лет!");
                    }
                    else{
                        System.out.print("\nВам нет 18 лет");
                    }
                    System.out.print("\nВедите следующую операцию: ");
                    switchchoice = in.next();
                    break;

                default:
                    System.out.print("\nВедите номер операции: ");
                    switchchoice = in.next();
                    break;

                case "esc":
                    System.exit(0);
            }


        }

    }
}
