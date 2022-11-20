// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.feed.composables;

import androidx.constraintlayout.compose.ConstrainScope$VerticalAnchorable;
import androidx.constraintlayout.compose.ConstrainScope$HorizontalAnchorable;
import ng2.e;
import kotlin.Metadata;
import cg2.j;
import androidx.constraintlayout.compose.ConstrainScope;
import mg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class CollectibleAvatarsKt$NftCardItem$1$1 extends Lambda implements l<ConstrainScope, j>
{
    public static final CollectibleAvatarsKt$NftCardItem$1$1 INSTANCE;
    
    static {
        INSTANCE = new CollectibleAvatarsKt$NftCardItem$1$1();
    }
    
    public CollectibleAvatarsKt$NftCardItem$1$1() {
        super(1);
    }
    
    public /* bridge */ Object invoke(final Object o) {
        this.invoke((ConstrainScope)o);
        return j.a;
    }
    
    public final void invoke(final ConstrainScope constrainScope) {
        e.f((Object)constrainScope, "$this$constrainAs");
        ConstrainScope$HorizontalAnchorable.b(constrainScope.e, constrainScope.c.c);
        ConstrainScope$VerticalAnchorable.b(constrainScope.d, constrainScope.c.b);
        ConstrainScope$VerticalAnchorable.b(constrainScope.f, constrainScope.c.d);
    }
}
