// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import ff2.a0;
import ff2.y;
import kf2.o;
import zf2.b;
import sf2.a;

public final class ObservableGroupBy<T, K, V> extends sf2.a<T, b<K, V>>
{
    public final o<? super T, ? extends K> g;
    public final o<? super T, ? extends V> h;
    public final int i;
    public final boolean j;
    
    public ObservableGroupBy(final y<T> y, final o<? super T, ? extends K> g, final o<? super T, ? extends V> h, final int i, final boolean j) {
        super((y)y);
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final void subscribeActual(final a0<? super b<K, V>> a0) {
        super.f.subscribe((a0)new ObservableGroupBy.ObservableGroupBy$GroupByObserver((a0)a0, (o)this.g, (o)this.h, this.i, this.j));
    }
    
    public static final class a<K, T> extends b<K, T>
    {
        public final ObservableGroupBy$State<T, K> g;
        
        public a(final K k, final ObservableGroupBy$State<T, K> g) {
            super((Object)k);
            this.g = g;
        }
        
        public final void subscribeActual(final a0<? super T> a0) {
            this.g.subscribe((a0)a0);
        }
    }
}
