// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.widget.bottomnav;

import ra.o;
import com.reddit.launch.bottomnav.BottomNavScreenPresenter;
import kotlin.Metadata;
import hg2.j;
import rg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lhg2/j;", "invoke", "()V", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class BottomNavView$updateItems$1$onClick$1 extends Lambda implements a<j>
{
    public final /* synthetic */ BottomNavView.Item $item;
    public final /* synthetic */ BottomNavView this$0;
    
    public BottomNavView$updateItems$1$onClick$1(final BottomNavView this$0, final BottomNavView.Item $item) {
        this.this$0 = this$0;
        this.$item = $item;
        super(0);
    }
    
    public final void invoke() {
        final BottomNavView.b onItemSelectedListener = this.this$0.getOnItemSelectedListener();
        if (onItemSelectedListener != null) {
            ((BottomNavScreenPresenter)((o)onItemSelectedListener).g).Hc(this.$item.a, this.this$0.getSelectedItemType());
        }
    }
}
