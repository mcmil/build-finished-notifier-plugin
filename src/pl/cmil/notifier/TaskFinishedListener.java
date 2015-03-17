package pl.cmil.notifier;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.externalSystem.model.task.ExternalSystemTaskId;
import com.intellij.openapi.externalSystem.model.task.ExternalSystemTaskNotificationListenerAdapter;
import com.intellij.util.ui.UIUtil;

public class TaskFinishedListener extends ExternalSystemTaskNotificationListenerAdapter {

    @Override
    public void onEnd(ExternalSystemTaskId id) {
        super.onEnd(id);
        playSound();
    }


    private void playSound() {
        UIUtil.playSoundFromResource("/finished.wav");
    }
}
