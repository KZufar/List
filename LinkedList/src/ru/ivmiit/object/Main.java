package ru.ivmiit.object;

import ru.ivmiit.object.Human;

public class Main {

    public static void main(String[] args) {
        /**
         * equals - сравнивает текущий объект с другим
         * hashCode - возвращает хеш-код объекта
         * Если по equals объекты равны, значит по hashCode они тоже должны быть равны
         * Поэтому в формировании hashCode должны участвовать не больше полей, чем в equals
         */
	    Human human = new Human("Marsel", 23);
        Human otherHuman = new Human("Marsel", 23);
        String humanAsString = human.toString();

        int humanHashCode = human.hashCode();
        int otherHumanHashCode = otherHuman.hashCode();

        System.out.println(humanAsString);
        System.out.println(humanHashCode);
        System.out.println(otherHumanHashCode);

        System.out.println(human);

        System.out.println(human == otherHuman);
        System.out.println(human.equals(otherHuman));
    }
}
