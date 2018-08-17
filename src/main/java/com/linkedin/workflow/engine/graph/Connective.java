package com.linkedin.workflow.engine.graph;

import java.util.List;


public interface Connective {

  ConnectiveTypes returnType();
  List<Connective> getPrecursors();
  List<Connective> getSuccessors();
  List<Object> getInputTypes();
  Object getOutputType();

}
