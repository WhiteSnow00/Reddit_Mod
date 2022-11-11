// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.navdrawer;

import pj2.e;
import o72.f;
import pc0.b$b;
import pc0.b;
import pj2.p;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003¨\u0006\n" }, d2 = { "Lcom/reddit/domain/navdrawer/NavDrawerStateChangeEventBus;", "", "Lpj2/e;", "Lpc0/b;", "get", "state", "Lpg2/j;", "dispatchChange", "<init>", "()V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class NavDrawerStateChangeEventBus
{
    private final p<b> bus;
    
    public NavDrawerStateChangeEventBus() {
        this.bus = (p<b>)f.f((Object)b$b.a);
    }
    
    public final void dispatchChange(final b value) {
        ah2.f.f((Object)value, "state");
        this.bus.setValue((Object)value);
    }
    
    public final e<b> get() {
        return (e<b>)this.bus;
    }
}
