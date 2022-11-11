// 
// Decompiled by Procyon v0.6.0
// 

package c6;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadFactory;

public final class a implements ThreadFactory
{
    public final AtomicInteger f;
    public final /* synthetic */ boolean g;
    
    public a(final boolean g) {
        this.g = g;
        this.f = new AtomicInteger(0);
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        String s;
        if (this.g) {
            s = "WM.task-";
        }
        else {
            s = "androidx.work-";
        }
        final StringBuilder r = a.r(s);
        r.append(this.f.incrementAndGet());
        return new Thread(runnable, r.toString());
    }
}
