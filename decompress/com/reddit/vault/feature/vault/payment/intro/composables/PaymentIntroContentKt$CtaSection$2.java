// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.payment.intro.composables;

import mg2.a;
import kotlin.Metadata;
import cg2.j;
import z0.d;
import mg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class PaymentIntroContentKt$CtaSection$2 extends Lambda implements p<d, Integer, j>
{
    public final int $$changed;
    public final a<j> $onLearnMoreClicked;
    public final a<j> $onOpenFtxClicked;
    
    public PaymentIntroContentKt$CtaSection$2(final a<j> $onLearnMoreClicked, final a<j> $onOpenFtxClicked, final int $$changed) {
        this.$onLearnMoreClicked = $onLearnMoreClicked;
        this.$onOpenFtxClicked = $onOpenFtxClicked;
        this.$$changed = $$changed;
        super(2);
    }
    
    public /* bridge */ Object invoke(final Object o, final Object o2) {
        this.invoke((d)o, ((Number)o2).intValue());
        return j.a;
    }
    
    public final void invoke(final d d, final int n) {
        PaymentIntroContentKt.g((a)this.$onLearnMoreClicked, (a)this.$onOpenFtxClicked, d, this.$$changed | 0x1);
    }
}
