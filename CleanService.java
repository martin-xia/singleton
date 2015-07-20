/*
 * Clean service class that use functions exposed from defined interface,
 * Clean and Neat
 * Singleton using enum and implements interface
 *
 * Since we don't have worry about double-checked blocking, 
 * the interface class, service class, other instantiator 
 * class can be in the same package
 *
 * Martin.Xia
 */
public class CleanService {
    public static final CLASS_NAME = "EXAMPLE";

    @Override
	public String getClassName() {
		return CLASS_NAME;
	}

	public static CleanInterface get() {
		return CleanInterfaceUtil.INSTANCE;
	}


    public enum CleanInterfaceUtil implements CleanInterfaceUtil {
		INSTANCE;
	    private int variable;

	    @Override
	    public int getVariable() {
	        return variable;
	    }

	    @Override
	    public void firstFunction() {
	        variable++;
	    }

	    @Override
	    public void secondFunction() {
	        variable--;
	    }

	    @Override
	    public void thirdFunction() {
	    }
    }
}
