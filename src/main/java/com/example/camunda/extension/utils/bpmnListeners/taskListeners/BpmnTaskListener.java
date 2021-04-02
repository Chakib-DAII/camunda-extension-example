package com.example.camunda.extension.utils.bpmnListeners.taskListeners;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by chakib.daii on 9/24/2020.
 */
@Component
public class BpmnTaskListener implements TaskListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(BpmnTaskListener.class);

    @Override
    public void notify(DelegateTask delegateTask) {
        LOGGER.info("\nTask Info: {} \nTask Name: {} \nTask Key: {} \nTask Id: {} \nForm Key: {} \nVariables: {}\n",
                delegateTask.getEventName(), delegateTask.getName(), delegateTask.getTaskDefinitionKey(),
                delegateTask.getId(), delegateTask.getBpmnModelElementInstance().getCamundaFormKey(), delegateTask.getVariables());
    }
}
