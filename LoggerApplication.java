package labs;

public class LoggerApplication {

	public static void main(String[] args) {
		Logger aLogger = new AsteriskLogger();
		Logger sLogger = new SpacedLogger ();
		
		aLogger.log("First Message");
		aLogger.error("First Message");
		
		sLogger.log("First");
		sLogger.error("Also First");
		

	}

}
