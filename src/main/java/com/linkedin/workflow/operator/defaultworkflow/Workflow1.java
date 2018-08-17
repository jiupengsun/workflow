package com.linkedin.remix.operator.defaultworkflow;

import com.linkedin.remix.Operator1;
import com.linkedin.remix.data.SearchRequest;
import com.linkedin.remix.util.Logger;


public class Workflow1 implements Operator1<SearchRequest, SearchRequest> {
  @Override
  public SearchRequest apply(SearchRequest searchRequest) {
    Logger.info(Workflow1.class.getName());
    return searchRequest;
  }
}
