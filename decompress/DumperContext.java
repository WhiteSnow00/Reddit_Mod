// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.dumpapp;

import com.facebook.stetho.common.Util;
import java.io.InputStream;
import java.io.PrintStream;
import mk2.a;
import java.util.List;

public class DumperContext
{
    private final List<String> mArgs;
    private final a mParser;
    private final PrintStream mStderr;
    private final InputStream mStdin;
    private final PrintStream mStdout;
    
    public DumperContext(final DumperContext dumperContext, final List<String> list) {
        this(dumperContext.getStdin(), dumperContext.getStdout(), dumperContext.getStderr(), dumperContext.getParser(), list);
    }
    
    public DumperContext(final InputStream inputStream, final PrintStream printStream, final PrintStream printStream2, final a a, final List<String> list) {
        this.mStdin = (InputStream)Util.throwIfNull((Object)inputStream);
        this.mStdout = (PrintStream)Util.throwIfNull((Object)printStream);
        this.mStderr = (PrintStream)Util.throwIfNull((Object)printStream2);
        this.mParser = (a)Util.throwIfNull((Object)a);
        this.mArgs = (List)Util.throwIfNull((Object)list);
    }
    
    public List<String> getArgsAsList() {
        return this.mArgs;
    }
    
    public a getParser() {
        return this.mParser;
    }
    
    public PrintStream getStderr() {
        return this.mStderr;
    }
    
    public InputStream getStdin() {
        return this.mStdin;
    }
    
    public PrintStream getStdout() {
        return this.mStdout;
    }
}
