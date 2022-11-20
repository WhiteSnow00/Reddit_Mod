// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import nt2.d;
import io.reactivex.internal.util.EmptyComponent;
import af2.l;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentHashMap;
import nt2.c;
import java.util.Map;
import ff2.g;
import ff2.o;
import ef2.b;
import lf2.a;

public final class FlowableGroupBy<T, K, V> extends a<T, ef2.b<K, V>>
{
    public final o<? super T, ? extends K> g;
    public final o<? super T, ? extends V> h;
    public final int i;
    public final boolean j;
    public final o<? super ff2.g<Object>, ? extends Map<K, Object>> k;
    
    public FlowableGroupBy(final g<T> g, final o<? super T, ? extends K> g2, final o<? super T, ? extends V> h, final int i, final boolean j, final o<? super ff2.g<Object>, ? extends Map<K, Object>> k) {
        super(g);
        this.g = g2;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    @Override
    public final void subscribeActual(c<? super ef2.b<K, V>> flowableGroupBy$GroupBySubscriber) {
        try {
            ConcurrentLinkedQueue concurrentLinkedQueue;
            Map map;
            if (this.k == null) {
                concurrentLinkedQueue = null;
                map = new ConcurrentHashMap();
            }
            else {
                concurrentLinkedQueue = new ConcurrentLinkedQueue();
                map = (Map)this.k.apply((Object)new FlowableGroupBy.FlowableGroupBy$a(concurrentLinkedQueue));
            }
            flowableGroupBy$GroupBySubscriber = new FlowableGroupBy.FlowableGroupBy$GroupBySubscriber((c)flowableGroupBy$GroupBySubscriber, (o)this.g, (o)this.h, this.i, this.j, map, (Queue)concurrentLinkedQueue);
            super.f.subscribe((l<? super T>)flowableGroupBy$GroupBySubscriber);
        }
        catch (final Exception ex) {
            xd.a.t1((Throwable)ex);
            ((c)flowableGroupBy$GroupBySubscriber).onSubscribe((d)EmptyComponent.INSTANCE);
            ((c)flowableGroupBy$GroupBySubscriber).onError((Throwable)ex);
        }
    }
    
    public static final class b<K, T> extends ef2.b<K, T>
    {
        public static final int h = 0;
        public final FlowableGroupBy$State<T, K> g;
        
        public b(final K k, final FlowableGroupBy$State<T, K> g) {
            super((Object)k);
            this.g = g;
        }
        
        public final void subscribeActual(final c<? super T> c) {
            this.g.subscribe((c)c);
        }
    }
}
