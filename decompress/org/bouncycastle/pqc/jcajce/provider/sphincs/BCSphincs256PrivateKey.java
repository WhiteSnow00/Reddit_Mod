// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.pqc.jcajce.provider.sphincs;

import kk2.u0;
import kk2.l;
import vl2.e;
import java.util.Arrays;
import kk2.q;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import vl2.h;
import tk2.b;
import kk2.u;
import bm2.a;
import kk2.m;
import org.bouncycastle.pqc.jcajce.interfaces.SPHINCSKey;
import java.security.PrivateKey;

public class BCSphincs256PrivateKey implements PrivateKey, SPHINCSKey
{
    private static final long serialVersionUID = 1L;
    public transient m f;
    public transient a g;
    public transient u h;
    
    public BCSphincs256PrivateKey(final m f, final a g) {
        this.f = f;
        this.g = g;
    }
    
    public BCSphincs256PrivateKey(final b b) throws IOException {
        this.h = b.i;
        this.f = vl2.h.i(b.g.g).g.f;
        this.g = (a)cm2.a.a(b);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        final b i = b.i((Object)objectInputStream.readObject());
        this.h = i.i;
        this.f = vl2.h.i(i.g.g).g.f;
        this.g = (a)cm2.a.a(i);
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
        if (o instanceof BCSphincs256PrivateKey) {
            final BCSphincs256PrivateKey bcSphincs256PrivateKey = (BCSphincs256PrivateKey)o;
            if (!((q)this.f).n((q)bcSphincs256PrivateKey.f) || !Arrays.equals(this.g.a(), bcSphincs256PrivateKey.g.a())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }
    
    public byte[] getEncoded() {
        final byte[] array = null;
        try {
            final a g = this.g;
            b a;
            if (g.f != null) {
                a = cm2.b.a((fl2.a)g, this.h);
            }
            else {
                a = new b(new xk2.a(e.d, (l)new h(new xk2.a(this.f))), (l)new u0(this.g.a()), this.h, (byte[])null);
            }
            return ((l)a).getEncoded();
        }
        catch (final IOException ex) {
            return array;
        }
    }
    
    public String getFormat() {
        return "PKCS#8";
    }
    
    public byte[] getKeyData() {
        return this.g.a();
    }
    
    public zk2.a getKeyParams() {
        return (zk2.a)this.g;
    }
    
    public m getTreeDigest() {
        return this.f;
    }
    
    @Override
    public int hashCode() {
        return nm2.a.e(this.g.a()) * 37 + this.f.hashCode();
    }
}
