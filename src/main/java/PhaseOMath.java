/**
 * @author Sergei Usov
 * @version 1.0.0
 */
public class PhaseOMath {
    public static void main(String[] args) {

        String[] wordListOne = {"круглосуточный", "трех-звенный", "30000-футовый", "взаимный", "обоюдный выйгрыш", "фронтэнд", "на основе веб приложений", "проникающий", "умный", "шесть сигм", "динамичный"};
        String[] wordListTwo = {"уполномоченный", "трудный", "чистый", "ориентированный", "центральный", "распределенный", "кластеризированный", "чистый ум", "нестандартный ум", "позиционированный", "сетевой", "общий", "ускоренный"};
        String[] wordListThree = {"процесс", "пункт разгрузки", "выход из положения", "тип уструктуры", "талант", "подход", "уровень заваеванного доверия", "портал", "период времени", "обзор", "образец", "пункт следования"};

        int oneLenght = wordListOne.length;
        int twoLenght = wordListTwo.length;
        int threeLenght = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLenght);
        int rand2 = (int) (Math.random() * twoLenght);
        int rand3 = (int) (Math.random() * threeLenght);

        String phase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("Все что нам нужно, - это " + phase);
    }
}
