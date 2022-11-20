// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import cg2.j;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import ng2.e;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016R.\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0013" }, d2 = { "Landroidx/appcompat/widget/RedditDrawerCtaToolbar;", "Landroidx/appcompat/widget/Toolbar;", "", "getPaddingRight", "Landroid/view/View;", "value", "c0", "Landroid/view/View;", "getCta", "()Landroid/view/View;", "setCta", "(Landroid/view/View;)V", "cta", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ui_release" }, k = 1, mv = { 1, 7, 1 })
public class RedditDrawerCtaToolbar extends Toolbar
{
    public View c0;
    
    public RedditDrawerCtaToolbar(final Context context, final AttributeSet set) {
        e.f((Object)context, "context");
        e.f((Object)set, "attrs");
        super(context, set);
    }
    
    public final View getCta() {
        return this.c0;
    }
    
    public int getPaddingRight() {
        final View c0 = this.c0;
        Integer value;
        if (c0 != null) {
            final ViewGroup$LayoutParams layoutParams = c0.getLayoutParams();
            e.d((Object)layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
            value = viewGroup$MarginLayoutParams.getMarginEnd() + (viewGroup$MarginLayoutParams.getMarginStart() + c0.getMeasuredWidth());
        }
        else {
            value = null;
        }
        final int paddingRight = super.getPaddingRight();
        int intValue;
        if (value != null) {
            intValue = value;
        }
        else {
            intValue = 0;
        }
        return paddingRight + intValue;
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        final View c0 = this.c0;
        if (c0 != null) {
            final ViewGroup$LayoutParams layoutParams = c0.getLayoutParams();
            e.d((Object)layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            c0.layout(((View)this).getRight() - this.getPaddingRight(), ((View)this).getPaddingTop(), ((View)this).getRight() - super.getPaddingRight() - ((ViewGroup$MarginLayoutParams)layoutParams).getMarginEnd(), ((View)this).getBottom());
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        final View c0 = this.c0;
        if (c0 != null) {
            final ViewGroup$LayoutParams layoutParams = c0.getLayoutParams();
            e.d((Object)layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
            c0.measure(ViewGroup.getChildMeasureSpec(n, viewGroup$MarginLayoutParams.getMarginEnd() + (viewGroup$MarginLayoutParams.getMarginStart() + (super.getPaddingLeft() + super.getPaddingRight())), viewGroup$MarginLayoutParams.width), ViewGroup.getChildMeasureSpec(n2, super.getPaddingTop() + super.getPaddingBottom() + viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin, viewGroup$MarginLayoutParams.height));
        }
        super.onMeasure(n, n2);
    }
    
    public final void setCta(final View c0) {
        if (c0 == null) {
            final View c2 = this.c0;
            if (c2 != null) {
                ((ViewGroup)this).removeView(c2);
            }
        }
        else {
            final ViewGroup$LayoutParams layoutParams = c0.getLayoutParams();
            ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams;
            if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
            }
            else {
                viewGroup$MarginLayoutParams = null;
            }
            Toolbar$g toolbar$g;
            if (viewGroup$MarginLayoutParams != null) {
                toolbar$g = new Toolbar$g(viewGroup$MarginLayoutParams);
            }
            else {
                toolbar$g = new Toolbar$g(c0.getLayoutParams());
            }
            toolbar$g.b = 1;
            final j a = j.a;
            ((ViewGroup)this).addView(c0, (ViewGroup$LayoutParams)toolbar$g);
        }
        this.c0 = c0;
        ((View)this).requestLayout();
    }
}
