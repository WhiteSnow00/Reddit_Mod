// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.feed.composables;

import androidx.constraintlayout.compose.c;
import sg2.e;
import y2.a;
import kotlin.Metadata;
import hg2.j;
import androidx.constraintlayout.compose.ConstrainScope;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class CollectibleAvatarsKt$NftCardItem$1$2$1 extends Lambda implements l<ConstrainScope, j>
{
    public final /* synthetic */ a $nftCard;
    
    public CollectibleAvatarsKt$NftCardItem$1$2$1(final a $nftCard) {
        this.$nftCard = $nftCard;
        super(1);
    }
    
    public final void invoke(final ConstrainScope constrainScope) {
        e.f((Object)constrainScope, "$this$constrainAs");
        ConstrainScope.HorizontalAnchorable.b(constrainScope.e, this.$nftCard.e);
        ConstrainScope.VerticalAnchorable.b(constrainScope.d, this.$nftCard.b);
        ConstrainScope.VerticalAnchorable.b(constrainScope.f, this.$nftCard.d);
        constrainScope.f(c.a.a());
    }
}
