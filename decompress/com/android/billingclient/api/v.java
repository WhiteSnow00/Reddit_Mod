// 
// Decompiled by Procyon v0.6.0
// 

package com.android.billingclient.api;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadFactory;

public final class v implements ThreadFactory
{
    public final ThreadFactory f;
    public final AtomicInteger g;
    
    public v() {
        this.f = Executors.defaultThreadFactory();
        this.g = new AtomicInteger(1);
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final Thread thread = this.f.newThread(runnable);
        final int andIncrement = this.g.getAndIncrement();
        final StringBuilder sb = new StringBuilder(30);
        sb.append("PlayBillingLibrary-");
        sb.append(andIncrement);
        thread.setName(sb.toString());
        return thread;
    }
}
