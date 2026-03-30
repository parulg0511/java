package Java_Core;

public class Switchloop {

	public static void main(String[] args) {
		String light = "Green";  // you can change to "Yellow" or "Green"

        System.out.println("Light: " + light);

        String action;
        switch (light) {
            case "Red":
                action = "STOP — Do not proceed.";
                break;
            case "Yellow":
                action = "CAUTION — Prepare to stop.";
                break;
            case "Green":
                action = "GO — Proceed safely.";
                break;
            default:
                action = "UNKNOWN signal — treat as Red.";
                break;
        }
        System.out.println("Action: " + action);

     
        boolean safeToGo = light.equals("Green") ? true : false;
        System.out.println("Safe to go: " + safeToGo);

	}

}
