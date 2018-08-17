package com.linkedin.workflow.operator.defaultworkflow;

import com.linkedin.remix.Operator0;
import com.linkedin.workflow.data.MemberData;
import com.linkedin.remix.util.Logger;


public class MemberDataWorkflow implements Operator0<MemberData> {
  @Override
  public MemberData apply() {
    Logger.info(MemberDataWorkflow.class.getName());
    return new MemberData();
  }
}
