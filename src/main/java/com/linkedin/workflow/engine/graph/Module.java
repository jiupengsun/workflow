package com.linkedin.workflow.engine.graph;

public class Module extends Graph {

  @Override
  public ConnectiveTypes returnType() {
    return ConnectiveTypes.MODULE;
  }
}
