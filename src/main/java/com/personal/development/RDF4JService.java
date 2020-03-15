package com.personal.development;


import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.impl.SimpleValueFactory;
import org.eclipse.rdf4j.model.impl.TreeModel;
import org.eclipse.rdf4j.model.vocabulary.OWL;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import org.eclipse.rdf4j.model.vocabulary.RDFS;
import org.eclipse.rdf4j.rio.RDFFormat;
import org.eclipse.rdf4j.rio.Rio;

public class RDF4JService {


    public static void main(String[] args) {


        // We use a ValueFactory to create the building blocks of our RDF statements:
// IRIs, blank nodes and literals.
        ValueFactory vf = SimpleValueFactory.getInstance();
        IRIGenerator iriGenerator = new IRIGenerator();

        Model model = new TreeModel();
        model.setNamespace(RDF.NS);
        model.setNamespace(RDFS.NS);
        model.setNamespace(Compliance.NS);
        model.setNamespace(Party.NS);
        model.setNamespace(Individual.NS);
        model.setNamespace(Organization.NS);
        model.setNamespace(Address.NS);
        model.setNamespace(OWL.NS);
        model.setNamespace(Person.NS);


// We want to reuse this namespace when creating several building blocks.
        //String baseURL = "http://example.org/";

// Create IRIs for the resources we want to add.
        IRI party = vf.createIRI(Compliance.NS.getName() , "party123");
        IRI oraganizationIRI =  iriGenerator.getIRIInstance("IBM123" , party); //vf.createIRI(party.getNamespace(), "oragnization");

        IRI person = vf.createIRI(party.getNamespace() , "Person");
        model.add(person,  Party.Of_PARTY , party);
        model.add(person , RDFS.SUBCLASSOF , party);
        model.add(person , RDFS.DOMAIN , party);
        model.add(person , RDFS.LABEL , vf.createLiteral("PERSON"));
        model.add(person , RDFS.DATATYPE , RDFS.CLASS);

        IRI individualIRI =   null ;
        for (int i=1 ; i < 4 ; i++)
        {
            individualIRI = iriGenerator.getIRIInstance(String.valueOf(i) , party);// vf.createIRI(party.getNamespace(), "individual");

           // model.add(individualIRI , RDFS.SUBCLASSOF , person);
            model.add(individualIRI , RDF.TYPE , person);
            model.add(individualIRI ,RDFS.DOMAIN , party);
            model.add(individualIRI , RDFS.RANGE ,party);
            model.add(individualIRI , RDFS.LABEL , vf.createLiteral("INIDIVIDUAL"));
            model.add(individualIRI, Individual.NAME  , vf.createLiteral("Shashi_Updated"));
            model.add(individualIRI,Individual.ADDRESS , vf.createLiteral("Singapore"));
            model.add(individualIRI,Individual.EMAIL , vf.createLiteral("Shashi123@gmail.com"));
            model.add(individualIRI , Individual.WORKS_FOR_ORG , oraganizationIRI);
           model.add(person ,Person.HAS_INDIVIDUAL , individualIRI );

        }


        //Address
        IRI location = vf.createIRI(Compliance.NS.getName() , "location");
        IRI addressIRI = vf.createIRI(location.getNamespace() , "address");
        model.add(addressIRI , RDF.TYPE , location);
        model.add(addressIRI , Address.ADDRESS_VALUE , vf.createLiteral("Provide Full Address"));



        //Organization data
        model.add(oraganizationIRI,Party.Of_PARTY , party);
        model.add(oraganizationIRI, RDFS.SUBCLASSOF, party);
        model.add(oraganizationIRI, RDFS.DOMAIN , party);
        model.add(oraganizationIRI ,RDFS.LABEL ,vf.createLiteral("ORGANIZATION"));
        model.add(oraganizationIRI, Organization.NAME, vf.createLiteral("IBM"));




        Rio.write(model, System.out , RDFFormat.TURTLE);

    }

}
