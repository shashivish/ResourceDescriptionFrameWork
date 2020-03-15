package com.personal.development;

import org.apache.commons.math3.geometry.euclidean.threed.NotARotationMatrixException;
import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Namespace;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.impl.SimpleNamespace;
import org.eclipse.rdf4j.model.impl.SimpleValueFactory;

/**
 * @Author : Shashi Vishwakarma
 */
public class Individual {

    public static final String NAMESPACE = "http://example.org/individual/";
    public static final String PREFIX = "individual";
    public static final Namespace NS = new SimpleNamespace(PREFIX, NAMESPACE);
    public static final IRI NAME;
    public static final IRI ADDRESS;
    public static final IRI EMAIL;
    public static  final  IRI WORKS_FOR_ORG;

    static {
        ValueFactory factory = SimpleValueFactory.getInstance();
        NAME = factory.createIRI( NAMESPACE,"Name");
        ADDRESS = factory.createIRI( NAMESPACE,"ADDRESS");
        EMAIL = factory.createIRI( NAMESPACE,"EMAIL");
        WORKS_FOR_ORG = factory.createIRI(NAMESPACE , "WORKS_FOR_ORG");

    }

}
