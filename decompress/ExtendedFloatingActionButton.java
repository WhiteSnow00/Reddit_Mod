// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.floatingactionbutton;

import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import qf.b;
import java.util.ArrayList;
import android.view.ViewGroup$LayoutParams;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.appbar.AppBarLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$f;
import android.content.res.TypedArray;
import pj2.u;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import ze.g;
import java.util.WeakHashMap;
import a4.p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout$c;
import android.view.View;
import android.util.Property;
import androidx.coordinatorlayout.widget.CoordinatorLayout$b;
import com.google.android.material.button.MaterialButton;

public final class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout$b
{
    public static final /* synthetic */ int w = 0;
    
    static {
        new Property<View, Float>() {
            public final Object get(final Object o) {
                return ((View)o).getLayoutParams().width;
            }
            
            public final void set(final Object o, final Object o2) {
                final View view = (View)o;
                view.getLayoutParams().width = ((Float)o2).intValue();
                view.requestLayout();
            }
        };
        new Property<View, Float>() {
            public final Object get(final Object o) {
                return ((View)o).getLayoutParams().height;
            }
            
            public final void set(final Object o, final Object o2) {
                final View view = (View)o;
                view.getLayoutParams().height = ((Float)o2).intValue();
                view.requestLayout();
            }
        };
    }
    
    public CoordinatorLayout$c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }
    
    public int getCollapsedSize() {
        final WeakHashMap a = p0.a;
        return this.getIconSize() + Math.min(p0.e.f((View)this), p0.e.e((View)this)) * 2;
    }
    
    public g getExtendMotionSpec() {
        throw null;
    }
    
    public g getHideMotionSpec() {
        throw null;
    }
    
    public g getShowMotionSpec() {
        throw null;
    }
    
    public g getShrinkMotionSpec() {
        throw null;
    }
    
    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }
    
    public void setExtendMotionSpec(final g g) {
        throw null;
    }
    
    public void setExtendMotionSpecResource(final int n) {
        this.setExtendMotionSpec(g.b(n, ((View)this).getContext()));
    }
    
    public void setExtended(final boolean b) {
        if (!b) {
            return;
        }
        throw null;
    }
    
    public void setHideMotionSpec(final g g) {
        throw null;
    }
    
    public void setHideMotionSpecResource(final int n) {
        this.setHideMotionSpec(g.b(n, ((View)this).getContext()));
    }
    
    public void setShowMotionSpec(final g g) {
        throw null;
    }
    
    public void setShowMotionSpecResource(final int n) {
        this.setShowMotionSpec(g.b(n, ((View)this).getContext()));
    }
    
    public void setShrinkMotionSpec(final g g) {
        throw null;
    }
    
    public void setShrinkMotionSpecResource(final int n) {
        this.setShrinkMotionSpec(g.b(n, ((View)this).getContext()));
    }
    
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout$c<T>
    {
        public Rect a;
        public boolean b;
        public boolean c;
        
        public ExtendedFloatingActionButtonBehavior() {
            this.b = false;
            this.c = true;
        }
        
        public ExtendedFloatingActionButtonBehavior(final Context context, final AttributeSet set) {
            super(context, set);
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, pj2.u.x);
            this.b = obtainStyledAttributes.getBoolean(0, false);
            this.c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }
        
        public final void c(final CoordinatorLayout$f coordinatorLayout$f) {
            if (coordinatorLayout$f.h == 0) {
                coordinatorLayout$f.h = 80;
            }
        }
        
        public final boolean d(final CoordinatorLayout coordinatorLayout, final View view, final View view2) {
            final ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton)view;
            if (view2 instanceof AppBarLayout) {
                this.v(coordinatorLayout, (AppBarLayout)view2, extendedFloatingActionButton);
            }
            else {
                final ViewGroup$LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout$f && ((CoordinatorLayout$f)layoutParams).a instanceof BottomSheetBehavior) {
                    this.w(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }
        
        public final boolean h(final CoordinatorLayout coordinatorLayout, final View view, final int n) {
            final ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton)view;
            final ArrayList e = coordinatorLayout.e((View)extendedFloatingActionButton);
            for (int size = e.size(), i = 0; i < size; ++i) {
                final View view2 = (View)e.get(i);
                if (view2 instanceof AppBarLayout) {
                    this.v(coordinatorLayout, (AppBarLayout)view2, extendedFloatingActionButton);
                }
                else {
                    final ViewGroup$LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout$f && ((CoordinatorLayout$f)layoutParams).a instanceof BottomSheetBehavior) {
                        this.w(view2, extendedFloatingActionButton);
                    }
                }
            }
            coordinatorLayout.r(n, (View)extendedFloatingActionButton);
            return true;
        }
        
        public final boolean v(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, final ExtendedFloatingActionButton extendedFloatingActionButton) {
            final CoordinatorLayout$f coordinatorLayout$f = (CoordinatorLayout$f)((View)extendedFloatingActionButton).getLayoutParams();
            boolean b = false;
            Label_0045: {
                if (this.b || this.c) {
                    if (coordinatorLayout$f.f == ((View)appBarLayout).getId()) {
                        b = true;
                        break Label_0045;
                    }
                }
                b = false;
            }
            if (!b) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            final Rect a = this.a;
            qf.b.a((ViewGroup)coordinatorLayout, (View)appBarLayout, a);
            if (a.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                if (this.c) {
                    final int w = ExtendedFloatingActionButton.w;
                }
                else {
                    final int w2 = ExtendedFloatingActionButton.w;
                }
                throw null;
            }
            if (this.c) {
                final int w3 = ExtendedFloatingActionButton.w;
            }
            else {
                final int w4 = ExtendedFloatingActionButton.w;
            }
            throw null;
        }
        
        public final boolean w(final View view, final ExtendedFloatingActionButton extendedFloatingActionButton) {
            final CoordinatorLayout$f coordinatorLayout$f = (CoordinatorLayout$f)((View)extendedFloatingActionButton).getLayoutParams();
            boolean b = false;
            Label_0045: {
                if (this.b || this.c) {
                    if (coordinatorLayout$f.f == view.getId()) {
                        b = true;
                        break Label_0045;
                    }
                }
                b = false;
            }
            if (!b) {
                return false;
            }
            if (view.getTop() < ((View)extendedFloatingActionButton).getHeight() / 2 + ((ViewGroup$MarginLayoutParams)((View)extendedFloatingActionButton).getLayoutParams()).topMargin) {
                if (this.c) {
                    final int w = ExtendedFloatingActionButton.w;
                }
                else {
                    final int w2 = ExtendedFloatingActionButton.w;
                }
                throw null;
            }
            if (this.c) {
                final int w3 = ExtendedFloatingActionButton.w;
            }
            else {
                final int w4 = ExtendedFloatingActionButton.w;
            }
            throw null;
        }
    }
}
