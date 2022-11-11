// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.button;

import android.widget.TextView;
import android.view.ViewGroup;
import b4.c$b;
import android.view.accessibility.AccessibilityNodeInfo;
import tf.c;
import tf.j$a;
import java.util.List;
import java.util.TreeMap;
import android.graphics.Canvas;
import java.util.Iterator;
import android.util.Log;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import a4.j;
import android.widget.LinearLayout$LayoutParams;
import android.text.TextUtils$TruncateAt;
import a4.q0$e;
import a4.t1;
import java.util.WeakHashMap;
import android.content.res.TypedArray;
import a4.q0$d;
import a4.q0;
import of.g;
import pd.r;
import android.view.View;
import java.util.Comparator;
import yf.a;
import android.util.AttributeSet;
import android.content.Context;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import android.widget.LinearLayout;

public class MaterialButtonToggleGroup extends LinearLayout
{
    public final ArrayList f;
    public final MaterialButtonToggleGroup.MaterialButtonToggleGroup$c g;
    public final MaterialButtonToggleGroup.MaterialButtonToggleGroup$f h;
    public final LinkedHashSet<e> i;
    public final MaterialButtonToggleGroup$a j;
    public Integer[] k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    
    public MaterialButtonToggleGroup(final Context context, final AttributeSet set) {
        super(a.a(context, set, 2130969383, 2132018123), set, 2130969383);
        this.f = new ArrayList();
        this.g = new MaterialButtonToggleGroup.MaterialButtonToggleGroup$c(this);
        this.h = new MaterialButtonToggleGroup.MaterialButtonToggleGroup$f(this);
        this.i = new LinkedHashSet<e>();
        this.j = new Comparator<MaterialButton>() {
            @Override
            public final int compare(final Object o, final Object o2) {
                final MaterialButton materialButton = (MaterialButton)o;
                final MaterialButton materialButton2 = (MaterialButton)o2;
                int n = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
                if (n == 0) {
                    n = Boolean.valueOf(((View)materialButton).isPressed()).compareTo(Boolean.valueOf(((View)materialButton2).isPressed()));
                    if (n == 0) {
                        n = Integer.valueOf(((ViewGroup)MaterialButtonToggleGroup.this).indexOfChild((View)materialButton)).compareTo(((ViewGroup)MaterialButtonToggleGroup.this).indexOfChild((View)materialButton2));
                    }
                }
                return n;
            }
        };
        this.l = false;
        final TypedArray d = of.g.d(((View)this).getContext(), set, r.F, 2130969383, 2132018123, new int[0]);
        this.setSingleSelection(d.getBoolean(2, false));
        this.o = d.getResourceId(0, -1);
        this.n = d.getBoolean(1, false);
        ((ViewGroup)this).setChildrenDrawingOrderEnabled(true);
        d.recycle();
        final WeakHashMap<View, t1> a = q0.a;
        q0$d.s((View)this, 1);
    }
    
    private int getFirstVisibleChildIndex() {
        for (int childCount = ((ViewGroup)this).getChildCount(), i = 0; i < childCount; ++i) {
            if (this.d(i)) {
                return i;
            }
        }
        return -1;
    }
    
    private int getLastVisibleChildIndex() {
        for (int i = ((ViewGroup)this).getChildCount() - 1; i >= 0; --i) {
            if (this.d(i)) {
                return i;
            }
        }
        return -1;
    }
    
    private int getVisibleButtonCount() {
        int i = 0;
        int n = 0;
        while (i < ((ViewGroup)this).getChildCount()) {
            int n2 = n;
            if (((ViewGroup)this).getChildAt(i) instanceof MaterialButton) {
                n2 = n;
                if (this.d(i)) {
                    n2 = n + 1;
                }
            }
            ++i;
            n = n2;
        }
        return n;
    }
    
    private void setCheckedId(final int o) {
        this.b(this.o = o, true);
    }
    
    private void setGeneratedIdIfNeeded(final MaterialButton materialButton) {
        if (((View)materialButton).getId() == -1) {
            final WeakHashMap<View, t1> a = q0.a;
            ((View)materialButton).setId(q0$e.a());
        }
    }
    
