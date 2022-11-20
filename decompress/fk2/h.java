// 
// Decompiled by Procyon v0.6.0
// 

package fk2;

import cg2.j;
import java.io.IOException;
import java.io.Closeable;

public abstract class h implements Closeable
{
    public boolean f;
    public int g;
    
    public abstract void b() throws IOException;
    
    @Override
    public final void close() throws IOException {
        synchronized (this) {
            if (this.f) {
                return;
            }
            this.f = true;
            if (this.g != 0) {
                return;
            }
            final j a = j.a;
            monitorexit(this);
            this.b();
        }
    }
    
    public abstract int d(final long p0, final byte[] p1, final int p2, final int p3) throws IOException;
    
    public abstract long h() throws IOException;
    
    public final h.h$a j(final long n) throws IOException {
        synchronized (this) {
            if (this.f ^ true) {
                ++this.g;
                monitorexit(this);
                return new h.h$a(this, n);
            }
            throw new IllegalStateException("closed".toString());
        }
    }
    
    public final long size() throws IOException {
        synchronized (this) {
            if (this.f ^ true) {
                final j a = j.a;
                monitorexit(this);
                return this.h();
            }
            throw new IllegalStateException("closed".toString());
        }
    }
}
