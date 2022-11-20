// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.pqc.jcajce.provider.lms;

import kk2.l;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import wl2.g;
import java.util.Arrays;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import cm2.a;
import tk2.b;
import kk2.u;
import wl2.f;
import org.bouncycastle.pqc.jcajce.interfaces.LMSPrivateKey;
import java.security.PrivateKey;

public class BCLMSPrivateKey implements PrivateKey, LMSPrivateKey
{
    private static final long serialVersionUID = 8568701712864512338L;
    public transient f f;
    public transient u g;
    
    public BCLMSPrivateKey(final b b) throws IOException {
        this.g = b.i;
        this.f = (f)a.a(b);
    }
    
    public BCLMSPrivateKey(final f f) {
        this.f = f;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        final b i = b.i((Object)objectInputStream.readObject());
        this.g = i.i;
        this.f = (f)a.a(i);
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.getEncoded());
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof BCLMSPrivateKey) {
            final BCLMSPrivateKey bclmsPrivateKey = (BCLMSPrivateKey)o;
            try {
                return Arrays.equals(this.f.getEncoded(), bclmsPrivateKey.f.getEncoded());
            }
            catch (final IOException ex) {
                throw new IllegalStateException("unable to perform equals");
            }
        }
        return false;
    }
    
    @Override
    public LMSPrivateKey extractKeyShard(final int n) {
        final f f = this.f;
        if (f instanceof g) {
            final g g = (g)f;
            synchronized (g) {
                final int k = g.k;
                final int n2 = k + n;
                if (n2 < g.i) {
                    final g g2 = new g(g, k, n2);
                    g.k += n;
                    monitorexit(g);
                    return new BCLMSPrivateKey((f)g2);
                }
                throw new IllegalArgumentException("usageCount exceeds usages remaining");
            }
        }
        final wl2.b b = (wl2.b)f;
        synchronized (b) {
            final long j = b.j;
            final long i = b.k;
            final long n3 = n;
            if (j - i >= n3) {
                final long l = i + n3;
                b.k = l;
                synchronized (b) {
                    final List h = b.h;
                    monitorexit(b);
                    final ArrayList list = new ArrayList(h);
                    synchronized (b) {
                        final List m = b.i;
                        monitorexit(b);
                        final wl2.b b2 = new wl2.b(b.f, list, new ArrayList(m), i, l, true);
                        try {
                            final wl2.b a = wl2.b.a((Object)b2.getEncoded());
                            b.b();
                            monitorexit(b);
                            return new BCLMSPrivateKey((f)a);
                        }
                        catch (final Exception ex) {
                            throw new RuntimeException(ex.getMessage(), ex);
                        }
                    }
                }
            }
            throw new IllegalArgumentException("usageCount exceeds usages remaining in current leaf");
        }
    }
    
    @Override
    public String getAlgorithm() {
        return "LMS";
    }
    
    @Override
    public byte[] getEncoded() {
        try {
            return ((l)cm2.b.a((fl2.a)this.f, this.g)).getEncoded();
        }
        catch (final IOException ex) {
            return null;
        }
    }
    
    @Override
    public String getFormat() {
        return "PKCS#8";
    }
    
    @Override
    public long getIndex() {
        if (this.getUsagesRemaining() != 0L) {
            final f f = this.f;
            if (f instanceof g) {
                final g g = (g)f;
                synchronized (g) {
                    return g.k;
                }
            }
            final wl2.b b = (wl2.b)f;
            synchronized (b) {
                return b.k;
            }
        }
        throw new IllegalStateException("key exhausted");
    }
    
    public zk2.a getKeyParams() {
        return (zk2.a)this.f;
    }
    
    @Override
    public int getLevels() {
        final f f = this.f;
        if (f instanceof g) {
            return 1;
        }
        return ((wl2.b)f).f;
    }
    
    @Override
    public long getUsagesRemaining() {
        final f f = this.f;
        if (f instanceof g) {
            final g g = (g)f;
            return g.i - g.k;
        }
        final wl2.b b = (wl2.b)f;
        return b.j - b.k;
    }
    
    @Override
    public int hashCode() {
        try {
            return nm2.a.e(this.f.getEncoded());
        }
        catch (final IOException ex) {
            throw new IllegalStateException("unable to calculate hashCode");
        }
    }
}
