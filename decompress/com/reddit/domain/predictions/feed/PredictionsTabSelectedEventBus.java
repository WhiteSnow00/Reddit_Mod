// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.predictions.feed;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import cg2.j;
import gg2.c;
import kotlinx.coroutines.flow.g;
import zi2.q1;
import cj2.q;
import kotlinx.coroutines.channels.BufferOverflow;
import dg.l0;
import cj2.t;
import gd0.b;
import cj2.o;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e" }, d2 = { "Lcom/reddit/domain/predictions/feed/PredictionsTabSelectedEventBus;", "", "Lgd0/b;", "event", "Lcg2/j;", "post", "(Lgd0/b;Lgg2/c;)Ljava/lang/Object;", "Lcj2/t;", "events", "Lcj2/t;", "getEvents", "()Lcj2/t;", "<init>", "()V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class PredictionsTabSelectedEventBus
{
    private final o<b> _events;
    private final t<b> events;
    
    public PredictionsTabSelectedEventBus() {
        final g m = l0.m(0, 0, (BufferOverflow)null, 7);
        this._events = (o<b>)m;
        this.events = (t<b>)new q(m, (q1)null);
    }
    
    public final t<b> getEvents() {
        return this.events;
    }
    
    public final Object post(final b b, final c<? super j> c) {
        final Object emit = this._events.emit((Object)b, (c)c);
        if (emit == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return emit;
        }
        return j.a;
    }
}
