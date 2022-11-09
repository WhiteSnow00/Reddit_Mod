// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import l.f;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$MarginLayoutParams;
import android.text.TextUtils;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.i;
import android.view.ViewGroup$LayoutParams;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import k.b;
import java.util.WeakHashMap;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import a4.p0;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.view.View;

public class ActionBarContextView extends a
{
    public CharSequence n;
    public CharSequence o;
    public View p;
    public View q;
    public View r;
    public LinearLayout s;
    public TextView t;
    public TextView u;
    public int v;
    public int w;
    public boolean x;
    public int y;
    
    public ActionBarContextView(final Context context, final AttributeSet set) {
        super(context, set, 2130968607);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, gn.a.T, 2130968607, 0);
        final z0 z0 = new z0(context, obtainStyledAttributes);
        final Drawable e = z0.e(0);
        final WeakHashMap a = p0.a;
        p0.d.q((View)this, e);
        this.v = z0.i(5, 0);
        this.w = z0.i(4, 0);
        super.j = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.y = z0.i(2, 2131623991);
        z0.n();
    }
    
    public final void f(final b b) {
        final View p = this.p;
        if (p == null) {
            this.addView(this.p = LayoutInflater.from(((View)this).getContext()).inflate(this.y, (ViewGroup)this, false));
        }
        else if (p.getParent() == null) {
            this.addView(this.p);
        }
        (this.q = this.p.findViewById(2131427495)).setOnClickListener((View$OnClickListener)new ActionBarContextView$a(b));
        final MenuBuilder e = b.e();
        final c i = super.i;
        if (i != null) {
            i.h();
            final c.a z = i.z;
            if (z != null && z.b()) {
                ((f)z.j).dismiss();
            }
        }
        final c j = new c(((View)this).getContext());
        super.i = j;
        j.r = true;
        j.s = true;
        final ViewGroup$LayoutParams viewGroup$LayoutParams = new ViewGroup$LayoutParams(-2, -1);
        e.addMenuPresenter((i)super.i, super.g);
        final c k = super.i;
        final j m = ((androidx.appcompat.view.menu.a)k).m;
        if (m == null) {
            (((androidx.appcompat.view.menu.a)k).m = (j)((androidx.appcompat.view.menu.a)k).i.inflate(((androidx.appcompat.view.menu.a)k).k, (ViewGroup)this, false)).a(((androidx.appcompat.view.menu.a)k).h);
            k.k();
        }
        final j l = ((androidx.appcompat.view.menu.a)k).m;
        if (m != l) {
            ((ActionMenuView)l).setPresenter(k);
        }
        final ActionMenuView h = (ActionMenuView)l;
        super.h = h;
        final WeakHashMap a = p0.a;
        p0.d.q((View)h, null);
        this.addView((View)super.h, viewGroup$LayoutParams);
    }
    
    public final void g() {
        if (this.s == null) {
            LayoutInflater.from(((View)this).getContext()).inflate(2131623986, (ViewGroup)this);
            final LinearLayout s = (LinearLayout)this.getChildAt(this.getChildCount() - 1);
            this.s = s;
            this.t = (TextView)((View)s).findViewById(2131427437);
            this.u = (TextView)((View)this.s).findViewById(2131427436);
            if (this.v != 0) {
                this.t.setTextAppearance(((View)this).getContext(), this.v);
            }
            if (this.w != 0) {
                this.u.setTextAppearance(((View)this).getContext(), this.w);
            }
        }
        this.t.setText(this.n);
        this.u.setText(this.o);
        final boolean empty = TextUtils.isEmpty(this.n);
        final boolean b = TextUtils.isEmpty(this.o) ^ true;
        final TextView u = this.u;
        final int n = 0;
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)u).setVisibility(visibility);
        final LinearLayout s2 = this.s;
        int visibility2 = n;
        if (!(empty ^ true)) {
            if (b) {
                visibility2 = n;
            }
            else {
                visibility2 = 8;
            }
        }
        ((View)s2).setVisibility(visibility2);
        if (((View)this.s).getParent() == null) {
            this.addView((View)this.s);
        }
    }
    
    public final ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new ViewGroup$MarginLayoutParams(-1, -2);
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new ViewGroup$MarginLayoutParams(((View)this).getContext(), set);
    }
    
    public CharSequence getSubtitle() {
        return this.o;
    }
    
    public CharSequence getTitle() {
        return this.n;
    }
    
    public final void h() {
        this.removeAllViews();
        this.r = null;
        super.h = null;
        super.i = null;
        final View q = this.q;
        if (q != null) {
            q.setOnClickListener((View$OnClickListener)null);
        }
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final c i = super.i;
        if (i != null) {
            i.h();
            final c.a z = super.i.z;
            if (z != null && z.b()) {
                ((f)z.j).dismiss();
            }
        }
    }
    
    public final void onLayout(final boolean b, int paddingLeft, int n, final int n2, int n3) {
        final boolean a = i1.a((View)this);
        int paddingLeft2;
        if (a) {
            paddingLeft2 = n2 - paddingLeft - ((View)this).getPaddingRight();
        }
        else {
            paddingLeft2 = ((View)this).getPaddingLeft();
        }
        final int paddingTop = ((View)this).getPaddingTop();
        final int n4 = n3 - n - ((View)this).getPaddingTop() - ((View)this).getPaddingBottom();
        final View p5 = this.p;
        n = paddingLeft2;
        if (p5 != null) {
            n = paddingLeft2;
            if (p5.getVisibility() != 8) {
                final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)this.p.getLayoutParams();
                if (a) {
                    n3 = viewGroup$MarginLayoutParams.rightMargin;
                }
                else {
                    n3 = viewGroup$MarginLayoutParams.leftMargin;
                }
                if (a) {
                    n = viewGroup$MarginLayoutParams.leftMargin;
                }
                else {
                    n = viewGroup$MarginLayoutParams.rightMargin;
                }
                if (a) {
                    n3 = paddingLeft2 - n3;
                }
                else {
                    n3 += paddingLeft2;
                }
                n3 += androidx.appcompat.widget.a.d(this.p, a, n3, paddingTop, n4);
                if (a) {
                    n = n3 - n;
                }
                else {
                    n += n3;
                }
            }
        }
        final LinearLayout s = this.s;
        n3 = n;
        if (s != null) {
            n3 = n;
            if (this.r == null) {
                n3 = n;
                if (((View)s).getVisibility() != 8) {
                    n3 = n + androidx.appcompat.widget.a.d((View)this.s, a, n, paddingTop, n4);
                }
            }
        }
        final View r = this.r;
        if (r != null) {
            androidx.appcompat.widget.a.d(r, a, n3, paddingTop, n4);
        }
        if (a) {
            paddingLeft = ((View)this).getPaddingLeft();
        }
        else {
            paddingLeft = n2 - paddingLeft - ((View)this).getPaddingRight();
        }
        final ActionMenuView h = super.h;
        if (h != null) {
            androidx.appcompat.widget.a.d((View)h, a ^ true, paddingLeft, paddingTop, n4);
        }
    }
    
    public final void onMeasure(int i, int n) {
        final int mode = View$MeasureSpec.getMode(i);
        final int n2 = 1073741824;
        if (mode != 1073741824) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.getClass().getSimpleName());
            sb.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(sb.toString());
        }
        if (View$MeasureSpec.getMode(n) != 0) {
            final int size = View$MeasureSpec.getSize(i);
            int n3 = super.j;
            if (n3 <= 0) {
                n3 = View$MeasureSpec.getSize(n);
            }
            i = ((View)this).getPaddingTop();
            final int n4 = ((View)this).getPaddingBottom() + i;
            i = size - ((View)this).getPaddingLeft() - ((View)this).getPaddingRight();
            final int n5 = n3 - n4;
            final int measureSpec = View$MeasureSpec.makeMeasureSpec(n5, Integer.MIN_VALUE);
            final View p2 = this.p;
            final int n6 = 0;
            n = i;
            if (p2 != null) {
                i = a.c(p2, i, measureSpec);
                final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)this.p.getLayoutParams();
                n = i - (viewGroup$MarginLayoutParams.leftMargin + viewGroup$MarginLayoutParams.rightMargin);
            }
            final ActionMenuView h = super.h;
            i = n;
            if (h != null) {
                i = n;
                if (((View)h).getParent() == this) {
                    i = a.c((View)super.h, n, measureSpec);
                }
            }
            final LinearLayout s = this.s;
            n = i;
            if (s != null) {
                n = i;
                if (this.r == null) {
                    if (this.x) {
                        n = View$MeasureSpec.makeMeasureSpec(0, 0);
                        ((View)this.s).measure(n, measureSpec);
                        final int measuredWidth = ((View)this.s).getMeasuredWidth();
                        final boolean b = measuredWidth <= i;
                        n = i;
                        if (b) {
                            n = i - measuredWidth;
                        }
                        final LinearLayout s2 = this.s;
                        if (b) {
                            i = 0;
                        }
                        else {
                            i = 8;
                        }
                        ((View)s2).setVisibility(i);
                    }
                    else {
                        n = a.c((View)s, i, measureSpec);
                    }
                }
            }
            final View r = this.r;
            if (r != null) {
                final ViewGroup$LayoutParams layoutParams = r.getLayoutParams();
                final int width = layoutParams.width;
                if (width != -2) {
                    i = 1073741824;
                }
                else {
                    i = Integer.MIN_VALUE;
                }
                int min = n;
                if (width >= 0) {
                    min = Math.min(width, n);
                }
                final int height = layoutParams.height;
                if (height != -2) {
                    n = n2;
                }
                else {
                    n = Integer.MIN_VALUE;
                }
                int min2 = n5;
                if (height >= 0) {
                    min2 = Math.min(height, n5);
                }
                this.r.measure(View$MeasureSpec.makeMeasureSpec(min, i), View$MeasureSpec.makeMeasureSpec(min2, n));
            }
            if (super.j <= 0) {
                final int childCount = this.getChildCount();
                n = 0;
                int n7;
                int n8;
                for (i = n6; i < childCount; ++i, n = n8) {
                    n7 = this.getChildAt(i).getMeasuredHeight() + n4;
                    if (n7 > (n8 = n)) {
                        n8 = n7;
                    }
                }
                ((View)this).setMeasuredDimension(size, n);
            }
            else {
                ((View)this).setMeasuredDimension(size, n3);
            }
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(this.getClass().getSimpleName());
        sb2.append(" can only be used with android:layout_height=\"wrap_content\"");
        throw new IllegalStateException(sb2.toString());
    }
    
    @Override
    public void setContentHeight(final int j) {
        super.j = j;
    }
    
    public void setCustomView(final View r) {
        final View r2 = this.r;
        if (r2 != null) {
            this.removeView(r2);
        }
        if ((this.r = r) != null) {
            final LinearLayout s = this.s;
            if (s != null) {
                this.removeView((View)s);
                this.s = null;
            }
        }
        if (r != null) {
            this.addView(r);
        }
        ((View)this).requestLayout();
    }
    
    public void setSubtitle(final CharSequence o) {
        this.o = o;
        this.g();
    }
    
    public void setTitle(final CharSequence n) {
        this.n = n;
        this.g();
        p0.m((View)this, n);
    }
    
    public void setTitleOptional(final boolean x) {
        if (x != this.x) {
            ((View)this).requestLayout();
        }
        this.x = x;
    }
    
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
