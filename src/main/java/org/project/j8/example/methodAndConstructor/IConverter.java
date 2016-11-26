package org.project.j8.example.methodAndConstructor;

@FunctionalInterface
public interface IConverter<F, T> {
    T convert(F from);
}
