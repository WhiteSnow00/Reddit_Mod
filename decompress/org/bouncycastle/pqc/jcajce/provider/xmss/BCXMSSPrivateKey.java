// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.pqc.jcajce.provider.xmss;

import org.bouncycastle.pqc.crypto.xmss.c;
import org.bouncycastle.pqc.crypto.xmss.BDS;
import dm2.l;
import org.bouncycastle.pqc.crypto.xmss.g$a;
import java.util.Arrays;
import kk2.q;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import cm2.a;
import vl2.i;
import tk2.b;
import kk2.u;
import kk2.m;
import org.bouncycastle.pqc.crypto.xmss.g;
import org.bouncycastle.pqc.jcajce.interfaces.XMSSPrivateKey;
import java.security.PrivateKey;

public class BCXMSSPrivateKey implements PrivateKey, XMSSPrivateKey
{
    private static final long serialVersionUID = 8568701712864512338L;
    public transient g f;
    public transient m g;
    public transient u h;
    
    public BCXMSSPrivateKey(final m g, final g f) {
        this.g = g;
        this.f = f;
    }
    
    public BCXMSSPrivateKey(final b b) throws IOException {
        this.h = b.i;
        this.g = i.i(b.g.g).h.f;
        this.f = (g)a.a(b);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        final b i = b.i((Object)objectInputStream.readObject());
        this.h = i.i;
        this.g = vl2.i.i(i.g.g).h.f;
        this.f = (g)a.a(i);
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
        if (o instanceof BCXMSSPrivateKey) {
            final BCXMSSPrivateKey bcxmssPrivateKey = (BCXMSSPrivateKey)o;
            if (!((q)this.g).n((q)bcxmssPrivateKey.g) || !Arrays.equals(this.f.b(), bcxmssPrivateKey.f.b())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public XMSSPrivateKey extractKeyShard(final int n) {
        final m g = this.g;
        final g f = this.f;
        if (n >= 1) {
            monitorenter(f);
            final long n2 = n;
            try {
                if (n2 <= f.a()) {
                    final g$a g$a = new g$a(f.g);
                    g$a.d = l.b(f.h);
                    g$a.e = l.b(f.i);
                    g$a.f = l.b(f.j);
                    g$a.g = l.b(f.k);
                    g$a.b = f.l.getIndex();
                    g$a.h = f.l.withMaxIndex(f.l.getIndex() + n - 1, f.g.d);
                    final g g2 = new g(g$a);
                    if (n2 == f.a()) {
                        f.l = new BDS(f.g, f.l.getMaxIndex(), f.l.getIndex() + n);
                    }
                    else {
                        final c c = new c(new c.a());
                        for (int i = 0; i != n; ++i) {
                            f.l = f.l.getNextState(f.j, f.h, c);
                        }
                    }
                    monitorexit(f);
                    return (XMSSPrivateKey)new BCXMSSPrivateKey(g, g2);
                }
                throw new IllegalArgumentException("usageCount exceeds usages remaining");
            }
            finally {
                monitorexit(f);
            }
        }
        f.getClass();
        throw new IllegalArgumentException("cannot ask for a shard with 0 keys");
    }
    
    public String getAlgorithm() {
        return "XMSS";
    }
    
    public byte[] getEncoded() {
        try {
            return ((kk2.l)cm2.b.a((fl2.a)this.f, this.h)).getEncoded();
        }
        catch (final IOException ex) {
            return null;
        }
    }
    
    public String getFormat() {
        return "PKCS#8";
    }
    
    public int getHeight() {
        return this.f.g.b;
    }
    
    public long getIndex() {
        if (this.getUsagesRemaining() != 0L) {
            return this.f.l.getIndex();
        }
        throw new IllegalStateException("key exhausted");
    }
    
    public zk2.a getKeyParams() {
        return (zk2.a)this.f;
    }
    
    public String getTreeDigest() {
        return xd.a.j0(this.g);
    }
    
    public m getTreeDigestOID() {
        return this.g;
    }
    
    public long getUsagesRemaining() {
        return this.f.a();
    }
    
    @Override
    public int hashCode() {
        return nm2.a.e(this.f.b()) * 37 + this.g.hashCode();
    }
}
