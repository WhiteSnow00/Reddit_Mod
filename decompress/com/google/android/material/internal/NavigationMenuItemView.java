// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.internal;

import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.graphics.drawable.Drawable$ConstantState;
import android.widget.TextView;
import e4.j$b;
import p3.f;
import java.util.WeakHashMap;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.d1;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.TypedValue;
import android.view.ViewStub;
import a4.p0;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import b4.c;
import android.view.View;
import a4.a;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import androidx.appcompat.view.menu.g;
import android.widget.FrameLayout;
import android.widget.CheckedTextView;
import androidx.appcompat.view.menu.j$a;
import qf.d;

public class NavigationMenuItemView extends d implements j$a
{
    public static final int[] v;
    public int l;
    public boolean m;
    public boolean n;
    public final CheckedTextView o;
    public FrameLayout p;
    public g q;
    public ColorStateList r;
    public boolean s;
    public Drawable t;
    public final NavigationMenuItemView$a u;
    
    static {
        v = new int[] { 16842912 };
    }
    
    public NavigationMenuItemView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public NavigationMenuItemView(final Context context, final AttributeSet set, final int n) {
        super(context, set, 0);
        final a4.a u = new a4.a() {
            @Override
            public final void onInitializeAccessibilityNodeInfo(final View view, final c c) {
                super.onInitializeAccessibilityNodeInfo(view, c);
                c.a.setCheckable(NavigationMenuItemView.this.n);
            }
        };
        this.u = u;
        this.setOrientation(0);
        LayoutInflater.from(context).inflate(2131624192, (ViewGroup)this, true);
        this.setIconSize(context.getResources().getDimensionPixelSize(2131165631));
        final CheckedTextView o = (CheckedTextView)((View)this).findViewById(2131428684);
        ((View)(this.o = o)).setDuplicateParentStateEnabled(true);
        p0.l((View)o, (a4.a)u);
    }
    
    private void setActionView(final View view) {
        if (view != null) {
            if (this.p == null) {
                this.p = (FrameLayout)((ViewStub)((View)this).findViewById(2131428683)).inflate();
            }
            ((ViewGroup)this.p).removeAllViews();
            ((ViewGroup)this.p).addView(view);
        }
    }
    
    public final void b(g q) {
        this.q = q;
        final int a = q.a;
        if (a > 0) {
            ((View)this).setId(a);
        }
        int visibility;
        if (q.isVisible()) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)this).setVisibility(visibility);
        final Drawable background = ((View)this).getBackground();
        boolean b = true;
        if (background == null) {
            final TypedValue typedValue = new TypedValue();
            StateListDrawable stateListDrawable;
            if (((View)this).getContext().getTheme().resolveAttribute(2130968820, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(NavigationMenuItemView.v, (Drawable)new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, (Drawable)new ColorDrawable(0));
            }
            else {
                stateListDrawable = null;
            }
            final WeakHashMap a2 = p0.a;
            p0.d.q((View)this, (Drawable)stateListDrawable);
        }
        this.setCheckable(q.isCheckable());
        this.setChecked(q.isChecked());
        ((View)this).setEnabled(q.isEnabled());
        this.setTitle(q.e);
        this.setIcon(q.getIcon());
        this.setActionView(q.getActionView());
        ((View)this).setContentDescription(q.q);
        d1.a((View)this, q.r);
        q = this.q;
        if (q.e != null || q.getIcon() != null || this.q.getActionView() == null) {
            b = false;
        }
        if (b) {
            this.o.setVisibility(8);
            final FrameLayout p = this.p;
            if (p != null) {
                final a layoutParams = (a)((View)p).getLayoutParams();
                layoutParams.width = -1;
                ((View)this.p).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            }
        }
        else {
            this.o.setVisibility(0);
            final FrameLayout p2 = this.p;
            if (p2 != null) {
                final a layoutParams2 = (a)((View)p2).getLayoutParams();
                layoutParams2.width = -2;
                ((View)this.p).setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
            }
        }
    }
    
    public g getItemData() {
        return this.q;
    }
    
    public final int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 1);
        final g q = this.q;
        if (q != null && q.isCheckable() && this.q.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, NavigationMenuItemView.v);
        }
        return onCreateDrawableState;
    }
    
    public void setCheckable(final boolean n) {
        ((View)this).refreshDrawableState();
        if (this.n != n) {
            this.n = n;
            this.u.sendAccessibilityEvent((View)this.o, 2048);
        }
    }
    
    public void setChecked(final boolean checked) {
        ((View)this).refreshDrawableState();
        this.o.setChecked(checked);
    }
    
    public void setHorizontalPadding(final int n) {
        ((View)this).setPadding(n, 0, n, 0);
    }
    
    public void setIcon(Drawable t) {
        if (t != null) {
            Drawable mutate = t;
            if (this.s) {
                final Drawable$ConstantState constantState = t.getConstantState();
                if (constantState != null) {
                    t = constantState.newDrawable();
                }
                mutate = t.mutate();
                r3.a.b.h(mutate, this.r);
            }
            final int l = this.l;
            mutate.setBounds(0, 0, l, l);
            t = mutate;
        }
        else if (this.m) {
            if (this.t == null) {
                final Resources resources = ((View)this).getResources();
                final Resources$Theme theme = ((View)this).getContext().getTheme();
                final ThreadLocal<TypedValue> a = p3.f.a;
                t = p3.f.a.a(resources, 2131232699, theme);
                if ((this.t = t) != null) {
                    final int i = this.l;
                    t.setBounds(0, 0, i, i);
                }
            }
            t = this.t;
        }
        j$b.e((TextView)this.o, t, (Drawable)null, (Drawable)null, (Drawable)null);
    }
    
    public void setIconPadding(final int compoundDrawablePadding) {
        ((TextView)this.o).setCompoundDrawablePadding(compoundDrawablePadding);
    }
    
    public void setIconSize(final int l) {
        this.l = l;
    }
    
    public void setIconTintList(final ColorStateList r) {
        this.r = r;
        this.s = (r != null);
        final g q = this.q;
        if (q != null) {
            this.setIcon(q.getIcon());
        }
    }
    
    public void setMaxLines(final int maxLines) {
        ((TextView)this.o).setMaxLines(maxLines);
    }
    
    public void setNeedsEmptyIcon(final boolean m) {
        this.m = m;
    }
    
    public void setTextAppearance(final int textAppearance) {
        ((TextView)this.o).setTextAppearance(textAppearance);
    }
    
    public void setTextColor(final ColorStateList textColor) {
        ((TextView)this.o).setTextColor(textColor);
    }
    
    public void setTitle(final CharSequence text) {
        ((TextView)this.o).setText(text);
    }
}
