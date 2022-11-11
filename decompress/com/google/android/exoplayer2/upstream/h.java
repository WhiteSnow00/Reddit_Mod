// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import ad.d0;

public interface h
{
    b getFallbackSelectionFor(final a p0, final c p1);
    
    int getMinimumLoadableRetryCount(final int p0);
    
    long getRetryDelayMsFor(final c p0);
    
    default void onLoadTaskConcluded(final long n) {
    }
    
    public static final class a
    {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        
        public a(final int a, final int b, final int c, final int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        public final boolean a(final int n) {
            boolean b = false;
            if (n == 1) {
                if (this.a - this.b <= 1) {
                    return b;
                }
            }
            else if (this.c - this.d <= 1) {
                return b;
            }
            b = true;
            return b;
        }
    }
    
    public static final class b
    {
        public final int a;
        public final long b;
        
        public b(final int a, final long b) {
            d0.c(b >= 0L);
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class c
    {
        public final IOException a;
        public final int b;
        
        public c(final IOException a, final int b) {
            this.a = a;
            this.b = b;
        }
    }
}
