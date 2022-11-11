// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android.shadow.com.google.gson.stream;

import java.io.IOException;

public final class MalformedJsonException extends IOException
{
    private static final long serialVersionUID = 1L;
    
    public MalformedJsonException(final String s) {
        super(s);
    }
    
    public MalformedJsonException(final String s, final Throwable t) {
        super(s);
        this.initCause(t);
    }
    
    public MalformedJsonException(final Throwable t) {
        this.initCause(t);
    }
}
