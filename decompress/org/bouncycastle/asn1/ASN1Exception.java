// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.asn1;

import java.io.IOException;

public class ASN1Exception extends IOException
{
    private Throwable cause;
    
    public ASN1Exception(final String s) {
        super(s);
    }
    
    public ASN1Exception(final String s, final Throwable cause) {
        super(s);
        this.cause = cause;
    }
    
    @Override
    public Throwable getCause() {
        return this.cause;
    }
}
