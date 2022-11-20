// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.ui.viewpager;

import java.util.Iterator;
import android.view.View$MeasureSpec;
import android.view.View;
import a4.f1;
import android.view.ViewGroup;
import androidx.core.view.a;
import ng2.e;
import android.util.AttributeSet;
import android.content.Context;
import kotlin.Metadata;
import androidx.viewpager.widget.ViewPager;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "Lcom/reddit/ui/viewpager/VariableHeightViewPager;", "Landroidx/viewpager/widget/ViewPager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "themes_release" }, k = 1, mv = { 1, 7, 1 })
public final class VariableHeightViewPager extends ViewPager
{
    public VariableHeightViewPager(final Context context, final AttributeSet set) {
        e.f((Object)context, "context");
        super(context, set);
    }
    
    public final void onMeasure(final int n, int measureSpec) {
        final androidx.viewpager.widget.a adapter = this.getAdapter();
        if (adapter != null) {
            this.setOffscreenPageLimit(adapter.getCount());
        }
        final Iterator iterator = a.a((ViewGroup)this).iterator();
        int max = 0;
        while (true) {
            final f1 f1 = (f1)iterator;
            if (!f1.hasNext()) {
                break;
            }
            final View view = (View)f1.next();
            view.measure(n, View$MeasureSpec.makeMeasureSpec(0, 0));
            max = Math.max(view.getMeasuredHeight(), max);
        }
        if (max != 0) {
            measureSpec = View$MeasureSpec.makeMeasureSpec(max, 1073741824);
        }
        super.onMeasure(n, measureSpec);
    }
}
