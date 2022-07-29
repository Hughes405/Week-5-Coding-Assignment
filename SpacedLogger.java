package labs;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		int length = log.length();
		for( int i = 0; i< length; i++) {
			System.out.print(log.charAt(i) + " ");
		}
		System.out.println();		
	}

	@Override
	public void error(String error) {
				int length = error.length();
				System.out.print("ERROR: ");
		for( int i = 0; i< length; i++) {
			System.out.print(error.charAt(i)+ " ");
		}
		System.out.println();
	}

}
