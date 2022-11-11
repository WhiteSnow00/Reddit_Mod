// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.subscriptions;

import qt2.d;
import qt2.c;
import nf2.g;

public enum EmptySubscription implements g<Object>
{
    INSTANCE;
    
    public static void complete(final c<?> c) {
        c.onSubscribe((d)EmptySubscription.INSTANCE);
        c.onComplete();
    }
    
    public static void error(final Throwable t, final c<?> c) {
        c.onSubscribe((d)EmptySubscription.INSTANCE);
        c.onError(t);
    }
    
    public void cancel() {
    }
    
    public void clear() {
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
    
    public Object poll() {
        return null;
    }
    
    public void request(final long n) {
        SubscriptionHelper.validate(n);
    }
    
    public int requestFusion(final int n) {
        return n & 0x2;
    }
    
    @Override
    public String toString() {
        return "EmptySubscription";
    }
}
