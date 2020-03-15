package com.personal.development;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.impl.SimpleValueFactory;

public class IRIGenerator {

    ValueFactory vf = SimpleValueFactory.getInstance();

    /**
     * Get IRI instance
     * @param model
     * @param id
     * @param parentIRI
     * @return
     */
    public  IRI getIRIInstance( String id, IRI parentIRI) {
        IRI dyanmicIRR = vf.createIRI(parentIRI.getNamespace(), id);
        return dyanmicIRR;
    }
}
