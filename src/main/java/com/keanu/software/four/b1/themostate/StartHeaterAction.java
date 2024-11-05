package com.keanu.software.four.b1.themostate;

import com.github.oxo42.stateless4j.delegates.Action;

public class StartHeaterAction implements Action {

    @Override
    public void doIt() {
        System.out.println("开始烧水");
    }
}
