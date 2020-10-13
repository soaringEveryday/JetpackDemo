package com.test.jetpack;

import androidx.work.WorkManager;

public class Logger {

    private volatile WorkManager workManager = null;

    private Logger() {
    }

    private void attach(WorkManager manager) {
        this.workManager = manager;
    }

    private static class LoggerHolder {
        static Logger INSTANCE = new Logger();
    }

    public  static Logger getInstance(){
        return LoggerHolder.INSTANCE;
    }

    public static void init(WorkManager manager) {
        Logger logger = getInstance();
        if (logger != null) {
            logger.attach(manager);
        }
    }

    public static void D(String log) {

    }

    public static void E(String log) {

    }
}
