package Task11;

public class Value {
    enum ValueType {VAR, VAL, CONST}

    String var1 = null;
    String var2 = null;
    Double double1 = null;
    Double double2 = null;
    Value value1 = null;
    Value value2 = null;
    ValueType type = null;
    String operation = null;

    public Value(String var1) {
        this.var1 = var1;
    }

    public Value(Double double1) {
        this.double1 = double1;
    }

    public Value(Value value1) {
        this.value1 = value1;
    }

    public Value(Double double1, ValueType type) {
        this.double1 = double1;
        this.type = type;
    }

    public Value(String var1, ValueType type) {
        this.var1 = var1;
        this.type = type;
    }
}
