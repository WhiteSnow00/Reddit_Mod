// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.tasks;

import qg.n;
import qg.a;

public class NativeOnCompleteListener implements a<Object>
{
    public final void e(final n n) {
        synchronized (n.a) {
            final boolean c = n.c;
            monitorexit(n.a);
            if (c) {
                if (n.d()) {
                    this.nativeOnComplete(0L, 0, n.c(), 0);
                    return;
                }
                final Object a = n.a;
                synchronized (n.a) {
                    final Exception e = n.e;
                    monitorexit(n.a);
                    if (!(e instanceof zzj)) {
                        this.nativeOnComplete(0L, 0, null, -100);
                        return;
                    }
                    final int errorCode = ((zzj)e).getErrorCode();
                    if (errorCode != 0) {
                        this.nativeOnComplete(0L, 0, null, errorCode);
                        return;
                    }
                    throw new IllegalStateException("TaskException has error code 0 on task: 0");
                }
            }
            throw new IllegalStateException("onComplete called for incomplete task: 0");
        }
    }
    
    public native void nativeOnComplete(final long p0, final int p1, final Object p2, final int p3);
}
