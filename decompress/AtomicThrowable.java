// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.util;

import java.util.concurrent.atomic.AtomicReference;

public final class AtomicThrowable extends AtomicReference<Throwable>
{
    private static final long serialVersionUID = 3949248817947090603L;
    
    public boolean addThrowable(final Throwable t) {
        return ExceptionHelper.a(this, t);
    }
    
    public boolean isTerminated() {
        return this.get() == ExceptionHelper.a;
    }
    
    public Throwable terminate() {
        return ExceptionHelper.b(this);
    }
}
