// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.widget;

import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import java.util.Iterator;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import java.util.Collection;
import java.util.HashSet;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.AttributeSet;
import android.content.Context;
import java.util.Arrays;
import i3.a;
import java.util.HashMap;
import android.util.SparseIntArray;

public final class b
{
    public static final int[] b;
    public static SparseIntArray c;
    public HashMap<Integer, a> a;
    
    static {
        b = new int[] { 0, 4, 8 };
        (androidx.constraintlayout.widget.b.c = new SparseIntArray()).append(55, 25);
        androidx.constraintlayout.widget.b.c.append(56, 26);
        androidx.constraintlayout.widget.b.c.append(58, 29);
        androidx.constraintlayout.widget.b.c.append(59, 30);
        androidx.constraintlayout.widget.b.c.append(64, 36);
        androidx.constraintlayout.widget.b.c.append(63, 35);
        androidx.constraintlayout.widget.b.c.append(37, 4);
        androidx.constraintlayout.widget.b.c.append(36, 3);
        androidx.constraintlayout.widget.b.c.append(34, 1);
        androidx.constraintlayout.widget.b.c.append(72, 6);
        androidx.constraintlayout.widget.b.c.append(73, 7);
        androidx.constraintlayout.widget.b.c.append(44, 17);
        androidx.constraintlayout.widget.b.c.append(45, 18);
        androidx.constraintlayout.widget.b.c.append(46, 19);
        androidx.constraintlayout.widget.b.c.append(0, 27);
        androidx.constraintlayout.widget.b.c.append(60, 32);
        androidx.constraintlayout.widget.b.c.append(61, 33);
        androidx.constraintlayout.widget.b.c.append(43, 10);
        androidx.constraintlayout.widget.b.c.append(42, 9);
        androidx.constraintlayout.widget.b.c.append(76, 13);
        androidx.constraintlayout.widget.b.c.append(79, 16);
        androidx.constraintlayout.widget.b.c.append(77, 14);
        androidx.constraintlayout.widget.b.c.append(74, 11);
        androidx.constraintlayout.widget.b.c.append(78, 15);
        androidx.constraintlayout.widget.b.c.append(75, 12);
        androidx.constraintlayout.widget.b.c.append(67, 40);
        androidx.constraintlayout.widget.b.c.append(53, 39);
        androidx.constraintlayout.widget.b.c.append(52, 41);
        androidx.constraintlayout.widget.b.c.append(66, 42);
        androidx.constraintlayout.widget.b.c.append(51, 20);
        androidx.constraintlayout.widget.b.c.append(65, 37);
        androidx.constraintlayout.widget.b.c.append(41, 5);
        androidx.constraintlayout.widget.b.c.append(54, 75);
        androidx.constraintlayout.widget.b.c.append(62, 75);
        androidx.constraintlayout.widget.b.c.append(57, 75);
        androidx.constraintlayout.widget.b.c.append(35, 75);
        androidx.constraintlayout.widget.b.c.append(33, 75);
        androidx.constraintlayout.widget.b.c.append(5, 24);
        androidx.constraintlayout.widget.b.c.append(7, 28);
        androidx.constraintlayout.widget.b.c.append(23, 31);
        androidx.constraintlayout.widget.b.c.append(24, 8);
        androidx.constraintlayout.widget.b.c.append(6, 34);
        androidx.constraintlayout.widget.b.c.append(8, 2);
        androidx.constraintlayout.widget.b.c.append(3, 23);
        androidx.constraintlayout.widget.b.c.append(4, 21);
        androidx.constraintlayout.widget.b.c.append(2, 22);
        androidx.constraintlayout.widget.b.c.append(13, 43);
        androidx.constraintlayout.widget.b.c.append(26, 44);
        androidx.constraintlayout.widget.b.c.append(21, 45);
        androidx.constraintlayout.widget.b.c.append(22, 46);
        androidx.constraintlayout.widget.b.c.append(20, 60);
        androidx.constraintlayout.widget.b.c.append(18, 47);
        androidx.constraintlayout.widget.b.c.append(19, 48);
        androidx.constraintlayout.widget.b.c.append(14, 49);
        androidx.constraintlayout.widget.b.c.append(15, 50);
        androidx.constraintlayout.widget.b.c.append(16, 51);
        androidx.constraintlayout.widget.b.c.append(17, 52);
        androidx.constraintlayout.widget.b.c.append(25, 53);
        androidx.constraintlayout.widget.b.c.append(68, 54);
        androidx.constraintlayout.widget.b.c.append(47, 55);
        androidx.constraintlayout.widget.b.c.append(69, 56);
        androidx.constraintlayout.widget.b.c.append(48, 57);
        androidx.constraintlayout.widget.b.c.append(70, 58);
        androidx.constraintlayout.widget.b.c.append(49, 59);
        androidx.constraintlayout.widget.b.c.append(38, 61);
        androidx.constraintlayout.widget.b.c.append(40, 62);
        androidx.constraintlayout.widget.b.c.append(39, 63);
        androidx.constraintlayout.widget.b.c.append(1, 38);
        androidx.constraintlayout.widget.b.c.append(71, 69);
        androidx.constraintlayout.widget.b.c.append(50, 70);
        androidx.constraintlayout.widget.b.c.append(29, 71);
        androidx.constraintlayout.widget.b.c.append(28, 72);
        androidx.constraintlayout.widget.b.c.append(30, 73);
        androidx.constraintlayout.widget.b.c.append(27, 74);
    }
    
