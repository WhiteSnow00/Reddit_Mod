// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.pqc.jcajce.provider.newhope;

import kk2.l;
import cm2.d;
import java.util.Arrays;
import nm2.a;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import cm2.c;
import yl2.b;
import org.bouncycastle.pqc.jcajce.interfaces.NHPublicKey;

public class BCNHPublicKey implements NHPublicKey
{
    private static final long serialVersionUID = 1L;
    public transient b f;
    
    public BCNHPublicKey(final xk2.b b) throws IOException {
        this.f = (b)c.a(b);
    }
    
    public BCNHPublicKey(final b f) {
        this.f = f;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f = (b)c.a(xk2.b.i((Object)objectInputStream.readObject()));
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.getEncoded());
    }
    
    @Override
    public boolean equals(final Object o) {
        return o != null && o instanceof BCNHPublicKey && Arrays.equals(a.a(this.f.f), a.a(((BCNHPublicKey)o).f.f));
    }
    
    public final String getAlgorithm() {
        return "NH";
    }
    
    public byte[] getEncoded() {
        try {
            return ((l)d.a((fl2.a)this.f)).getEncoded();
        }
        catch (final IOException ex) {
            return null;
        }
    }
    
    public String getFormat() {
        return "X.509";
    }
    
    public zk2.a getKeyParams() {
        return (zk2.a)this.f;
    }
    
    public byte[] getPublicData() {
        return a.a(this.f.f);
    }
    
    @Override
    public int hashCode() {
        return a.e(a.a(this.f.f));
    }
}
