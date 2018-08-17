package com.linkedin.workflow.engine;

import com.linkedin.workflow.engine.graph.Graph;
import java.util.LinkedHashMap;
import java.util.List;


/**
 * rules for config file format:
 * @include("name", "file_path")
 * @define("name", "class_path")
 *  ::sequential: module=[module/node],[module/node]
 *    the output and input type should match (number, types, order)
 *  ::parallel: module=[module/node] | [module/node]
 *    the precursor nodes can be parallel, then the order of output should match current input node
 *    if the successor nodes are parallel, then current output should be input for each of successors
 *    no continuous parallel module allowed
 *      for example: w1, w2|w3 is allowed
 *                   w1|w2, w3 is allowed
 *                   w1|w2,w3|w4 is not allowed
 *  ::condition: <conditional[module/node], true[module/node], false[module/node]>
 *    condition identifier is only a state mark, no input & output, not allowed to use it in the workflow chain
 *    the first module/node should have Boolean as output, the true and false module/node should have same output type
 *
 *  constrains:
 *  The graph should be DAG(no circle existed)
 *  No isolated node(connected graph)
 *  Each .wf file will be generated as a Graph, in Graph there are module and node
 *  Graph: single input, single input type, single output
 *  Module: variable input, single input type, single output
 *  Node: single input, variable input type, single output
 *  The input and output type between connected graph/module/node should match
 */
public class Parser {
  private LinkedHashMap<String, Graph> _graphMap;

  public void parse() {
    /**
     * step for parsing config file
     * 1. scan the whole folder to get all of the config files ends with .wf
     *  and add them in the memory, analysis the syntax for each file, will throw error if there are syntax error
     * 2. check dependency for each graph, generate a non-connected graph
     * 3. parse the graph one by one
     */

    List<String> configFiles;
    List<Graph> graphs;
  }
}
