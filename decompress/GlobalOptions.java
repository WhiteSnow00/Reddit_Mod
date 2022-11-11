// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.dumpapp;

import org.apache.commons.cli.Options;
import org.apache.commons.cli.Option;

public class GlobalOptions
{
    public final Option optionHelp;
    public final Option optionListPlugins;
    public final Option optionProcess;
    public final Options options;
    
    public GlobalOptions() {
        final Option optionHelp = new Option("h", "help", false, "Print this help");
        this.optionHelp = optionHelp;
        final Option optionListPlugins = new Option("l", "list", false, "List available plugins");
        this.optionListPlugins = optionListPlugins;
        final Option optionProcess = new Option("p", "process", true, "Specify target process");
        this.optionProcess = optionProcess;
        final Options options = new Options();
        (this.options = options).addOption(optionHelp);
        options.addOption(optionListPlugins);
        options.addOption(optionProcess);
    }
}
