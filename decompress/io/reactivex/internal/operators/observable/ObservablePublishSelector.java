// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.EmptyDisposable;
import ej2.c0;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.subjects.PublishSubject;
import ff2.a0;
import ff2.y;
import ff2.t;
import kf2.o;
import sf2.a;

public final class ObservablePublishSelector<T, R> extends a<T, R>
{
    public final o<? super t<T>, ? extends y<R>> g;
    
    public ObservablePublishSelector(final y<T> y, final o<? super t<T>, ? extends y<R>> g) {
        super((y)y);
        this.g = g;
    }
    
    public final void subscribeActual(a0<? super R> observablePublishSelector$TargetObserver) {
        final PublishSubject<Object> create = PublishSubject.create();
        try {
            final Object apply = this.g.apply((Object)create);
            mf2.a.b(apply, "The selector returned a null ObservableSource");
            final y y = (y)apply;
            observablePublishSelector$TargetObserver = new ObservablePublishSelector.ObservablePublishSelector$TargetObserver((a0)observablePublishSelector$TargetObserver);
            y.subscribe((a0)observablePublishSelector$TargetObserver);
            super.f.subscribe((a0)new ObservablePublishSelector.ObservablePublishSelector$a((PublishSubject)create, (AtomicReference)observablePublishSelector$TargetObserver));
        }
        finally {
            final Throwable t;
            c0.i4(t);
            EmptyDisposable.error(t, (a0)observablePublishSelector$TargetObserver);
        }
    }
}
