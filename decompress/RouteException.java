// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android.shadow.okhttp3.internal.connection;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import mc2.a;
import java.io.IOException;

public final class RouteException extends RuntimeException
{
    private IOException firstException;
    private IOException lastException;
    
    public RouteException(final IOException ex) {
        super(ex);
        this.firstException = ex;
        this.lastException = ex;
    }
    
    public void addConnectException(final IOException lastException) {
        final IOException firstException = this.firstException;
        final Method p = a.p;
        while (true) {
            if (p == null) {
                break Label_0027;
            }
            try {
                p.invoke(firstException, lastException);
                this.lastException = lastException;
            }
            catch (final InvocationTargetException | IllegalAccessException ex) {
                continue;
            }
            break;
        }
    }
    
    public IOException getFirstConnectException() {
        return this.firstException;
    }
    
    public IOException getLastConnectException() {
        return this.lastException;
    }
}
