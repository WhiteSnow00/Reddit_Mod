// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.pqc.crypto.xmss;

import hm2.k;
import java.io.Serializable;

public final class XMSSNode implements Serializable
{
    private static final long serialVersionUID = 1L;
    private final int height;
    private final byte[] value;
    
    public XMSSNode(final int height, final byte[] value) {
        this.height = height;
        this.value = value;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public byte[] getValue() {
        return k.b(this.value);
    }
}
