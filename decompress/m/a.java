// 
// Decompiled by Procyon v0.6.0
// 

package m;

import android.os.Looper;

public final class a extends android.support.v4.media.a
{
    public static volatile a g;
    public static final a$a h;
    public b f;
    
    static {
        h = new a$a();
    }
    
    public a() {
        this.f = new b();
    }
    
    public static a r2() {
        if (a.g != null) {
            return a.g;
        }
        synchronized (a.class) {
            if (a.g == null) {
                a.g = new a();
            }
            return a.g;
        }
    }
    
    public final boolean s2() {
        this.f.getClass();
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
    
    public final void t2(final Runnable runnable) {
        final b f = this.f;
        if (f.h == null) {
            synchronized (f.f) {
                if (f.h == null) {
                    f.h = b.r2(Looper.getMainLooper());
                }
            }
        }
        f.h.post(runnable);
    }
}
