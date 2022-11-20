// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.pqc.jcajce.provider.newhope;

import kk2.l;
import java.util.Arrays;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import tk2.b;
import kk2.u;
import yl2.a;
import org.bouncycastle.pqc.jcajce.interfaces.NHPrivateKey;

public class BCNHPrivateKey implements NHPrivateKey
{
    private static final long serialVersionUID = 1L;
    public transient a f;
    public transient u g;
    
    public BCNHPrivateKey(final b b) throws IOException {
        this.g = b.i;
        this.f = (a)cm2.a.a(b);
    }
    
    public BCNHPrivateKey(final a f) {
        this.f = f;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        final b i = b.i((Object)objectInputStream.readObject());
        this.g = i.i;
        this.f = (a)cm2.a.a(i);
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.getEncoded());
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof BCNHPrivateKey)) {
            return false;
        }
        final BCNHPrivateKey bcnhPrivateKey = (BCNHPrivateKey)o;
        final short[] f = this.f.f;
        short[] array = null;
        short[] array2;
        if (f == null) {
            array2 = null;
        }
        else {
            array2 = f.clone();
        }
        final short[] f2 = bcnhPrivateKey.f.f;
        if (f2 != null) {
            array = f2.clone();
        }
        return Arrays.equals(array2, array);
    }
    
    public final String getAlgorithm() {
        return "NH";
    }
    
    public byte[] getEncoded() {
        try {
            return ((l)cm2.b.a((fl2.a)this.f, this.g)).getEncoded();
        }
        catch (final IOException ex) {
            return null;
        }
    }
    
    public String getFormat() {
        return "PKCS#8";
    }
    
    public zk2.a getKeyParams() {
        return (zk2.a)this.f;
    }
    
    public short[] getSecretData() {
        final short[] f = this.f.f;
        short[] array;
        if (f == null) {
            array = null;
        }
        else {
            array = f.clone();
        }
        return array;
    }
    
    @Override
    public int hashCode() {
        final short[] f = this.f.f;
        short[] array;
        if (f == null) {
            array = null;
        }
        else {
            array = f.clone();
        }
        return nm2.a.h(array);
    }
}
