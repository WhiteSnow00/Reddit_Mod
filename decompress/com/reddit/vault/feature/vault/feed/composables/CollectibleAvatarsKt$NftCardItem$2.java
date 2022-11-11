// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.feed.composables;

import fa2.a;
import kotlin.Metadata;
import hg2.j;
import z0.d;
import rg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class CollectibleAvatarsKt$NftCardItem$2 extends Lambda implements p<z0.d, Integer, j>
{
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ j1.d $modifier;
    public final /* synthetic */ a $uiModel;
    
    public CollectibleAvatarsKt$NftCardItem$2(final a $uiModel, final j1.d $modifier, final int $$changed, final int $$default) {
        this.$uiModel = $uiModel;
        this.$modifier = $modifier;
        this.$$changed = $$changed;
        this.$$default = $$default;
        super(2);
    }
    
    public final void invoke(final z0.d d, final int n) {
        CollectibleAvatarsKt.c(this.$uiModel, this.$modifier, d, this.$$changed | 0x1, this.$$default);
    }
}
