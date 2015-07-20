/*
 * singleton using enum and implements interface
 *
 * Since we don't have worry about double-checked blocking, 
 * the interface class, service class, other instantiator 
 * class can be in the same package
 *
 * Martin.Xia
 */
public enum sampleService implements sampleInterface {
    INSTANCE;
    private int variable;

    @Override
    public int getVariable() {
        return variable;
    }
}
