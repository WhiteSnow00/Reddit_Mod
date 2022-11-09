// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo;

import java.util.concurrent.ThreadFactory;

public final class b implements ThreadFactory
{
    @Override
    public final Thread newThread(final Runnable runnable) {
        return new Thread(runnable, "Apollo Dispatcher");
    }
}
