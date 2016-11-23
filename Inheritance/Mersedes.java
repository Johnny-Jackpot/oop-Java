//Отражение типа связи "является"(иерархии)
class Vehicle {}
class Car extends Vehicle {}
class Mersedes extends Car{
    public static void main(String[] args) {
        Mersedes mersedes = new Mersedes();
        System.out.println(mersedes instanceof Car);
        System.out.println(mersedes instanceof Vehicle);
    }
}
/**
 * mersedes is-a Car, також mersedes is-a Vehicle.
 * Об`єкт mersedes є сутністю класу Mersedes.
 * Клас Mersedes наслідує клас Car, тому об`єкт mersedes
 * є сутністю класу Car. В свою чергу, Car наслідує Vehicle, 
 * тому об`єкт mersedes є сутністю класу Vehicle.
 * Виходить така ієрархія: Mersedes - Car - Vehicle.
 * 
 * class Vehicle{}
 * class Wheels{}
 * class Car extends Vehicle{
 *  private Wheels wheels;
 * }
 * 
 * В цьому випадку тип зв`язку "has-a".
 * Car has-a Wheels.
 * 
 */