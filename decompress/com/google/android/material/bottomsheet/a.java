// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.view.View$OnTouchListener;
import ff.f;
import a4.p0;
import ff.e;
import android.view.View$OnClickListener;
import ff.d;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.Window;
import android.os.Bundle;
import android.view.View;
import android.util.TypedValue;
import android.content.Context;
import android.widget.FrameLayout;
import h.m;

public class a extends m
{
    public BottomSheetBehavior<FrameLayout> j;
    public FrameLayout k;
    public boolean l;
    public boolean m;
    public boolean n;
    public a$a o;
    
    public a(final Context context, final int n) {
        int resourceId = n;
        if (n == 0) {
            final TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(2130968715, typedValue, true)) {
                resourceId = typedValue.resourceId;
            }
            else {
                resourceId = 2132017876;
            }
        }
        super(context, resourceId);
        this.l = true;
        this.m = true;
        this.o = new BottomSheetBehavior$c() {
            public final void onSlide(final View view, final float n) {
            }
            
            public final void onStateChanged(final View view, final int n) {
                if (n == 5) {
                    com.google.android.material.bottomsheet.a.this.cancel();
                }
            }
        };
        this.p(1);
    }
    
    public final void cancel() {
        if (this.j == null) {
            this.q();
        }
        super.cancel();
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Window window = ((Dialog)this).getWindow();
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }
    
    public final void onStart() {
        super.onStart();
        final BottomSheetBehavior<FrameLayout> j = this.j;
        if (j != null && j.y == 5) {
            j.F(4);
        }
    }
    
    public final void q() {
        if (this.k == null) {
            final FrameLayout k = (FrameLayout)View.inflate(((Dialog)this).getContext(), 2131624181, (ViewGroup)null);
            this.k = k;
            final BottomSheetBehavior<FrameLayout> a = BottomSheetBehavior.A((FrameLayout)((View)k).findViewById(2131428681));
            this.j = a;
            final BottomSheetBehavior$c o = this.o;
            if (!a.I.contains(o)) {
                a.I.add((BottomSheetBehavior.BottomSheetBehavior$c)o);
            }
            this.j.D(this.l);
        }
    }
    
    public final FrameLayout r(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.q();
        final CoordinatorLayout coordinatorLayout = (CoordinatorLayout)((View)this.k).findViewById(2131428506);
        View inflate = view;
        if (n != 0 && (inflate = view) == null) {
            inflate = ((Dialog)this).getLayoutInflater().inflate(n, (ViewGroup)coordinatorLayout, false);
        }
        final FrameLayout frameLayout = (FrameLayout)((View)this.k).findViewById(2131428681);
        ((ViewGroup)frameLayout).removeAllViews();
        if (viewGroup$LayoutParams == null) {
            ((ViewGroup)frameLayout).addView(inflate);
        }
        else {
            ((ViewGroup)frameLayout).addView(inflate, viewGroup$LayoutParams);
        }
        ((View)coordinatorLayout).findViewById(2131431866).setOnClickListener((View$OnClickListener)new d(this));
        p0.l((View)frameLayout, (a4.a)new e(this));
        ((View)frameLayout).setOnTouchListener((View$OnTouchListener)new f());
        return this.k;
    }
    
    public final void setCancelable(final boolean b) {
        super.setCancelable(b);
        if (this.l != b) {
            this.l = b;
            final BottomSheetBehavior<FrameLayout> j = this.j;
            if (j != null) {
                j.D(b);
            }
        }
    }
    
    public final void setCanceledOnTouchOutside(final boolean b) {
        super.setCanceledOnTouchOutside(b);
        if (b && !this.l) {
            this.l = true;
        }
        this.m = b;
        this.n = true;
    }
    
    @Override
    public void setContentView(final int n) {
        super.setContentView((View)this.r(null, n, null));
    }
    
    @Override
    public void setContentView(final View view) {
        super.setContentView((View)this.r(view, 0, null));
    }
    
    @Override
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super.setContentView((View)this.r(view, 0, viewGroup$LayoutParams));
    }
}
