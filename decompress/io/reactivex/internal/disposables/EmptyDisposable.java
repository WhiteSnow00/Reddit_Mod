// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.disposables;

import af2.e0;
import af2.p;
import af2.c;
import df2.a;
import af2.a0;
import if2.e;

public enum EmptyDisposable implements e<Object>
{
    private static final EmptyDisposable[] $VALUES;
    
    INSTANCE, 
    NEVER;
    
    public static void complete(final a0<?> a0) {
        a0.onSubscribe((a)EmptyDisposable.INSTANCE);
        a0.onComplete();
    }
    
    public static void complete(final c c) {
        c.onSubscribe((a)EmptyDisposable.INSTANCE);
        c.onComplete();
    }
    
    public static void complete(final p<?> p) {
        p.onSubscribe((a)EmptyDisposable.INSTANCE);
        p.onComplete();
    }
    
    public static void error(final Throwable t, final a0<?> a0) {
        a0.onSubscribe((a)EmptyDisposable.INSTANCE);
        a0.onError(t);
    }
    
    public static void error(final Throwable t, final c c) {
        c.onSubscribe((a)EmptyDisposable.INSTANCE);
        c.onError(t);
    }
    
    public static void error(final Throwable t, final e0<?> e0) {
        e0.onSubscribe((a)EmptyDisposable.INSTANCE);
        e0.onError(t);
    }
    
    public static void error(final Throwable t, final p<?> p2) {
        p2.onSubscribe((a)EmptyDisposable.INSTANCE);
        p2.onError(t);
    }
    
    public void clear() {
    }
    
    public void dispose() {
    }
    
    public boolean isDisposed() {
        return this == EmptyDisposable.INSTANCE;
    }
    
    public boolean isEmpty() {
        return true;
    }
    
    public boolean offer(final Object o) {
        throw new UnsupportedOperationException("Should not be called!");
    }
    
    public boolean offer(final Object o, final Object o2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
    
    public Object poll() throws Exception {
        return null;
    }
    
    public int requestFusion(final int n) {
        return n & 0x2;
    }
}
