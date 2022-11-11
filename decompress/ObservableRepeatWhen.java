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

public final class ObservableRepeatWhen<T> extends a<T, T>
{
    public final o<? super t<Object>, ? extends y<?>> g;
    
    public ObservableRepeatWhen(final y<T> y, final o<? super t<Object>, ? extends y<?>> g) {
        super((y)y);
        this.g = g;
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        final c serialized = PublishSubject.create().toSerialized();
        try {
            final Object apply = this.g.apply((Object)serialized);
            mf2.a.b(apply, "The handler returned a null ObservableSource");
            final y y = (y)apply;
            final ObservableRepeatWhen.ObservableRepeatWhen$RepeatWhenObserver observableRepeatWhen$RepeatWhenObserver = new ObservableRepeatWhen.ObservableRepeatWhen$RepeatWhenObserver((a0)a0, serialized, super.f);
            a0.onSubscribe((if2.a)observableRepeatWhen$RepeatWhenObserver);
            y.subscribe((a0)observableRepeatWhen$RepeatWhenObserver.inner);
            observableRepeatWhen$RepeatWhenObserver.subscribeNext();
        }
        finally {
            final Throwable t;
            c0.i4(t);
            EmptyDisposable.error(t, (a0)a0);
        }
    }
}
