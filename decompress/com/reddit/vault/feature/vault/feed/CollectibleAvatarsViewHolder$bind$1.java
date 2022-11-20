// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.feed;

import mg2.q;
import com.reddit.vault.feature.vault.feed.composables.CollectibleAvatarsKt;
import ng2.e;
import mg2.l;
import androidx.compose.runtime.ComposerKt;
import y92.c;
import kotlin.Metadata;
import cg2.j;
import z0.d;
import mg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lcg2/j;", "invoke", "(Lz0/d;I)V", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class CollectibleAvatarsViewHolder$bind$1 extends Lambda implements p<d, Integer, j>
{
    public final c $item;
    public final y92.d this$0;
    
    public CollectibleAvatarsViewHolder$bind$1(final c $item, final y92.d this$0) {
        this.$item = $item;
        this.this$0 = this$0;
        super(2);
    }
    
    public /* bridge */ Object invoke(final Object o, final Object o2) {
        this.invoke((d)o, ((Number)o2).intValue());
        return j.a;
    }
    
    public final void invoke(final d d, final int n) {
        if ((n & 0xB) == 0x2 && d.d()) {
            d.j();
        }
        else {
            final q a = ComposerKt.a;
            CollectibleAvatarsKt.a(this.$item.a, (l)new l<String, j>(this.this$0) {
                public final y92.d this$0;
                
                public /* bridge */ Object invoke(final Object o) {
                    this.invoke((String)o);
                    return j.a;
                }
                
                public final void invoke(final String s) {
                    e.f((Object)s, "id");
                    this.this$0.g.M7(s);
                }
            }, d, 8);
        }
    }
}
