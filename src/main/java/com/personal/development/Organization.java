package com.personal.development;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Namespace;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.impl.SimpleNamespace;
import org.eclipse.rdf4j.model.impl.SimpleValueFactory;

public class Organization {

    public static final String NAMESPACE = "http://example.org/organization/";
    public static final String PREFIX = "organization";
    public static final Namespace NS = new SimpleNamespace(PREFIX, NAMESPACE);
    public static final IRI NAME;


    static {
        ValueFactory factory = SimpleValueFactory.getInstance();
        NAME = factory.createIRI(NAMESPACE, "Name");

    }
}
