// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.rx2;

import gg2.c;
import ng2.e;
import cg.d;
import java.util.NoSuchElementException;
import kotlin.Result;
import zi2.m;
import zi2.l;
import df2.a;
import af2.a0;

public final class RxAwaitKt$awaitOne$2$1 implements a0<Object>
{
    public df2.a f;
    public Object g;
    public boolean h;
    public final l<Object> i;
    public final Mode j;
    public final Object k;
    
    public RxAwaitKt$awaitOne$2$1(final m i, final Mode j, final Object k) {
        this.i = (l<Object>)i;
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
            final l<Object> i = this.i;
            final StringBuilder t = a.t("No value received via onNext for ");
            t.append(this.j);
            ((c)i).resumeWith(Result.constructor-impl((Object)d.B1((Throwable)new NoSuchElementException(t.toString()))));
        }
    }
    
    public final void onError(final Throwable t) {
        ((c)this.i).resumeWith(Result.constructor-impl((Object)d.B1(t)));
    }
    
    public final void onNext(final Object g) {
        final int n = a.a[this.j.ordinal()];
        if (n != 1 && n != 2) {
            if (n == 3 || n == 4) {
                if (this.j == Mode.SINGLE && this.h) {
                    if (this.i.isActive()) {
                        final l<Object> i = this.i;
                        final StringBuilder t = a.t("More than one onNext value for ");
                        t.append(this.j);
                        ((c)i).resumeWith(Result.constructor-impl((Object)d.B1((Throwable)new IllegalArgumentException(t.toString()))));
                    }
                    final df2.a f = this.f;
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
            final df2.a f2 = this.f;
            if (f2 == null) {
                e.n("subscription");
                throw null;
            }
            f2.dispose();
        }
    }
    
    public final void onSubscribe(final df2.a f) {
        this.f = f;
        this.i.Z((mg2.l)new RxAwaitKt$awaitOne$2$1$onSubscribe$1(f));
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
            a = a2;
        }
    }
}
