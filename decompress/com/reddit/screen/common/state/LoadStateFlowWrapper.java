// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.screen.common.state;

import kotlinx.coroutines.JobSupport;
import zi2.g0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import java.util.concurrent.CancellationException;
import zi2.z0;
import cg2.j;
import mg2.q;
import p2.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import xd.a;
import mg2.p;
import kotlinx.coroutines.CoroutineDispatcher;
import zi2.g;
import kotlinx.coroutines.CoroutineStart;
import ng2.e;
import kotlinx.coroutines.flow.StateFlowImpl;
import gg2.c;
import mg2.l;
import zi2.c0;

public final class LoadStateFlowWrapper<Value>
{
    public final c0 a;
    public final l<c<? super Value>, Object> b;
    public final l<c<? super Value>, Object> c;
    public StateFlowImpl d;
    
    public LoadStateFlowWrapper(final c0 c0, final l<? super c<? super Value>, ?> l) {
        e.f((Object)c0, "scope");
        this(c0, l, l);
    }
    
    public LoadStateFlowWrapper(final c0 a, final l<? super c<? super Value>, ?> b, final l<? super c<? super Value>, ?> c) {
        e.f((Object)a, "scope");
        this.a = a;
        this.b = (l<c<? super Value>, Object>)b;
        this.c = (l<c<? super Value>, Object>)c;
        this.d = xd.a.h((Object)g.b(a, null, CoroutineStart.LAZY, (p)new LoadStateFlowWrapper$createInitialDeferred$1(this, (c)null), 1));
    }
    
    public final ChannelFlowTransformLatest a() {
        return p2.b.S((cj2.e)this.d, (q)new LoadStateFlowWrapper$getDataFlow$1(new Ref$ObjectRef(), new Ref$ObjectRef(), (c)null));
    }
    
    public final Object b(final c<? super j> c) {
        ((z0)this.d.getValue()).a(null);
        final g0 b = g.b(this.a, null, null, (p)new LoadStateFlowWrapper$refresh$deferred$1(this, (c)null), 3);
        this.d.setValue((Object)b);
        final Object k = ((JobSupport)b).k((c)c);
        if (k == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return k;
        }
        return j.a;
    }
}
