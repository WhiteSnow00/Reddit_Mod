// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.payment.intro.composables;

import kotlin.Metadata;
import hg2.j;
import z0.d;
import rg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class PaymentIntroContentKt$Heading$2 extends Lambda implements p<z0.d, Integer, j>
{
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $icon;
    public final /* synthetic */ int $title;
    
    public PaymentIntroContentKt$Heading$2(final int $title, final int $icon, final int $$changed) {
        this.$title = $title;
        this.$icon = $icon;
        this.$$changed = $$changed;
        super(2);
    }
    
    public final void invoke(final z0.d d, final int n) {
        PaymentIntroContentKt.b(this.$title, this.$icon, this.$$changed | 0x1, d);
    }
}
