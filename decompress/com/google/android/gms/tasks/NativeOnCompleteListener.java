// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.tasks;

import we.g;
import we.c;

public class NativeOnCompleteListener implements c<Object>
{
    public final void k(final g<Object> g) {
        Object j = null;
        String message = null;
        Label_0047: {
            if (g.n()) {
                j = g.j();
                message = null;
            }
            else {
                if (!g.l()) {
                    final Exception i = g.i();
                    if (i != null) {
                        message = i.getMessage();
                        j = null;
                        break Label_0047;
                    }
                }
                j = null;
                message = null;
            }
        }
        this.nativeOnComplete(0L, j, g.n(), g.l(), message);
    }
    
    public native void nativeOnComplete(final long p0, final Object p1, final boolean p2, final boolean p3, final String p4);
}
