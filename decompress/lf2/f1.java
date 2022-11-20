// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import af2.g;
import nt2.d;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import hf2.a;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;
import nt2.b;
import ff2.o;
import nt2.c;

public final class f1
{
    public static boolean a(final c c, final o o, final b b) {
        if (b instanceof Callable) {
            try {
                final Object call = ((Callable)b).call();
                if (call == null) {
                    EmptySubscription.complete(c);
                    return true;
                }
                try {
                    final Object apply = o.apply(call);
                    hf2.a.b(apply, "The mapper returned a null Publisher");
                    final b b2 = (b)apply;
                    if (b2 instanceof Callable) {
                        try {
                            final Object call2 = ((Callable<Object>)b2).call();
                            if (call2 == null) {
                                EmptySubscription.complete(c);
                                return true;
                            }
                            c.onSubscribe((d)new ScalarSubscription(c, call2));
                            return true;
                        }
                        finally {
                            return;
                        }
                    }
                    b2.subscribe(c);
                    return true;
                }
                finally {
                    return;
                }
            }
            finally {
                final Throwable t;
                xd.a.t1(t);
                EmptySubscription.error(t, c);
                return true;
            }
        }
        return false;
    }
    
    public static final class a<T, R> extends g<R>
    {
        public final T f;
        public final o<? super T, ? extends b<? extends R>> g;
        
        public a(final o g, final Object f) {
            this.f = (T)f;
            this.g = (o<? super T, ? extends b<? extends R>>)g;
        }
        
        @Override
        public final void subscribeActual(final c<? super R> c) {
            try {
                final Object apply = this.g.apply((Object)this.f);
                hf2.a.b(apply, "The mapper returned a null Publisher");
                final b b = (b)apply;
                if (b instanceof Callable) {
                    try {
                        final Object call = ((Callable<Object>)b).call();
                        if (call == null) {
                            EmptySubscription.complete((c)c);
                            return;
                        }
                        c.onSubscribe((d)new ScalarSubscription((c)c, call));
                        return;
                    }
                    finally {
                        final Throwable t;
                        xd.a.t1(t);
                        EmptySubscription.error(t, (c)c);
                        return;
                    }
                }
                b.subscribe((c)c);
            }
            finally {
                final Throwable t2;
                EmptySubscription.error(t2, (c)c);
            }
        }
    }
}
