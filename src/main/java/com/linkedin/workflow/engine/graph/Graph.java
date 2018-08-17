package com.linkedin.workflow.engine.graph;

import java.util.List;


public class Graph implements Connective {

  protected List<Connective> _precursors;
  protected List<Connective> _successors;
  protected List<Object> _inputTypes;
  protected Object _outputType;
  protected List<Connective> _inputEle;
  protected Connective _outputEle;

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

  public List<Connective> getInputEle() {
    return _inputEle;
  }

  public void setInputEle(List<Connective> inputEle) {
    _inputEle = inputEle;
  }

  public Connective getOutputEle() {
    return _outputEle;
  }

  public void setOutputEle(Connective outputEle) {
    _outputEle = outputEle;
  }

  @Override
  public ConnectiveTypes returnType() {
    return ConnectiveTypes.GRAPH;
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
