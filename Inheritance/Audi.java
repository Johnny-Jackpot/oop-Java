//Устранение дублирования спецификации классов
class Vehicle {
    public String brand = "Unknown";
    public int weight = 25;
    public int height = 36 ;
    public int length = 45;
    public int width = 63;

    public void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    public int fuelCapacity = 100;

    public int getFuelConsumption() {
        return 10;
    }
}

class Ship extends Vehicle {
    public int waterDisplacement = 2500;

    public void dropAnchor() {
        System.out.println("Anchor is dropped");
    }
}

class Audi extends Car {
    public boolean hasQuattroSuspension = false;

    public boolean enableAutoPilot() {
        return true;
    }

    public static void main(String[] args) {
        Audi audi = new Audi();

        System.out.println("Vehicle length: " + audi.length);
        audi.run();
        System.out.println("Vehicle fuel capacity: " + audi.fuelCapacity);
        System.out.println("Vehicle fuel consumption: " + audi.getFuelConsumption());
        System.out.println("Vehicle has quattro suspension: " + audi.hasQuattroSuspension);
        System.out.println("\n");

        Ship ship = new Ship();
        ship.dropAnchor();
        System.out.println("Ship height: " + ship.height);
    }
}

/**
 * Клас Vehicle містить загальні характеристики транспортного засобу, наприклад:
 * марка, вага, висота, довжина, ширина і метод рухатись.
 * Від класу Vehicle наслідуються класи Car і Ship. Для класу Car вже характерним є
 * запас топлива та споживання топлива. Для класу Ship - водотоннажність та 
 * можливість кинути якір.
 * Далі, клас Audi наслідується від класу Car і в свою чергу має свої властивості.
 * В строкі 40 ми звертаємося до властивості length якої немає в класі Audi, а є в
 * класі Vehicle, в строкі 42 - до fuelCapacity яка є в класі Car, а не в Audi.
 * Завдяки наслідуванню клас Car отримує методи і властивості класу Vehicle.
 * В свою чергу, клас Audi - класу Car. Це дозволяє не дублювати код.
 */