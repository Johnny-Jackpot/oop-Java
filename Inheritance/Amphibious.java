//Наследование интерфейса
interface IVehicle {
    public String getInfo();
}

interface ICar extends IVehicle{
    public void drive();
}

interface IShip extends IVehicle{
    public void swim();
}

public class Amphibious implements ICar, IShip {
    public String getInfo() {
        return "This is amphibious";
    }

    public void drive() {
        System.out.println("Driving");
    }

    public void swim() {
        System.out.println("swimming");
    }

    public static void main(String[] args) {
        Amphibious smth = new Amphibious();
        System.out.println(smth.getInfo());
        smth.drive();
        smth.swim();
    }
}

/**
 * Інтерфейси IVehicle, ICar, IShip вказують які методи мають включати класи,
 * що їх реалізують. Інтерфейси ICar та IShip наслідують IVehicle. 
 * Клас Amphibious реалізовує інтерфейси ICar та IShip, тому має мати 
 * реалізацію всіх методів ICar, IShip та IVehicle. На відміну від множинного
 * наслідування, клас може реалізовувати декілька інтерфейсів.
 */