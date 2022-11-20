// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.screen.changehandler;

import java.util.Iterator;
import java.util.List;
import wi2.g;
import android.animation.TimeInterpolator;
import android.animation.Animator;
import dg2.o;
import java.util.Collection;
import cg.d;
import wi2.f;
import java.util.ArrayList;
import mg2.l;
import wi2.k;
import kotlin.sequences.b;
import com.reddit.screen.dialog.ModalBackdropView;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import com.bluelinelabs.conductor.c;
import ng2.e;
import java.util.Arrays;
import android.animation.ObjectAnimator;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class a extends e8.a
{
    public static final int q = 0;
    public final boolean p;
    
    public a() {
        this(false, 1, null);
    }
    
    public a(final boolean p) {
        super(false);
        this.p = p;
    }
    
    public a(boolean b, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            b = false;
        }
        this(b);
    }
    
    public static ObjectAnimator r(final View view, final float... array) {
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)view, View.TRANSLATION_Y, Arrays.copyOf(array, array.length));
        e.e((Object)ofFloat, "ofFloat(\n      this,\n   \u2026N_Y,\n      *values,\n    )");
        return ofFloat;
    }
    
    public final c c() {
        return (c)new a(false, 1, null);
    }
    
    public final AnimatorSet o(final ViewGroup viewGroup, final View view, final View view2, final boolean b, final boolean b2) {
        e.f((Object)viewGroup, "container");
        final AnimatorSet set = new AnimatorSet();
        View view3;
        if (b && view2 != null) {
            view3 = view2;
        }
        else {
            if (b || view == null) {
                return set;
            }
            view3 = view;
        }
        final boolean a = e.a((Object)view3, (Object)view2);
        final View viewById = view3.findViewById(2131431088);
        final ModalBackdropView modalBackdropView = (ModalBackdropView)view3.findViewById(2131431086);
        e.e((Object)modalBackdropView, "modalBackdropView");
        final g k1 = b.K1((k)androidx.core.view.a.a((ViewGroup)modalBackdropView), (l)new BottomSheetModalChangeHandler$getAnimator$otherViews$1(viewById));
        final ArrayList list = new ArrayList();
        final float n = (float)view3.getHeight();
        Object o;
        if (this.p) {
            o = b.T1((k)k1, (l)new BottomSheetModalChangeHandler$getAnimator$otherViewsAnimatorsTo$1(this, n));
        }
        else {
            o = f.a;
        }
        Object o2;
        if (this.p) {
            o2 = b.T1((k)k1, (l)new BottomSheetModalChangeHandler$getAnimator$otherViewsAnimatorsFrom$1(this, n));
        }
        else {
            o2 = f.a;
        }
        if (a) {
            final s4.c interpolator = new s4.c();
            e.e((Object)viewById, "modalContainer");
            final ObjectAnimator r = r(viewById, n, 0.0f);
            final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)modalBackdropView, "backdropAlphaMultiplier", Arrays.copyOf(new float[] { 0.0f, 1.0f }, 2));
            e.e((Object)ofFloat, "ofFloat(\n      this,\n   \u2026ame,\n      *values,\n    )");
            final List m3 = d.m3((Object[])new ObjectAnimator[] { r, ofFloat });
            e.f((Object)m3, "<this>");
            final ArrayList list2 = new ArrayList(m3.size() + 10);
            list2.addAll(m3);
            dg2.o.z4(list2, (k)o);
            final Iterator iterator = list2.iterator();
            while (iterator.hasNext()) {
                ((Animator)iterator.next()).setInterpolator((TimeInterpolator)interpolator);
            }
            list.addAll(list2);
        }
        else {
            final s4.a interpolator2 = new s4.a();
            e.e((Object)viewById, "modalContainer");
            final ObjectAnimator r2 = r(viewById, n);
            final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)modalBackdropView, "backdropAlphaMultiplier", Arrays.copyOf(new float[] { 0.0f }, 1));
            e.e((Object)ofFloat2, "ofFloat(\n      this,\n   \u2026ame,\n      *values,\n    )");
            final List m4 = d.m3((Object[])new ObjectAnimator[] { r2, ofFloat2 });
            e.f((Object)m4, "<this>");
            final ArrayList list3 = new ArrayList(m4.size() + 10);
            list3.addAll(m4);
            dg2.o.z4(list3, (k)o2);
            final Iterator iterator2 = list3.iterator();
            while (iterator2.hasNext()) {
                ((Animator)iterator2.next()).setInterpolator((TimeInterpolator)interpolator2);
            }
            list.addAll(list3);
        }
        set.playTogether((Collection)list);
        return set;
    }
    
    public final void q(final View view) {
        e.f((Object)view, "from");
    }
}
