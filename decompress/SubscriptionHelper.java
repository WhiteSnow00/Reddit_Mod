// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.subscriptions;

import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.exceptions.ProtocolViolationException;
import al0.g7;
import vl.a;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qt2.d;

public enum SubscriptionHelper implements d
{
    CANCELLED;
    
    public static boolean cancel(final AtomicReference<d> atomicReference) {
        final d d = atomicReference.get();
        final SubscriptionHelper cancelled = SubscriptionHelper.CANCELLED;
        if (d != cancelled) {
            final d d2 = atomicReference.getAndSet((d)cancelled);
            if (d2 != cancelled) {
                if (d2 != null) {
                    d2.cancel();
                }
                return true;
            }
        }
        return false;
    }
    
    public static void deferredRequest(final AtomicReference<d> atomicReference, final AtomicLong atomicLong, long andSet) {
        final d d = atomicReference.get();
        if (d != null) {
            d.request(andSet);
        }
        else if (validate(andSet)) {
            a.l(atomicLong, andSet);
            final d d2 = atomicReference.get();
            if (d2 != null) {
                andSet = atomicLong.getAndSet(0L);
                if (andSet != 0L) {
                    d2.request(andSet);
                }
            }
        }
    }
    
    public static boolean deferredSetOnce(final AtomicReference<d> atomicReference, final AtomicLong atomicLong, final d d) {
        if (setOnce(atomicReference, d)) {
            final long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0L) {
                d.request(andSet);
            }
            return true;
        }
        return false;
    }
    
    public static boolean replace(final AtomicReference<d> atomicReference, final d d) {
        boolean b;
    Label_0055:
        do {
            final d d2 = atomicReference.get();
            final SubscriptionHelper cancelled = SubscriptionHelper.CANCELLED;
            b = false;
            if (d2 == cancelled) {
                if (d != null) {
                    d.cancel();
                }
                return false;
            }
            while (!atomicReference.compareAndSet(d2, d)) {
                if (atomicReference.get() != d2) {
                    continue Label_0055;
                }
            }
            b = true;
        } while (!b);
        return true;
    }
    
    public static void reportMoreProduced(final long n) {
        RxJavaPlugins.onError(new ProtocolViolationException(g7.g("More produced than requested: ", n)));
    }
    
    public static void reportSubscriptionSet() {
        RxJavaPlugins.onError(new ProtocolViolationException("Subscription already set!"));
    }
    
    public static boolean set(final AtomicReference<d> atomicReference, final d d) {
        boolean b;
        d d2 = null;
    Label_0055:
        do {
            d2 = atomicReference.get();
            final SubscriptionHelper cancelled = SubscriptionHelper.CANCELLED;
            b = false;
            if (d2 == cancelled) {
                if (d != null) {
                    d.cancel();
                }
                return false;
            }
            while (!atomicReference.compareAndSet(d2, d)) {
                if (atomicReference.get() != d2) {
                    continue Label_0055;
                }
            }
            b = true;
        } while (!b);
        if (d2 != null) {
            d2.cancel();
        }
        return true;
    }
    
    public static boolean setOnce(final AtomicReference<d> atomicReference, final d d) {
        if (d != null) {
            while (true) {
                while (!atomicReference.compareAndSet(null, d)) {
                    if (atomicReference.get() != null) {
                        final boolean b = false;
                        if (!b) {
                            d.cancel();
                            if (atomicReference.get() != SubscriptionHelper.CANCELLED) {
                                reportSubscriptionSet();
                            }
                            return false;
                        }
                        return true;
                    }
                }
                final boolean b = true;
                continue;
            }
        }
        throw new NullPointerException("s is null");
    }
    
    public static boolean setOnce(final AtomicReference<d> atomicReference, final d d, final long n) {
        if (setOnce(atomicReference, d)) {
            d.request(n);
            return true;
        }
        return false;
    }
    
    public static boolean validate(final long n) {
        if (n <= 0L) {
            RxJavaPlugins.onError(new IllegalArgumentException(g7.g("n > 0 required but it was ", n)));
            return false;
        }
        return true;
    }
    
    public static boolean validate(final d d, final d d2) {
        if (d2 == null) {
            RxJavaPlugins.onError(new NullPointerException("next is null"));
            return false;
        }
        if (d != null) {
            d2.cancel();
            reportSubscriptionSet();
            return false;
        }
        return true;
    }
    
    public void cancel() {
    }
    
    public void request(final long n) {
    }
}
