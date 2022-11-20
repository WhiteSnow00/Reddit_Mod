// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.collectibleavatars.composables;

import kotlin.Metadata;
import cg2.j;
import z0.d;
import mg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class CarrouselControlKt$PageIndicator$2 extends Lambda implements p<d, Integer, j>
{
    public final int $$changed;
    public final int $currentPage;
    public final j1.d $modifier;
    public final int $numberOfPages;
    
    public CarrouselControlKt$PageIndicator$2(final int $numberOfPages, final int $currentPage, final j1.d $modifier, final int $$changed) {
        this.$numberOfPages = $numberOfPages;
        this.$currentPage = $currentPage;
        this.$modifier = $modifier;
        this.$$changed = $$changed;
        super(2);
    }
    
    public /* bridge */ Object invoke(final Object o, final Object o2) {
        this.invoke((d)o, ((Number)o2).intValue());
        return j.a;
    }
    
    public final void invoke(final d d, int $currentPage) {
        final int $numberOfPages = this.$numberOfPages;
        $currentPage = this.$currentPage;
        CarrouselControlKt.b($numberOfPages, $currentPage, this.$$changed | 0x1, d, this.$modifier);
    }
}
