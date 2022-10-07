package io.codelex.enums.practice.Exercise2;

public enum Actions {
    S("SCISSOR"),
    P("PAPER"),
    T("STONE");

    String name;

    Actions(String name) {
        this.name = name;
    }

    public Actions choise(int num) {
        Actions[] all = Actions.values();
        return all[num];
    }
}
