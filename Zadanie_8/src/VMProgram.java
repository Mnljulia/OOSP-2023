public class VMProgram {
    private VMStateManager stateManager;
    public VMProgram(VMStateManager stateManager) {
        this.stateManager = stateManager;
    }
    public void execute() {
        VMState state = new VMState();
        stateManager.saveState(state);
    }
}