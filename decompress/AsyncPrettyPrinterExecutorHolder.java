// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.network;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

final class AsyncPrettyPrinterExecutorHolder
{
    private static ExecutorService sExecutorService;
    
    private AsyncPrettyPrinterExecutorHolder() {
    }
    
    public static void ensureInitialized() {
        if (AsyncPrettyPrinterExecutorHolder.sExecutorService == null) {
            AsyncPrettyPrinterExecutorHolder.sExecutorService = Executors.newCachedThreadPool();
        }
    }
    
    public static ExecutorService getExecutorService() {
        return AsyncPrettyPrinterExecutorHolder.sExecutorService;
    }
    
    public static void shutdown() {
        AsyncPrettyPrinterExecutorHolder.sExecutorService.shutdown();
        AsyncPrettyPrinterExecutorHolder.sExecutorService = null;
    }
}
