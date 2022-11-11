// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import sg2.e;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;

public final class p4
{
    public final ExecutorService a;
    
    public p4(final v a) {
        this.a = a;
    }
    
    public final <T> Future<T> a(final j2<T> j2) {
        if (!this.a.isShutdown() && !this.a.isTerminated()) {
            final Future<T> submit = this.a.submit((Callable<T>)j2.f);
            e.e((Object)submit, "executorService.submit(task.callable)");
            return submit;
        }
        throw new RuntimeException("Task has been terminated");
    }
}
