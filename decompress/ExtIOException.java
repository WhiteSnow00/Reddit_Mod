// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.jce.exception;

import java.io.IOException;

public class ExtIOException extends IOException
{
    private Throwable cause;
    
    public ExtIOException(final String s, final Throwable cause) {
        super(s);
        this.cause = cause;
    }
    
    @Override
    public Throwable getCause() {
        return this.cause;
    }
}
