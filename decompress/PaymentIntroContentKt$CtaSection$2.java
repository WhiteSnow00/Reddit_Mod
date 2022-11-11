// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.payment.intro.composables;

import rg2.a;
import kotlin.Metadata;
import hg2.j;
import z0.d;
import rg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class PaymentIntroContentKt$CtaSection$2 extends Lambda implements p<z0.d, Integer, j>
{
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ a<j> $onLearnMoreClicked;
    public final /* synthetic */ a<j> $onOpenFtxClicked;
    
    public PaymentIntroContentKt$CtaSection$2(final a<j> $onLearnMoreClicked, final a<j> $onOpenFtxClicked, final int $$changed) {
        this.$onLearnMoreClicked = $onLearnMoreClicked;
        this.$onOpenFtxClicked = $onOpenFtxClicked;
        this.$$changed = $$changed;
        super(2);
    }
    
    public final void invoke(final z0.d d, final int n) {
        PaymentIntroContentKt.g((a)this.$onLearnMoreClicked, (a)this.$onOpenFtxClicked, d, this.$$changed | 0x1);
    }
}
