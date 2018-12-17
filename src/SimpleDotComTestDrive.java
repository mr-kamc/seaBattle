import java.util.Scanner;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {

        //создаем экземпляр класса
        SimpleDotCom dot = new SimpleDotCom();

        //создаем массив местоположения сайта
        int[] locations = {2, 3, 4};

        //размещаем местоположение через сеттер
        dot.setLocationCells(locations);

        //Получаем ответ от пользователя
        Scanner scanner = new Scanner(System.in);
        String userGuess = scanner.nextLine();


        //вызываем метод проверки
        String result = dot.checkYourSelf(userGuess);

    }
}
