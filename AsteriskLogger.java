package labs;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		System.out.println();
		
	}

	@Override
	public void error(String error) {
		System.out.println("*****************");
		System.out.println("*** ERROR: " + error + "***");
		System.out.println("*****************");
		System.out.println();
	}

}
