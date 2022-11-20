// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.pqc.jcajce.provider.mceliece;

import java.io.IOException;
import kk2.l;
import vl2.e;
import ah0.b;
import xl2.c;
import java.security.PublicKey;
import zk2.a;

public class BCMcElieceCCA2PublicKey implements a, PublicKey
{
    private static final long serialVersionUID = 1L;
    private c params;
    
    public BCMcElieceCCA2PublicKey(final c params) {
        this.params = params;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b2;
        final boolean b = b2 = false;
        if (o != null) {
            if (!(o instanceof BCMcElieceCCA2PublicKey)) {
                b2 = b;
            }
            else {
                final BCMcElieceCCA2PublicKey bcMcElieceCCA2PublicKey = (BCMcElieceCCA2PublicKey)o;
                b2 = b;
                if (this.params.g == bcMcElieceCCA2PublicKey.getN()) {
                    b2 = b;
                    if (this.params.h == bcMcElieceCCA2PublicKey.getT()) {
                        b2 = b;
                        if (this.params.i.equals(bcMcElieceCCA2PublicKey.getG())) {
                            b2 = true;
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    @Override
    public String getAlgorithm() {
        return "McEliece-CCA2";
    }
    
    @Override
    public byte[] getEncoded() {
        final c params = this.params;
        final vl2.b b = new vl2.b(params.g, params.h, params.i, ah0.b.k0(((xl2.a)params).f));
        final xk2.a a = new xk2.a(e.c);
        try {
            return ((l)new xk2.b(a, (l)b)).getEncoded();
        }
        catch (final IOException ex) {
            return null;
        }
    }
    
    @Override
    public String getFormat() {
        return "X.509";
    }
    
    public mm2.a getG() {
        return this.params.i;
    }
    
    public int getK() {
        return this.params.i.a;
    }
    
    public fl2.a getKeyParams() {
        return (fl2.a)this.params;
    }
    
    public int getN() {
        return this.params.g;
    }
    
    public int getT() {
        return this.params.h;
    }
    
    @Override
    public int hashCode() {
        final c params = this.params;
        return params.i.hashCode() + (params.h * 37 + params.g) * 37;
    }
    
    @Override
    public String toString() {
        final StringBuilder q = android.support.v4.media.a.q(a.q(android.support.v4.media.a.q(a.q(android.support.v4.media.a.q("McEliecePublicKey:\n", " length of the code         : "), this.params.g, "\n"), " error correction capability: "), this.params.h, "\n"), " generator matrix           : ");
        q.append(this.params.i.toString());
        return q.toString();
    }
}
