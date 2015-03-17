package pl.cmil.notifier;

import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.externalSystem.service.notification.ExternalSystemProgressNotificationManager;
import org.jetbrains.annotations.NotNull;

public class ExternalSystemListenerRegistrator implements ApplicationComponent {
    private ExternalSystemProgressNotificationManager systemProgressNotificationManager;

    public ExternalSystemListenerRegistrator(ExternalSystemProgressNotificationManager mng) {
        systemProgressNotificationManager = mng;
    }


    @Override
    public void initComponent() {
        systemProgressNotificationManager.addNotificationListener(new TaskFinishedListener());
    }

    @Override
    public void disposeComponent() {

    }

    @NotNull
    @Override
    public String getComponentName() {
        return "task-finished-registrator";
    }
}
