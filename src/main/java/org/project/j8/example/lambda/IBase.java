package org.project.j8.example.lambda;

@FunctionalInterface
public interface IBase<T> {
    // To add two objects
    public T add(T t1, T t2);
}