package com.brentmoen.maventemplate;

import com.brentmoen.commons.logging.LoggerFactory;
import com.brentmoen.log4j.Log4jLoggerFactory;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import javax.inject.Singleton;

public class AppModule extends AbstractModule {
    @Provides
    @Singleton
    LoggerFactory provideLoggerFactory(Log4jLoggerFactory loggerFactory) {
        return loggerFactory;
    }
}