    public b() {
        this.a = new HashMap<Integer, a>();
    }
    
    public static int[] j(final Barrier barrier, String s) {
        final String[] split = s.split(",");
        final Context context = barrier.getContext();
        s = (String)(Object)new int[split.length];
        int i;
        int n;
        for (i = 0, n = 0; i < split.length; ++i, ++n) {
            final String trim = split[i].trim();
            int int1;
            try {
                int1 = i3.a.class.getField(trim).getInt(null);
            }
            catch (final Exception ex) {
                int1 = 0;
            }
            int identifier = int1;
            if (int1 == 0) {
                identifier = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            int intValue;
            if ((intValue = identifier) == 0) {
                intValue = identifier;
                if (barrier.isInEditMode()) {
                    intValue = identifier;
                    if (barrier.getParent() instanceof ConstraintLayout) {
                        final Object designInformation = ((ConstraintLayout)barrier.getParent()).getDesignInformation(0, trim);
                        intValue = identifier;
                        if (designInformation != null) {
                            intValue = identifier;
                            if (designInformation instanceof Integer) {
                                intValue = (int)designInformation;
                            }
                        }
                    }
                }
            }
            s[n] = intValue;
        }
        Object copy = s;
        if (n != split.length) {
            copy = Arrays.copyOf((int[])(Object)s, n);
        }
        return (int[])copy;
    }
    
    public static a k(final Context context, final AttributeSet set) {
        final a a = new a();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, ah0.b.v);
        for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = obtainStyledAttributes.getIndex(i);
            final int value = androidx.constraintlayout.widget.b.c.get(index);
            switch (value) {
                default: {
                    switch (value) {
                        default: {
                            switch (value) {
                                default: {
                                    final StringBuilder t = a.t("Unknown attribute 0x");
                                    t.append(Integer.toHexString(index));
                                    t.append("   ");
                                    t.append(androidx.constraintlayout.widget.b.c.get(index));
                                    Log.w("ConstraintSet", t.toString());
                                    continue;
                                }
                                case 75: {
                                    final StringBuilder t2 = a.t("unused attribute 0x");
                                    t2.append(Integer.toHexString(index));
                                    t2.append("   ");
                                    t2.append(androidx.constraintlayout.widget.b.c.get(index));
                                    Log.w("ConstraintSet", t2.toString());
                                    continue;
                                }
                                case 74: {
                                    a.r0 = obtainStyledAttributes.getBoolean(index, a.r0);
                                    continue;
                                }
                                case 73: {
                                    a.v0 = obtainStyledAttributes.getString(index);
                                    continue;
                                }
                                case 72: {
                                    a.s0 = obtainStyledAttributes.getInt(index, a.s0);
                                    continue;
                                }
                                case 71: {
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    continue;
                                }
                                case 70: {
                                    a.q0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    continue;
                                }
                                case 69: {
                                    a.p0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    continue;
                                }
                            }
                            break;
                        }
                        case 63: {
                            a.z = obtainStyledAttributes.getFloat(index, a.z);
                            continue;
                        }
                        case 62: {
                            a.y = obtainStyledAttributes.getDimensionPixelSize(index, a.y);
                            continue;
                        }
                        case 61: {
                            a.x = n(obtainStyledAttributes, index, a.x);
                            continue;
                        }
                        case 60: {
                            a.X = obtainStyledAttributes.getFloat(index, a.X);
                            continue;
                        }
                    }
                    break;
                }
                case 53: {
                    a.g0 = obtainStyledAttributes.getDimension(index, a.g0);
                    break;
                }
                case 52: {
                    a.f0 = obtainStyledAttributes.getDimension(index, a.f0);
                    break;
                }
                case 51: {
                    a.e0 = obtainStyledAttributes.getDimension(index, a.e0);
                    break;
                }
                case 50: {
                    a.d0 = obtainStyledAttributes.getFloat(index, a.d0);
                    break;
                }
                case 49: {
                    a.c0 = obtainStyledAttributes.getFloat(index, a.c0);
                    break;
                }
                case 48: {
                    a.b0 = obtainStyledAttributes.getFloat(index, a.b0);
                    break;
                }
                case 47: {
                    a.a0 = obtainStyledAttributes.getFloat(index, a.a0);
                    break;
                }
                case 46: {
                    a.Z = obtainStyledAttributes.getFloat(index, a.Z);
                    break;
                }
                case 45: {
                    a.Y = obtainStyledAttributes.getFloat(index, a.Y);
                    break;
                }
                case 44: {
                    a.V = true;
                    a.W = obtainStyledAttributes.getDimension(index, a.W);
                    break;
                }
                case 43: {
                    a.U = obtainStyledAttributes.getFloat(index, a.U);
                    break;
                }
                case 42: {
                    a.T = obtainStyledAttributes.getInt(index, a.T);
                    break;
                }
                case 41: {
                    a.S = obtainStyledAttributes.getInt(index, a.S);
                    break;
                }
                case 40: {
                    a.Q = obtainStyledAttributes.getFloat(index, a.Q);
                    break;
                }
                case 39: {
                    a.R = obtainStyledAttributes.getFloat(index, a.R);
                    break;
                }
                case 38: {
                    a.d = obtainStyledAttributes.getResourceId(index, a.d);
                    break;
                }
                case 37: {
                    a.v = obtainStyledAttributes.getFloat(index, a.v);
                    break;
                }
                case 36: {
                    a.l = n(obtainStyledAttributes, index, a.l);
                    break;
                }
                case 35: {
                    a.m = n(obtainStyledAttributes, index, a.m);
                    break;
                }
                case 34: {
                    a.F = obtainStyledAttributes.getDimensionPixelSize(index, a.F);
                    break;
                }
                case 33: {
                    a.r = n(obtainStyledAttributes, index, a.r);
                    break;
                }
                case 32: {
                    a.q = n(obtainStyledAttributes, index, a.q);
                    break;
                }
                case 31: {
                    a.I = obtainStyledAttributes.getDimensionPixelSize(index, a.I);
                    break;
                }
                case 30: {
                    a.k = n(obtainStyledAttributes, index, a.k);
                    break;
                }
                case 29: {
                    a.j = n(obtainStyledAttributes, index, a.j);
                    break;
                }
                case 28: {
                    a.E = obtainStyledAttributes.getDimensionPixelSize(index, a.E);
                    break;
                }
                case 27: {
                    a.C = obtainStyledAttributes.getInt(index, a.C);
                    break;
                }
                case 26: {
                    a.i = n(obtainStyledAttributes, index, a.i);
                    break;
                }
                case 25: {
                    a.h = n(obtainStyledAttributes, index, a.h);
                    break;
                }
                case 24: {
                    a.D = obtainStyledAttributes.getDimensionPixelSize(index, a.D);
                    break;
                }
                case 23: {
                    a.b = obtainStyledAttributes.getLayoutDimension(index, a.b);
                    break;
                }
                case 22: {
                    a.J = androidx.constraintlayout.widget.b.b[obtainStyledAttributes.getInt(index, a.J)];
                    break;
                }
                case 21: {
                    a.c = obtainStyledAttributes.getLayoutDimension(index, a.c);
                    break;
                }
                case 20: {
                    a.u = obtainStyledAttributes.getFloat(index, a.u);
                    break;
                }
                case 19: {
                    a.g = obtainStyledAttributes.getFloat(index, a.g);
                    break;
                }
                case 18: {
                    a.f = obtainStyledAttributes.getDimensionPixelOffset(index, a.f);
                    break;
                }
                case 17: {
                    a.e = obtainStyledAttributes.getDimensionPixelOffset(index, a.e);
                    break;
                }
                case 16: {
                    a.L = obtainStyledAttributes.getDimensionPixelSize(index, a.L);
                    break;
                }
                case 15: {
                    a.P = obtainStyledAttributes.getDimensionPixelSize(index, a.P);
                    break;
                }
                case 14: {
                    a.M = obtainStyledAttributes.getDimensionPixelSize(index, a.M);
                    break;
                }
                case 13: {
                    a.K = obtainStyledAttributes.getDimensionPixelSize(index, a.K);
                    break;
                }
                case 12: {
                    a.O = obtainStyledAttributes.getDimensionPixelSize(index, a.O);
                    break;
                }
                case 11: {
                    a.N = obtainStyledAttributes.getDimensionPixelSize(index, a.N);
                    break;
                }
                case 10: {
                    a.s = n(obtainStyledAttributes, index, a.s);
                    break;
                }
                case 9: {
                    a.t = n(obtainStyledAttributes, index, a.t);
                    break;
                }
                case 8: {
                    a.H = obtainStyledAttributes.getDimensionPixelSize(index, a.H);
                    break;
                }
                case 7: {
                    a.B = obtainStyledAttributes.getDimensionPixelOffset(index, a.B);
                    break;
                }
                case 6: {
                    a.A = obtainStyledAttributes.getDimensionPixelOffset(index, a.A);
                    break;
                }
                case 5: {
                    a.w = obtainStyledAttributes.getString(index);
                    break;
                }
                case 4: {
                    a.n = n(obtainStyledAttributes, index, a.n);
                    break;
                }
                case 3: {
                    a.o = n(obtainStyledAttributes, index, a.o);
                    break;
                }
                case 2: {
                    a.G = obtainStyledAttributes.getDimensionPixelSize(index, a.G);
                    break;
                }
                case 1: {
                    a.p = n(obtainStyledAttributes, index, a.p);
                    break;
                }
            }
        }
        obtainStyledAttributes.recycle();
        return a;
    }
    
    public static int n(final TypedArray typedArray, final int n, int n2) {
        if ((n2 = typedArray.getResourceId(n, n2)) == -1) {
            n2 = typedArray.getInt(n, -1);
        }
        return n2;
    }
    
    public static String p(final int n) {
        switch (n) {
            default: {
                return "undefined";
            }
            case 7: {
                return "end";
            }
            case 6: {
                return "start";
            }
            case 5: {
                return "baseline";
            }
            case 4: {
                return "bottom";
            }
            case 3: {
                return "top";
            }
            case 2: {
                return "right";
            }
            case 1: {
                return "left";
            }
        }
    }
    
    public final void a(final int n, final int n2, final int n3) {
        int n4;
        if (n2 == 0) {
            n4 = 1;
        }
        else {
            n4 = 2;
        }
        this.f(n, 1, n2, n4);
        int n5;
        if (n3 == 0) {
            n5 = 2;
        }
        else {
            n5 = 1;
        }
        this.f(n, 2, n3, n5);
        if (n2 != 0) {
            this.f(n2, 2, n, 1);
        }
        if (n3 != 0) {
            this.f(n3, 1, n, 2);
        }
    }
    
    public final void b(final ConstraintLayout constraintLayout) {
        this.c(constraintLayout);
        constraintLayout.setConstraintSet(null);
    }
    
    public final void c(final ConstraintLayout constraintLayout) {
        final int childCount = constraintLayout.getChildCount();
        final HashSet set = new HashSet((Collection<? extends E>)this.a.keySet());
        for (int i = 0; i < childCount; ++i) {
            final View child = constraintLayout.getChildAt(i);
            final int id = child.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (this.a.containsKey(id)) {
                set.remove(id);
                final a a = this.a.get(id);
                if (child instanceof Barrier) {
                    a.t0 = 1;
                }
                final int t0 = a.t0;
                if (t0 != -1) {
                    if (t0 == 1) {
                        final Barrier barrier = (Barrier)child;
                        barrier.setId(id);
                        barrier.setType(a.s0);
                        barrier.setAllowsGoneWidget(a.r0);
                        final int[] u0 = a.u0;
                        if (u0 != null) {
                            barrier.setReferencedIds(u0);
                        }
                        else {
                            final String v0 = a.v0;
                            if (v0 != null) {
                                barrier.setReferencedIds(a.u0 = j(barrier, v0));
                            }
                        }
                    }
                }
                final ConstraintLayout.a layoutParams = (ConstraintLayout.a)child.getLayoutParams();
                a.a(layoutParams);
                child.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                child.setVisibility(a.J);
                child.setAlpha(a.U);
                child.setRotation(a.X);
                child.setRotationX(a.Y);
                child.setRotationY(a.Z);
                child.setScaleX(a.a0);
                child.setScaleY(a.b0);
                if (!Float.isNaN(a.c0)) {
                    child.setPivotX(a.c0);
                }
                if (!Float.isNaN(a.d0)) {
                    child.setPivotY(a.d0);
                }
                child.setTranslationX(a.e0);
                child.setTranslationY(a.f0);
                child.setTranslationZ(a.g0);
                if (a.V) {
                    child.setElevation(a.W);
                }
            }
        }
        for (final Integer n : set) {
            final a a2 = this.a.get(n);
            final int t2 = a2.t0;
            if (t2 != -1) {
                if (t2 == 1) {
                    final Barrier barrier2 = new Barrier(((View)constraintLayout).getContext());
                    barrier2.setId((int)n);
                    final int[] u2 = a2.u0;
                    if (u2 != null) {
                        barrier2.setReferencedIds(u2);
                    }
                    else {
                        final String v2 = a2.v0;
                        if (v2 != null) {
                            barrier2.setReferencedIds(a2.u0 = j(barrier2, v2));
                        }
                    }
                    barrier2.setType(a2.s0);
                    final ConstraintLayout.a generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.e();
                    a2.a(generateDefaultLayoutParams);
                    constraintLayout.addView((View)barrier2, (ViewGroup$LayoutParams)generateDefaultLayoutParams);
                }
            }
            if (a2.a) {
                final Guideline guideline = new Guideline(((View)constraintLayout).getContext());
                guideline.setId((int)n);
                final ConstraintLayout.a generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                a2.a(generateDefaultLayoutParams2);
                constraintLayout.addView((View)guideline, (ViewGroup$LayoutParams)generateDefaultLayoutParams2);
            }
        }
    }
    
    public final void d(final int n, final int n2) {
        if (this.a.containsKey(n)) {
            final a a = this.a.get(n);
            switch (n2) {
                default: {
                    throw new IllegalArgumentException("unknown constraint");
                }
                case 7: {
                    a.s = -1;
                    a.t = -1;
                    a.H = -1;
                    a.O = -1;
                    break;
                }
                case 6: {
                    a.q = -1;
                    a.r = -1;
                    a.I = -1;
                    a.P = -1;
                    break;
                }
                case 5: {
                    a.p = -1;
                    break;
                }
                case 4: {
                    a.n = -1;
                    a.o = -1;
                    a.G = -1;
                    a.N = -1;
                    break;
                }
                case 3: {
                    a.m = -1;
                    a.l = -1;
                    a.F = -1;
                    a.L = -1;
                    break;
                }
                case 2: {
                    a.k = -1;
                    a.j = -1;
                    a.E = -1;
                    a.M = -1;
                    break;
                }
                case 1: {
                    a.i = -1;
                    a.h = -1;
                    a.D = -1;
                    a.K = -1;
                    break;
                }
            }
        }
    }
    
    public final void e(final ConstraintLayout constraintLayout) {
        final int childCount = constraintLayout.getChildCount();
        this.a.clear();
        for (int i = 0; i < childCount; ++i) {
            final View child = constraintLayout.getChildAt(i);
            final ConstraintLayout.a a = (ConstraintLayout.a)child.getLayoutParams();
            final int id = child.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.a.containsKey(id)) {
                this.a.put(id, new a());
            }
            final a a2 = this.a.get(id);
            a2.b(id, a);
            a2.J = child.getVisibility();
            a2.U = child.getAlpha();
            a2.X = child.getRotation();
            a2.Y = child.getRotationX();
            a2.Z = child.getRotationY();
            a2.a0 = child.getScaleX();
            a2.b0 = child.getScaleY();
            final float pivotX = child.getPivotX();
            final float pivotY = child.getPivotY();
            if (pivotX != 0.0 || pivotY != 0.0) {
                a2.c0 = pivotX;
                a2.d0 = pivotY;
            }
            a2.e0 = child.getTranslationX();
            a2.f0 = child.getTranslationY();
            a2.g0 = child.getTranslationZ();
            if (a2.V) {
                a2.W = child.getElevation();
            }
            if (child instanceof Barrier) {
                final Barrier barrier = (Barrier)child;
                a2.r0 = barrier.m.m0;
                a2.u0 = barrier.getReferencedIds();
                a2.s0 = barrier.getType();
            }
        }
    }
    
    public final void f(final int n, final int n2, final int i, final int n3) {
        if (!this.a.containsKey(n)) {
            this.a.put(n, new a());
        }
        final a a = this.a.get(n);
        switch (n2) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append(p(n2));
                sb.append(" to ");
                sb.append(p(n3));
                sb.append(" unknown");
                throw new IllegalArgumentException(sb.toString());
            }
            case 7: {
                if (n3 == 7) {
                    a.t = i;
                    a.s = -1;
                }
                else {
                    if (n3 != 6) {
                        final StringBuilder t = a.t("right to ");
                        t.append(p(n3));
                        t.append(" undefined");
                        throw new IllegalArgumentException(t.toString());
                    }
                    a.s = i;
                    a.t = -1;
                }
                a.H = 0;
                break;
            }
            case 6: {
                if (n3 == 6) {
                    a.r = i;
                    a.q = -1;
                }
                else {
                    if (n3 != 7) {
                        final StringBuilder t2 = a.t("right to ");
                        t2.append(p(n3));
                        t2.append(" undefined");
                        throw new IllegalArgumentException(t2.toString());
                    }
                    a.q = i;
                    a.r = -1;
                }
                a.I = 0;
                break;
            }
            case 5: {
                if (n3 == 5) {
                    a.p = i;
                    a.o = -1;
                    a.n = -1;
                    a.l = -1;
                    a.m = -1;
                    break;
                }
                final StringBuilder t3 = a.t("right to ");
                t3.append(p(n3));
                t3.append(" undefined");
                throw new IllegalArgumentException(t3.toString());
            }
            case 4: {
                if (n3 == 4) {
                    a.o = i;
                    a.n = -1;
                    a.p = -1;
                }
                else {
                    if (n3 != 3) {
                        final StringBuilder t4 = a.t("right to ");
                        t4.append(p(n3));
                        t4.append(" undefined");
                        throw new IllegalArgumentException(t4.toString());
                    }
                    a.n = i;
                    a.o = -1;
                    a.p = -1;
                }
                a.G = 0;
                break;
            }
            case 3: {
                if (n3 == 3) {
                    a.l = i;
                    a.m = -1;
                    a.p = -1;
                }
                else {
                    if (n3 != 4) {
                        final StringBuilder t5 = a.t("right to ");
                        t5.append(p(n3));
                        t5.append(" undefined");
                        throw new IllegalArgumentException(t5.toString());
                    }
                    a.m = i;
                    a.l = -1;
                    a.p = -1;
                }
                a.F = 0;
                break;
            }
            case 2: {
                if (n3 == 1) {
                    a.j = i;
                    a.k = -1;
                }
                else {
                    if (n3 != 2) {
                        final StringBuilder t6 = a.t("right to ");
                        t6.append(p(n3));
                        t6.append(" undefined");
                        throw new IllegalArgumentException(t6.toString());
                    }
                    a.k = i;
                    a.j = -1;
                }
                a.E = 0;
                break;
            }
            case 1: {
                if (n3 == 1) {
                    a.h = i;
                    a.i = -1;
                }
                else {
                    if (n3 != 2) {
                        final StringBuilder t7 = a.t("Left to ");
                        t7.append(p(n3));
                        t7.append(" undefined");
                        throw new IllegalArgumentException(t7.toString());
                    }
                    a.i = i;
                    a.h = -1;
                }
                a.D = 0;
                break;
            }
        }
    }
    
    public final void g(final int n, final int n2, final int i, final int n3) {
        if (!this.a.containsKey(n)) {
            this.a.put(n, new a());
        }
        final a a = this.a.get(n);
        switch (n2) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append(p(n2));
                sb.append(" to ");
                sb.append(p(n3));
                sb.append(" unknown");
                throw new IllegalArgumentException(sb.toString());
            }
            case 7: {
                if (n3 == 7) {
                    a.t = i;
                    a.s = -1;
                    break;
                }
                if (n3 == 6) {
                    a.s = i;
                    a.t = -1;
                    break;
                }
                final StringBuilder t = a.t("right to ");
                t.append(p(n3));
                t.append(" undefined");
                throw new IllegalArgumentException(t.toString());
            }
            case 6: {
                if (n3 == 6) {
                    a.r = i;
                    a.q = -1;
                    break;
                }
                if (n3 == 7) {
                    a.q = i;
                    a.r = -1;
                    break;
                }
                final StringBuilder t2 = a.t("right to ");
                t2.append(p(n3));
                t2.append(" undefined");
                throw new IllegalArgumentException(t2.toString());
            }
            case 5: {
                if (n3 == 5) {
                    a.p = i;
                    a.o = -1;
                    a.n = -1;
                    a.l = -1;
                    a.m = -1;
                    break;
                }
                final StringBuilder t3 = a.t("right to ");
                t3.append(p(n3));
                t3.append(" undefined");
                throw new IllegalArgumentException(t3.toString());
            }
            case 4: {
                if (n3 == 4) {
                    a.o = i;
                    a.n = -1;
                    a.p = -1;
                    break;
                }
                if (n3 == 3) {
                    a.n = i;
                    a.o = -1;
                    a.p = -1;
                    break;
                }
                final StringBuilder t4 = a.t("right to ");
                t4.append(p(n3));
                t4.append(" undefined");
                throw new IllegalArgumentException(t4.toString());
            }
            case 3: {
                if (n3 == 3) {
                    a.l = i;
                    a.m = -1;
                    a.p = -1;
                    break;
                }
                if (n3 == 4) {
                    a.m = i;
                    a.l = -1;
                    a.p = -1;
                    break;
                }
                final StringBuilder t5 = a.t("right to ");
                t5.append(p(n3));
                t5.append(" undefined");
                throw new IllegalArgumentException(t5.toString());
            }
            case 2: {
                if (n3 == 1) {
                    a.j = i;
                    a.k = -1;
                    break;
                }
                if (n3 == 2) {
                    a.k = i;
                    a.j = -1;
                    break;
                }
                final StringBuilder t6 = a.t("right to ");
                t6.append(p(n3));
                t6.append(" undefined");
                throw new IllegalArgumentException(t6.toString());
            }
            case 1: {
                if (n3 == 1) {
                    a.h = i;
                    a.i = -1;
                    break;
                }
                if (n3 == 2) {
                    a.i = i;
                    a.h = -1;
                    break;
                }
                final StringBuilder t7 = a.t("left to ");
                t7.append(p(n3));
                t7.append(" undefined");
                throw new IllegalArgumentException(t7.toString());
            }
        }
    }
    
    public final void h(final float p2, final int n) {
        this.l(n).p0 = p2;
    }
    
    public final void i(final int n, final int b) {
        this.l(n).b = b;
    }
    
    public final a l(final int n) {
        if (!this.a.containsKey(n)) {
            this.a.put(n, new a());
        }
        return this.a.get(n);
    }
    
    public final void m(int i, final Context context) {
        final XmlResourceParser xml = context.getResources().getXml(i);
        try {
            String name;
            a k;
            for (i = ((XmlPullParser)xml).getEventType(); i != 1; i = ((XmlPullParser)xml).next()) {
                if (i != 0) {
                    if (i == 2) {
                        name = ((XmlPullParser)xml).getName();
                        k = k(context, Xml.asAttributeSet((XmlPullParser)xml));
                        if (name.equalsIgnoreCase("Guideline")) {
                            k.a = true;
                        }
                        this.a.put(k.d, k);
                    }
                }
                else {
                    ((XmlPullParser)xml).getName();
                }
            }
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
        catch (final XmlPullParserException ex2) {
            ex2.printStackTrace();
        }
    }
    
    public final void o(final int n, final int n2, final int n3) {
        final a l = this.l(n);
        switch (n2) {
            default: {
                throw new IllegalArgumentException("unknown constraint");
            }
            case 7: {
                l.H = n3;
                break;
            }
            case 6: {
                l.I = n3;
                break;
            }
            case 5: {
                throw new IllegalArgumentException("baseline does not support margins");
            }
            case 4: {
                l.G = n3;
                break;
            }
            case 3: {
                l.F = n3;
                break;
            }
            case 2: {
                l.E = n3;
                break;
            }
            case 1: {
                l.D = n3;
                break;
            }
        }
    }
    
    public static final class a
    {
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public float Q;
        public float R;
        public int S;
        public int T;
        public float U;
        public boolean V;
        public float W;
        public float X;
        public float Y;
        public float Z;
        public boolean a;
        public float a0;
        public int b;
        public float b0;
        public int c;
        public float c0;
        public int d;
        public float d0;
        public int e;
        public float e0;
        public int f;
        public float f0;
        public float g;
        public float g0;
        public int h;
        public boolean h0;
        public int i;
        public boolean i0;
        public int j;
        public int j0;
        public int k;
        public int k0;
        public int l;
        public int l0;
        public int m;
        public int m0;
        public int n;
        public int n0;
        public int o;
        public int o0;
        public int p;
        public float p0;
        public int q;
        public float q0;
        public int r;
        public boolean r0;
        public int s;
        public int s0;
        public int t;
        public int t0;
        public float u;
        public int[] u0;
        public float v;
        public String v0;
        public String w;
        public int x;
        public int y;
        public float z;
        
        public a() {
            this.a = false;
            this.e = -1;
            this.f = -1;
            this.g = -1.0f;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = 0.5f;
            this.v = 0.5f;
            this.w = null;
            this.x = -1;
            this.y = 0;
            this.z = 0.0f;
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.H = -1;
            this.I = -1;
            this.J = 0;
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = -1;
            this.P = -1;
            this.Q = 0.0f;
            this.R = 0.0f;
            this.S = 0;
            this.T = 0;
            this.U = 1.0f;
            this.V = false;
            this.W = 0.0f;
            this.X = 0.0f;
            this.Y = 0.0f;
            this.Z = 0.0f;
            this.a0 = 1.0f;
            this.b0 = 1.0f;
            this.c0 = Float.NaN;
            this.d0 = Float.NaN;
            this.e0 = 0.0f;
            this.f0 = 0.0f;
            this.g0 = 0.0f;
            this.h0 = false;
            this.i0 = false;
            this.j0 = 0;
            this.k0 = 0;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = 1.0f;
            this.q0 = 1.0f;
            this.r0 = false;
            this.s0 = -1;
            this.t0 = -1;
        }
        
        public final void a(final ConstraintLayout.a a) {
            a.d = this.h;
            a.e = this.i;
            a.f = this.j;
            a.g = this.k;
            a.h = this.l;
            a.i = this.m;
            a.j = this.n;
            a.k = this.o;
            a.l = this.p;
            a.p = this.q;
            a.q = this.r;
            a.r = this.s;
            a.s = this.t;
            a.leftMargin = this.D;
            a.rightMargin = this.E;
            a.topMargin = this.F;
            a.bottomMargin = this.G;
            a.x = this.P;
            a.y = this.O;
            a.z = this.u;
            a.A = this.v;
            a.m = this.x;
            a.n = this.y;
            a.o = this.z;
            a.B = this.w;
            a.P = this.A;
            a.Q = this.B;
            a.E = this.Q;
            a.D = this.R;
            a.G = this.T;
            a.F = this.S;
            a.S = this.h0;
            a.T = this.i0;
            a.H = this.j0;
            a.I = this.k0;
            a.L = this.l0;
            a.M = this.m0;
            a.J = this.n0;
            a.K = this.o0;
            a.N = this.p0;
            a.O = this.q0;
            a.R = this.C;
            a.c = this.g;
            a.a = this.e;
            a.b = this.f;
            a.width = this.b;
            a.height = this.c;
            a.setMarginStart(this.I);
            a.setMarginEnd(this.H);
            a.a();
        }
        
        public final void b(final int d, final ConstraintLayout.a a) {
            this.d = d;
            this.h = a.d;
            this.i = a.e;
            this.j = a.f;
            this.k = a.g;
            this.l = a.h;
            this.m = a.i;
            this.n = a.j;
            this.o = a.k;
            this.p = a.l;
            this.q = a.p;
            this.r = a.q;
            this.s = a.r;
            this.t = a.s;
            this.u = a.z;
            this.v = a.A;
            this.w = a.B;
            this.x = a.m;
            this.y = a.n;
            this.z = a.o;
            this.A = a.P;
            this.B = a.Q;
            this.C = a.R;
            this.g = a.c;
            this.e = a.a;
            this.f = a.b;
            this.b = a.width;
            this.c = a.height;
            this.D = a.leftMargin;
            this.E = a.rightMargin;
            this.F = a.topMargin;
            this.G = a.bottomMargin;
            this.Q = a.E;
            this.R = a.D;
            this.T = a.G;
            this.S = a.F;
            final boolean s = a.S;
            this.i0 = a.T;
            this.j0 = a.H;
            this.k0 = a.I;
            this.h0 = s;
            this.l0 = a.L;
            this.m0 = a.M;
            this.n0 = a.J;
            this.o0 = a.K;
            this.p0 = a.N;
            this.q0 = a.O;
            this.H = a.getMarginEnd();
            this.I = a.getMarginStart();
        }
        
        public final void c(final int n, final c.a a) {
            this.b(n, a);
            this.U = a.l0;
            this.X = a.o0;
            this.Y = a.p0;
            this.Z = a.q0;
            this.a0 = a.r0;
            this.b0 = a.s0;
            this.c0 = a.t0;
            this.d0 = a.u0;
            this.e0 = a.v0;
            this.f0 = a.w0;
            this.g0 = 0.0f;
            this.W = a.n0;
            this.V = a.m0;
        }
        
        public final Object clone() throws CloneNotSupportedException {
            final a a = new a();
            a.a = this.a;
            a.b = this.b;
            a.c = this.c;
            a.e = this.e;
            a.f = this.f;
            a.g = this.g;
            a.h = this.h;
            a.i = this.i;
            a.j = this.j;
            a.k = this.k;
            a.l = this.l;
            a.m = this.m;
            a.n = this.n;
            a.o = this.o;
            a.p = this.p;
            a.q = this.q;
            a.r = this.r;
            a.s = this.s;
            a.t = this.t;
            a.u = this.u;
            a.v = this.v;
            a.w = this.w;
            a.A = this.A;
            a.B = this.B;
            a.u = this.u;
            a.u = this.u;
            a.u = this.u;
            a.u = this.u;
            a.u = this.u;
            a.C = this.C;
            a.D = this.D;
            a.E = this.E;
            a.F = this.F;
            a.G = this.G;
            a.H = this.H;
            a.I = this.I;
            a.J = this.J;
            a.K = this.K;
            a.L = this.L;
            a.M = this.M;
            a.N = this.N;
            a.O = this.O;
            a.P = this.P;
            a.Q = this.Q;
            a.R = this.R;
            a.S = this.S;
            a.T = this.T;
            a.U = this.U;
            a.V = this.V;
            a.W = this.W;
            a.X = this.X;
            a.Y = this.Y;
            a.Z = this.Z;
            a.a0 = this.a0;
            a.b0 = this.b0;
            a.c0 = this.c0;
            a.d0 = this.d0;
            a.e0 = this.e0;
            a.f0 = this.f0;
            a.g0 = this.g0;
            a.h0 = this.h0;
            a.i0 = this.i0;
            a.j0 = this.j0;
            a.k0 = this.k0;
            a.l0 = this.l0;
            a.m0 = this.m0;
            a.n0 = this.n0;
            a.o0 = this.o0;
            a.p0 = this.p0;
            a.q0 = this.q0;
            a.s0 = this.s0;
            a.t0 = this.t0;
            final int[] u0 = this.u0;
            if (u0 != null) {
                a.u0 = Arrays.copyOf(u0, u0.length);
            }
            a.x = this.x;
            a.y = this.y;
            a.z = this.z;
            a.r0 = this.r0;
            return a;
        }
    }
}
