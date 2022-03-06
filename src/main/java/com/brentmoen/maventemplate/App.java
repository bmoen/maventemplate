package com.brentmoen.maventemplate;

import com.brentmoen.boot.Boot;
import com.brentmoen.commons.logging.Logger;
import com.brentmoen.commons.logging.LoggerFactory;

import javax.inject.Inject;

public class App implements Runnable {
	public static void main(String[] args) {
        Boot.boot(args, App.class, Config.class, new AppModule());
	}

    private final Logger logger;

    @Inject
    public App(LoggerFactory loggerFactory) {
        this.logger = loggerFactory.create(getClass());
    }

    @Override
    public void run() {
        logger.info("Hello World");
    }
}
