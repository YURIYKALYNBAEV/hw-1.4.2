public class Main {
    public static void main(String[] args) {
        // Задача №1
        System.out.println("Задача №1");

        int ageUser = 17;
        if (ageUser >= 18) {
            System.out.println("Поздравляем тебя с совершеннолетием!");
        }
        if (ageUser < 18){
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }

        // Задача №2
        System.out.println("Задача №2");

        int agePerson = 25;
        if (agePerson >= 7 && agePerson < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (agePerson >= 18 && agePerson < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (agePerson >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        // Задача №3
        System.out.println("Задача №3");

        int BusyPlaces = 103;

        if (BusyPlaces < 60) {
            System.out.println("В вагоне есть сидячие и стоячие места");
        }
        if (BusyPlaces >= 60 && BusyPlaces < 102) {
            System.out.println("В вагоне есть стоячие места");
        } if (BusyPlaces >= 102) {
            System.out.println("Вагон уже полностью забит");
        }
    }
}