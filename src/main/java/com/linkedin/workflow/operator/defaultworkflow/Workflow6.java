package com.linkedin.remix.operator.defaultworkflow;

import com.linkedin.remix.Operator2;
import com.linkedin.remix.data.SearchRequest;
import com.linkedin.remix.util.Logger;


public class Workflow6 implements Operator2<SearchRequest, SearchRequest, SearchRequest> {
  @Override
  public SearchRequest apply(SearchRequest searchRequest, SearchRequest searchRequest2) {
    Logger.info(Workflow6.class.getName());
    return searchRequest;
  }
}
