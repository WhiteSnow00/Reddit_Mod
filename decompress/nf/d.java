// 
// Decompiled by Procyon v0.6.0
// 

package nf;

import android.animation.TimeInterpolator;
import android.view.View;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.animation.StateListAnimator;
import android.os.Build$VERSION;
import tf.f;
import tf.j;
import android.content.Context;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import com.google.android.material.floatingactionbutton.FloatingActionButton$b;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public final class d extends com.google.android.material.floatingactionbutton.d
{
    public d(final FloatingActionButton floatingActionButton, final FloatingActionButton$b floatingActionButton$b) {
        super(floatingActionButton, floatingActionButton$b);
    }
    
    @Override
    public final float d() {
        return ((View)super.x).getElevation();
    }
    
    @Override
    public final void e(final Rect rect) {
        if (((FloatingActionButton$b)super.y).a.q) {
            super.e(rect);
        }
        else if (super.f && super.x.getSizeDimension() < super.k) {
            final int n = (super.k - super.x.getSizeDimension()) / 2;
            rect.set(n, n, n, n);
        }
        else {
            rect.set(0, 0, 0, 0);
        }
    }
    
    @Override
    public final void f(final ColorStateList list, final PorterDuff$Mode tintMode, final ColorStateList list2, final int n) {
        (super.b = this.r()).setTintList(list);
        if (tintMode != null) {
            super.b.setTintMode(tintMode);
        }
        super.b.i(((View)super.x).getContext());
        Object b2;
        if (n > 0) {
            final Context context = ((View)super.x).getContext();
            final j a = super.a;
            a.getClass();
            final a d = new a(a);
            final int color = n3.a.getColor(context, 2131099879);
            final int color2 = n3.a.getColor(context, 2131099878);
            final int color3 = n3.a.getColor(context, 2131099876);
            final int color4 = n3.a.getColor(context, 2131099877);
            d.i = color;
            d.j = color2;
            d.k = color3;
            d.l = color4;
            final float h = (float)n;
            if (d.h != h) {
                d.h = h;
                d.b.setStrokeWidth(h * 1.3333f);
                d.n = true;
                d.invalidateSelf();
            }
            if (list != null) {
                d.m = list.getColorForState(d.getState(), d.m);
            }
            d.p = list;
            d.n = true;
            d.invalidateSelf();
            super.d = d;
            final a d2 = super.d;
            d2.getClass();
            final tf.f b = super.b;
            b.getClass();
            b2 = new LayerDrawable(new Drawable[] { d2, (Drawable)b });
        }
        else {
            super.d = null;
            b2 = super.b;
        }
        final RippleDrawable rippleDrawable = new RippleDrawable(rf.a.b(list2), (Drawable)b2, (Drawable)null);
        super.c = (Drawable)rippleDrawable;
        super.e = (LayerDrawable)rippleDrawable;
    }
    
    @Override
    public final void g() {
    }
    
    @Override
    public final void h() {
        this.p();
    }
    
    @Override
    public final void i(final int[] array) {
    }
    
    @Override
    public final void j(final float n, final float n2, final float n3) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.F, (Animator)this.q(n, n3));
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.G, (Animator)this.q(n, n2));
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.H, (Animator)this.q(n, n2));
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.I, (Animator)this.q(n, n2));
        final AnimatorSet set = new AnimatorSet();
        final ArrayList list = new ArrayList();
        list.add(ObjectAnimator.ofFloat((Object)super.x, "elevation", new float[] { n }).setDuration(0L));
        if (sdk_INT <= 24) {
            final FloatingActionButton x = super.x;
            list.add(ObjectAnimator.ofFloat((Object)x, View.TRANSLATION_Z, new float[] { ((View)x).getTranslationZ() }).setDuration(100L));
        }
        list.add(ObjectAnimator.ofFloat((Object)super.x, View.TRANSLATION_Z, new float[] { 0.0f }).setDuration(100L));
        set.playSequentially((Animator[])list.toArray(new Animator[0]));
        set.setInterpolator((TimeInterpolator)com.google.android.material.floatingactionbutton.d.E);
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.J, (Animator)set);
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.K, (Animator)this.q(0.0f, 0.0f));
        ((View)super.x).setStateListAnimator(stateListAnimator);
        if (this.n()) {
            this.p();
        }
    }
    
    @Override
    public final void l(final ColorStateList list) {
        final Drawable c = super.c;
        if (c instanceof RippleDrawable) {
            ((RippleDrawable)c).setColor(rf.a.b(list));
        }
        else {
            super.l(list);
        }
    }
    
    @Override
    public final boolean n() {
        final boolean q = ((FloatingActionButton$b)super.y).a.q;
        boolean b = false;
        if (q || (super.f && super.x.getSizeDimension() < super.k)) {
            b = true;
        }
        return b;
    }
    
    @Override
    public final void o() {
    }
    
    public final AnimatorSet q(final float n, final float n2) {
        final AnimatorSet set = new AnimatorSet();
        set.play((Animator)ObjectAnimator.ofFloat((Object)super.x, "elevation", new float[] { n }).setDuration(0L)).with((Animator)ObjectAnimator.ofFloat((Object)super.x, View.TRANSLATION_Z, new float[] { n2 }).setDuration(100L));
        set.setInterpolator((TimeInterpolator)com.google.android.material.floatingactionbutton.d.E);
        return set;
    }
    
    public final tf.f r() {
        final j a = super.a;
        a.getClass();
        return (tf.f)new d.d$a(a);
    }
}
