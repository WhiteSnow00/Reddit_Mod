// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.util;

import io.reactivex.plugins.RxJavaPlugins;
import df2.a;
import nt2.d;
import af2.c;
import af2.e0;
import af2.p;
import af2.a0;
import af2.l;

public enum EmptyComponent implements l<Object>, a0<Object>, p<Object>, e0<Object>, c, d, a
{
    private static final EmptyComponent[] $VALUES;
    
    INSTANCE;
    
    public static <T> a0<T> asObserver() {
        return (a0<T>)EmptyComponent.INSTANCE;
    }
    
    public static <T> nt2.c<T> asSubscriber() {
        return (nt2.c<T>)EmptyComponent.INSTANCE;
    }
    
    public void cancel() {
    }
    
    public void dispose() {
    }
    
    public boolean isDisposed() {
        return true;
    }
    
    public void onComplete() {
    }
    
    public void onError(final Throwable t) {
        RxJavaPlugins.onError(t);
    }
    
    public void onNext(final Object o) {
    }
    
    public void onSubscribe(final a a) {
        a.dispose();
    }
    
    @Override
    public void onSubscribe(final d d) {
        d.cancel();
    }
    
    public void onSuccess(final Object o) {
    }
    
    public void request(final long n) {
    }
}
