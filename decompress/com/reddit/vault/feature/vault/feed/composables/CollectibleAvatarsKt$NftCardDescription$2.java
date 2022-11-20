// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.feed.composables;

import z92.a;
import kotlin.Metadata;
import cg2.j;
import z0.d;
import mg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class CollectibleAvatarsKt$NftCardDescription$2 extends Lambda implements p<d, Integer, j>
{
    public final int $$changed;
    public final int $$default;
    public final j1.d $modifier;
    public final a $uiModel;
    
    public CollectibleAvatarsKt$NftCardDescription$2(final a $uiModel, final j1.d $modifier, final int $$changed, final int $$default) {
        this.$uiModel = $uiModel;
        this.$modifier = $modifier;
        this.$$changed = $$changed;
        this.$$default = $$default;
        super(2);
    }
    
    public /* bridge */ Object invoke(final Object o, final Object o2) {
        this.invoke((d)o, ((Number)o2).intValue());
        return j.a;
    }
    
    public final void invoke(final d d, final int n) {
        CollectibleAvatarsKt.b(this.$uiModel, this.$modifier, d, this.$$changed | 0x1, this.$$default);
    }
}
