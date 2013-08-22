package com.lancope.option;

public abstract class Option<T> {
    protected T thing;

    protected Option(T thing) {
        this.thing = thing;
    }

    public static <T> Option<T> option(T thing) {
        return thing == null ?
                new None<T>(thing) :
                new Some<T>(thing);
    }

    public abstract T getOrElse(T alternate);
}

class Some<T> extends Option<T> {
    protected Some(T thing) {
        super(thing);
    }

    @Override
    public T getOrElse(T alternate) {
        return thing;
    }
}

class None<T> extends Option<T> {

    protected None(T thing) {
        super(thing);
    }

    @Override
    public T getOrElse(T alternate) {
        return alternate;
    }
}
