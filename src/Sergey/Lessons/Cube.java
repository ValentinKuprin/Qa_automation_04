package Sergey.Lessons;

public class Cube{

 //   int side;
//
 //   public int getSide() {
 //       return side;
 //   }
//
 //   public void setSide(a) {
  //      side = a;
    }



/**
    Создайте общедоступный класс с именем Cube без конструктора, который получает
    одну единственную частную целочисленную переменную Side , метод получения GetSide()
    и метод установки SetSide(int num) для этого свойства. На самом деле методы
    получения и установки не являются распространенным способом написания этого кода
    на C#. В следующем ката этой серии мы рефакторим код и сделаем его немного более
    профессиональным...

 /**
 первое задание с codewars касается создания класса Cube
 в codewars он по сути создан
 в IntelliJ IDEA создать как и раньше создавали

 дальше объявить глобальную переменную, т.е. после строки с классом, но до методов
 раньше мы ставили директиву public для глобальных переменных, а тут надо написать private

 и создать два метода
 один будет с return , следовательно объявлять его надо с типом - public int getSide()

 второй будет менять значение глобальной переменной - public void setSide(int num)
 но чтобы система понимала, что мы работаем с глобальной переменной, нужно указать это -
 либо Cube.Side, либо this.Side
 */