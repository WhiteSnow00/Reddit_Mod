// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.navdrawer;

import ng2.e;
import xd.a;
import fc0.b$b;
import fc0.b;
import cj2.p;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003¨\u0006\n" }, d2 = { "Lcom/reddit/domain/navdrawer/NavDrawerStateChangeEventBus;", "", "Lcj2/e;", "Lfc0/b;", "get", "state", "Lcg2/j;", "dispatchChange", "<init>", "()V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class NavDrawerStateChangeEventBus
{
    private final p<b> bus;
    
    public NavDrawerStateChangeEventBus() {
        this.bus = (p<b>)a.h((Object)b$b.a);
    }
    
    public final void dispatchChange(final b value) {
        e.f((Object)value, "state");
        this.bus.setValue(value);
    }
    
    public final cj2.e<b> get() {
        return (cj2.e<b>)this.bus;
    }
}
