// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.audio;

import h.r;
import com.google.android.exoplayer2.k$b;
import android.os.Handler;
import za.g;
import com.google.android.exoplayer2.n;
import za.e;

public interface a
{
    default void b(final String s) {
    }
    
    default void d(final long n, final long n2, final String s) {
    }
    
    default void g(final Exception ex) {
    }
    
    default void i(final e e) {
    }
    
    default void k(final Exception ex) {
    }
    
    default void l(final long n) {
    }
    
    default void o(final e e) {
    }
    
    default void onSkipSilenceEnabledChanged(final boolean b) {
    }
    
    default void p(final n n, final g g) {
    }
    
    default void s(final int n, final long n2, final long n3) {
    }
    
    @Deprecated
    default void v(final n n) {
    }
    
    public static final class a
    {
        public final Handler a;
        public final com.google.android.exoplayer2.audio.a b;
        
        public a(final Handler a, final k$b b) {
            this.a = a;
            this.b = (com.google.android.exoplayer2.audio.a)b;
        }
        
        public final void a(final e e) {
            monitorenter(e);
            monitorexit(e);
            final Handler a = this.a;
            if (a != null) {
                a.post((Runnable)new r(2, this, e));
            }
        }
    }
}
