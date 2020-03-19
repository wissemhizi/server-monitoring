package tn.talan.javaagent.util;

import tn.talan.javaagent.domain.MetricRecord;
import tn.talan.javaagent.domain.RequestRecord;

import java.util.Map;

public interface HttpUrlConnectionUtil {

    String processMetricRecords(Map<String, MetricRecord> metricRecords);

    String processRequestRecords(Map<String, RequestRecord> requestRecords);

}