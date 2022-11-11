// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.session.foreground;

import androidx.lifecycle.q;
import javax.inject.Inject;
import ah2.f;
import le0.a;
import javax.inject.Provider;
import kotlin.Metadata;
import le0.c;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003" }, d2 = { "Lcom/reddit/data/session/foreground/ForegroundSessionLifecycleHandlerImpl;", "Lle0/c;", "Landroidx/lifecycle/c;", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class ForegroundSessionLifecycleHandlerImpl implements c, androidx.lifecycle.c
{
    public final Provider<a> f;
    
    @Inject
    public ForegroundSessionLifecycleHandlerImpl(final Provider<a> f) {
        ah2.f.f((Object)f, "foregroundSessionProvider");
        this.f = f;
    }
    
    public final void onStart(final q q) {
        ((a)this.f.get()).c();
    }
    
    public final void onStop(final q q) {
        ((a)this.f.get()).b();
    }
}
