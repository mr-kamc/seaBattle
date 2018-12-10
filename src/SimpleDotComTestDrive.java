public class SimpleDotComTestDrive {
    public static void main(String[] args) {

        //создаем экземпляр класса
        SimpleDotCom dot = new SimpleDotCom();

        //создаем массив местоположения сайта
        int[] locations = {2, 3, 4};

        //размещаем местоположение через сеттер
        dot.setLocationCells(locations);

        //делаем ход от имени пользователя
        String userGuess = "2";

        //вызываем метод проверки
        String result = dot.checkYourSelf(userGuess);

        String testResult = "Неудача";

        if (result.equals("Попал")) {
            testResult = "Пройден";
        }

        System.out.println(testResult);

    }
}
