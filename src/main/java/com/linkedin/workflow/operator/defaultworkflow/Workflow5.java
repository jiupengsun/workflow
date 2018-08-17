package com.linkedin.remix.operator.defaultworkflow;

import com.linkedin.remix.Operator2;
import com.linkedin.workflow.data.MemberData;
import com.linkedin.remix.data.SearchRequest;
import com.linkedin.remix.util.Logger;


public class Workflow5 implements Operator2<MemberData, SearchRequest, SearchRequest> {
  @Override
  public SearchRequest apply(MemberData memberData, SearchRequest searchRequest) {
    Logger.info(Workflow5.class.getName());
    return searchRequest;
  }
}
