// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.pqc.jcajce.provider.lms;

import kk2.l;
import wl2.h;
import fl2.a;
import cm2.d;
import java.util.Arrays;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import cm2.c;
import xk2.b;
import wl2.f;
import org.bouncycastle.pqc.jcajce.interfaces.LMSKey;
import java.security.PublicKey;

public class BCLMSPublicKey implements PublicKey, LMSKey
{
    private static final long serialVersionUID = -5617456225328969766L;
    public transient f f;
    
    public BCLMSPublicKey(final f f) {
        this.f = f;
    }
    
    public BCLMSPublicKey(final b b) throws IOException {
        this.f = (f)c.a(b);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f = (f)c.a(b.i((Object)objectInputStream.readObject()));
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
        if (!(o instanceof BCLMSPublicKey)) {
            return false;
        }
        final BCLMSPublicKey bclmsPublicKey = (BCLMSPublicKey)o;
        try {
            return Arrays.equals(this.f.getEncoded(), bclmsPublicKey.f.getEncoded());
        }
        catch (final IOException ex) {
            return false;
        }
    }
    
    public final String getAlgorithm() {
        return "LMS";
    }
    
    public byte[] getEncoded() {
        try {
            return ((l)d.a((a)this.f)).getEncoded();
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
    
    public int getLevels() {
        final f f = this.f;
        if (f instanceof h) {
            return 1;
        }
        return ((wl2.c)f).f;
    }
    
    @Override
    public int hashCode() {
        try {
            return nm2.a.e(((nm2.c)this.f).getEncoded());
        }
        catch (final IOException ex) {
            return -1;
        }
    }
}
