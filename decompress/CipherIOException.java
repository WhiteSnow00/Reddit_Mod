// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.crypto.io;

import java.io.IOException;

public class CipherIOException extends IOException
{
    private static final long serialVersionUID = 1L;
    private final Throwable cause;
    
    public CipherIOException(final String s, final Throwable cause) {
        super(s);
        this.cause = cause;
    }
    
    @Override
    public Throwable getCause() {
        return this.cause;
    }
}
