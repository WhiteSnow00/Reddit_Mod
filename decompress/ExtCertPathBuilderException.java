// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.jce.exception;

import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;

public class ExtCertPathBuilderException extends CertPathBuilderException
{
    private Throwable cause;
    
    public ExtCertPathBuilderException(final String s, final Throwable cause) {
        super(s);
        this.cause = cause;
    }
    
    public ExtCertPathBuilderException(final String s, final Throwable cause, final CertPath certPath, final int n) {
        super(s, cause);
        this.cause = cause;
    }
    
    @Override
    public Throwable getCause() {
        return this.cause;
    }
}
