Simple Scala-like Option
========================

This is a simple implementation of a Scala-like Option/Some/None hierarchy. 

Use
---
To get an instance of Option<T>, call it like this:

    Option<T> opt = Option.option(sometingThatMightBeNull);

You can then call `opt.get()` or `opt.getOrElse(alternateValue)` and won't get a null, even if `thingThatMightBeNull` is, in fact, null. If the call `opt.get()`, and the Option<T> you have is actually a None<T>, then a NoSuchElementException will be thrown.

=======
option
======
