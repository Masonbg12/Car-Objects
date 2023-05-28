// CREATING A CAR OBJECT WITH MULTIPLE LEVELS OF HIERARCHY AND IMPLEMENTING AN INTERFACE

package carObjects;

import java.util.*;

interface Engine {
    public String getEngine();
}

// Steering interface
interface Steering {
    public String getSteering();
}

// Car class that implements the two interfaces above
class Car implements Engine, Steering {
    private String carModel;
    private String engineModel;
    private String steeringModel;
    
    // overloaded constructor
    public Car(String carModel, String engineModel, String steeringModel) {
        this.carModel = carModel;
        this.engineModel = engineModel;
        this.steeringModel = steeringModel;
    }
    
    // model acessor
    public String getModel() {
        return this.carModel;
    }
    
    // steering acessor
    public String getSteering() {
        return this.steeringModel;
    }
    
    // engine acessor
    public String getEngine() {
        return this.engineModel;
    }
}

// main class and driver method
public class DriverMain {
    public static void main(String[] args) {
        // declaration section
        Scanner s = new Scanner(System.in);
        String carModel, engineModel, steeringModel;
        
        // input
        carModel = s.nextLine();
        engineModel = s.nextLine();
        steeringModel = s.nextLine();
        
        // creating a new car
        Car car = new Car(carModel, engineModel, steeringModel);
        
        // outputting model, engine, and steering
        System.out.print(car.getModel() + "\n" + car.getEngine() + "\n" + car.getSteering());
        s.close();
    }
}