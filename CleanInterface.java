/*
 * Interface to define functions for service
 *
 * Since we don't have worry about double-checked blocking, 
 * the interface class, service class, other instantiator 
 * class can be in the same package
 *
 * Martin.Xia
 */
public interface CleanInterface {
    public int getVariable();
    public void firstFunction();
    public void secondFunction();
    public void thirdFunction();
}

