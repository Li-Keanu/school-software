package com.keanu.software.four.b1.themostate;

import com.github.oxo42.stateless4j.delegates.FuncBoolean;

public class GuardCondition {
    private boolean empty;
    FuncBoolean isEmpty() {
        return () -> empty;
    }
    FuncBoolean hasWater() {
        return () -> !empty;
    }

    void setEmpty(boolean empty) {
        this.empty = empty;
    }
}
