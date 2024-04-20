public class Alexa {
    Fridge fridge;
    Lights bedroomLights;
    Lights livingroomLights;
    Lights kitchenLights;
    TV livingroomTV;
    VacuumCleaner vacuumCleaner;
    WindowBlinds kitchenBlinds;
    WindowBlinds livingroomBlinds;
    WindowBlinds bedroomBlinds;

    public Alexa(Fridge fridge, Lights bedroomLights, Lights livingroomLights, Lights kitchenLights, TV livingroomTV, VacuumCleaner vacuumCleaner, WindowBlinds kitchenBlinds, WindowBlinds livingroomBlinds, WindowBlinds bedroomBlinds) {
        this.fridge = fridge;
        this.bedroomLights = bedroomLights;
        this.livingroomLights = livingroomLights;
        this.kitchenLights = kitchenLights;
        this.livingroomTV = livingroomTV;
        this.vacuumCleaner = vacuumCleaner;
        this.kitchenBlinds = kitchenBlinds;
        this.livingroomBlinds = livingroomBlinds;
        this.bedroomBlinds = bedroomBlinds;
    }

    public void goodMorning(){
        this.bedroomBlinds.open();
        this.livingroomBlinds.open();
        this.kitchenBlinds.open();
        this.bedroomLights.turnOn();

        System.out.println("Good morning sunshine!");
    }

    public void parentsAreComing() {
        this.fridge.turnExtraFreezeOn();;
        this.vacuumCleaner.turnOn();
        this.livingroomBlinds.open();
        this.kitchenBlinds.open();
        this.kitchenLights.turnOff();
        this.livingroomTV.turnOn();

        System.out.println("Good luck cleaning!");
    }

    public void goodNight() {
        this.livingroomTV.turnOff();
        this.kitchenLights.turnOff();
        this.vacuumCleaner.turnOff();
        this.bedroomLights.turnOff();
        this.kitchenBlinds.close();
        this.livingroomBlinds.close();
        this.bedroomBlinds.close();
        this.livingroomLights.turnOff();

        System.out.println("Nighty night!");
    }

}
