package Arrays;

public class Dog {
    String name;

    public static void main(String[] args) {
//        Создаем объект Dog  получаем к нему доступ
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

//        Теперь создадим массив типа Dog
        Dog[] myDogs = new Dog[3];
//       и поместим в него несколько элементов
       myDogs[0] = new Dog();
       myDogs[1] = new Dog();
       myDogs[2] = dog1;

//       Теперь получаем доступ к объектам Dog
//       с помощью ссылок из массива
        myDogs[0] .name = "Fred";
        myDogs[1] .name = "Georg";

//        Интересно какое имя у myDogs[2] ?
        System.out.print("Имя последней собаки  - ");
        System.out.println(myDogs[2] .name);

//        Теперь переберем все элементы массива
//        и вызовем для кажого метод bark()
        int x = 0;
        while (x < myDogs.length) {
//            Массивы содержат переменную length которая предоставляет количество хранимых элементов
            myDogs[x] .bark();
            x = x +1;
        }
        }
     public void bark(){
         System.out.println(name + " сказал Откушу пятку!");
    }

}
