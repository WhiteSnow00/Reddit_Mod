// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.payment.intro.composables;

import oa2.a;
import java.util.List;
import kotlin.Metadata;
import hg2.j;
import z0.d;
import rg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class PaymentIntroContentKt$ListItems$2 extends Lambda implements p<z0.d, Integer, j>
{
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ List<a> $listItems;
    
    public PaymentIntroContentKt$ListItems$2(final List<a> $listItems, final int $$changed) {
        this.$listItems = $listItems;
        this.$$changed = $$changed;
        super(2);
    }
    
    public final void invoke(final z0.d d, final int n) {
        PaymentIntroContentKt.h((List)this.$listItems, d, this.$$changed | 0x1);
    }
}
