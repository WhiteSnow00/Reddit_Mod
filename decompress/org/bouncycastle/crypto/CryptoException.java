// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.crypto;

public class CryptoException extends Exception
{
    private Throwable cause;
    
    public CryptoException() {
    }
    
    public CryptoException(final String s) {
        super(s);
    }
    
    public CryptoException(final String s, final Throwable cause) {
        super(s);
        this.cause = cause;
    }
    
    @Override
    public Throwable getCause() {
        return this.cause;
    }
}
