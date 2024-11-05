package com.keanu.software.four.b1.themostate;

import com.github.oxo42.stateless4j.delegates.Action;

/**
 * @author tiger
 * @date 2023-10-16 20:45
 */
public class StartHeaterAction implements Action {

    @Override
    public void doIt() {
        System.out.println("开始烧水");
    }
}
