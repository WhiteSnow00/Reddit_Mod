// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.pqc.crypto.xmss;

import android.support.v4.media.c;

public abstract class e
{
    public final int a;
    public final long b;
    public final int c;
    public final int d;
    
    public e(final a a) {
        this.a = a.b;
        this.b = a.c;
        this.c = a.a;
        this.d = a.d;
    }
    
    public byte[] a() {
        final byte[] array = new byte[32];
        android.support.v4.media.c.m0(this.a, 0, array);
        android.support.v4.media.c.B0(this.b, array, 4);
        android.support.v4.media.c.m0(this.c, 12, array);
        android.support.v4.media.c.m0(this.d, 28, array);
        return array;
    }
    
    public abstract static class a<T extends a>
    {
        public final int a;
        public int b;
        public long c;
        public int d;
        
        public a(final int a) {
            this.b = 0;
            this.c = 0L;
            this.d = 0;
            this.a = a;
        }
        
        public abstract T a();
        
        public final T b(final int d) {
            this.d = d;
            return this.a();
        }
        
        public final T c(final int b) {
            this.b = b;
            return this.a();
        }
        
        public final T d(final long c) {
            this.c = c;
            return this.a();
        }
    }
}
