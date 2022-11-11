// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.util;

import java.io.Serializable;
import qt2.d;
import if2.a;
import qt2.c;
import ff2.a0;

public enum NotificationLite
{
    COMPLETE;
    
    public static <T> boolean accept(final Object o, final a0<? super T> a0) {
        if (o == NotificationLite.COMPLETE) {
            a0.onComplete();
            return true;
        }
        if (o instanceof ErrorNotification) {
            a0.onError(((ErrorNotification)o).e);
            return true;
        }
        a0.onNext(o);
        return false;
    }
    
    public static <T> boolean accept(final Object o, final c<? super T> c) {
        if (o == NotificationLite.COMPLETE) {
            c.onComplete();
            return true;
        }
        if (o instanceof ErrorNotification) {
            c.onError(((ErrorNotification)o).e);
            return true;
        }
        c.onNext(o);
        return false;
    }
    
    public static <T> boolean acceptFull(final Object o, final a0<? super T> a0) {
        if (o == NotificationLite.COMPLETE) {
            a0.onComplete();
            return true;
        }
        if (o instanceof ErrorNotification) {
            a0.onError(((ErrorNotification)o).e);
            return true;
        }
        if (o instanceof DisposableNotification) {
            a0.onSubscribe(((DisposableNotification)o).upstream);
            return false;
        }
        a0.onNext(o);
        return false;
    }
    
    public static <T> boolean acceptFull(final Object o, final c<? super T> c) {
        if (o == NotificationLite.COMPLETE) {
            c.onComplete();
            return true;
        }
        if (o instanceof ErrorNotification) {
            c.onError(((ErrorNotification)o).e);
            return true;
        }
        if (o instanceof SubscriptionNotification) {
            c.onSubscribe(((SubscriptionNotification)o).upstream);
            return false;
        }
        c.onNext(o);
        return false;
    }
    
    public static Object complete() {
        return NotificationLite.COMPLETE;
    }
    
    public static Object disposable(final a a) {
        return new DisposableNotification(a);
    }
    
    public static Object error(final Throwable t) {
        return new ErrorNotification(t);
    }
    
    public static a getDisposable(final Object o) {
        return ((DisposableNotification)o).upstream;
    }
    
    public static Throwable getError(final Object o) {
        return ((ErrorNotification)o).e;
    }
    
    public static d getSubscription(final Object o) {
        return ((SubscriptionNotification)o).upstream;
    }
    
    public static <T> T getValue(final Object o) {
        return (T)o;
    }
    
    public static boolean isComplete(final Object o) {
        return o == NotificationLite.COMPLETE;
    }
    
    public static boolean isDisposable(final Object o) {
        return o instanceof DisposableNotification;
    }
    
    public static boolean isError(final Object o) {
        return o instanceof ErrorNotification;
    }
    
    public static boolean isSubscription(final Object o) {
        return o instanceof SubscriptionNotification;
    }
    
    public static <T> Object next(final T t) {
        return t;
    }
    
    public static Object subscription(final d d) {
        return new SubscriptionNotification(d);
    }
    
    @Override
    public String toString() {
        return "NotificationLite.Complete";
    }
    
    public static final class DisposableNotification implements Serializable
    {
        private static final long serialVersionUID = -7482590109178395495L;
        public final a upstream;
        
        public DisposableNotification(final a upstream) {
            this.upstream = upstream;
        }
        
        @Override
        public String toString() {
            final StringBuilder r = a.r("NotificationLite.Disposable[");
            r.append(this.upstream);
            r.append("]");
            return r.toString();
        }
    }
    
    public static final class ErrorNotification implements Serializable
    {
        private static final long serialVersionUID = -8759979445933046293L;
        public final Throwable e;
        
        public ErrorNotification(final Throwable e) {
            this.e = e;
        }
        
        @Override
        public boolean equals(final Object o) {
            return o instanceof ErrorNotification && mf2.a.a((Object)this.e, (Object)((ErrorNotification)o).e);
        }
        
        @Override
        public int hashCode() {
            return this.e.hashCode();
        }
        
        @Override
        public String toString() {
            final StringBuilder r = a.r("NotificationLite.Error[");
            r.append(this.e);
            r.append("]");
            return r.toString();
        }
    }
    
    public static final class SubscriptionNotification implements Serializable
    {
        private static final long serialVersionUID = -1322257508628817540L;
        public final d upstream;
        
        public SubscriptionNotification(final d upstream) {
            this.upstream = upstream;
        }
        
        @Override
        public String toString() {
            final StringBuilder r = a.r("NotificationLite.Subscription[");
            r.append(this.upstream);
            r.append("]");
            return r.toString();
        }
    }
}
