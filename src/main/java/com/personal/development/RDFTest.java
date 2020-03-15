package com.personal.development;

import org.eclipse.rdf4j.model.*;
import org.eclipse.rdf4j.model.impl.LinkedHashModel;
import org.eclipse.rdf4j.model.impl.SimpleValueFactory;
import org.eclipse.rdf4j.model.impl.TreeModel;
import org.eclipse.rdf4j.model.util.RDFCollections;
import org.eclipse.rdf4j.model.vocabulary.FOAF;
import org.eclipse.rdf4j.model.vocabulary.RDF;

import org.eclipse.rdf4j.rio.RDFFormat;
import org.eclipse.rdf4j.rio.Rio;

import java.util.Arrays;
import java.util.List;

public class RDFTest {

    public static void main(String[] args) {
// We use a ValueFactory to create the building blocks of our RDF statements:
// IRIs, blank nodes and literals.
        ValueFactory vf = SimpleValueFactory.getInstance();

// We want to reuse this namespace when creating several building blocks.
        String ex = "http://example.org/";

// Create IRIs for the resources we want to add.
        IRI picasso = vf.createIRI(ex, "Picasso");
        IRI artist = vf.createIRI(ex, "Artist");
        IRI sam = vf.createIRI(ex,"alert1");
        IRI sam2 = vf.createIRI(ex,"alert2");






// Create a new, empty Model object.
        Model model = new TreeModel();

// add our first statement: Picasso is an Artist
        model.add(picasso, RDF.TYPE, artist);

// second statement: Picasso's first name is "Pablo".
        model.add(picasso, FOAF.FIRST_NAME, vf.createLiteral("Pablo"));

        model.setNamespace("ex" ,ex);
        model.setNamespace(FOAF.NS);

        model.add(sam , RDF.TYPE, artist);
        model.add(sam , FOAF.NAME , picasso);

        model.add(sam2 , RDF.TYPE , artist);
        model.add(sam2,FOAF.ACCOUNT , picasso);

        Rio.write(model, System.out , RDFFormat.TURTLE);
    }
}
