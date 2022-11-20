// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.content.Context;
import android.view.View;
import android.util.AttributeSet;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;

public final class c extends ViewGroup
{
    public b f;
    
    public final ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new a();
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new a(((View)this).getContext(), set);
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new ConstraintLayout.a(viewGroup$LayoutParams);
    }
    
    public b getConstraintSet() {
        if (this.f == null) {
            this.f = new b();
        }
        final b f = this.f;
        f.getClass();
        final int childCount = this.getChildCount();
        f.a.clear();
        for (int i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final a a = (a)child.getLayoutParams();
            final int id = child.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!f.a.containsKey(id)) {
                f.a.put(id, new b.a());
            }
            final b.a a2 = f.a.get(id);
            if (child instanceof androidx.constraintlayout.widget.a) {
                final androidx.constraintlayout.widget.a a3 = (androidx.constraintlayout.widget.a)child;
                a2.c(id, a);
                if (a3 instanceof Barrier) {
                    a2.t0 = 1;
                    final Barrier barrier = (Barrier)a3;
                    a2.s0 = barrier.getType();
                    a2.u0 = barrier.getReferencedIds();
                }
            }
            a2.c(id, a);
        }
        return this.f;
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
    }
    
    public static final class a extends ConstraintLayout.a
    {
        public float l0;
        public boolean m0;
        public float n0;
        public float o0;
        public float p0;
        public float q0;
        public float r0;
        public float s0;
        public float t0;
        public float u0;
        public float v0;
        public float w0;
        
        public a() {
            super(-2);
            this.l0 = 1.0f;
            this.m0 = false;
            this.n0 = 0.0f;
            this.o0 = 0.0f;
            this.p0 = 0.0f;
            this.q0 = 0.0f;
            this.r0 = 1.0f;
            this.s0 = 1.0f;
            this.t0 = 0.0f;
            this.u0 = 0.0f;
            this.v0 = 0.0f;
            this.w0 = 0.0f;
        }
        
        public a(final Context context, final AttributeSet set) {
            super(context, set);
            this.l0 = 1.0f;
            int i = 0;
            this.m0 = false;
            this.n0 = 0.0f;
            this.o0 = 0.0f;
            this.p0 = 0.0f;
            this.q0 = 0.0f;
            this.r0 = 1.0f;
            this.s0 = 1.0f;
            this.t0 = 0.0f;
            this.u0 = 0.0f;
            this.v0 = 0.0f;
            this.w0 = 0.0f;
            for (TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, ah0.b.v); i < obtainStyledAttributes.getIndexCount(); ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == 13) {
                    this.l0 = obtainStyledAttributes.getFloat(index, this.l0);
                }
                else if (index == 26) {
                    this.n0 = obtainStyledAttributes.getFloat(index, this.n0);
                    this.m0 = true;
                }
                else if (index == 21) {
                    this.p0 = obtainStyledAttributes.getFloat(index, this.p0);
                }
                else if (index == 22) {
                    this.q0 = obtainStyledAttributes.getFloat(index, this.q0);
                }
                else if (index == 20) {
                    this.o0 = obtainStyledAttributes.getFloat(index, this.o0);
                }
                else if (index == 18) {
                    this.r0 = obtainStyledAttributes.getFloat(index, this.r0);
                }
                else if (index == 19) {
                    this.s0 = obtainStyledAttributes.getFloat(index, this.s0);
                }
                else if (index == 14) {
                    this.t0 = obtainStyledAttributes.getFloat(index, this.t0);
                }
                else if (index == 15) {
                    this.u0 = obtainStyledAttributes.getFloat(index, this.u0);
                }
                else if (index == 16) {
                    this.v0 = obtainStyledAttributes.getFloat(index, this.v0);
                }
                else if (index == 17) {
                    this.w0 = obtainStyledAttributes.getFloat(index, this.w0);
                }
                else if (index == 25) {
                    this.v0 = obtainStyledAttributes.getFloat(index, 0.0f);
                }
            }
        }
    }
}
