// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.jce.provider;

public class AnnotatedException extends Exception
{
    private Throwable _underlyingException;
    
    public AnnotatedException(final String s) {
        this(s, null);
    }
    
    public AnnotatedException(final String s, final Throwable underlyingException) {
        super(s);
        this._underlyingException = underlyingException;
    }
    
    @Override
    public Throwable getCause() {
        return this._underlyingException;
    }
    
    public Throwable getUnderlyingException() {
        return this._underlyingException;
    }
}
