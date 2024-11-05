package com.keanu.software.four.b1.themostate;

import com.github.oxo42.stateless4j.delegates.Action;

public class StopHeaterAction implements Action {
    @Override
    public void doIt() {
        System.out.println("停止烧水");
    }
}
