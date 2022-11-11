// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.widgets;

import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.GridLayout;
import sg2.e;
import kotlin.Metadata;
import android.widget.GridLayout$LayoutParams;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "La42/e;", "Model", "it", "Landroid/widget/GridLayout$LayoutParams;", "invoke", "(La42/e;)Landroid/widget/GridLayout$LayoutParams;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class MarketingPerksGridView$bind$3 extends Lambda implements l<Object, GridLayout$LayoutParams>
{
    public final /* synthetic */ MarketingPerksGridView this$0;
    
    public MarketingPerksGridView$bind$3(final MarketingPerksGridView this$0) {
        this.this$0 = this$0;
        super(1);
    }
    
    public final GridLayout$LayoutParams invoke(final Object o) {
        e.f(o, "it");
        final GridLayout$LayoutParams gridLayout$LayoutParams = new GridLayout$LayoutParams(GridLayout.spec(Integer.MIN_VALUE, 1.0f), GridLayout.spec(Integer.MIN_VALUE, 1.0f));
        final MarketingPerksGridView this$0 = this.this$0;
        ((ViewGroup$MarginLayoutParams)gridLayout$LayoutParams).setMargins(((View)this$0).getResources().getDimensionPixelOffset(2131166842), ((View)this$0).getResources().getDimensionPixelOffset(2131166673), ((View)this$0).getResources().getDimensionPixelOffset(2131166842), 0);
        return gridLayout$LayoutParams;
    }
}
