package com.linkedin.remix.operator.defaultworkflow;

import com.linkedin.remix.Operator2;
import com.linkedin.remix.data.PrivacyData;
import com.linkedin.remix.data.SearchRequest;
import com.linkedin.remix.util.Logger;


public class Workflow4 implements Operator2<PrivacyData, SearchRequest, SearchRequest> {
  @Override
  public SearchRequest apply(PrivacyData privacyData, SearchRequest searchRequest) {
    Logger.info(Workflow4.class.getName());
    return searchRequest;
  }
}
