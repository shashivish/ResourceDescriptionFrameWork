package com.personal.development;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Namespace;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.impl.SimpleNamespace;
import org.eclipse.rdf4j.model.impl.SimpleValueFactory;

public class Compliance {

    public static final String NAMESPACE = "http://compliance.org/";
    public static final String PREFIX = "compliance";
    public static final Namespace NS = new SimpleNamespace(PREFIX, NAMESPACE);
    public static final IRI NAME;


    static {
        ValueFactory factory = SimpleValueFactory.getInstance();
        NAME = factory.createIRI(NAMESPACE, "Name");

    }

}
