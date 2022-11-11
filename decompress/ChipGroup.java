// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.chip;

import android.widget.CompoundButton;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import b4.c$b;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;
import android.view.ViewGroup$LayoutParams;
import java.util.WeakHashMap;
import android.content.res.TypedArray;
import android.view.View;
import a4.p0;
import android.view.ViewGroup$OnHierarchyChangeListener;
import qf.g;
import pj2.u;
import ag.a;
import android.util.AttributeSet;
import android.content.Context;
import qf.c;

public class ChipGroup extends c
{
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public final ChipGroup.ChipGroup$a n;
    public ChipGroup.ChipGroup$d o;
    public int p;
    public boolean q;
    
    public ChipGroup(final Context context, final AttributeSet set) {
        super(a.a(context, set, 2130968772, 2132018117), set, 2130968772);
        this.n = new ChipGroup.ChipGroup$a(this);
        this.o = new ChipGroup.ChipGroup$d(this);
        this.p = -1;
        this.q = false;
        final TypedArray d = g.d(((View)this).getContext(), set, u.u, 2130968772, 2132018117, new int[0]);
        final int dimensionPixelOffset = d.getDimensionPixelOffset(1, 0);
        this.setChipSpacingHorizontal(d.getDimensionPixelOffset(2, dimensionPixelOffset));
        this.setChipSpacingVertical(d.getDimensionPixelOffset(3, dimensionPixelOffset));
        this.setSingleLine(d.getBoolean(5, false));
        this.setSingleSelection(d.getBoolean(6, false));
        this.setSelectionRequired(d.getBoolean(4, false));
        final int resourceId = d.getResourceId(0, -1);
        if (resourceId != -1) {
            this.p = resourceId;
        }
        d.recycle();
        super.setOnHierarchyChangeListener((ViewGroup$OnHierarchyChangeListener)this.o);
        final WeakHashMap a = p0.a;
        p0.d.s((View)this, 1);
    }
    
    private int getChipCount() {
        int i = 0;
        int n = 0;
        while (i < ((ViewGroup)this).getChildCount()) {
            int n2 = n;
            if (((ViewGroup)this).getChildAt(i) instanceof Chip) {
                n2 = n + 1;
            }
            ++i;
            n = n2;
        }
        return n;
    }
    
    private void setCheckedId(final int p) {
        this.p = p;
    }
    
    public final boolean a() {
        return super.h;
    }
    
    public final void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (view instanceof Chip) {
            final Chip chip = (Chip)view;
            if (((CompoundButton)chip).isChecked()) {
                final int p3 = this.p;
                if (p3 != -1 && this.l) {
                    this.c(p3, false);
                }
                this.setCheckedId(((View)chip).getId());
            }
        }
        super.addView(view, n, viewGroup$LayoutParams);
    }
    
    public final void c(final int n, final boolean checked) {
        final View viewById = ((View)this).findViewById(n);
        if (viewById instanceof Chip) {
            this.q = true;
            ((Chip)viewById).setChecked(checked);
            this.q = false;
        }
    }
    
    public final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return super.checkLayoutParams(viewGroup$LayoutParams) && viewGroup$LayoutParams instanceof ChipGroup.ChipGroup$b;
    }
    
    public final ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new ChipGroup.ChipGroup$b();
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new ChipGroup.ChipGroup$b(((View)this).getContext(), set);
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new ChipGroup.ChipGroup$b(viewGroup$LayoutParams);
    }
    
    public int getCheckedChipId() {
        int p;
        if (this.l) {
            p = this.p;
        }
        else {
            p = -1;
        }
        return p;
    }
    
    public List<Integer> getCheckedChipIds() {
        final ArrayList list = new ArrayList();
        for (int i = 0; i < ((ViewGroup)this).getChildCount(); ++i) {
            final View child = ((ViewGroup)this).getChildAt(i);
            if (child instanceof Chip && ((CompoundButton)child).isChecked()) {
                list.add(child.getId());
                if (this.l) {
                    return list;
                }
            }
        }
        return list;
    }
    
    public int getChipSpacingHorizontal() {
        return this.j;
    }
    
    public int getChipSpacingVertical() {
        return this.k;
    }
    
    public final void onFinishInflate() {
        super.onFinishInflate();
        final int p = this.p;
        if (p != -1) {
            this.c(p, true);
            this.setCheckedId(this.p);
        }
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        final b4.c c = new b4.c(accessibilityNodeInfo);
        int chipCount;
        if (super.h) {
            chipCount = this.getChipCount();
        }
        else {
            chipCount = -1;
        }
        final int rowCount = this.getRowCount();
        int n;
        if (this.l) {
            n = 1;
        }
        else {
            n = 2;
        }
        c.o(c$b.a(rowCount, chipCount, n, false));
    }
    
    public void setChipSpacing(final int n) {
        this.setChipSpacingHorizontal(n);
        this.setChipSpacingVertical(n);
    }
    
    public void setChipSpacingHorizontal(final int j) {
        if (this.j != j) {
            this.setItemSpacing(this.j = j);
            ((View)this).requestLayout();
        }
    }
    
    public void setChipSpacingHorizontalResource(final int n) {
        this.setChipSpacingHorizontal(((View)this).getResources().getDimensionPixelOffset(n));
    }
    
    public void setChipSpacingResource(final int n) {
        this.setChipSpacing(((View)this).getResources().getDimensionPixelOffset(n));
    }
    
    public void setChipSpacingVertical(final int k) {
        if (this.k != k) {
            this.setLineSpacing(this.k = k);
            ((View)this).requestLayout();
        }
    }
    
    public void setChipSpacingVerticalResource(final int n) {
        this.setChipSpacingVertical(((View)this).getResources().getDimensionPixelOffset(n));
    }
    
    @Deprecated
    public void setDividerDrawableHorizontal(final Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }
    
    @Deprecated
    public void setDividerDrawableVertical(final Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }
    
    @Deprecated
    public void setFlexWrap(final int n) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }
    
    public void setOnCheckedChangeListener(final ChipGroup.ChipGroup$c chipGroup$c) {
    }
    
    public void setOnHierarchyChangeListener(final ViewGroup$OnHierarchyChangeListener f) {
        this.o.f = f;
    }
    
    public void setSelectionRequired(final boolean m) {
        this.m = m;
    }
    
    @Deprecated
    public void setShowDividerHorizontal(final int n) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }
    
    @Deprecated
    public void setShowDividerVertical(final int n) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }
    
    public void setSingleLine(final int n) {
        this.setSingleLine(((View)this).getResources().getBoolean(n));
    }
    
    public void setSingleLine(final boolean singleLine) {
        super.setSingleLine(singleLine);
    }
    
    public void setSingleSelection(final int n) {
        this.setSingleSelection(((View)this).getResources().getBoolean(n));
    }
    
    public void setSingleSelection(final boolean l) {
        if (this.l != l) {
            this.l = l;
            this.q = true;
            for (int i = 0; i < ((ViewGroup)this).getChildCount(); ++i) {
                final View child = ((ViewGroup)this).getChildAt(i);
                if (child instanceof Chip) {
                    ((Chip)child).setChecked(false);
                }
            }
            this.q = false;
            this.setCheckedId(-1);
        }
    }
}
