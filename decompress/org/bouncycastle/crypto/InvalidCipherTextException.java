// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.crypto;

public class InvalidCipherTextException extends CryptoException
{
    public InvalidCipherTextException() {
    }
    
    public InvalidCipherTextException(final String s) {
        super(s);
    }
    
    public InvalidCipherTextException(final String s, final Throwable t) {
        super(s, t);
    }
}
