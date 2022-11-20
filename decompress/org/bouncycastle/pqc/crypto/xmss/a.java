// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.pqc.crypto.xmss;

import ai2.h;

public final class a extends e
{
    public final int e;
    public final int f;
    
    public a(final a a) {
        super((e$a)a);
        this.e = a.e;
        this.f = a.f;
    }
    
    public final byte[] a() {
        final byte[] a = super.a();
        h.G(0, 16, a);
        h.G(this.e, 20, a);
        h.G(this.f, 24, a);
        return a;
    }
    
    public static final class a extends e$a<a>
    {
        public int e;
        public int f;
        
        public a() {
            super(2);
            this.e = 0;
            this.f = 0;
        }
        
        public final e$a a() {
            return this;
        }
        
        public final e e() {
            return new org.bouncycastle.pqc.crypto.xmss.a(this);
        }
    }
}
