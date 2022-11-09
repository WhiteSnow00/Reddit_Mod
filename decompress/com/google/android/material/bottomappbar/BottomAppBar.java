// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.bottomappbar;

import android.view.ViewGroup$MarginLayoutParams;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import df.e;
import android.view.View$OnLayoutChangeListener;
import androidx.coordinatorlayout.widget.CoordinatorLayout$f;
import android.util.AttributeSet;
import android.content.Context;
import java.lang.ref.WeakReference;
import android.graphics.Rect;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import qf.j;
import java.util.Iterator;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import j0.i;
import java.util.List;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import df.c;
import df.d;
import android.animation.Animator$AnimatorListener;
import java.util.Collection;
import df.b;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import a4.p0;
import android.graphics.drawable.Drawable;
import r3.a;
import android.os.Parcelable;
import a4.u1;
import androidx.coordinatorlayout.widget.CoordinatorLayout$c;
import android.content.res.ColorStateList;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import df.f;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import android.animation.Animator;
import android.animation.AnimatorSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout$b;
import androidx.appcompat.widget.Toolbar;

public final class BottomAppBar extends Toolbar implements CoordinatorLayout$b
{
    public static final /* synthetic */ int j0 = 0;
    public AnimatorSet c0;
    public Animator d0;
    public int e0;
    public int f0;
    public boolean g0;
    public boolean h0;
    public Behavior i0;
    
    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < this.getChildCount(); ++i) {
            final View child = this.getChildAt(i);
            if (child instanceof ActionMenuView) {
                return (ActionMenuView)child;
            }
        }
        return null;
    }
    
    private int getBottomInset() {
        return 0;
    }
    
    private float getFabTranslationX() {
        return this.z(this.e0);
    }
    
    private float getFabTranslationY() {
        return -this.getTopEdgeTreatment().i;
    }
    
    private int getLeftInset() {
        return 0;
    }
    
    private int getRightInset() {
        return 0;
    }
    
    private df.f getTopEdgeTreatment() {
        throw null;
    }
    
    public final void A() {
        final df.f topEdgeTreatment = this.getTopEdgeTreatment();
        this.getFabTranslationX();
        topEdgeTreatment.getClass();
        this.x();
        if (this.h0) {
            final View x = this.x();
            FloatingActionButton floatingActionButton;
            if (x instanceof FloatingActionButton) {
                floatingActionButton = (FloatingActionButton)x;
            }
            else {
                floatingActionButton = null;
            }
            if (floatingActionButton != null) {
                floatingActionButton.j();
            }
        }
        throw null;
    }
    
    public final void B(final int n) {
        final float h = (float)n;
        if (h == this.getTopEdgeTreatment().h) {
            return;
        }
        this.getTopEdgeTreatment().h = h;
        throw null;
    }
    
    public ColorStateList getBackgroundTint() {
        throw null;
    }
    
    public Behavior getBehavior() {
        if (this.i0 == null) {
            this.i0 = new Behavior();
        }
        return this.i0;
    }
    
    public float getCradleVerticalOffset() {
        return this.getTopEdgeTreatment().i;
    }
    
    public int getFabAlignmentMode() {
        return this.e0;
    }
    
    public int getFabAnimationMode() {
        return this.f0;
    }
    
    public float getFabCradleMargin() {
        return this.getTopEdgeTreatment().g;
    }
    
    public float getFabCradleRoundedCornerRadius() {
        return this.getTopEdgeTreatment().f;
    }
    
    public boolean getHideOnScroll() {
        return this.g0;
    }
    
    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u1.c1((View)this, (vf.f)null);
        throw null;
    }
    
    @Override
    public final void onLayout(final boolean b, int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        FloatingActionButton floatingActionButton = null;
        if (b) {
            final Animator d0 = this.d0;
            if (d0 != null) {
                d0.cancel();
            }
            final AnimatorSet c0 = this.c0;
            if (c0 != null) {
                ((Animator)c0).cancel();
            }
            this.A();
            throw null;
        }
        final ActionMenuView actionMenuView = this.getActionMenuView();
        if (actionMenuView != null) {
            ((View)actionMenuView).setAlpha(1.0f);
            final View x = this.x();
            if (x instanceof FloatingActionButton) {
                floatingActionButton = (FloatingActionButton)x;
            }
            if (floatingActionButton != null && floatingActionButton.j()) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n == 0) {
                ((View)actionMenuView).setTranslationX((float)this.y(actionMenuView, 0, false));
            }
            else {
                ((View)actionMenuView).setTranslationX((float)this.y(actionMenuView, this.e0, this.h0));
            }
        }
    }
    
    @Override
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final a a = (a)parcelable;
        super.onRestoreInstanceState(a.f);
        this.e0 = a.h;
        this.h0 = a.i;
    }
    
    @Override
    public final Parcelable onSaveInstanceState() {
        final a a = new a((i)super.onSaveInstanceState());
        a.h = this.e0;
        a.i = this.h0;
        return (Parcelable)a;
    }
    
    public void setBackgroundTint(final ColorStateList list) {
        r3.a.b.h(null, list);
    }
    
    public void setCradleVerticalOffset(final float i) {
        if (i == this.getCradleVerticalOffset()) {
            return;
        }
        final df.f topEdgeTreatment = this.getTopEdgeTreatment();
        if (i >= 0.0f) {
            topEdgeTreatment.i = i;
            throw null;
        }
        topEdgeTreatment.getClass();
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }
    
    public void setElevation(final float n) {
        throw null;
    }
    
    public void setFabAlignmentMode(final int e0) {
        final int e2 = this.e0;
        final FloatingActionButton floatingActionButton = null;
        if (e2 != e0) {
            final WeakHashMap a = p0.a;
            if (p0.g.c((View)this)) {
                final AnimatorSet c0 = this.c0;
                if (c0 != null) {
                    ((Animator)c0).cancel();
                }
                final ArrayList list = new ArrayList();
                if (this.f0 == 1) {
                    final View x = this.x();
                    FloatingActionButton floatingActionButton2;
                    if (x instanceof FloatingActionButton) {
                        floatingActionButton2 = (FloatingActionButton)x;
                    }
                    else {
                        floatingActionButton2 = null;
                    }
                    final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)floatingActionButton2, "translationX", new float[] { this.z(e0) });
                    ofFloat.setDuration(300L);
                    list.add(ofFloat);
                }
                else {
                    final View x2 = this.x();
                    FloatingActionButton floatingActionButton3;
                    if (x2 instanceof FloatingActionButton) {
                        floatingActionButton3 = (FloatingActionButton)x2;
                    }
                    else {
                        floatingActionButton3 = null;
                    }
                    if (floatingActionButton3 != null) {
                        if (!floatingActionButton3.i()) {
                            floatingActionButton3.h(new b(this, e0), true);
                        }
                    }
                }
                final AnimatorSet c2 = new AnimatorSet();
                c2.playTogether((Collection)list);
                ((Animator)(this.c0 = c2)).addListener((Animator$AnimatorListener)new df.a(this));
                ((Animator)this.c0).start();
            }
        }
        int h0 = this.h0 ? 1 : 0;
        final WeakHashMap a2 = p0.a;
        if (p0.g.c((View)this)) {
            final Animator d0 = this.d0;
            if (d0 != null) {
                d0.cancel();
            }
            final ArrayList<AnimatorSet> list2 = new ArrayList<AnimatorSet>();
            final View x3 = this.x();
            FloatingActionButton floatingActionButton4 = floatingActionButton;
            if (x3 instanceof FloatingActionButton) {
                floatingActionButton4 = (FloatingActionButton)x3;
            }
            int n;
            if (floatingActionButton4 == null || !floatingActionButton4.j()) {
                h0 = (n = 0);
            }
            else {
                n = e0;
            }
            final ActionMenuView actionMenuView = this.getActionMenuView();
            if (actionMenuView != null) {
                final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)actionMenuView, "alpha", new float[] { 1.0f });
                if (Math.abs(((View)actionMenuView).getTranslationX() - this.y(actionMenuView, n, (boolean)(h0 != 0))) > 1.0f) {
                    final ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((Object)actionMenuView, "alpha", new float[] { 0.0f });
                    ((Animator)ofFloat3).addListener((Animator$AnimatorListener)new d(this, actionMenuView, n, (boolean)(h0 != 0)));
                    final AnimatorSet set = new AnimatorSet();
                    set.setDuration(150L);
                    set.playSequentially(new Animator[] { (Animator)ofFloat3, (Animator)ofFloat2 });
                    list2.add(set);
                }
                else if (((View)actionMenuView).getAlpha() < 1.0f) {
                    list2.add((AnimatorSet)ofFloat2);
                }
            }
            final AnimatorSet d2 = new AnimatorSet();
            d2.playTogether((Collection)list2);
            (this.d0 = (Animator)d2).addListener((Animator$AnimatorListener)new c(this));
            this.d0.start();
        }
        this.e0 = e0;
    }
    
    public void setFabAnimationMode(final int f0) {
        this.f0 = f0;
    }
    
    public void setFabCradleMargin(final float g) {
        if (g == this.getFabCradleMargin()) {
            return;
        }
        this.getTopEdgeTreatment().g = g;
        throw null;
    }
    
    public void setFabCradleRoundedCornerRadius(final float f) {
        if (f == this.getFabCradleRoundedCornerRadius()) {
            return;
        }
        this.getTopEdgeTreatment().f = f;
        throw null;
    }
    
    public void setHideOnScroll(final boolean g0) {
        this.g0 = g0;
    }
    
    @Override
    public void setSubtitle(final CharSequence charSequence) {
    }
    
    @Override
    public void setTitle(final CharSequence charSequence) {
    }
    
    public final View x() {
        if (!(((View)this).getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        final CoordinatorLayout coordinatorLayout = (CoordinatorLayout)((View)this).getParent();
        final List list = (List)((j0.i)coordinatorLayout.g.g).getOrDefault((Object)this, (Object)null);
        coordinatorLayout.i.clear();
        if (list != null) {
            coordinatorLayout.i.addAll(list);
        }
        for (final View view : coordinatorLayout.i) {
            if (view instanceof FloatingActionButton || view instanceof ExtendedFloatingActionButton) {
                return view;
            }
        }
        return null;
    }
    
    public final int y(final ActionMenuView actionMenuView, int n, final boolean b) {
        if (n == 1 && b) {
            final boolean b2 = qf.j.b((View)this);
            if (b2) {
                n = ((View)this).getMeasuredWidth();
            }
            else {
                n = 0;
            }
            int i = 0;
            int n2 = n;
            while (i < this.getChildCount()) {
                final View child = this.getChildAt(i);
                final boolean b3 = child.getLayoutParams() instanceof g && (((g)child.getLayoutParams()).a & 0x800007) == 0x800003;
                n = n2;
                if (b3) {
                    if (b2) {
                        n = Math.min(n2, child.getLeft());
                    }
                    else {
                        n = Math.max(n2, child.getRight());
                    }
                }
                ++i;
                n2 = n;
            }
            if (b2) {
                n = ((View)actionMenuView).getRight();
            }
            else {
                n = ((View)actionMenuView).getLeft();
            }
            return n2 - (n + 0);
        }
        return 0;
    }
    
    public final float z(int n) {
        final boolean b = qf.j.b((View)this);
        final int n2 = 1;
        if (n == 1) {
            final int n3 = ((View)this).getMeasuredWidth() / 2;
            n = n2;
            if (b) {
                n = -1;
            }
            return (float)((n3 + 0) * n);
        }
        return 0.0f;
    }
    
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar>
    {
        public final Rect e;
        public WeakReference<BottomAppBar> f;
        public int g;
        public final BottomAppBar$Behavior$a h;
        
        public Behavior() {
            this.h = new BottomAppBar$Behavior$a(this);
            this.e = new Rect();
        }
        
        public Behavior(final Context context, final AttributeSet set) {
            super(context, set);
            this.h = new BottomAppBar$Behavior$a(this);
            this.e = new Rect();
        }
        
        @Override
        public final boolean h(final CoordinatorLayout coordinatorLayout, final View view, final int n) {
            final BottomAppBar bottomAppBar = (BottomAppBar)view;
            this.f = new WeakReference<BottomAppBar>(bottomAppBar);
            final int j0 = BottomAppBar.j0;
            final View x = bottomAppBar.x();
            if (x != null) {
                final WeakHashMap a = p0.a;
                if (!p0.g.c(x)) {
                    final CoordinatorLayout$f coordinatorLayout$f = (CoordinatorLayout$f)x.getLayoutParams();
                    coordinatorLayout$f.d = 49;
                    this.g = ((ViewGroup$MarginLayoutParams)coordinatorLayout$f).bottomMargin;
                    if (x instanceof FloatingActionButton) {
                        final FloatingActionButton floatingActionButton = (FloatingActionButton)x;
                        ((View)floatingActionButton).addOnLayoutChangeListener((View$OnLayoutChangeListener)this.h);
                        floatingActionButton.d();
                        floatingActionButton.e(new df.e(bottomAppBar));
                        floatingActionButton.f();
                    }
                    bottomAppBar.A();
                    throw null;
                }
            }
            coordinatorLayout.r(n, (View)bottomAppBar);
            super.h(coordinatorLayout, bottomAppBar, n);
            return false;
        }
        
        @Override
        public final boolean r(final CoordinatorLayout coordinatorLayout, final View view, final View view2, final View view3, final int n, final int n2) {
            final BottomAppBar bottomAppBar = (BottomAppBar)view;
            return bottomAppBar.getHideOnScroll() && super.r(coordinatorLayout, bottomAppBar, view2, view3, n, n2);
        }
    }
    
    public static final class a extends h4.a
    {
        public static final Parcelable$Creator<a> CREATOR;
        public int h;
        public boolean i;
        
        static {
            CREATOR = (Parcelable$Creator)new BottomAppBar$a$a();
        }
        
        public a(final Parcel parcel, final ClassLoader classLoader) {
            super(parcel, classLoader);
            this.h = parcel.readInt();
            this.i = (parcel.readInt() != 0);
        }
        
        public a(final i i) {
            super((Parcelable)i);
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeParcelable(super.f, n);
            parcel.writeInt(this.h);
            parcel.writeInt((int)(this.i ? 1 : 0));
        }
    }
}
