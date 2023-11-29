public class VMStateManager {
    private VMState currentState;

    public void saveState(VMState state) {
        currentState = state;
    }
    public VMState restoreState() {
        return currentState;
    }
}