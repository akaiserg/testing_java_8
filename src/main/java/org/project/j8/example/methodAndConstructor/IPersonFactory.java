package org.project.j8.example.methodAndConstructor;

interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}