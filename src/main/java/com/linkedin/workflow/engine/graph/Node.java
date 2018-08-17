package com.linkedin.workflow.engine.graph;

import java.util.List;


public class Node implements Connective {

  private String _classPath;
  private boolean ifConditional;
  private List<Connective> _precursors;
  private List<Connective> _successors;
  private List<Object> _inputTypes;

  public void setPrecursors(List<Connective> precursors) {
    _precursors = precursors;
  }

  public void setSuccessors(List<Connective> successors) {
    _successors = successors;
  }

  public void setInputTypes(List<Object> inputTypes) {
    _inputTypes = inputTypes;
  }

  public void setOutputType(Object outputType) {
    _outputType = outputType;
  }

  private Object _outputType;

  public String getClassPath() {
    return _classPath;
  }

  public void setClassPath(String classPath) {
    _classPath = classPath;
  }

  public boolean isIfConditional() {
    return ifConditional;
  }

  public void setIfConditional(boolean ifConditional) {
    this.ifConditional = ifConditional;
  }

  @Override
  public ConnectiveTypes returnType() {
    return ConnectiveTypes.NODE;
  }

  @Override
  public List<Connective> getPrecursors() {
    return _precursors;
  }

  @Override
  public List<Connective> getSuccessors() {
    return _successors;
  }

  @Override
  public List<Object> getInputTypes() {
    return _inputTypes;
  }

  @Override
  public Object getOutputType() {
    return _outputType;
  }
}
