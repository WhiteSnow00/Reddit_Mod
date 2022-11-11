// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.i18n;

import java.util.Locale;
import ll2.a;

public class LocalizedException extends Exception
{
    private Throwable cause;
    public a message;
    
    public LocalizedException(final a a) {
        Locale.getDefault();
        throw null;
    }
    
    public LocalizedException(final a a, final Throwable t) {
        Locale.getDefault();
        throw null;
    }
    
    @Override
    public Throwable getCause() {
        return this.cause;
    }
    
    public a getErrorMessage() {
        return null;
    }
}
