// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.jcajce.provider.util;

import javax.crypto.BadPaddingException;

public class BadBlockException extends BadPaddingException
{
    private final Throwable cause;
    
    public BadBlockException(final String s, final Throwable cause) {
        super(s);
        this.cause = cause;
    }
    
    @Override
    public Throwable getCause() {
        return this.cause;
    }
}
