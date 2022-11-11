// 
// Decompiled by Procyon v0.6.0
// 

package androidx.paging;

import c5.x;
import rg2.p;
import hg2.j;
import lg2.c;
import hj2.f;
import rg2.q;
import hj2.e;

public final class FlowExtKt
{
    public static final Object a;
    
    static {
        a = new Object();
    }
    
    public static final <T, R> e<R> a(final e<? extends T> e, final q<? super f<? super R>, ? super T, ? super c<? super j>, ?> q) {
        sg2.e.f((Object)e, "<this>");
        return SimpleChannelFlowKt.a((p<? super x<R>, ? super c<? super j>, ?>)new FlowExtKt$simpleTransformLatest$1((e)e, (q)q, (c)null));
    }
}
