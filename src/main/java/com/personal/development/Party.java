package com.personal.development;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Namespace;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.impl.SimpleNamespace;
import org.eclipse.rdf4j.model.impl.SimpleValueFactory;

import javax.print.attribute.standard.MediaSize;

public class Party {

    public static final String NAMESPACE = "http://example.org/party/";
    public static final String PREFIX = "party";
    public static final Namespace NS = new SimpleNamespace(PREFIX, NAMESPACE);
    public static final IRI NAME;
    public  static  final  IRI Of_PARTY ;


    static {
        ValueFactory factory = SimpleValueFactory.getInstance();
        NAME = factory.createIRI(NAMESPACE, "Name");
        Of_PARTY = factory.createIRI(NAMESPACE,"Of_Party");

    }
}
