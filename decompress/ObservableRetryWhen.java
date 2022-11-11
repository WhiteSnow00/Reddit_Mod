// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import fg2.c;
import io.reactivex.internal.disposables.EmptyDisposable;
import ej2.c0;
import io.reactivex.subjects.PublishSubject;
import ff2.a0;
import ff2.y;
import ff2.t;
import kf2.o;
import sf2.a;

public final class ObservableRetryWhen<T> extends a<T, T>
{
    public final o<? super t<Throwable>, ? extends y<?>> g;
    
    public ObservableRetryWhen(final y<T> y, final o<? super t<Throwable>, ? extends y<?>> g) {
        super((y)y);
        this.g = g;
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        final c serialized = PublishSubject.create().toSerialized();
        try {
            final Object apply = this.g.apply((Object)serialized);
            mf2.a.b(apply, "The handler returned a null ObservableSource");
            final y y = (y)apply;
            final ObservableRetryWhen.ObservableRetryWhen$RepeatWhenObserver observableRetryWhen$RepeatWhenObserver = new ObservableRetryWhen.ObservableRetryWhen$RepeatWhenObserver((a0)a0, serialized, super.f);
            a0.onSubscribe((if2.a)observableRetryWhen$RepeatWhenObserver);
            y.subscribe((a0)observableRetryWhen$RepeatWhenObserver.inner);
            observableRetryWhen$RepeatWhenObserver.subscribeNext();
        }
        finally {
            final Throwable t;
            c0.i4(t);
            EmptyDisposable.error(t, (a0)a0);
        }
    }
}
