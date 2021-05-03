public class Rectangle {    //Создание класа Rectangle
    public static void main (String[] args){    // Главный метод прогарммы main(точка входа программы)
        Calculate obj1=new Calculate("5",2.5);  //Создание объектной ппеременной
        System.out.print("Объем конуса: ");
        System.out.printf("%6.2f",obj1.calc()); //Форматированый вывод результата
    }
}

class Calculate{    //Класс Calculate
    private double h;   //Высота конуса
    private double radius;  //Радиус конуса

    public Calculate(){     // Пустой конструктор
    }

    public Calculate(double radius){    // Конструктор с 1 параметром
        this.radius=radius;
        h=5.0;
    }

    public Calculate(String h, double radius){  // Конструктор с двумя параметром
        this.radius=radius;
        double height=Double.parseDouble(h);    // Преобразование строкового типа на тип Double
        this.h=height;
    }

    void setRadius(double radius){  // Акцессоры Setters&Getters
        this.radius=radius;
    }

    void setHeight(double h){
        this.h=h;
    }
    double getRadius(){
        return radius;
    }
    double getHeight(){
        return  h;
    }
//////////////////////////////////////////////////////////////////
    public double calc(){   //Метод вычисление
        final double pi =3.1415;
        return 1.0/3.0*pi*radius*radius*h;  //Возвращаем результат
    }
}
