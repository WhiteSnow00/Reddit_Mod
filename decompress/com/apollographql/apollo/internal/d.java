// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.internal;

import com.apollographql.apollo.ApolloSubscriptionCall$a;
import y7.i$a;
import com.apollographql.apollo.exception.ApolloCanceledException;
import s7.h;
import com.apollographql.apollo.coroutines.CoroutinesExtensionsKt$toFlow$3;
import java.util.concurrent.atomic.AtomicReference;
import zd.b;
import java.util.concurrent.Executor;
import com.apollographql.apollo.ApolloSubscriptionCall$CachePolicy;
import m7.a;
import y7.i;
import h7.p;
import com.apollographql.apollo.ApolloSubscriptionCall;

public final class d<T> implements ApolloSubscriptionCall<T>
{
    public final p<?, T, ?> a;
    public final i b;
    public final a c;
    public final ApolloSubscriptionCall$CachePolicy d;
    public final Executor e;
    public final zd.b f;
    public final AtomicReference<CallState> g;
    public b<T> h;
    
    public d(final p<?, T, ?> a, final i b, final a c, final ApolloSubscriptionCall$CachePolicy d, final Executor e, final zd.b f) {
        this.g = new AtomicReference<CallState>(CallState.IDLE);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void a() {
        synchronized (this) {
            final int n = d$a.a[((Enum)this.g.get()).ordinal()];
            if (n != 1) {
                if (n != 2 && n != 3) {
                    if (n == 4) {
                        try {
                            this.b.h((p)this.a);
                            return;
                        }
                        finally {
                            this.g.set(CallState.CANCELED);
                            final b<T> h = this.h;
                            h.a = null;
                            h.b = null;
                        }
                    }
                    throw new IllegalStateException("Unknown state");
                }
            }
            else {
                this.g.set(CallState.CANCELED);
            }
        }
    }
    
    public final void b(final CoroutinesExtensionsKt$toFlow$3.CoroutinesExtensionsKt$toFlow$3$a apolloSubscriptionCall$a) throws ApolloCanceledException {
        synchronized (this) {
            final int n = d$a.a[((Enum)this.g.get()).ordinal()];
            if (n == 1) {
                this.g.set(CallState.ACTIVE);
                if (this.d == ApolloSubscriptionCall$CachePolicy.CACHE_AND_NETWORK) {
                    this.e.execute(new h(apolloSubscriptionCall$a, this));
                }
                final b<T> h = new b<T>(apolloSubscriptionCall$a, this);
                this.h = h;
                this.b.a((p)this.a, (b)h);
                return;
            }
            if (n == 2) {
                throw new ApolloCanceledException();
            }
            if (n != 3 && n != 4) {
                throw new IllegalStateException("Unknown state");
            }
            throw new IllegalStateException("Already Executed");
        }
    }
    
    public final Object clone() throws CloneNotSupportedException {
        return new d((h7.p<?, Object, ?>)this.a, this.b, this.c, this.d, this.e, this.f);
    }
    
    public static final class b<T> implements i$a<T>
    {
        public ApolloSubscriptionCall$a<T> a;
        public d<T> b;
        
        public b(final CoroutinesExtensionsKt$toFlow$3.CoroutinesExtensionsKt$toFlow$3$a a, final d b) {
            this.a = (ApolloSubscriptionCall$a<T>)a;
            this.b = b;
        }
        
        public final void a() {
            final d<T> b = this.b;
            if (b != null) {
                synchronized (b) {
                    final int n = d$a.a[((Enum)b.g.get()).ordinal()];
                    if (n != 1) {
                        if (n != 2) {
                            if (n == 3) {
                                throw new IllegalStateException(new CallState$a((CallState)b.g.get()).a(new CallState[] { CallState.ACTIVE, CallState.CANCELED }));
                            }
                            if (n != 4) {
                                throw new IllegalStateException("Unknown state");
                            }
                            b.g.set(CallState.TERMINATED);
                            final b<T> h = b.h;
                            h.a = null;
                            h.b = null;
                        }
                        return;
                    }
                    throw new IllegalStateException(new CallState$a((CallState)b.g.get()).a(new CallState[] { CallState.ACTIVE, CallState.CANCELED }));
                }
            }
        }
    }
}
