// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.view.View$OnTouchListener;
import ef.f;
import a4.l0;
import ef.e;
import android.view.View$OnClickListener;
import ef.d;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
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
                resourceId = 2132017878;
            }
        }
        super(context, resourceId);
        this.l = true;
        this.m = true;
        this.o = new BottomSheetBehavior$c(this) {
            public final a a;
            
            public final void onSlide(final View view, final float n) {
            }
            
            public final void onStateChanged(final View view, final int n) {
                if (n == 5) {
                    this.a.cancel();
                }
            }
        };
        this.v(1);
    }
    
    public final void cancel() {
        if (this.j == null) {
            this.w();
        }
        super.cancel();
    }
    
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
    
    public void setContentView(final int n) {
        super.setContentView((View)this.x(null, n, null));
    }
    
    public void setContentView(final View view) {
        super.setContentView((View)this.x(view, 0, null));
    }
    
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super.setContentView((View)this.x(view, 0, viewGroup$LayoutParams));
    }
    
    public final void w() {
        if (this.k == null) {
            final FrameLayout k = (FrameLayout)View.inflate(((Dialog)this).getContext(), 2131624182, (ViewGroup)null);
            this.k = k;
            final BottomSheetBehavior<FrameLayout> a = BottomSheetBehavior.A((FrameLayout)((View)k).findViewById(2131428675));
            this.j = a;
            final BottomSheetBehavior$c o = this.o;
            if (!a.I.contains(o)) {
                a.I.add((BottomSheetBehavior.BottomSheetBehavior$c)o);
            }
            this.j.D(this.l);
        }
    }
    
    public final FrameLayout x(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.w();
        final CoordinatorLayout coordinatorLayout = (CoordinatorLayout)((View)this.k).findViewById(2131428500);
        View inflate = view;
        if (n != 0 && (inflate = view) == null) {
            inflate = ((Dialog)this).getLayoutInflater().inflate(n, (ViewGroup)coordinatorLayout, false);
        }
        final FrameLayout frameLayout = (FrameLayout)((View)this.k).findViewById(2131428675);
        ((ViewGroup)frameLayout).removeAllViews();
        if (viewGroup$LayoutParams == null) {
            ((ViewGroup)frameLayout).addView(inflate);
        }
        else {
            ((ViewGroup)frameLayout).addView(inflate, viewGroup$LayoutParams);
        }
        ((View)coordinatorLayout).findViewById(2131431874).setOnClickListener((View$OnClickListener)new d(this));
        l0.l((View)frameLayout, (a4.a)new e(this));
        ((View)frameLayout).setOnTouchListener((View$OnTouchListener)new f());
        return this.k;
    }
}
