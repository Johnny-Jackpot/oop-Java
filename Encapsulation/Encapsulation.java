//Сокрытие деталей реализации и поведения объекта от его клиентов.
//Проекция правил взаимодействия с объектами в реальном мире на проектируемый объект.
class Bmw {
    private int fuel = 0;
    private int engineOil = 0;
    private int batteryLevel = 0;

    Bmw(int fuel, int engineOil, int batteryLevel) {
        this.fuel = fuel;
        this.engineOil = engineOil;
        this.batteryLevel = batteryLevel;
    }

    class Dashboard {
        public int fuelLevel;
        public int engineOilLevel;
        public int batteryLevel;
    }

    private int getFuilLevel() {
        return this.fuel;
    }

    private int getEngineOil() {
        return this.engineOil;
    }

    private int getBatteryLevel() {
        return this.batteryLevel;
    }

    public Dashboard getPerformanceDashboard() {
        Dashboard dash = new Dashboard();

        dash.fuelLevel = this.getFuilLevel();
        dash.engineOilLevel = this.getEngineOil();
        dash.batteryLevel = this.getBatteryLevel();

        return dash;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Bmw bmw = new Bmw(25, 1, 20);
        System.out.println("Fuel level is: " + bmw.getPerformanceDashboard().fuelLevel);
    }
}

/**
 * В класі Encapsulation в main ми створюємо новий об`єкт класу Bmw і виводимо в консоль
 * рівень топлива з панелі приладів. Під капотом методу створюється і повертається об`єкт 
 * класу Dashboard, його поля заповнюються результатами виклику приватних методів класу Bmw.
 * Таким чином, деталі реалізації отримання показників панелі приладів приховані, 
 * а у нас є публічний метод getPerformanceDashboard який всередині себе виконує 
 * необхідну роботу, викликає приватні методи і повертає результат.
 * 
 */