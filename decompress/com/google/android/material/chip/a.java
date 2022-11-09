// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.chip;

import android.graphics.Outline;
import vf.k;
import android.graphics.Rect;
import android.text.TextUtils;
import android.graphics.Paint$Align;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import sf.d;
import q3.e;
import java.util.Arrays;
import android.util.AttributeSet;
import android.graphics.drawable.shapes.Shape;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Paint$FontMetrics;
import android.graphics.Paint;
import android.content.Context;
import ze.g;
import android.text.SpannableStringBuilder;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils$TruncateAt;
import java.lang.ref.WeakReference;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.PorterDuffColorFilter;
import android.graphics.ColorFilter;
import android.graphics.drawable.ShapeDrawable;
import qf.f$b;
import android.graphics.drawable.Drawable$Callback;
import vf.f;

public final class a extends f implements Drawable$Callback, f$b
{
    public static final int[] M0;
    public static final ShapeDrawable N0;
    public ColorFilter A0;
    public PorterDuffColorFilter B0;
    public ColorStateList C0;
    public ColorStateList D;
    public PorterDuff$Mode D0;
    public ColorStateList E;
    public int[] E0;
    public float F;
    public boolean F0;
    public float G;
    public ColorStateList G0;
    public ColorStateList H;
    public WeakReference<a.a$a> H0;
    public float I;
    public TextUtils$TruncateAt I0;
    public ColorStateList J;
    public boolean J0;
    public CharSequence K;
    public int K0;
    public boolean L;
    public boolean L0;
    public Drawable M;
    public ColorStateList N;
    public float O;
    public boolean P;
    public boolean Q;
    public Drawable R;
    public RippleDrawable S;
    public ColorStateList T;
    public float U;
    public SpannableStringBuilder V;
    public boolean W;
    public boolean X;
    public Drawable Y;
    public ColorStateList Z;
    public g a0;
    public g b0;
    public float c0;
    public float d0;
    public float e0;
    public float f0;
    public float g0;
    public float h0;
    public float i0;
    public float j0;
    public final Context k0;
    public final Paint l0;
    public final Paint$FontMetrics m0;
    public final RectF n0;
    public final PointF o0;
    public final Path p0;
    public final qf.f q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public boolean x0;
    public int y0;
    public int z0;
    
    static {
        M0 = new int[] { 16842910 };
        N0 = new ShapeDrawable((Shape)new OvalShape());
    }
    
    public a(final Context k0, final AttributeSet set) {
        super(k0, set, 2130968791, 2132018113);
        this.G = -1.0f;
        this.l0 = new Paint(1);
        this.m0 = new Paint$FontMetrics();
        this.n0 = new RectF();
        this.o0 = new PointF();
        this.p0 = new Path();
        this.z0 = 255;
        this.D0 = PorterDuff$Mode.SRC_IN;
        this.H0 = new WeakReference<a.a$a>(null);
        this.i(k0);
        this.k0 = k0;
        final qf.f q0 = new qf.f((f$b)this);
        this.q0 = q0;
        this.K = "";
        q0.a.density = k0.getResources().getDisplayMetrics().density;
        final int[] m0 = a.M0;
        ((Drawable)this).setState(m0);
        if (!Arrays.equals(this.E0, m0)) {
            this.E0 = m0;
            if (this.Y()) {
                this.B(((Drawable)this).getState(), m0);
            }
        }
        this.J0 = true;
        final int[] a = tf.a.a;
        ((Drawable)com.google.android.material.chip.a.N0).setTint(-1);
    }
    
