package Task11;

public class Divide extends Operation implements Operandable{
    public Divide(Operandable firstOperation, Operandable secondOperation) {
        super(firstOperation, secondOperation);
        value.operation = "/";
    }

    @Override
    public Value getValue() {
        return value;
    }
}
