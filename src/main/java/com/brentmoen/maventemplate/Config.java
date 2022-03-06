package com.brentmoen.maventemplate;

import com.brentmoen.boot.AppConfig;
import picocli.CommandLine;

@CommandLine.Command(
    name = "Example app",
    version = "1.0-SNAPSHOT",
    description = ""
)
public class Config implements AppConfig {
    @CommandLine.Option(names = {"-h", "--help"}, description = "Display this message")
    private boolean helpRequested;

    @Override
    public boolean isHelpRequested() {
        return helpRequested;
    }

    @Override
    public void run() {
    }
}