    public static void Z(final Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable$Callback)null);
        }
    }
    
    public static boolean y(final ColorStateList list) {
        return list != null && list.isStateful();
    }
    
    public static boolean z(final Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }
    
    public final void A() {
        final a.a$a a$a = this.H0.get();
        if (a$a != null) {
            a$a.a();
        }
    }
    
    public final boolean B(int[] a, final int[] state) {
        int onStateChange = super.onStateChange(a) ? 1 : 0;
        final ColorStateList d = this.D;
        int colorForState;
        if (d != null) {
            colorForState = d.getColorForState(a, this.r0);
        }
        else {
            colorForState = 0;
        }
        final int r0 = this.r0;
        int n = 1;
        if (r0 != colorForState) {
            this.r0 = colorForState;
            onStateChange = 1;
        }
        final ColorStateList e = this.E;
        int colorForState2;
        if (e != null) {
            colorForState2 = e.getColorForState(a, this.s0);
        }
        else {
            colorForState2 = 0;
        }
        if (this.s0 != colorForState2) {
            this.s0 = colorForState2;
            onStateChange = 1;
        }
        final int g = q3.e.g(colorForState2, colorForState);
        final boolean b = this.t0 != g;
        final boolean b2 = super.f.c == null;
        int n2 = onStateChange;
        if (b | b2) {
            this.t0 = g;
            this.l(ColorStateList.valueOf(g));
            n2 = 1;
        }
        final ColorStateList h = this.H;
        int colorForState3;
        if (h != null) {
            colorForState3 = h.getColorForState(a, this.u0);
        }
        else {
            colorForState3 = 0;
        }
        if (this.u0 != colorForState3) {
            this.u0 = colorForState3;
            n2 = 1;
        }
        int colorForState4;
        if (this.G0 != null && a.c(a)) {
            colorForState4 = this.G0.getColorForState(a, this.v0);
        }
        else {
            colorForState4 = 0;
        }
        int n3 = n2;
        if (this.v0 != colorForState4) {
            this.v0 = colorForState4;
            n3 = n2;
            if (this.F0) {
                n3 = 1;
            }
        }
        final d f = this.q0.f;
        int colorForState5 = 0;
        Label_0335: {
            if (f != null) {
                final ColorStateList b3 = f.b;
                if (b3 != null) {
                    colorForState5 = b3.getColorForState(a, this.w0);
                    break Label_0335;
                }
            }
            colorForState5 = 0;
        }
        if (this.w0 != colorForState5) {
            this.w0 = colorForState5;
            n3 = 1;
        }
        final int[] state2 = ((Drawable)this).getState();
        boolean b4 = false;
        Label_0407: {
            if (state2 != null) {
                for (int length = state2.length, i = 0; i < length; ++i) {
                    if (state2[i] == 16842912) {
                        b4 = true;
                        break Label_0407;
                    }
                }
            }
            b4 = false;
        }
        final boolean x0 = b4 && this.W;
        int n4;
        if (this.x0 != x0 && this.Y != null) {
            final float v = this.v();
            this.x0 = x0;
            if (v != this.v()) {
                n3 = (n4 = 1);
            }
            else {
                n4 = 0;
                n3 = 1;
            }
        }
        else {
            n4 = 0;
        }
        final ColorStateList c0 = this.C0;
        int colorForState6;
        if (c0 != null) {
            colorForState6 = c0.getColorForState(a, this.y0);
        }
        else {
            colorForState6 = 0;
        }
        if (this.y0 != colorForState6) {
            this.y0 = colorForState6;
            final ColorStateList c2 = this.C0;
            final PorterDuff$Mode d2 = this.D0;
            PorterDuffColorFilter b5;
            if (c2 != null && d2 != null) {
                b5 = new PorterDuffColorFilter(c2.getColorForState(((Drawable)this).getState(), 0), d2);
            }
            else {
                b5 = null;
            }
            this.B0 = b5;
        }
        else {
            n = n3;
        }
        int n5 = n;
        if (z(this.M)) {
            n5 = (n | (this.M.setState(a) ? 1 : 0));
        }
        int n6 = n5;
        if (z(this.Y)) {
            n6 = (n5 | (this.Y.setState(a) ? 1 : 0));
        }
        int n7 = n6;
        if (z(this.R)) {
            final int[] state3 = new int[a.length + state.length];
            System.arraycopy(a, 0, state3, 0, a.length);
            System.arraycopy(state, 0, state3, a.length, state.length);
            n7 = (n6 | (this.R.setState(state3) ? 1 : 0));
        }
        a = a.a;
        int n8 = n7;
        if (z((Drawable)this.S)) {
            n8 = (n7 | (((Drawable)this.S).setState(state) ? 1 : 0));
        }
        if (n8 != 0) {
            this.invalidateSelf();
        }
        if (n4 != 0) {
            this.A();
        }
        return n8 != 0;
    }
    
    public final void C(final boolean w) {
        if (this.W != w) {
            this.W = w;
            final float v = this.v();
            if (!w && this.x0) {
                this.x0 = false;
            }
            final float v2 = this.v();
            this.invalidateSelf();
            if (v != v2) {
                this.A();
            }
        }
    }
    
    public final void D(final Drawable y) {
        if (this.Y != y) {
            final float v = this.v();
            this.Y = y;
            final float v2 = this.v();
            Z(this.Y);
            this.t(this.Y);
            this.invalidateSelf();
            if (v != v2) {
                this.A();
            }
        }
    }
    
    public final void E(final ColorStateList z) {
        if (this.Z != z) {
            this.Z = z;
            if (this.X && this.Y != null && this.W) {
                r3.a.b.h(this.Y, z);
            }
            this.onStateChange(((Drawable)this).getState());
        }
    }
    
    public final void F(final boolean x) {
        if (this.X != x) {
            final boolean w = this.W();
            this.X = x;
            final boolean w2 = this.W();
            if (w != w2) {
                if (w2) {
                    this.t(this.Y);
                }
                else {
                    Z(this.Y);
                }
                this.invalidateSelf();
                this.A();
            }
        }
    }
    
    @Deprecated
    public final void G(final float g) {
        if (this.G != g) {
            this.G = g;
            this.setShapeAppearanceModel(super.f.a.d(g));
        }
    }
    
    public final void H(final Drawable drawable) {
        final Drawable m = this.M;
        Drawable mutate = null;
        Drawable b;
        if (m != null) {
            b = m;
            if (m instanceof r3.d) {
                b = ((r3.d)m).b();
            }
        }
        else {
            b = null;
        }
        if (b != drawable) {
            final float v = this.v();
            if (drawable != null) {
                mutate = drawable.mutate();
            }
            this.M = mutate;
            final float v2 = this.v();
            Z(b);
            if (this.X()) {
                this.t(this.M);
            }
            this.invalidateSelf();
            if (v != v2) {
                this.A();
            }
        }
    }
    
    public final void I(float v) {
        if (this.O != v) {
            final float v2 = this.v();
            this.O = v;
            v = this.v();
            this.invalidateSelf();
            if (v2 != v) {
                this.A();
            }
        }
    }
    
    public final void J(final ColorStateList n) {
        this.P = true;
        if (this.N != n) {
            this.N = n;
            if (this.X()) {
                r3.a.b.h(this.M, n);
            }
            this.onStateChange(((Drawable)this).getState());
        }
    }
    
    public final void K(final boolean l) {
        if (this.L != l) {
            final boolean x = this.X();
            this.L = l;
            final boolean x2 = this.X();
            if (x != x2) {
                if (x2) {
                    this.t(this.M);
                }
                else {
                    Z(this.M);
                }
                this.invalidateSelf();
                this.A();
            }
        }
    }
    
    public final void L(final ColorStateList list) {
        if (this.H != list) {
            this.H = list;
            if (this.L0) {
                final vf.f$b f = super.f;
                if (f.d != list) {
                    f.d = list;
                    this.onStateChange(((Drawable)this).getState());
                }
            }
            this.onStateChange(((Drawable)this).getState());
        }
    }
    
    public final void M(final float k) {
        if (this.I != k) {
            this.I = k;
            this.l0.setStrokeWidth(k);
            if (this.L0) {
                super.f.k = k;
                this.invalidateSelf();
            }
            this.invalidateSelf();
        }
    }
    
    public final void N(final Drawable drawable) {
        final Drawable r = this.R;
        Drawable mutate = null;
        Drawable b;
        if (r != null) {
            b = r;
            if (r instanceof r3.d) {
                b = ((r3.d)r).b();
            }
        }
        else {
            b = null;
        }
        if (b != drawable) {
            final float w = this.w();
            if (drawable != null) {
                mutate = drawable.mutate();
            }
            this.R = mutate;
            final int[] a = tf.a.a;
            this.S = new RippleDrawable(tf.a.b(this.J), this.R, (Drawable)com.google.android.material.chip.a.N0);
            final float w2 = this.w();
            Z(b);
            if (this.Y()) {
                this.t(this.R);
            }
            this.invalidateSelf();
            if (w != w2) {
                this.A();
            }
        }
    }
    
    public final void O(final float i0) {
        if (this.i0 != i0) {
            this.i0 = i0;
            this.invalidateSelf();
            if (this.Y()) {
                this.A();
            }
        }
    }
    
    public final void P(final float u) {
        if (this.U != u) {
            this.U = u;
            this.invalidateSelf();
            if (this.Y()) {
                this.A();
            }
        }
    }
    
    public final void Q(final float h0) {
        if (this.h0 != h0) {
            this.h0 = h0;
            this.invalidateSelf();
            if (this.Y()) {
                this.A();
            }
        }
    }
    
    public final void R(final ColorStateList t) {
        if (this.T != t) {
            this.T = t;
            if (this.Y()) {
                r3.a.b.h(this.R, t);
            }
            this.onStateChange(((Drawable)this).getState());
        }
    }
    
    public final void S(final boolean q) {
        if (this.Q != q) {
            final boolean y = this.Y();
            this.Q = q;
            final boolean y2 = this.Y();
            if (y != y2) {
                if (y2) {
                    this.t(this.R);
                }
                else {
                    Z(this.R);
                }
                this.invalidateSelf();
                this.A();
            }
        }
    }
    
    public final void T(float v) {
        if (this.e0 != v) {
            final float v2 = this.v();
            this.e0 = v;
            v = this.v();
            this.invalidateSelf();
            if (v2 != v) {
                this.A();
            }
        }
    }
    
    public final void U(float v) {
        if (this.d0 != v) {
            final float v2 = this.v();
            this.d0 = v;
            v = this.v();
            this.invalidateSelf();
            if (v2 != v) {
                this.A();
            }
        }
    }
    
    public final void V(ColorStateList b) {
        if (this.J != b) {
            this.J = b;
            if (this.F0) {
                b = tf.a.b(b);
            }
            else {
                b = null;
            }
            this.G0 = b;
            this.onStateChange(((Drawable)this).getState());
        }
    }
    
    public final boolean W() {
        return this.X && this.Y != null && this.x0;
    }
    
    public final boolean X() {
        return this.L && this.M != null;
    }
    
    public final boolean Y() {
        return this.Q && this.R != null;
    }
    
    public final void a() {
        this.A();
        this.invalidateSelf();
    }
    
    public final void draw(final Canvas canvas) {
        final Rect bounds = ((Drawable)this).getBounds();
        if (!bounds.isEmpty()) {
            final int z0 = this.z0;
            if (z0 != 0) {
                int saveLayerAlpha;
                if (z0 < 255) {
                    saveLayerAlpha = canvas.saveLayerAlpha((float)bounds.left, (float)bounds.top, (float)bounds.right, (float)bounds.bottom, z0);
                }
                else {
                    saveLayerAlpha = 0;
                }
                if (!this.L0) {
                    this.l0.setColor(this.r0);
                    this.l0.setStyle(Paint$Style.FILL);
                    this.n0.set(bounds);
                    canvas.drawRoundRect(this.n0, this.x(), this.x(), this.l0);
                }
                if (!this.L0) {
                    this.l0.setColor(this.s0);
                    this.l0.setStyle(Paint$Style.FILL);
                    final Paint l0 = this.l0;
                    Object colorFilter = this.A0;
                    if (colorFilter == null) {
                        colorFilter = this.B0;
                    }
                    l0.setColorFilter((ColorFilter)colorFilter);
                    this.n0.set(bounds);
                    canvas.drawRoundRect(this.n0, this.x(), this.x(), this.l0);
                }
                if (this.L0) {
                    super.draw(canvas);
                }
                if (this.I > 0.0f && !this.L0) {
                    this.l0.setColor(this.u0);
                    this.l0.setStyle(Paint$Style.STROKE);
                    if (!this.L0) {
                        final Paint l2 = this.l0;
                        Object colorFilter2 = this.A0;
                        if (colorFilter2 == null) {
                            colorFilter2 = this.B0;
                        }
                        l2.setColorFilter((ColorFilter)colorFilter2);
                    }
                    final RectF n0 = this.n0;
                    final float n2 = (float)bounds.left;
                    final float n3 = this.I / 2.0f;
                    n0.set(n2 + n3, bounds.top + n3, bounds.right - n3, bounds.bottom - n3);
                    final float n4 = this.G - this.I / 2.0f;
                    canvas.drawRoundRect(this.n0, n4, n4, this.l0);
                }
                this.l0.setColor(this.v0);
                this.l0.setStyle(Paint$Style.FILL);
                this.n0.set(bounds);
                if (!this.L0) {
                    canvas.drawRoundRect(this.n0, this.x(), this.x(), this.l0);
                }
                else {
                    final RectF rectF = new RectF(bounds);
                    final Path p = this.p0;
                    final k w = super.w;
                    final vf.f$b f = super.f;
                    w.a(f.a, f.j, rectF, super.v, p);
                    this.f(canvas, this.l0, this.p0, super.f.a, this.g());
                }
                if (this.X()) {
                    this.u(bounds, this.n0);
                    final RectF n5 = this.n0;
                    final float left = n5.left;
                    final float top = n5.top;
                    canvas.translate(left, top);
                    this.M.setBounds(0, 0, (int)this.n0.width(), (int)this.n0.height());
                    this.M.draw(canvas);
                    canvas.translate(-left, -top);
                }
                if (this.W()) {
                    this.u(bounds, this.n0);
                    final RectF n6 = this.n0;
                    final float left2 = n6.left;
                    final float top2 = n6.top;
                    canvas.translate(left2, top2);
                    this.Y.setBounds(0, 0, (int)this.n0.width(), (int)this.n0.height());
                    this.Y.draw(canvas);
                    canvas.translate(-left2, -top2);
                }
                if (this.J0 && this.K != null) {
                    final PointF o0 = this.o0;
                    o0.set(0.0f, 0.0f);
                    Paint$Align textAlign = Paint$Align.LEFT;
                    if (this.K != null) {
                        final float n7 = this.v() + this.c0 + this.f0;
                        if (r3.a.c.a((Drawable)this) == 0) {
                            o0.x = bounds.left + n7;
                            textAlign = Paint$Align.LEFT;
                        }
                        else {
                            o0.x = bounds.right - n7;
                            textAlign = Paint$Align.RIGHT;
                        }
                        final float n8 = (float)bounds.centerY();
                        ((Paint)this.q0.a).getFontMetrics(this.m0);
                        final Paint$FontMetrics m0 = this.m0;
                        o0.y = n8 - (m0.descent + m0.ascent) / 2.0f;
                    }
                    final RectF n9 = this.n0;
                    n9.setEmpty();
                    if (this.K != null) {
                        final float n10 = this.v() + this.c0 + this.f0;
                        final float n11 = this.w() + this.j0 + this.g0;
                        if (r3.a.c.a((Drawable)this) == 0) {
                            n9.left = bounds.left + n10;
                            n9.right = bounds.right - n11;
                        }
                        else {
                            n9.left = bounds.left + n11;
                            n9.right = bounds.right - n10;
                        }
                        n9.top = (float)bounds.top;
                        n9.bottom = (float)bounds.bottom;
                    }
                    final qf.f q0 = this.q0;
                    if (q0.f != null) {
                        q0.a.drawableState = ((Drawable)this).getState();
                        final qf.f q2 = this.q0;
                        q2.f.c(this.k0, q2.a, (bj2.d)q2.b);
                    }
                    ((Paint)this.q0.a).setTextAlign(textAlign);
                    final boolean b = Math.round(this.q0.a(this.K.toString())) > Math.round(this.n0.width());
                    int save;
                    if (b) {
                        save = canvas.save();
                        canvas.clipRect(this.n0);
                    }
                    else {
                        save = 0;
                    }
                    CharSequence charSequence2;
                    final CharSequence charSequence = charSequence2 = this.K;
                    if (b) {
                        charSequence2 = charSequence;
                        if (this.I0 != null) {
                            charSequence2 = TextUtils.ellipsize(charSequence, this.q0.a, this.n0.width(), this.I0);
                        }
                    }
                    final int length = charSequence2.length();
                    final PointF o2 = this.o0;
                    canvas.drawText(charSequence2, 0, length, o2.x, o2.y, (Paint)this.q0.a);
                    if (b) {
                        canvas.restoreToCount(save);
                    }
                }
                if (this.Y()) {
                    final RectF n12 = this.n0;
                    n12.setEmpty();
                    if (this.Y()) {
                        final float n13 = this.j0 + this.i0;
                        if (r3.a.c.a((Drawable)this) == 0) {
                            final float right = bounds.right - n13;
                            n12.right = right;
                            n12.left = right - this.U;
                        }
                        else {
                            final float left3 = bounds.left + n13;
                            n12.left = left3;
                            n12.right = left3 + this.U;
                        }
                        final float exactCenterY = bounds.exactCenterY();
                        final float u = this.U;
                        final float top3 = exactCenterY - u / 2.0f;
                        n12.top = top3;
                        n12.bottom = top3 + u;
                    }
                    final RectF n14 = this.n0;
                    final float left4 = n14.left;
                    final float top4 = n14.top;
                    canvas.translate(left4, top4);
                    this.R.setBounds(0, 0, (int)this.n0.width(), (int)this.n0.height());
                    final int[] a = tf.a.a;
                    ((Drawable)this.S).setBounds(this.R.getBounds());
                    ((Drawable)this.S).jumpToCurrentState();
                    ((Drawable)this.S).draw(canvas);
                    canvas.translate(-left4, -top4);
                }
                if (this.z0 < 255) {
                    canvas.restoreToCount(saveLayerAlpha);
                }
            }
        }
    }
    
    public final int getAlpha() {
        return this.z0;
    }
    
    public final ColorFilter getColorFilter() {
        return this.A0;
    }
    
    public final int getIntrinsicHeight() {
        return (int)this.F;
    }
    
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(this.w() + (this.q0.a(this.K.toString()) + (this.v() + this.c0 + this.f0) + this.g0) + this.j0), this.K0);
    }
    
    public final int getOpacity() {
        return -3;
    }
    
    public final void getOutline(final Outline outline) {
        if (this.L0) {
            super.getOutline(outline);
            return;
        }
        final Rect bounds = ((Drawable)this).getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.G);
        }
        else {
            outline.setRoundRect(0, 0, this.getIntrinsicWidth(), (int)this.F, this.G);
        }
        outline.setAlpha(this.z0 / 255.0f);
    }
    
    public final void invalidateDrawable(final Drawable drawable) {
        final Drawable$Callback callback = ((Drawable)this).getCallback();
        if (callback != null) {
            callback.invalidateDrawable((Drawable)this);
        }
    }
    
    public final boolean isStateful() {
        final boolean y = y(this.D);
        boolean b2;
        final boolean b = b2 = true;
        if (!y) {
            b2 = b;
            if (!y(this.E)) {
                b2 = b;
                if (!y(this.H)) {
                    if (this.F0) {
                        b2 = b;
                        if (y(this.G0)) {
                            return b2;
                        }
                    }
                    final d f = this.q0.f;
                    boolean b4 = false;
                    Label_0102: {
                        if (f != null) {
                            final ColorStateList b3 = f.b;
                            if (b3 != null && b3.isStateful()) {
                                b4 = true;
                                break Label_0102;
                            }
                        }
                        b4 = false;
                    }
                    b2 = b;
                    if (!b4) {
                        final boolean b5 = this.X && this.Y != null && this.W;
                        b2 = b;
                        if (!b5) {
                            b2 = b;
                            if (!z(this.M)) {
                                b2 = b;
                                if (!z(this.Y)) {
                                    b2 = (y(this.C0) && b);
                                }
                            }
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    public final boolean onLayoutDirectionChanged(final int n) {
        boolean onLayoutDirectionChanged;
        final boolean b = onLayoutDirectionChanged = super.onLayoutDirectionChanged(n);
        if (this.X()) {
            onLayoutDirectionChanged = (b | r3.a.c.b(this.M, n));
        }
        boolean b2 = onLayoutDirectionChanged;
        if (this.W()) {
            b2 = (onLayoutDirectionChanged | r3.a.c.b(this.Y, n));
        }
        int n2 = b2 ? 1 : 0;
        if (this.Y()) {
            n2 = ((b2 | r3.a.c.b(this.R, n)) ? 1 : 0);
        }
        if (n2 != 0) {
            this.invalidateSelf();
        }
        return true;
    }
    
    public final boolean onLevelChange(final int level) {
        boolean onLevelChange;
        final boolean b = onLevelChange = super.onLevelChange(level);
        if (this.X()) {
            onLevelChange = (b | this.M.setLevel(level));
        }
        boolean b2 = onLevelChange;
        if (this.W()) {
            b2 = (onLevelChange | this.Y.setLevel(level));
        }
        boolean b3 = b2;
        if (this.Y()) {
            b3 = (b2 | this.R.setLevel(level));
        }
        if (b3) {
            this.invalidateSelf();
        }
        return b3;
    }
    
    public final boolean onStateChange(final int[] array) {
        if (this.L0) {
            super.onStateChange(array);
        }
        return this.B(array, this.E0);
    }
    
    public final void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        final Drawable$Callback callback = ((Drawable)this).getCallback();
        if (callback != null) {
            callback.scheduleDrawable((Drawable)this, runnable, n);
        }
    }
    
    public final void setAlpha(final int z0) {
        if (this.z0 != z0) {
            this.z0 = z0;
            this.invalidateSelf();
        }
    }
    
    public final void setColorFilter(final ColorFilter a0) {
        if (this.A0 != a0) {
            this.A0 = a0;
            this.invalidateSelf();
        }
    }
    
    public final void setTintList(final ColorStateList c0) {
        if (this.C0 != c0) {
            this.C0 = c0;
            this.onStateChange(((Drawable)this).getState());
        }
    }
    
    public final void setTintMode(final PorterDuff$Mode d0) {
        if (this.D0 != d0) {
            this.D0 = d0;
            final ColorStateList c0 = this.C0;
            PorterDuffColorFilter b0;
            if (c0 != null && d0 != null) {
                b0 = new PorterDuffColorFilter(c0.getColorForState(((Drawable)this).getState(), 0), d0);
            }
            else {
                b0 = null;
            }
            this.B0 = b0;
            this.invalidateSelf();
        }
    }
    
    public final boolean setVisible(final boolean b, final boolean b2) {
        boolean setVisible;
        final boolean b3 = setVisible = super.setVisible(b, b2);
        if (this.X()) {
            setVisible = (b3 | this.M.setVisible(b, b2));
        }
        boolean b4 = setVisible;
        if (this.W()) {
            b4 = (setVisible | this.Y.setVisible(b, b2));
        }
        boolean b5 = b4;
        if (this.Y()) {
            b5 = (b4 | this.R.setVisible(b, b2));
        }
        if (b5) {
            this.invalidateSelf();
        }
        return b5;
    }
    
    public final void t(final Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback((Drawable$Callback)this);
        r3.a.c.b(drawable, r3.a.c.a((Drawable)this));
        drawable.setLevel(((Drawable)this).getLevel());
        drawable.setVisible(((Drawable)this).isVisible(), false);
        if (drawable == this.R) {
            if (drawable.isStateful()) {
                drawable.setState(this.E0);
            }
            r3.a.b.h(drawable, this.T);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(((Drawable)this).getState());
        }
        final Drawable m = this.M;
        if (drawable == m && this.P) {
            r3.a.b.h(m, this.N);
        }
    }
    
    public final void u(final Rect rect, final RectF rectF) {
        rectF.setEmpty();
        if (this.X() || this.W()) {
            final float n = this.c0 + this.d0;
            if (r3.a.c.a((Drawable)this) == 0) {
                final float left = rect.left + n;
                rectF.left = left;
                rectF.right = left + this.O;
            }
            else {
                final float right = rect.right - n;
                rectF.right = right;
                rectF.left = right - this.O;
            }
            final float exactCenterY = rect.exactCenterY();
            final float o = this.O;
            final float top = exactCenterY - o / 2.0f;
            rectF.top = top;
            rectF.bottom = top + o;
        }
    }
    
    public final void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        final Drawable$Callback callback = ((Drawable)this).getCallback();
        if (callback != null) {
            callback.unscheduleDrawable((Drawable)this, runnable);
        }
    }
    
    public final float v() {
        if (!this.X() && !this.W()) {
            return 0.0f;
        }
        return this.d0 + this.O + this.e0;
    }
    
    public final float w() {
        if (this.Y()) {
            return this.h0 + this.U + this.i0;
        }
        return 0.0f;
    }
    
    public final float x() {
        float n;
        if (this.L0) {
            n = this.h();
        }
        else {
            n = this.G;
        }
        return n;
    }
}
