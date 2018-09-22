package ru.nukkit.multipass.util;

import cn.nukkit.Server;
import cn.nukkit.scheduler.AsyncTask;
import ru.nukkit.multipass.MultipassPlugin;

/**
 * Created by Igor on 17.08.2016.
 */
public abstract class MultiTask extends AsyncTask {

    public void start() {
        Server.getInstance().getScheduler().scheduleAsyncTask(MultipassPlugin.getPlugin(), this);
    }
}
