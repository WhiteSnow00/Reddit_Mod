// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.crypto.io;

public class InvalidCipherTextIOException extends CipherIOException
{
    private static final long serialVersionUID = 1L;
    
    public InvalidCipherTextIOException(final String s, final Throwable t) {
        super(s, t);
    }
}
