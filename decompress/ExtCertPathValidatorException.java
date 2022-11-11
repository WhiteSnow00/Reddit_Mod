// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.jce.exception;

import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;

public class ExtCertPathValidatorException extends CertPathValidatorException
{
    private Throwable cause;
    
    public ExtCertPathValidatorException(final String s, final Throwable cause) {
        super(s);
        this.cause = cause;
    }
    
    public ExtCertPathValidatorException(final String s, final Throwable cause, final CertPath certPath, final int n) {
        super(s, cause, certPath, n);
        this.cause = cause;
    }
    
    @Override
    public Throwable getCause() {
        return this.cause;
    }
}
