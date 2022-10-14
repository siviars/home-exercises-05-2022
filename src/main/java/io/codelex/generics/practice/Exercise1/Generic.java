package main.java.io.codelex.generics.practice.Exercise1;

import java.util.HashMap;
import java.util.Map;

public class Generic<N,E>  {
    private  N i;
    private  E el;

    private Map<N, E> users = new HashMap<>();


    public <N,E> void add(N i, E el) {
        //this.i = i;
        //this.el = el;
        //users.put(i, el);
    }

    public E get(N i) {
        return users.get(i);
    }

}
