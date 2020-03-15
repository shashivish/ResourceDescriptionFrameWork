package com.personal.development;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Namespace;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.impl.SimpleNamespace;
import org.eclipse.rdf4j.model.impl.SimpleValueFactory;

public class Address {


    public static final String NAMESPACE = "http://example.org/address/";
    public static final String PREFIX = "address";
    public static final Namespace NS = new SimpleNamespace(PREFIX, NAMESPACE);
    public static final IRI ADDRESS_VALUE;


    static {
        ValueFactory factory = SimpleValueFactory.getInstance();
        ADDRESS_VALUE = factory.createIRI(NAMESPACE, "FullAddress");

    }
}
