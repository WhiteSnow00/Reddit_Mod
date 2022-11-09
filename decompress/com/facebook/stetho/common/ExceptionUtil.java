// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.common;

public class ExceptionUtil
{
    public static RuntimeException propagate(final Throwable t) {
        propagateIfInstanceOf(t, Error.class);
        propagateIfInstanceOf(t, RuntimeException.class);
        throw new RuntimeException(t);
    }
    
    public static <T extends Throwable> void propagateIfInstanceOf(final Throwable t, final Class<T> clazz) throws T, Throwable {
        if (!clazz.isInstance(t)) {
            return;
        }
        throw t;
    }
    
    public static <T extends Throwable> void sneakyThrow(final Throwable t) throws T, Throwable {
        throw t;
    }
}
