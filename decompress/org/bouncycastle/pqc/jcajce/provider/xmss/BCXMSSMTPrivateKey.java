// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.pqc.jcajce.provider.xmss;

import org.bouncycastle.pqc.crypto.xmss.BDSStateMap;
import dm2.l;
import dm2.h$a;
import java.util.Arrays;
import kk2.q;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import cm2.a;
import vl2.j;
import tk2.b;
import kk2.u;
import dm2.h;
import kk2.m;
import org.bouncycastle.pqc.jcajce.interfaces.XMSSMTPrivateKey;
import java.security.PrivateKey;

public class BCXMSSMTPrivateKey implements PrivateKey, XMSSMTPrivateKey
{
    private static final long serialVersionUID = 7682140473044521395L;
    public transient m f;
    public transient h g;
    public transient u h;
    
    public BCXMSSMTPrivateKey(final m f, final h g) {
        this.f = f;
        this.g = g;
    }
    
    public BCXMSSMTPrivateKey(final b b) throws IOException {
        this.h = b.i;
        this.f = j.i(b.g.g).i.f;
        this.g = (h)a.a(b);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        final b i = b.i((Object)objectInputStream.readObject());
        this.h = i.i;
        this.f = j.i(i.g.g).i.f;
        this.g = (h)a.a(i);
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.getEncoded());
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof BCXMSSMTPrivateKey) {
            final BCXMSSMTPrivateKey bcxmssmtPrivateKey = (BCXMSSMTPrivateKey)o;
            if (!((q)this.f).n((q)bcxmssmtPrivateKey.f) || !Arrays.equals(this.g.b(), bcxmssmtPrivateKey.g.b())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public XMSSMTPrivateKey extractKeyShard(final int n) {
        final m f = this.f;
        final h g = this.g;
        if (n >= 1) {
            monitorenter(g);
            final long n2 = n;
            while (true) {
                try {
                    synchronized (g) {
                        final long maxIndex = g.m.getMaxIndex();
                        final long l = g.l;
                        monitorexit(g);
                        if (n2 <= maxIndex - l + 1L) {
                            final h$a h$a = new h$a(g.g);
                            h$a.d = dm2.l.b(g.h);
                            h$a.e = dm2.l.b(g.i);
                            h$a.f = dm2.l.b(g.j);
                            h$a.g = dm2.l.b(g.k);
                            h$a.b = g.l;
                            h$a.a(new BDSStateMap(g.m, g.l + n2 - 1L));
                            final h h = new h(h$a);
                            for (int i = 0; i != n; ++i) {
                                g.a();
                            }
                            monitorexit(g);
                            return (XMSSMTPrivateKey)new BCXMSSMTPrivateKey(f, h);
                        }
                        throw new IllegalArgumentException("usageCount exceeds usages remaining");
                    }
                    monitorexit(g);
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
        g.getClass();
        throw new IllegalArgumentException("cannot ask for a shard with 0 keys");
    }
    
    public String getAlgorithm() {
        return "XMSSMT";
    }
    
    public byte[] getEncoded() {
        try {
            return ((kk2.l)cm2.b.a((fl2.a)this.g, this.h)).getEncoded();
        }
        catch (final IOException ex) {
            return null;
        }
    }
    
    public String getFormat() {
        return "PKCS#8";
    }
    
    public int getHeight() {
        return this.g.g.c;
    }
    
    public long getIndex() {
        if (this.getUsagesRemaining() != 0L) {
            return this.g.l;
        }
        throw new IllegalStateException("key exhausted");
    }
    
    public zk2.a getKeyParams() {
        return (zk2.a)this.g;
    }
    
    public int getLayers() {
        return this.g.g.d;
    }
    
    public String getTreeDigest() {
        return xd.a.j0(this.f);
    }
    
    public m getTreeDigestOID() {
        return this.f;
    }
    
    public long getUsagesRemaining() {
        final h g = this.g;
        synchronized (g) {
            return g.m.getMaxIndex() - g.l + 1L;
        }
    }
    
    @Override
    public int hashCode() {
        return nm2.a.e(this.g.b()) * 37 + this.f.hashCode();
    }
}
