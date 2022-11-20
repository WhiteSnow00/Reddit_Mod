// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import af2.l;
import nt2.c;
import af2.g;
import af2.s;
import lf2.a;

public final class FlowableMaterialize<T> extends a<T, s<T>>
{
    public FlowableMaterialize(final g<T> g) {
        super(g);
    }
    
    @Override
    public final void subscribeActual(final c<? super s<T>> c) {
        super.f.subscribe(new MaterializeSubscriber((nt2.c<? super af2.s<Object>>)c));
    }
    
    public static final class MaterializeSubscriber<T> extends SinglePostCompleteSubscriber<T, s<T>>
    {
        private static final long serialVersionUID = -3740826063558713822L;
        
        public MaterializeSubscriber(final c<? super s<T>> c) {
            super(c);
        }
        
        @Override
        public void onComplete() {
            this.complete((s<T>)s.b);
        }
        
        @Override
        public void onDrop(final s<T> s) {
            if (s.f()) {
                RxJavaPlugins.onError(s.c());
            }
        }
        
        @Override
        public /* bridge */ void onDrop(final Object o) {
            this.onDrop((s<T>)o);
        }
        
        @Override
        public void onError(final Throwable t) {
            this.complete((s<T>)s.a(t));
        }
        
        @Override
        public void onNext(final T t) {
            ++super.produced;
            super.downstream.onNext((Object)s.b((Object)t));
        }
    }
}
