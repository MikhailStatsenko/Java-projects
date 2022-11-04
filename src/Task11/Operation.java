package Task11;

public abstract class Operation {
    Value value;

    public Operation(Operandable firstOperand, Operandable secondOperand) {
        Value firstV = firstOperand.getValue();
        Value secondV = secondOperand.getValue();
        switch (firstV.type) {
            case VAL:
                value = new Value(firstV);
                switch (secondV.type) {
                    case VAL:
                        value.value2 = secondV;
                        break;
                    case CONST:
                        value.double2 = secondV.double1;
                        break;
                    case VAR:
                        value.var2 = secondV.var1;
                        break;
                    default:
                        break;
                }
                break;
            case VAR:
                value = new Value(firstV.var1);
                switch (secondV.type) {
                    case VAL:
                        value.value2 = secondV;
                        break;
                    case CONST:
                        value.double2 = secondV.double1;
                        break;
                    case VAR:
                        value.var2 = secondV.var1;
                        break;
                    default:
                        break;
                }
                break;
            case CONST:
                value = new Value(firstV.double1);
                switch (secondV.type) {
                    case VAL:
                        value.value2 = secondV;
                        break;
                    case CONST:
                        value.double2 = secondV.double1;
                        break;
                    case VAR:
                        value.var2 = secondV.var1;
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        value.type = Value.ValueType.VAL;
    }

    public double evaluate(double var, Value res) {
        if (res.var1 != null) {
            if (res.var2 != null) {
                return getOpResult(res.operation, var, var);
            }
            if (res.double2 != null) {
                return getOpResult(res.operation, var, res.double2);
            }
            if (res.value2 != null) {
                return getOpResult(
                        res.operation,
                        var,
                        evaluate(var, res.value2)
                );
            }
        }

        if (res.double1 != null) {
            if (res.var2 != null) {
                return getOpResult(res.operation, res.double1, var);
            }
            if (res.double2 != null) {
                return getOpResult(res.operation, res.double1, res.double2);
            }
            if (res.value2 != null) {
                return getOpResult(res.operation, res.double1, evaluate(var, res.value2));
            }
        }

        if (res.value1 != null) {
            if (res.var2 != null) {
                return getOpResult(res.operation, evaluate(var, res.value1), var);
            }
            if (res.double2 != null) {
                return getOpResult(res.operation, evaluate(var, res.value1), res.double2);
            }
            if (res.value2 != null) {
                return getOpResult(res.operation, evaluate(var, res.value1), evaluate(var, res.value2));
            }
        }

        return 0;
    }

    public static double getOpResult(String operation, double a, double b) {
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                return a + b;
        }
    }

    public double evaluate(double var) {
        return evaluate(var, value);
    }
}
