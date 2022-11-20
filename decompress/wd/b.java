// 
// Decompiled by Procyon v0.6.0
// 

package wd;

import com.android.billingclient.api.w;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadFactory;

public final class b implements ThreadFactory
{
    public final String f;
    public final AtomicInteger g;
    public final ThreadFactory h;
    
    public b(final String f) {
        this.g = new AtomicInteger();
        this.h = Executors.defaultThreadFactory();
        this.f = f;
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final Thread thread = this.h.newThread((Runnable)new w(runnable));
        final String f = this.f;
        final int andIncrement = this.g.getAndIncrement();
        final StringBuilder sb = new StringBuilder(f.length() + 13);
        sb.append(f);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        thread.setName(sb.toString());
        return thread;
    }
}
