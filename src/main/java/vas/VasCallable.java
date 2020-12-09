package vas;

import java.util.List;

interface VasCallable {
    int arity();
    Object call(Interpreter interpreter, List<Object> arguments);
}