    private void setupButtonChild(final MaterialButton materialButton) {
        ((TextView)materialButton).setMaxLines(1);
        ((TextView)materialButton).setEllipsize(TextUtils$TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.j.add(this.g);
        materialButton.setOnPressedChangeListenerInternal((MaterialButton$b)this.h);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }
    
    public final void a() {
        final int firstVisibleChildIndex = this.getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < ((ViewGroup)this).getChildCount(); ++i) {
            final MaterialButton c = this.c(i);
            final int min = Math.min(c.getStrokeWidth(), this.c(i - 1).getStrokeWidth());
            final ViewGroup$LayoutParams layoutParams = ((View)c).getLayoutParams();
            LinearLayout$LayoutParams layoutParams2;
            if (layoutParams instanceof LinearLayout$LayoutParams) {
                layoutParams2 = (LinearLayout$LayoutParams)layoutParams;
            }
            else {
                layoutParams2 = new LinearLayout$LayoutParams(layoutParams.width, layoutParams.height);
            }
            if (this.getOrientation() == 0) {
                a4.j.g((ViewGroup$MarginLayoutParams)layoutParams2, 0);
                a4.j.h((ViewGroup$MarginLayoutParams)layoutParams2, -min);
            }
            else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -min;
            }
            ((View)c).setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
        }
        if (((ViewGroup)this).getChildCount() != 0) {
            if (firstVisibleChildIndex != -1) {
                final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)((View)this.c(firstVisibleChildIndex)).getLayoutParams();
                if (this.getOrientation() == 1) {
                    linearLayout$LayoutParams.topMargin = 0;
                    linearLayout$LayoutParams.bottomMargin = 0;
                }
                else {
                    a4.j.g((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams, 0);
                    a4.j.h((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams, 0);
                    linearLayout$LayoutParams.leftMargin = 0;
                    linearLayout$LayoutParams.rightMargin = 0;
                }
            }
        }
    }
    
