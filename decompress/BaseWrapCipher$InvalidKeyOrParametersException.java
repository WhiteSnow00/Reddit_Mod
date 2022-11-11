// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.InvalidKeyException;

public class BaseWrapCipher$InvalidKeyOrParametersException extends InvalidKeyException
{
    private final Throwable cause;
    
    public BaseWrapCipher$InvalidKeyOrParametersException(final String s, final Throwable cause) {
        super(s);
        this.cause = cause;
    }
    
    @Override
    public Throwable getCause() {
        return this.cause;
    }
}
