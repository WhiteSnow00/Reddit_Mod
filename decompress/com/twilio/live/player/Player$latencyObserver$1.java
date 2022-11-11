// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.live.player;

import sg2.e;
import kotlin.Metadata;
import hg2.j;
import de2.a;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n" }, d2 = { "Lde2/a;", "it", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 5, 1 })
final class Player$latencyObserver$1 extends Lambda implements l<a, j>
{
    public final /* synthetic */ Player this$0;
    
    public Player$latencyObserver$1(final Player this$0) {
        this.this$0 = this$0;
        super(1);
    }
    
    public final void invoke(final a a) {
        e.f((Object)a, "it");
        final Player this$0 = this.this$0;
        ml0.a.v0(this$0.e, (Runnable)new be2.a(a, this$0));
    }
}
