// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.pqc.jcajce.provider.mceliece;

import mm2.d;
import java.io.IOException;
import kk2.u;
import kk2.l;
import tk2.b;
import vl2.c;
import xl2.e;
import java.security.PrivateKey;
import zk2.a;

public class BCMcEliecePrivateKey implements a, PrivateKey
{
    private static final long serialVersionUID = 1L;
    private e params;
    
    public BCMcEliecePrivateKey(final e params) {
        this.params = params;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof BCMcEliecePrivateKey;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final BCMcEliecePrivateKey bcMcEliecePrivateKey = (BCMcEliecePrivateKey)o;
        boolean b3 = b2;
        if (this.getN() == bcMcEliecePrivateKey.getN()) {
            b3 = b2;
            if (this.getK() == bcMcEliecePrivateKey.getK()) {
                b3 = b2;
                if (this.getField().equals(bcMcEliecePrivateKey.getField())) {
                    b3 = b2;
                    if (this.getGoppaPoly().equals(bcMcEliecePrivateKey.getGoppaPoly())) {
                        b3 = b2;
                        if (this.getSInv().equals(bcMcEliecePrivateKey.getSInv())) {
                            b3 = b2;
                            if (this.getP1().equals(bcMcEliecePrivateKey.getP1())) {
                                b3 = b2;
                                if (this.getP2().equals(bcMcEliecePrivateKey.getP2())) {
                                    b3 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return b3;
    }
    
    @Override
    public String getAlgorithm() {
        return "McEliece";
    }
    
    @Override
    public byte[] getEncoded() {
        final e params = this.params;
        final c c = new c(params.g, params.h, params.i, params.j, params.l, params.m, params.k);
        byte[] encoded = null;
        try {
            encoded = ((l)new b(new xk2.a(vl2.e.b), (l)c, (u)null, (byte[])null)).getEncoded();
            return encoded;
        }
        catch (final IOException ex) {
            return encoded;
        }
    }
    
    public mm2.b getField() {
        return this.params.i;
    }
    
    @Override
    public String getFormat() {
        return "PKCS#8";
    }
    
    public mm2.e getGoppaPoly() {
        return this.params.j;
    }
    
    public mm2.a getH() {
        return this.params.n;
    }
    
    public int getK() {
        return this.params.h;
    }
    
    public fl2.a getKeyParams() {
        return (fl2.a)this.params;
    }
    
    public int getN() {
        return this.params.g;
    }
    
    public d getP1() {
        return this.params.l;
    }
    
    public d getP2() {
        return this.params.m;
    }
    
    public mm2.e[] getQInv() {
        return this.params.o;
    }
    
    public mm2.a getSInv() {
        return this.params.k;
    }
    
    @Override
    public int hashCode() {
        final e params = this.params;
        return this.params.k.hashCode() + (this.params.m.hashCode() + (this.params.l.hashCode() + (params.j.hashCode() + ((params.h * 37 + params.g) * 37 + params.i.b) * 37) * 37) * 37) * 37;
    }
}
