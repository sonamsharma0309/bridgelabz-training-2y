import java.util.function.Consumer;

public class SmartHomeLightingAutomation {
    public static void main(String[] args) {
        Consumer<String> motionTrigger = (event) -> System.out.println("Motion detected! Turning on bright white lights.");
        Consumer<String> timeTrigger = (event) -> System.out.println("Evening time! Setting warm dim lights.");
        Consumer<String> voiceTrigger = (event) -> System.out.println("Voice command received! Turning off all lights.");
        
        motionTrigger.accept("motion");
        timeTrigger.accept("evening");
        voiceTrigger.accept("voice");
    }
}
