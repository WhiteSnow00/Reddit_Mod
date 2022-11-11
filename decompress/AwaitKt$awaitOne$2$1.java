// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.reactive;

import hg2.j;
import kotlin.coroutines.CoroutineContext;
import lg.e0;
import yd.b;
import java.util.NoSuchElementException;
import kotlin.Result;
import ej2.l;
import ej2.k;
import qt2.d;
import qt2.c;

public final class AwaitKt$awaitOne$2$1 implements c<Object>
{
    public d f;
    public Object g;
    public boolean h;
    public boolean i;
    public final /* synthetic */ k<Object> j;
    public final /* synthetic */ Mode k;
    public final /* synthetic */ Object l;
    
    public AwaitKt$awaitOne$2$1(final l j, final Mode k, final Object l) {
        this.j = (k<Object>)j;
        this.k = k;
        this.l = l;
    }
    
    public final void onComplete() {
        boolean b;
        if (this.i) {
            a.a(((lg2.c)this.j).getContext(), "onComplete");
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
                ((lg2.c)this.j).resumeWith(Result.constructor-impl(this.g));
            }
            return;
        }
        final Mode i = this.k;
        if (i != Mode.FIRST_OR_DEFAULT && i != Mode.SINGLE_OR_DEFAULT) {
            if (this.j.isActive()) {
                final k<Object> j = this.j;
                final StringBuilder r = a.r("No value received via onNext for ");
                r.append(this.k);
                ((lg2.c)j).resumeWith(Result.constructor-impl((Object)yd.b.o((Throwable)new NoSuchElementException(r.toString()))));
            }
        }
        else {
            ((lg2.c)this.j).resumeWith(Result.constructor-impl(this.l));
        }
    }
    
    public final void onError(final Throwable t) {
        boolean b;
        if (this.i) {
            a.a(((lg2.c)this.j).getContext(), "onError");
            b = false;
        }
        else {
            b = true;
            this.i = true;
        }
        if (b) {
            ((lg2.c)this.j).resumeWith(Result.constructor-impl((Object)yd.b.o(t)));
        }
    }
    
    public final void onNext(final Object g) {
        final d f = this.f;
        final k<Object> j = this.j;
        if (f == null) {
            e0.V(((lg2.c)j).getContext(), (Throwable)new IllegalStateException("'onNext' was called before 'onSubscribe'"));
            return;
        }
        if (this.i) {
            a.a(((lg2.c)j).getContext(), "onNext");
            return;
        }
        final int n = AwaitKt$awaitOne$2$1.AwaitKt$awaitOne$2$1$a.a[((Enum)this.k).ordinal()];
        if (n != 1 && n != 2) {
            if (n != 3 && n != 4 && n != 5) {
                return;
            }
            final Mode k = this.k;
            if ((k == Mode.SINGLE || k == Mode.SINGLE_OR_DEFAULT) && this.h) {
                final AwaitKt$awaitOne$2$1$onNext$2 awaitKt$awaitOne$2$1$onNext$2 = new AwaitKt$awaitOne$2$1$onNext$2(f);
                synchronized (this) {
                    ((rg2.a)awaitKt$awaitOne$2$1$onNext$2).invoke();
                    monitorexit(this);
                    if (this.j.isActive()) {
                        final k<Object> i = this.j;
                        final StringBuilder r = a.r("More than one onNext value for ");
                        r.append(this.k);
                        ((lg2.c)i).resumeWith(Result.constructor-impl((Object)b.o((Throwable)new IllegalArgumentException(r.toString()))));
                    }
                    return;
                }
            }
            this.g = g;
            this.h = true;
            return;
        }
        else if (this.h) {
            final CoroutineContext context = ((lg2.c)this.j).getContext();
            final Mode l = this.k;
            final StringBuilder sb = new StringBuilder();
            sb.append("Only a single value was requested in '");
            sb.append(l);
            sb.append("', but the publisher provided more");
            e0.V(context, (Throwable)new IllegalStateException(sb.toString()));
            return;
        }
        this.h = true;
        final AwaitKt$awaitOne$2$1$onNext$1 awaitKt$awaitOne$2$1$onNext$3 = new AwaitKt$awaitOne$2$1$onNext$1(f);
        synchronized (this) {
            ((rg2.a)awaitKt$awaitOne$2$1$onNext$3).invoke();
            monitorexit(this);
            ((lg2.c)this.j).resumeWith(Result.constructor-impl(g));
        }
    }
    
    public final void onSubscribe(final d f) {
        if (this.f != null) {
            final AwaitKt$awaitOne$2$1$onSubscribe$1 awaitKt$awaitOne$2$1$onSubscribe$1 = new AwaitKt$awaitOne$2$1$onSubscribe$1(f);
            synchronized (this) {
                ((rg2.a)awaitKt$awaitOne$2$1$onSubscribe$1).invoke();
                return;
            }
        }
        this.f = f;
        this.j.F((rg2.l<? super Throwable, j>)new AwaitKt$awaitOne$2$1$onSubscribe$2(this, f));
        final AwaitKt$awaitOne$2$1$onSubscribe$3 awaitKt$awaitOne$2$1$onSubscribe$2 = new AwaitKt$awaitOne$2$1$onSubscribe$3(f, this.k);
        synchronized (this) {
            ((rg2.a)awaitKt$awaitOne$2$1$onSubscribe$2).invoke();
        }
    }
}
