public class Main {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        Lights bedroomLights = new Lights();
        Lights livingroomLights = new Lights();
        Lights kitchenLights = new Lights();
        TV livingroomTV = new TV();
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        WindowBlinds kitchenBlinds = new WindowBlinds();
        WindowBlinds livingroomBlinds = new WindowBlinds();
        WindowBlinds bedroomBlinds = new WindowBlinds();
        
        Alexa Alexa = new Alexa(fridge, bedroomLights, livingroomLights, kitchenLights, livingroomTV, vacuumCleaner, kitchenBlinds,livingroomBlinds, bedroomBlinds);
        
        Alexa.goodMorning();
        
        Alexa.parentsAreComing();
        
        Alexa.goodNight();
  }
}
