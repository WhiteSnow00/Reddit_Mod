// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.live.player;

import ml0.a;
import sg2.e;
import kotlin.Metadata;
import hg2.j;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n" }, d2 = { "", "it", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 5, 1 })
final class Player$connect$1 extends Lambda implements l<String, j>
{
    public final /* synthetic */ Player this$0;
    
    public Player$connect$1(final Player this$0) {
        this.this$0 = this$0;
        super(1);
    }
    
    public final void invoke(final String s) {
        e.f((Object)s, "it");
        final Player this$0 = this.this$0;
        this$0.c.w(a.I((Object)this$0), s, (Throwable)null);
    }
}
