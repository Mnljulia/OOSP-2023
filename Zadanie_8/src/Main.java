public class Main {
    public static void main(String[] args) {
        VMStateManager stateManager = new VMStateManager();
        VMProgram vmProgram = new VMProgram(stateManager);
        vmProgram.execute();
        VMState savedState = stateManager.restoreState();
        System.out.println("Restored program state: " + savedState);
    }
}

