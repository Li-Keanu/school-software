package com.keanu.software.four.b1.themostate;

import com.github.oxo42.stateless4j.delegates.Action;

/**
 * @author tiger
 * @date 2023-10-16 20:47
 */
public class StopHeaterAction implements Action {
    @Override
    public void doIt() {
        System.out.println("停止烧水");
    }
}
