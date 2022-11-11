// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.dumpapp;

public interface DumperPlugin
{
    void dump(final DumperContext p0) throws DumpException;
    
    String getName();
}
