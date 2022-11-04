package Task11;

public class Add extends Operation implements Operandable{
    public Add(Operandable firstOperation, Operandable secondOperation) {
        super(firstOperation, secondOperation);
        value.operation = "+";
    }

    @Override
    public Value getValue() {
        return value;
    }
}
