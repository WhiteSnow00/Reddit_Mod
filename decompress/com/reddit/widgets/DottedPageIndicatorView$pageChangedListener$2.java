// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.widgets;

import java.util.Iterator;
import android.widget.ImageView;
import sg2.e;
import android.view.View;
import lw0.b;
import a4.o1;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager$n;
import kotlin.Metadata;
import rg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u0007\n\u0002\b\u0004*\u0001\u0000\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "com/reddit/widgets/DottedPageIndicatorView$pageChangedListener$2$a", "invoke", "()Lcom/reddit/widgets/DottedPageIndicatorView$pageChangedListener$2$a;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class DottedPageIndicatorView$pageChangedListener$2 extends Lambda implements a<DottedPageIndicatorView$pageChangedListener$2$a>
{
    public final /* synthetic */ DottedPageIndicatorView this$0;
    
    public DottedPageIndicatorView$pageChangedListener$2(final DottedPageIndicatorView this$0) {
        this.this$0 = this$0;
        super(0);
    }
    
    public final DottedPageIndicatorView$pageChangedListener$2$a invoke() {
        return new ViewPager$n() {
            public final /* synthetic */ DottedPageIndicatorView f = DottedPageIndicatorView$pageChangedListener$2.this.this$0;
            
            public final void onPageSelected(final int n) {
                final Iterator<View> iterator = androidx.core.view.a.a((ViewGroup)this.f).iterator();
                int n2 = 0;
                while (true) {
                    final o1 o1 = (o1)iterator;
                    if (!o1.hasNext()) {
                        return;
                    }
                    final Object next = o1.next();
                    if (n2 < 0) {
                        b.I2();
                        throw null;
                    }
                    final View view = (View)next;
                    e.d((Object)view, "null cannot be cast to non-null type android.widget.ImageView");
                    ((ImageView)view).setSelected(n2 == n);
                    ++n2;
                }
            }
        };
    }
}
