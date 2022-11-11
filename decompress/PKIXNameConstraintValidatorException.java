// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.jce.provider;

public class PKIXNameConstraintValidatorException extends Exception
{
    private Throwable cause;
    
    public PKIXNameConstraintValidatorException(final String s) {
        super(s);
    }
    
    public PKIXNameConstraintValidatorException(final String s, final Throwable cause) {
        super(s);
        this.cause = cause;
    }
    
    @Override
    public Throwable getCause() {
        return this.cause;
    }
}
