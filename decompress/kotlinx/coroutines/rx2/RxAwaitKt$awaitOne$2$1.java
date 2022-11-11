// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.rx2;

import lg2.c;
import hg2.j;
import sg2.e;
import yd.b;
import java.util.NoSuchElementException;
import kotlin.Result;
import ej2.l;
import ej2.k;
import if2.a;
import ff2.a0;

public final class RxAwaitKt$awaitOne$2$1 implements a0<Object>
{
    public a f;
    public Object g;
    public boolean h;
    public final /* synthetic */ k<Object> i;
    public final /* synthetic */ Mode j;
    public final /* synthetic */ Object k;
    
    public RxAwaitKt$awaitOne$2$1(final l i, final Mode j, final Object k) {
        this.i = (k<Object>)i;
        this.j = j;
        this.k = k;
    }
    
    public final void onComplete() {
        if (this.h) {
            if (this.i.isActive()) {
                ((c)this.i).resumeWith(Result.constructor-impl(this.g));
            }
            return;
        }
        if (this.j == Mode.FIRST_OR_DEFAULT) {
            ((c)this.i).resumeWith(Result.constructor-impl(this.k));
        }
        else if (this.i.isActive()) {
            final k<Object> i = this.i;
            final StringBuilder r = a.r("No value received via onNext for ");
            r.append(this.j);
            ((c)i).resumeWith(Result.constructor-impl((Object)b.o((Throwable)new NoSuchElementException(r.toString()))));
        }
    }
    
    public final void onError(final Throwable t) {
        ((c)this.i).resumeWith(Result.constructor-impl((Object)b.o(t)));
    }
    
    public final void onNext(final Object g) {
        final int n = RxAwaitKt$awaitOne$2$1.RxAwaitKt$awaitOne$2$1$a.a[((Enum)this.j).ordinal()];
        if (n != 1 && n != 2) {
            if (n == 3 || n == 4) {
                if (this.j == Mode.SINGLE && this.h) {
                    if (this.i.isActive()) {
                        final k<Object> i = this.i;
                        final StringBuilder r = a.r("More than one onNext value for ");
                        r.append(this.j);
                        ((c)i).resumeWith(Result.constructor-impl((Object)b.o((Throwable)new IllegalArgumentException(r.toString()))));
                    }
                    final a f = this.f;
                    if (f == null) {
                        e.n("subscription");
                        throw null;
                    }
                    f.dispose();
                }
                else {
                    this.g = g;
                    this.h = true;
                }
            }
        }
        else if (!this.h) {
            this.h = true;
            ((c)this.i).resumeWith(Result.constructor-impl(g));
            final a f2 = this.f;
            if (f2 == null) {
                e.n("subscription");
                throw null;
            }
            f2.dispose();
        }
    }
    
    public final void onSubscribe(final a f) {
        this.f = f;
        this.i.F((rg2.l<? super Throwable, j>)new RxAwaitKt$awaitOne$2$1$onSubscribe$1(f));
    }
}
