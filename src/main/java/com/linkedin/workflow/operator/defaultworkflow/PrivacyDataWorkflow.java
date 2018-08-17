package com.linkedin.workflow.operator.defaultworkflow;

import com.linkedin.remix.Operator0;
import com.linkedin.remix.data.PrivacyData;
import com.linkedin.remix.util.Logger;


public class PrivacyDataWorkflow implements Operator0<PrivacyData> {
  @Override
  public PrivacyData apply() {
    Logger.info(PrivacyDataWorkflow.class.getName());
    return new PrivacyData();
  }
}
