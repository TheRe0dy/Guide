import SSFML.Assa;
import SSFML.Controller;
import SSFML.Sprite;
import SSFML.Window;

class A
{

}
////
public class Main {
    public static void main(String[] args) {

        Window window = new Window(); //Пример создания окна

        //Пример создания текстур/спрайтов
        Sprite sp = new Sprite(); //создание обьекта - спрайта
        sp.setTexture("img/2.jpg"); //установка текстуры спрайта по пути картинки

        Sprite sp1 = new Sprite();
        sp1.setTexture("img/Red.png");
        sp1.setPos(400, 240); //установка позиции/координат спрайта в окне Window

        //sp1.setSize(50, 50); //изменить размер изображения
        //sp1.setScale(2, 2); //scale размера

        //Клавиатура и мышь.
        while (true)
        {
            if (window.getKeyKeyboard("w")) { //пример обработки нажатия кнопки
                System.out.println("Клавиша W нажата");
                break;
            }
            if (window.getKeyMouse(Controller.TypeMouse.BUTTON1)) { //пример обработки нажатия мыши
                System.out.println("Левая кнопка мыши нажата");
                break;
                /*
                BUTTON1 - левая кнопка мыши
                BUTTON2 - средняя
                BUTTON3 - правая
                 */
            }
            if (window.IntRect(0, 0, 100, 100)) {
                sp.getPos();
                System.out.println("Мышка в зоне действия координат 0, 0, 100, 100");
            }

            try { //пример кода задержки. Когда программа останавливается и ждет 10 миллисекунд
                Thread.sleep(10); //такой код необходим для избежания ошибок index array
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        //Вывод

        //Привер вывода в консоль
        window.draw(sp); //draw - фиксирование спрайта который нужно вывести
        window.draw(sp1);
        window.display(); //вывод всех зафиксированных спрайтов

        while (true) //реализация библиотеки обычно происходит в цикле
        {
            //движение красного квадрата
            if (window.getKeyKeyboard("w")) sp1.addPos(0, -0.0001f); //изменение координат в зависимости от нажатой кнопки
            if (window.getKeyKeyboard("s")) sp1.addPos(0, 0.0001f);
            if (window.getKeyKeyboard("a")) sp1.addPos(-0.0001f, 0);
            if (window.getKeyKeyboard("d")) sp1.addPos(0.0001f, 0);

            window.display(); //обновляем вывод каждый раз (если мы не будет этого делать картинка не изменится)

            try { //пример кода задержки. Когда программа останавливается и ждет 10 миллисекунд
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
System.out.println("Text");

    }
}

//getPos не робит