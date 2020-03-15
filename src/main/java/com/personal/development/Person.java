package com.personal.development;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Namespace;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.impl.SimpleNamespace;
import org.eclipse.rdf4j.model.impl.SimpleValueFactory;

public class Person {

    public static final String NAMESPACE = "http://example.org/person/";
    public static final String PREFIX = "person";
    public static final Namespace NS = new SimpleNamespace(PREFIX, NAMESPACE);
    public static final IRI HAS_INDIVIDUAL;



    static {
        ValueFactory factory = SimpleValueFactory.getInstance();
        HAS_INDIVIDUAL = factory.createIRI(NAMESPACE, "has_individual");


    }
}
