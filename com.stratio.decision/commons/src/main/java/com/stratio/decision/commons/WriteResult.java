package com.stratio.decision.commons;

 import org.drools.core.spi.KnowledgeHelper;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class WriteResult {

    public static void sendResult(KnowledgeHelper drools, Object data){
        
      
        Result res = new Result(data); 
        drools.insert(res);
      
    }
}