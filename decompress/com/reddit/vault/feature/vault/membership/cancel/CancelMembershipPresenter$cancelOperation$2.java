// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.membership.cancel;

import hj2.a0;
import x82.i;
import x82.h;
import sg2.e;
import kotlin.Metadata;
import y82.g$b;
import rg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Ly82/g$b;", "invoke", "()Ly82/g$b;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class CancelMembershipPresenter$cancelOperation$2 extends Lambda implements a<g$b>
{
    public final /* synthetic */ CancelMembershipPresenter this$0;
    
    public CancelMembershipPresenter$cancelOperation$2(final CancelMembershipPresenter this$0) {
        this.this$0 = this$0;
        super(0);
    }
    
    public final g$b invoke() {
        final CancelMembershipPresenter this$0 = this.this$0;
        final ja2.a j = this$0.j;
        final h b = j.b;
        final i c = j.c;
        final Object value = ((a0)this$0.m.getAddress()).getValue();
        e.c(value);
        return new g$b(b, c, (x82.a)value);
    }
}
