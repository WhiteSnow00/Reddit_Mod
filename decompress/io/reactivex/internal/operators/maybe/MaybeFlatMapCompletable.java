// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.maybe;

import ff2.p;
import ff2.c;
import ff2.e;
import kf2.o;
import ff2.r;
import ff2.a;

public final class MaybeFlatMapCompletable<T> extends a
{
    public final r<T> f;
    public final o<? super T, ? extends e> g;
    
    public MaybeFlatMapCompletable(final r<T> f, final o<? super T, ? extends e> g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void w(final c c) {
        final MaybeFlatMapCompletable.MaybeFlatMapCompletable$FlatMapCompletableObserver maybeFlatMapCompletable$FlatMapCompletableObserver = new MaybeFlatMapCompletable.MaybeFlatMapCompletable$FlatMapCompletableObserver(c, (o)this.g);
        c.onSubscribe((if2.a)maybeFlatMapCompletable$FlatMapCompletableObserver);
        this.f.b((p)maybeFlatMapCompletable$FlatMapCompletableObserver);
    }
}
