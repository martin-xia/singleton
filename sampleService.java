/*
 * singleton using enum and implements interface
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
