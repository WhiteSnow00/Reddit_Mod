// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.pqc.jcajce.provider.sphincs;

import kk2.l;
import vl2.e;
import fl2.a;
import cm2.d;
import java.util.Arrays;
import kk2.q;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import cm2.c;
import vl2.h;
import bm2.b;
import kk2.m;
import org.bouncycastle.pqc.jcajce.interfaces.SPHINCSKey;
import java.security.PublicKey;

public class BCSphincs256PublicKey implements PublicKey, SPHINCSKey
{
    private static final long serialVersionUID = 1L;
    public transient m f;
    public transient b g;
    
    public BCSphincs256PublicKey(final m f, final b g) {
        this.f = f;
        this.g = g;
    }
    
    public BCSphincs256PublicKey(final xk2.b b) throws IOException {
        this.f = h.i(b.f.g).g.f;
        this.g = (b)c.a(b);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        final xk2.b i = xk2.b.i((Object)objectInputStream.readObject());
        this.f = h.i(i.f.g).g.f;
        this.g = (b)c.a(i);
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
        if (o instanceof BCSphincs256PublicKey) {
            final BCSphincs256PublicKey bcSphincs256PublicKey = (BCSphincs256PublicKey)o;
            if (!((q)this.f).n((q)bcSphincs256PublicKey.f) || !Arrays.equals(this.g.a(), bcSphincs256PublicKey.g.a())) {
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
        try {
            final b g = this.g;
            xk2.b a;
            if (g.f != null) {
                a = d.a((a)g);
            }
            else {
                a = new xk2.b(new xk2.a(e.d, (l)new h(new xk2.a(this.f))), this.g.a());
            }
            return ((l)a).getEncoded();
        }
        catch (final IOException ex) {
            return null;
        }
    }
    
    public String getFormat() {
        return "X.509";
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
