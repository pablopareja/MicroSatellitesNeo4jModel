/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era7.bioinfo.microsats.relationships;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ProjectSequenceRel extends BasicRelationship{

    public static final String NAME = "PROJECT_SEQUENCE";
    

    public ProjectSequenceRel(Relationship rel){
        super(rel);
    }
    
    @Override
    public String name() {
        return NAME;
    }
    

}
