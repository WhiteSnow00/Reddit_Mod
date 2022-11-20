// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow.internal;

import p1.h;
import mg2.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import java.util.ArrayList;
import bj2.m;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import zi2.c0;
import bj2.n;
import cj2.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import mg2.p;
import mg.d0;
import cg2.j;
import gg2.c;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlin.coroutines.CoroutineContext;
import dj2.f;

public abstract class a<T> implements f<T>
{
    public final CoroutineContext f;
    public final int g;
    public final BufferOverflow h;
    
    public a(final CoroutineContext f, final int g, final BufferOverflow h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public Object a(final cj2.f<? super T> f, final c<? super j> c) {
        Object o = d0.G((p)new ChannelFlow$collect$2((cj2.f)f, this, (c)null), (c)c);
        if (o != CoroutineSingletons.COROUTINE_SUSPENDED) {
            o = j.a;
        }
        return o;
    }
    
    public final e<T> e(CoroutineContext plus, int n, BufferOverflow h) {
        plus = plus.plus(this.f);
        if (h == BufferOverflow.SUSPEND) {
            final int g = this.g;
            if (g != -3) {
                if (n == -3) {
                    n = g;
                }
                else if (g != -2) {
                    if (n == -2) {
                        n = g;
                    }
                    else {
                        n += g;
                        if (n < 0) {
                            n = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            h = this.h;
        }
        if (ng2.e.a((Object)plus, (Object)this.f) && n == this.g && h == this.h) {
            return (e<T>)this;
        }
        return (e<T>)this.i(plus, n, h);
    }
    
    public String f() {
        return null;
    }
    
    public abstract Object g(final n<? super T> p0, final c<? super j> p1);
    
    public abstract a<T> i(final CoroutineContext p0, final int p1, final BufferOverflow p2);
    
    public e<T> j() {
        return null;
    }
    
    public bj2.p<T> k(final c0 c0) {
        final CoroutineContext f = this.f;
        int g;
        if ((g = this.g) == -3) {
            g = -2;
        }
        final BufferOverflow h = this.h;
        final CoroutineStart atomic = CoroutineStart.ATOMIC;
        final ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this, (c)null);
        final m m = new m(CoroutineContextKt.c(c0, f), zg.a.e(g, h, 4));
        atomic.invoke((mg2.p<? super c<? super Object>, ? super c<? super Object>, ?>)channelFlow$collectToFun$1, (c<? super Object>)m, (c<? super Object>)m);
        return (bj2.p<T>)m;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList(4);
        final String f = this.f();
        if (f != null) {
            list.add(f);
        }
        if (this.f != EmptyCoroutineContext.INSTANCE) {
            final StringBuilder t = a.t("context=");
            t.append(this.f);
            list.add(t.toString());
        }
        if (this.g != -3) {
            final StringBuilder t2 = a.t("capacity=");
            t2.append(this.g);
            list.add(t2.toString());
        }
        if (this.h != BufferOverflow.SUSPEND) {
            final StringBuilder t3 = a.t("onBufferOverflow=");
            t3.append(this.h);
            list.add(t3.toString());
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append('[');
        return p1.h.c(sb, CollectionsKt___CollectionsKt.a5((Iterable)list, (CharSequence)", ", (String)null, (String)null, (l)null, 62), ']');
    }
}
