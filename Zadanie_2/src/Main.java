//Создайте систему управления производством автомобилей, где каждая фабрика может производить разные компоненты (двигатели, колеса, кузовы) для разных марок автомобилей. Используйте паттерн "Абстрактная фабрика".

import Abstract.BMWEngine;
import Abstract.KiaEngine;

public class Main {
    public static void main(String[] args) {
        BMWEngine bmwEngine = new BMWEngine();

        bmwEngine.createWheels();
        bmwEngine.createBody();

        KiaEngine kiaEngine = new KiaEngine();

        kiaEngine.createWheels();
        kiaEngine.createBody();
    }
}