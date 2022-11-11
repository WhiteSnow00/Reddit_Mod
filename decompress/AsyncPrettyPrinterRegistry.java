// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.network;

import java.util.HashMap;
import java.util.Map;

public class AsyncPrettyPrinterRegistry
{
    private final Map<String, AsyncPrettyPrinterFactory> mRegistry;
    
    public AsyncPrettyPrinterRegistry() {
        this.mRegistry = new HashMap<String, AsyncPrettyPrinterFactory>();
    }
    
    public AsyncPrettyPrinterFactory lookup(final String s) {
        synchronized (this) {
            return this.mRegistry.get(s);
        }
    }
    
    public void register(final String s, final AsyncPrettyPrinterFactory asyncPrettyPrinterFactory) {
        synchronized (this) {
            this.mRegistry.put(s, asyncPrettyPrinterFactory);
        }
    }
    
    public boolean unregister(final String s) {
        synchronized (this) {
            return this.mRegistry.remove(s) != null;
        }
    }
}
