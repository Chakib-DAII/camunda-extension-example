package com.example.camunda.extension.utils.bpmnListeners.executionListeners;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by chakib.daii on 9/24/2020.
 */
@Component
public class BpmnExecutionListener implements ExecutionListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(BpmnExecutionListener.class);

    @Override
    public void notify(DelegateExecution delegateExecution) {
        LOGGER.info("\nExecution Info: {} \nExecution Class: {} \nTask: {} \nVariables: {}\n",
                delegateExecution.getProcessDefinitionId(), delegateExecution.getBpmnModelElementInstance().getClass().getCanonicalName(),
                delegateExecution.getBpmnModelElementInstance().getName(), delegateExecution.getVariables());
    }
}
