package StudyExample.Collection_Interface.LIST.Interface;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map <Integer, String> map= new HashMap<>(); //с большой буквы!  Указываю два типа, ключ и имя.
        map.put (777,"Ivanov Mikhail");//обрати внимание, что здесь с маленькой буквы
        map.put (778,"Solovyeva Marina");
        map.put (779,"Savateev Denis");
        map.put (780,"Roberto Carlo");
        System.out.println("map -" + map);

        map.remove(780);
        System.out.println(map);//можно удалить элемент по номеру ключа
/*
Дубликаты здесь не поддерживаются. если создать нового сотрудника
 с таким же ключом - value прежнего объекта перезапишется на value Нового объекта.
 но если ключ будет другой ,а имя прежнее - ошибки нет
 */
    }
}
