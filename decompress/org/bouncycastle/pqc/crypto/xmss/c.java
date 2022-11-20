// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.pqc.crypto.xmss;

import ai2.h;

public final class c extends e
{
    public final int e;
    public final int f;
    public final int g;
    
    public c(final a a) {
        super((e$a)a);
        this.e = a.e;
        this.f = a.f;
        this.g = a.g;
    }
    
    public final byte[] a() {
        final byte[] a = super.a();
        h.G(this.e, 16, a);
        h.G(this.f, 20, a);
        h.G(this.g, 24, a);
        return a;
    }
    
    public static final class a extends e$a<a>
    {
        public int e;
        public int f;
        public int g;
        
        public a() {
            super(0);
            this.e = 0;
            this.f = 0;
            this.g = 0;
        }
        
        public final e$a a() {
            return this;
        }
        
        public final e e() {
            return new c(this);
        }
    }
}
