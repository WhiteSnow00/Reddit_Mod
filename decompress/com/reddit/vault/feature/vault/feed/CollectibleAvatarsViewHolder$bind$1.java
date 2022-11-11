// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.feed;

import z0.t0;
import z0.y0;
import rg2.q;
import java.util.List;
import com.reddit.vault.feature.vault.feed.composables.CollectibleAvatarsKt;
import sg2.e;
import rg2.l;
import androidx.compose.runtime.ComposerKt;
import ea2.c;
import kotlin.Metadata;
import hg2.j;
import z0.d;
import rg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lhg2/j;", "invoke", "(Lz0/d;I)V", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class CollectibleAvatarsViewHolder$bind$1 extends Lambda implements p<z0.d, Integer, j>
{
    public final /* synthetic */ c $item;
    public final /* synthetic */ ea2.d this$0;
    
    public CollectibleAvatarsViewHolder$bind$1(final c $item, final ea2.d this$0) {
        this.$item = $item;
        this.this$0 = this$0;
        super(2);
    }
    
    public final void invoke(final z0.d d, final int n) {
        if ((n & 0xB) == 0x2 && d.c()) {
            d.k();
        }
        else {
            final q<z0.c<?>, y0, t0, j> a = ComposerKt.a;
            CollectibleAvatarsKt.a((List)this.$item.a, (l)new l<String, j>() {
                public final /* synthetic */ ea2.d this$0 = CollectibleAvatarsViewHolder$bind$1.this.this$0;
                
                public final void invoke(final String s) {
                    e.f((Object)s, "id");
                    this.this$0.g.B8(s);
                }
            }, d, 8);
        }
    }
}
