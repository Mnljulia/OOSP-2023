public class VMState {
        private String programCounter;
        private Object memory;
         public VMState setProgramCounter(String programCounter) {
             this.programCounter = programCounter;
             return this;
         }
         public VMState setMemory(Object memory) {
             this.memory = memory;
             return this;
         }
}