    public final void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MaterialButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, n, viewGroup$LayoutParams);
        final MaterialButton generatedIdIfNeeded = (MaterialButton)view;
        this.setGeneratedIdIfNeeded(generatedIdIfNeeded);
        this.setupButtonChild(generatedIdIfNeeded);
        if (generatedIdIfNeeded.isChecked()) {
            this.f(((View)generatedIdIfNeeded).getId(), true);
            this.setCheckedId(((View)generatedIdIfNeeded).getId());
        }
        final tf.j shapeAppearanceModel = generatedIdIfNeeded.getShapeAppearanceModel();
        this.f.add(new d(shapeAppearanceModel.e, shapeAppearanceModel.h, shapeAppearanceModel.f, shapeAppearanceModel.g));
        q0.l((View)generatedIdIfNeeded, (a4.a)new MaterialButtonToggleGroup$b(this));
    }
    
    public final void b(final int n, final boolean b) {
        final Iterator<Object> iterator = this.i.iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
        }
    }
    
    public final MaterialButton c(final int n) {
        return (MaterialButton)((ViewGroup)this).getChildAt(n);
    }
    
    public final boolean d(final int n) {
        return ((ViewGroup)this).getChildAt(n).getVisibility() != 8;
    }
    
    public final void dispatchDraw(final Canvas canvas) {
        final TreeMap treeMap = new TreeMap((Comparator<? super K>)this.j);
        for (int childCount = ((ViewGroup)this).getChildCount(), i = 0; i < childCount; ++i) {
            treeMap.put(this.c(i), i);
        }
        this.k = (Integer[])treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }
    
    public final void e(final int n, final boolean checked) {
        final View viewById = ((View)this).findViewById(n);
        if (viewById instanceof MaterialButton) {
            this.l = true;
            ((MaterialButton)viewById).setChecked(checked);
            this.l = false;
        }
    }
    
    public final boolean f(int intValue, final boolean b) {
        final List<Integer> checkedButtonIds = this.getCheckedButtonIds();
        if (this.n && checkedButtonIds.isEmpty()) {
            this.e(intValue, true);
            this.o = intValue;
            return false;
        }
        if (b && this.m) {
            checkedButtonIds.remove((Object)intValue);
            final Iterator iterator = checkedButtonIds.iterator();
            while (iterator.hasNext()) {
                intValue = (int)iterator.next();
                this.e(intValue, false);
                this.b(intValue, false);
            }
        }
        return true;
    }
    
    public final void g() {
        final int childCount = ((ViewGroup)this).getChildCount();
        final int firstVisibleChildIndex = this.getFirstVisibleChildIndex();
        final int lastVisibleChildIndex = this.getLastVisibleChildIndex();
        for (int i = 0; i < childCount; ++i) {
            final MaterialButton c = this.c(i);
            if (((View)c).getVisibility() != 8) {
                final tf.j shapeAppearanceModel = c.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                final j$a j$a = new j$a(shapeAppearanceModel);
                d d = this.f.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    final boolean b = this.getOrientation() == 0;
                    if (i == firstVisibleChildIndex) {
                        if (b) {
                            if (of.j.b((View)this)) {
                                final tf.a e = MaterialButtonToggleGroup.d.e;
                                d = new d((c)e, (c)e, d.b, d.c);
                            }
                            else {
                                final c a = d.a;
                                final c d2 = d.d;
                                final tf.a e2 = MaterialButtonToggleGroup.d.e;
                                d = new d(a, d2, (c)e2, (c)e2);
                            }
                        }
                        else {
                            final c a2 = d.a;
                            final tf.a e3 = MaterialButtonToggleGroup.d.e;
                            d = new d(a2, (c)e3, d.b, (c)e3);
                        }
                    }
                    else if (i == lastVisibleChildIndex) {
                        if (b) {
                            if (of.j.b((View)this)) {
                                final c a3 = d.a;
                                final c d3 = d.d;
                                final tf.a e4 = MaterialButtonToggleGroup.d.e;
                                d = new d(a3, d3, (c)e4, (c)e4);
                            }
                            else {
                                final tf.a e5 = MaterialButtonToggleGroup.d.e;
                                d = new d((c)e5, (c)e5, d.b, d.c);
                            }
                        }
                        else {
                            final tf.a e6 = MaterialButtonToggleGroup.d.e;
                            d = new d((c)e6, d.d, (c)e6, d.c);
                        }
                    }
                    else {
                        d = null;
                    }
                }
                if (d == null) {
                    j$a.b(0.0f);
                }
                else {
                    j$a.e = d.a;
                    j$a.h = d.d;
                    j$a.f = d.b;
                    j$a.g = d.c;
                }
                c.setShapeAppearanceModel(new tf.j(j$a));
            }
        }
    }
    
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }
    
    public int getCheckedButtonId() {
        int o;
        if (this.m) {
            o = this.o;
        }
        else {
            o = -1;
        }
        return o;
    }
    
    public List<Integer> getCheckedButtonIds() {
        final ArrayList list = new ArrayList();
        for (int i = 0; i < ((ViewGroup)this).getChildCount(); ++i) {
            final MaterialButton c = this.c(i);
            if (c.isChecked()) {
                list.add(((View)c).getId());
            }
        }
        return list;
    }
    
    public final int getChildDrawingOrder(final int n, final int n2) {
        final Integer[] k = this.k;
        if (k != null && n2 < k.length) {
            return k[n2];
        }
        Log.w("MaterialButtonToggleGroup", "Child order wasn't updated");
        return n2;
    }
    
    public final void onFinishInflate() {
        super.onFinishInflate();
        final int o = this.o;
        if (o != -1) {
            this.e(o, true);
            this.f(o, true);
            this.setCheckedId(o);
        }
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        final b4.c c = new b4.c(accessibilityNodeInfo);
        final int visibleButtonCount = this.getVisibleButtonCount();
        int n;
        if (this.m) {
            n = 1;
        }
        else {
            n = 2;
        }
        c.o(c$b.a(1, visibleButtonCount, n, false));
    }
    
    public final void onMeasure(final int n, final int n2) {
        this.g();
        this.a();
        super.onMeasure(n, n2);
    }
    
    public final void onViewRemoved(final View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            final MaterialButton materialButton = (MaterialButton)view;
            materialButton.j.remove(this.g);
            materialButton.setOnPressedChangeListenerInternal((MaterialButton$b)null);
        }
        final int indexOfChild = ((ViewGroup)this).indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f.remove(indexOfChild);
        }
        this.g();
        this.a();
    }
    
    public void setSelectionRequired(final boolean n) {
        this.n = n;
    }
    
    public void setSingleSelection(final int n) {
        this.setSingleSelection(((View)this).getResources().getBoolean(n));
    }
    
    public void setSingleSelection(final boolean m) {
        if (this.m != m) {
            this.m = m;
            this.l = true;
            for (int i = 0; i < ((ViewGroup)this).getChildCount(); ++i) {
                final MaterialButton c = this.c(i);
                c.setChecked(false);
                this.b(((View)c).getId(), false);
            }
            this.l = false;
            this.setCheckedId(-1);
        }
    }
    
    public static final class d
    {
        public static final tf.a e;
        public c a;
        public c b;
        public c c;
        public c d;
        
        static {
            e = new tf.a(0.0f);
        }
        
        public d(final c a, final c d, final c b, final c c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
    
    public interface e
    {
        void a();
    }
}
