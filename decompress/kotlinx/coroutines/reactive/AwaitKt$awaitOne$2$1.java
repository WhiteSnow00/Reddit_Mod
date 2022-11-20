// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.reactive;

import kotlin.coroutines.CoroutineContext;
import p2.b;
import java.util.NoSuchElementException;
import kotlin.Result;
import zi2.m;
import zi2.l;
import nt2.d;
import nt2.c;

public final class AwaitKt$awaitOne$2$1 implements c<Object>
{
    public d f;
    public Object g;
    public boolean h;
    public boolean i;
    public final l<Object> j;
    public final Mode k;
    public final Object l;
    
    public AwaitKt$awaitOne$2$1(final m j, final Mode k, final Object l) {
        this.j = (l<Object>)j;
        this.k = k;
        this.l = l;
    }
    
    public final void onComplete() {
        boolean b;
        if (this.i) {
            kotlinx.coroutines.reactive.a.a(((gg2.c)this.j).getContext(), "onComplete");
            b = false;
        }
        else {
            b = true;
            this.i = true;
        }
        if (!b) {
            return;
        }
        if (this.h) {
            final Mode k = this.k;
            if (k != Mode.FIRST_OR_DEFAULT && k != Mode.FIRST && this.j.isActive()) {
                ((gg2.c)this.j).resumeWith(Result.constructor-impl(this.g));
            }
            return;
        }
        final Mode i = this.k;
        if (i != Mode.FIRST_OR_DEFAULT && i != Mode.SINGLE_OR_DEFAULT) {
            if (this.j.isActive()) {
                final l<Object> j = this.j;
                final StringBuilder t = a.t("No value received via onNext for ");
                t.append(this.k);
                ((gg2.c)j).resumeWith(Result.constructor-impl((Object)cg.d.B1((Throwable)new NoSuchElementException(t.toString()))));
            }
        }
        else {
            ((gg2.c)this.j).resumeWith(Result.constructor-impl(this.l));
        }
    }
    
    public final void onError(final Throwable t) {
        boolean b;
        if (this.i) {
            kotlinx.coroutines.reactive.a.a(((gg2.c)this.j).getContext(), "onError");
            b = false;
        }
        else {
            b = true;
            this.i = true;
        }
        if (b) {
            ((gg2.c)this.j).resumeWith(Result.constructor-impl((Object)cg.d.B1(t)));
        }
    }
    
    public final void onNext(final Object g) {
        final d f = this.f;
        final l<Object> j = this.j;
        if (f == null) {
            b.K(((gg2.c)j).getContext(), (Throwable)new IllegalStateException("'onNext' was called before 'onSubscribe'"));
            return;
        }
        if (this.i) {
            kotlinx.coroutines.reactive.a.a(((gg2.c)j).getContext(), "onNext");
            return;
        }
        final int n = a.a[this.k.ordinal()];
        if (n != 1 && n != 2) {
            if (n != 3 && n != 4 && n != 5) {
                return;
            }
            final Mode k = this.k;
            if ((k == Mode.SINGLE || k == Mode.SINGLE_OR_DEFAULT) && this.h) {
                final AwaitKt$awaitOne$2$1$onNext$2 awaitKt$awaitOne$2$1$onNext$2 = new AwaitKt$awaitOne$2$1$onNext$2(f);
                synchronized (this) {
                    ((mg2.a)awaitKt$awaitOne$2$1$onNext$2).invoke();
                    monitorexit(this);
                    if (this.j.isActive()) {
                        final l<Object> i = this.j;
                        final StringBuilder t = a.t("More than one onNext value for ");
                        t.append(this.k);
                        ((gg2.c)i).resumeWith(Result.constructor-impl((Object)cg.d.B1((Throwable)new IllegalArgumentException(t.toString()))));
                    }
                    return;
                }
            }
            this.g = g;
            this.h = true;
            return;
        }
        else if (this.h) {
            final CoroutineContext context = ((gg2.c)this.j).getContext();
            final Mode l = this.k;
            final StringBuilder sb = new StringBuilder();
            sb.append("Only a single value was requested in '");
            sb.append(l);
            sb.append("', but the publisher provided more");
            b.K(context, (Throwable)new IllegalStateException(sb.toString()));
            return;
        }
        this.h = true;
        final AwaitKt$awaitOne$2$1$onNext$1 awaitKt$awaitOne$2$1$onNext$3 = new AwaitKt$awaitOne$2$1$onNext$1(f);
        synchronized (this) {
            ((mg2.a)awaitKt$awaitOne$2$1$onNext$3).invoke();
            monitorexit(this);
            ((gg2.c)this.j).resumeWith(Result.constructor-impl(g));
        }
    }
    
    public final void onSubscribe(final d f) {
        if (this.f != null) {
            final AwaitKt$awaitOne$2$1$onSubscribe$1 awaitKt$awaitOne$2$1$onSubscribe$1 = new AwaitKt$awaitOne$2$1$onSubscribe$1(f);
            synchronized (this) {
                ((mg2.a)awaitKt$awaitOne$2$1$onSubscribe$1).invoke();
                return;
            }
        }
        this.f = f;
        this.j.Z((mg2.l)new AwaitKt$awaitOne$2$1$onSubscribe$2(this, f));
        final AwaitKt$awaitOne$2$1$onSubscribe$3 awaitKt$awaitOne$2$1$onSubscribe$2 = new AwaitKt$awaitOne$2$1$onSubscribe$3(f, this.k);
        synchronized (this) {
            ((mg2.a)awaitKt$awaitOne$2$1$onSubscribe$2).invoke();
        }
    }
    
    public final class a
    {
        public static final int[] a;
        
        static {
            final int[] a2 = new int[Mode.values().length];
            a2[Mode.FIRST.ordinal()] = 1;
            a2[Mode.FIRST_OR_DEFAULT.ordinal()] = 2;
            a2[Mode.LAST.ordinal()] = 3;
            a2[Mode.SINGLE.ordinal()] = 4;
            a2[Mode.SINGLE_OR_DEFAULT.ordinal()] = 5;
            a = a2;
        }
    }
}
