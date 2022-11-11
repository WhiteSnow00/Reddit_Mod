// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.ui;

import android.os.Looper;
import bc.a;
import com.google.android.exoplayer2.e0;
import java.util.Arrays;
import ad.d0;
import ad.c0;
import android.view.MotionEvent;
import android.os.SystemClock;
import java.util.Iterator;
import android.view.KeyEvent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.Locale;
import pd.r;
import android.util.AttributeSet;
import android.content.Context;
import androidx.appcompat.widget.e1;
import androidx.activity.b;
import com.google.android.exoplayer2.e0$c;
import com.google.android.exoplayer2.e0$b;
import java.util.Formatter;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;
import com.google.android.exoplayer2.w;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

public final class c extends FrameLayout
{
    public final Drawable A;
    public final Drawable B;
    public final String C;
    public final String D;
    public final String E;
    public final Drawable F;
    public final Drawable G;
    public final float H;
    public final float I;
    public final String J;
    public final String K;
    public w L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean a0;
    public long b0;
    public long[] c0;
    public boolean[] d0;
    public long[] e0;
    public final c$b f;
    public boolean[] f0;
    public final CopyOnWriteArrayList<d> g;
    public long g0;
    public final View h;
    public long h0;
    public final View i;
    public long i0;
    public final View j;
    public final View k;
    public final View l;
    public final View m;
    public final ImageView n;
    public final ImageView o;
    public final View p;
    public final TextView q;
    public final TextView r;
    public final e s;
    public final StringBuilder t;
    public final Formatter u;
    public final e0$b v;
    public final e0$c w;
    public final b x;
    public final e1 y;
    public final Drawable z;
    
    static {
        va.w.a("goog.exo.ui");
    }
    
    public c(final Context context, final AttributeSet set) {
        super(context, (AttributeSet)null, 0);
        this.Q = 5000;
        this.S = 0;
        this.R = 200;
        this.b0 = -9223372036854775807L;
        this.T = true;
        this.U = true;
        this.V = true;
        this.W = true;
        this.a0 = false;
        int resourceId = 2131624247;
        if (set != null) {
            final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(set, pd.r.Z, 0, 0);
            try {
                this.Q = obtainStyledAttributes.getInt(19, this.Q);
                resourceId = obtainStyledAttributes.getResourceId(5, 2131624247);
                this.S = obtainStyledAttributes.getInt(8, this.S);
                this.T = obtainStyledAttributes.getBoolean(17, this.T);
                this.U = obtainStyledAttributes.getBoolean(14, this.U);
                this.V = obtainStyledAttributes.getBoolean(16, this.V);
                this.W = obtainStyledAttributes.getBoolean(15, this.W);
                this.a0 = obtainStyledAttributes.getBoolean(18, this.a0);
                this.setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(20, this.R));
            }
            finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.g = new CopyOnWriteArrayList<d>();
        this.v = new e0$b();
        this.w = new e0$c();
        final StringBuilder t = new StringBuilder();
        this.t = t;
        this.u = new Formatter(t, Locale.getDefault());
        this.c0 = new long[0];
        this.d0 = new boolean[0];
        this.e0 = new long[0];
        this.f0 = new boolean[0];
        final c$b onClickListener = new c$b(this);
        this.f = onClickListener;
        this.x = new b((Object)this, 10);
        this.y = new e1((Object)this, 9);
        LayoutInflater.from(context).inflate(resourceId, (ViewGroup)this);
        ((ViewGroup)this).setDescendantFocusability(262144);
        final e s = (e)((View)this).findViewById(2131428970);
        final View viewById = ((View)this).findViewById(2131428972);
        if (s != null) {
            this.s = s;
        }
        else if (viewById != null) {
            final com.google.android.exoplayer2.ui.b s2 = new com.google.android.exoplayer2.ui.b(context, set);
            ((View)s2).setId(2131428970);
            ((View)s2).setLayoutParams(viewById.getLayoutParams());
            final ViewGroup viewGroup = (ViewGroup)viewById.getParent();
            final int indexOfChild = viewGroup.indexOfChild(viewById);
            viewGroup.removeView(viewById);
            viewGroup.addView((View)s2, indexOfChild);
            this.s = (e)s2;
        }
        else {
            this.s = null;
        }
        this.q = (TextView)((View)this).findViewById(2131428943);
        this.r = (TextView)((View)this).findViewById(2131428968);
        final e s3 = this.s;
        if (s3 != null) {
            s3.b(onClickListener);
        }
        final View viewById2 = ((View)this).findViewById(2131428964);
        if ((this.j = viewById2) != null) {
            viewById2.setOnClickListener((View$OnClickListener)onClickListener);
        }
        final View viewById3 = ((View)this).findViewById(2131428963);
        if ((this.k = viewById3) != null) {
            viewById3.setOnClickListener((View$OnClickListener)onClickListener);
        }
        final View viewById4 = ((View)this).findViewById(2131428969);
        if ((this.h = viewById4) != null) {
            viewById4.setOnClickListener((View$OnClickListener)onClickListener);
        }
        final View viewById5 = ((View)this).findViewById(2131428958);
        if ((this.i = viewById5) != null) {
            viewById5.setOnClickListener((View$OnClickListener)onClickListener);
        }
        final View viewById6 = ((View)this).findViewById(2131428976);
        if ((this.m = viewById6) != null) {
            viewById6.setOnClickListener((View$OnClickListener)onClickListener);
        }
        final View viewById7 = ((View)this).findViewById(2131428947);
        if ((this.l = viewById7) != null) {
            viewById7.setOnClickListener((View$OnClickListener)onClickListener);
        }
        final ImageView n = (ImageView)((View)this).findViewById(2131428974);
        if ((this.n = n) != null) {
            ((View)n).setOnClickListener((View$OnClickListener)onClickListener);
        }
        final ImageView o = (ImageView)((View)this).findViewById(2131428980);
        if ((this.o = o) != null) {
            ((View)o).setOnClickListener((View$OnClickListener)onClickListener);
        }
        final View viewById8 = ((View)this).findViewById(2131428992);
        this.p = viewById8;
        this.setShowVrButton(false);
        this.g(viewById8, false, false);
        final Resources resources = context.getResources();
        this.H = resources.getInteger(2131492879) / 100.0f;
        this.I = resources.getInteger(2131492878) / 100.0f;
        this.z = resources.getDrawable(2131231214);
        this.A = resources.getDrawable(2131231215);
        this.B = resources.getDrawable(2131231213);
        this.F = resources.getDrawable(2131231218);
        this.G = resources.getDrawable(2131231217);
        this.C = resources.getString(2131953412);
        this.D = resources.getString(2131953413);
        this.E = resources.getString(2131953411);
        this.J = resources.getString(2131953419);
        this.K = resources.getString(2131953418);
        this.h0 = -9223372036854775807L;
        this.i0 = -9223372036854775807L;
    }
    
    public static void b(final w w) {
        final int g = w.g();
        if (g == 1) {
            w.prepare();
        }
        else if (g == 4) {
            w.N(w.S(), -9223372036854775807L);
        }
        w.play();
    }
    
    public final boolean a(final KeyEvent keyEvent) {
        final int keyCode = keyEvent.getKeyCode();
        final w l = this.L;
        if (l != null && (keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88)) {
            if (keyEvent.getAction() == 0) {
                if (keyCode == 90) {
                    if (l.g() != 4) {
                        l.y();
                    }
                }
                else if (keyCode == 89) {
                    l.W();
                }
                else if (keyEvent.getRepeatCount() == 0) {
                    if (keyCode != 79 && keyCode != 85) {
                        if (keyCode != 87) {
                            if (keyCode != 88) {
                                if (keyCode != 126) {
                                    if (keyCode == 127) {
                                        l.pause();
                                    }
                                }
                                else {
                                    b(l);
                                }
                            }
                            else {
                                l.C();
                            }
                        }
                        else {
                            l.K();
                        }
                    }
                    else {
                        final int g = l.g();
                        if (g != 1 && g != 4 && l.o()) {
                            l.pause();
                        }
                        else {
                            b(l);
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public final void c() {
        if (this.e()) {
            ((View)this).setVisibility(8);
            for (final d d : this.g) {
                ((View)this).getVisibility();
                d.j();
            }
            ((View)this).removeCallbacks((Runnable)this.x);
            ((View)this).removeCallbacks((Runnable)this.y);
            this.b0 = -9223372036854775807L;
        }
    }
    
    public final void d() {
        ((View)this).removeCallbacks((Runnable)this.y);
        if (this.Q > 0) {
            final long uptimeMillis = SystemClock.uptimeMillis();
            final long n = this.Q;
            this.b0 = uptimeMillis + n;
            if (this.M) {
                ((View)this).postDelayed((Runnable)this.y, n);
            }
        }
        else {
            this.b0 = -9223372036854775807L;
        }
    }
    
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return this.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }
    
    public final boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ((View)this).removeCallbacks((Runnable)this.y);
        }
        else if (motionEvent.getAction() == 1) {
            this.d();
        }
        return super.dispatchTouchEvent(motionEvent);
    }
    
    public final boolean e() {
        return ((View)this).getVisibility() == 0;
    }
    
    public final boolean f() {
        final w l = this.L;
        boolean b = true;
        if (l == null || l.g() == 4 || this.L.g() == 1 || !this.L.o()) {
            b = false;
        }
        return b;
    }
    
    public final void g(final View view, final boolean b, final boolean enabled) {
        if (view == null) {
            return;
        }
        view.setEnabled(enabled);
        float alpha;
        if (enabled) {
            alpha = this.H;
        }
        else {
            alpha = this.I;
        }
        view.setAlpha(alpha);
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        view.setVisibility(visibility);
    }
    
    public w getPlayer() {
        return this.L;
    }
    
    public int getRepeatToggleModes() {
        return this.S;
    }
    
    public boolean getShowShuffleButton() {
        return this.a0;
    }
    
    public int getShowTimeoutMs() {
        return this.Q;
    }
    
    public boolean getShowVrButton() {
        final View p = this.p;
        return p != null && p.getVisibility() == 0;
    }
    
    public final void h() {
        if (this.e()) {
            if (this.M) {
                final w l = this.L;
                boolean n = false;
                boolean n2;
                boolean n3;
                boolean n4;
                boolean n5;
                if (l != null) {
                    n2 = l.n(5);
                    n = l.n(7);
                    n3 = l.n(11);
                    n4 = l.n(12);
                    n5 = l.n(9);
                }
                else {
                    final boolean b = n2 = false;
                    n4 = (n3 = n2);
                    n5 = b;
                }
                this.g(this.h, this.V, n);
                this.g(this.m, this.T, n3);
                this.g(this.l, this.U, n4);
                this.g(this.i, this.W, n5);
                final e s = this.s;
                if (s != null) {
                    s.setEnabled(n2);
                }
            }
        }
    }
    
    public final void i() {
        if (this.e()) {
            if (this.M) {
                final boolean f = this.f();
                final View j = this.j;
                final int n = 1;
                final int n2 = 0;
                int n3;
                int n6;
                if (j != null) {
                    n3 = (((f && j.isFocused()) | false) ? 1 : 0);
                    int n4;
                    if (ad.c0.a < 21) {
                        n4 = n3;
                    }
                    else if (f && a.a(this.j)) {
                        n4 = 1;
                    }
                    else {
                        n4 = 0;
                    }
                    final int n5 = n4 | 0x0;
                    final View i = this.j;
                    int visibility;
                    if (f) {
                        visibility = 8;
                    }
                    else {
                        visibility = 0;
                    }
                    i.setVisibility(visibility);
                    n6 = n5;
                }
                else {
                    n3 = (n6 = 0);
                }
                final View k = this.k;
                int n7 = n3;
                int n8 = n6;
                if (k != null) {
                    n7 = (n3 | ((!f && k.isFocused()) ? 1 : 0));
                    int n9;
                    if (ad.c0.a < 21) {
                        n9 = n7;
                    }
                    else if (!f && a.a(this.k)) {
                        n9 = n;
                    }
                    else {
                        n9 = 0;
                    }
                    n8 = (n6 | n9);
                    final View l = this.k;
                    int visibility2;
                    if (f) {
                        visibility2 = n2;
                    }
                    else {
                        visibility2 = 8;
                    }
                    l.setVisibility(visibility2);
                }
                Label_0309: {
                    if (n7 != 0) {
                        final boolean f2 = this.f();
                        if (!f2) {
                            final View m = this.j;
                            if (m != null) {
                                m.requestFocus();
                                break Label_0309;
                            }
                        }
                        if (f2) {
                            final View k2 = this.k;
                            if (k2 != null) {
                                k2.requestFocus();
                            }
                        }
                    }
                }
                if (n8 != 0) {
                    final boolean f3 = this.f();
                    if (!f3) {
                        final View j2 = this.j;
                        if (j2 != null) {
                            j2.sendAccessibilityEvent(8);
                            return;
                        }
                    }
                    if (f3) {
                        final View k3 = this.k;
                        if (k3 != null) {
                            k3.sendAccessibilityEvent(8);
                        }
                    }
                }
            }
        }
    }
    
    public final void j() {
        if (this.e()) {
            if (this.M) {
                final w l = this.L;
                long n = 0L;
                long n2;
                if (l != null) {
                    n = this.g0 + l.Q();
                    n2 = this.g0 + l.x();
                }
                else {
                    n2 = 0L;
                }
                final long h0 = this.h0;
                boolean b = false;
                if (n != h0) {
                    b = true;
                }
                this.h0 = n;
                this.i0 = n2;
                final TextView r = this.r;
                if (r != null && !this.P && b) {
                    r.setText((CharSequence)ad.c0.A(this.t, this.u, n));
                }
                final e s = this.s;
                if (s != null) {
                    s.setPosition(n);
                    this.s.setBufferedPosition(n2);
                }
                ((View)this).removeCallbacks((Runnable)this.x);
                int g;
                if (l == null) {
                    g = 1;
                }
                else {
                    g = l.g();
                }
                final long n3 = 1000L;
                if (l != null && l.isPlaying()) {
                    final e s2 = this.s;
                    long preferredUpdateDelay;
                    if (s2 != null) {
                        preferredUpdateDelay = s2.getPreferredUpdateDelay();
                    }
                    else {
                        preferredUpdateDelay = 1000L;
                    }
                    final long min = Math.min(preferredUpdateDelay, 1000L - n % 1000L);
                    final float f = l.c().f;
                    long n4 = n3;
                    if (f > 0.0f) {
                        n4 = (long)(min / f);
                    }
                    ((View)this).postDelayed((Runnable)this.x, ad.c0.j(n4, this.R, 1000L));
                }
                else if (g != 4 && g != 1) {
                    ((View)this).postDelayed((Runnable)this.x, 1000L);
                }
            }
        }
    }
    
    public final void k() {
        if (this.e() && this.M) {
            final ImageView n = this.n;
            if (n != null) {
                if (this.S == 0) {
                    this.g((View)n, false, false);
                    return;
                }
                final w l = this.L;
                if (l == null) {
                    this.g((View)n, true, false);
                    this.n.setImageDrawable(this.z);
                    ((View)this.n).setContentDescription((CharSequence)this.C);
                    return;
                }
                this.g((View)n, true, true);
                final int m = l.m();
                if (m != 0) {
                    if (m != 1) {
                        if (m == 2) {
                            this.n.setImageDrawable(this.B);
                            ((View)this.n).setContentDescription((CharSequence)this.E);
                        }
                    }
                    else {
                        this.n.setImageDrawable(this.A);
                        ((View)this.n).setContentDescription((CharSequence)this.D);
                    }
                }
                else {
                    this.n.setImageDrawable(this.z);
                    ((View)this.n).setContentDescription((CharSequence)this.C);
                }
                this.n.setVisibility(0);
            }
        }
    }
    
    public final void l() {
        if (this.e() && this.M) {
            final ImageView o = this.o;
            if (o != null) {
                final w l = this.L;
                if (!this.a0) {
                    this.g((View)o, false, false);
                }
                else if (l == null) {
                    this.g((View)o, true, false);
                    this.o.setImageDrawable(this.G);
                    ((View)this.o).setContentDescription((CharSequence)this.K);
                }
                else {
                    this.g((View)o, true, true);
                    final ImageView o2 = this.o;
                    Drawable imageDrawable;
                    if (l.V()) {
                        imageDrawable = this.F;
                    }
                    else {
                        imageDrawable = this.G;
                    }
                    o2.setImageDrawable(imageDrawable);
                    final ImageView o3 = this.o;
                    String contentDescription;
                    if (l.V()) {
                        contentDescription = this.J;
                    }
                    else {
                        contentDescription = this.K;
                    }
                    ((View)o3).setContentDescription((CharSequence)contentDescription);
                }
            }
        }
    }
    
    public final void m() {
        final w l = this.L;
        if (l == null) {
            return;
        }
        final boolean n = this.N;
        boolean b = true;
        boolean o2 = false;
        Label_0111: {
            if (n) {
                final e0 i = l.I();
                final e0$c w = this.w;
                boolean b2 = false;
                Label_0099: {
                    Label_0084: {
                        if (i.o() <= 100) {
                            for (int o = i.o(), j = 0; j < o; ++j) {
                                if (i.m(j, w).s == -9223372036854775807L) {
                                    break Label_0084;
                                }
                            }
                            b2 = true;
                            break Label_0099;
                        }
                    }
                    b2 = false;
                }
                if (b2) {
                    o2 = true;
                    break Label_0111;
                }
            }
            o2 = false;
        }
        this.O = o2;
        this.g0 = 0L;
        final e0 k = l.I();
        int n4;
        long n5;
        if (!k.p()) {
            final int s = l.S();
            final boolean o3 = this.O;
            int n2;
            if (o3) {
                n2 = 0;
            }
            else {
                n2 = s;
            }
            int n3;
            if (o3) {
                n3 = k.o() - 1;
            }
            else {
                n3 = s;
            }
            n4 = 0;
            n5 = 0L;
            while (n2 <= n3) {
                if (n2 == s) {
                    this.g0 = ad.c0.U(n5);
                }
                k.m(n2, this.w);
                final e0$c w2 = this.w;
                if (w2.s == -9223372036854775807L) {
                    ad.d0.f(this.O ^ b);
                    break;
                }
                final int t = w2.t;
                int n6 = n4;
                int n7 = t;
                e0$c w3;
                while (true) {
                    w3 = this.w;
                    if (n7 > w3.u) {
                        break;
                    }
                    k.f(n7, this.v, false);
                    final bc.a m = this.v.l;
                    for (int j2 = m.j; j2 < m.g; ++j2, b = true) {
                        long n8;
                        if ((n8 = this.v.d(j2)) == Long.MIN_VALUE) {
                            n8 = this.v.i;
                            if (n8 == -9223372036854775807L) {
                                continue;
                            }
                        }
                        final long n9 = n8 + this.v.j;
                        if (n9 >= 0L) {
                            final long[] c0 = this.c0;
                            if (n6 == c0.length) {
                                int n10;
                                if (c0.length == 0) {
                                    n10 = 1;
                                }
                                else {
                                    n10 = c0.length * 2;
                                }
                                this.c0 = Arrays.copyOf(c0, n10);
                                this.d0 = Arrays.copyOf(this.d0, n10);
                            }
                            this.c0[n6] = ad.c0.U(n9 + n5);
                            final boolean[] d0 = this.d0;
                            final bc.a.a a = this.v.l.a(j2);
                            boolean b3 = false;
                            Label_0526: {
                                Label_0476: {
                                    if (a.g != -1) {
                                        for (int n11 = 0; n11 < a.g; ++n11) {
                                            final int n12 = a.i[n11];
                                            if (n12 == 0) {
                                                break Label_0476;
                                            }
                                            if (n12 == 1) {
                                                break Label_0476;
                                            }
                                        }
                                        b3 = false;
                                        break Label_0526;
                                    }
                                }
                                b3 = true;
                            }
                            d0[n6] = (b3 ^ true);
                            ++n6;
                        }
                    }
                    ++n7;
                }
                n5 += w3.s;
                ++n2;
                n4 = n6;
            }
        }
        else {
            n5 = 0L;
            n4 = 0;
        }
        final long u = ad.c0.U(n5);
        final TextView q = this.q;
        if (q != null) {
            q.setText((CharSequence)ad.c0.A(this.t, this.u, u));
        }
        final e s2 = this.s;
        if (s2 != null) {
            s2.setDuration(u);
            final int length = this.e0.length;
            final int n13 = n4 + length;
            final long[] c2 = this.c0;
            if (n13 > c2.length) {
                this.c0 = Arrays.copyOf(c2, n13);
                this.d0 = Arrays.copyOf(this.d0, n13);
            }
            System.arraycopy(this.e0, 0, this.c0, n4, length);
            System.arraycopy(this.f0, 0, this.d0, n4, length);
            this.s.a(this.c0, this.d0, n13);
        }
        this.j();
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.M = true;
        final long b0 = this.b0;
        if (b0 != -9223372036854775807L) {
            final long n = b0 - SystemClock.uptimeMillis();
            if (n <= 0L) {
                this.c();
            }
            else {
                ((View)this).postDelayed((Runnable)this.y, n);
            }
        }
        else if (this.e()) {
            this.d();
        }
        this.i();
        this.h();
        this.k();
        this.l();
        this.m();
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.M = false;
        ((View)this).removeCallbacks((Runnable)this.x);
        ((View)this).removeCallbacks((Runnable)this.y);
    }
    
    public void setPlayer(final w l) {
        final Looper myLooper = Looper.myLooper();
        final Looper mainLooper = Looper.getMainLooper();
        final boolean b = true;
        ad.d0.f(myLooper == mainLooper);
        boolean b2 = b;
        if (l != null) {
            b2 = (l.J() == Looper.getMainLooper() && b);
        }
        ad.d0.c(b2);
        final w i = this.L;
        if (i == l) {
            return;
        }
        if (i != null) {
            i.h((w.c)this.f);
        }
        if ((this.L = l) != null) {
            l.R((w.c)this.f);
        }
        this.i();
        this.h();
        this.k();
        this.l();
        this.m();
    }
    
    public void setProgressUpdateListener(final c c) {
    }
    
    public void setRepeatToggleModes(final int s) {
        this.S = s;
        final w l = this.L;
        if (l != null) {
            final int m = l.m();
            if (s == 0 && m != 0) {
                this.L.p(0);
            }
            else if (s == 1 && m == 2) {
                this.L.p(1);
            }
            else if (s == 2 && m == 1) {
                this.L.p(2);
            }
        }
        this.k();
    }
    
    public void setShowFastForwardButton(final boolean u) {
        this.U = u;
        this.h();
    }
    
    public void setShowMultiWindowTimeBar(final boolean n) {
        this.N = n;
        this.m();
    }
    
    public void setShowNextButton(final boolean w) {
        this.W = w;
        this.h();
    }
    
    public void setShowPreviousButton(final boolean v) {
        this.V = v;
        this.h();
    }
    
    public void setShowRewindButton(final boolean t) {
        this.T = t;
        this.h();
    }
    
    public void setShowShuffleButton(final boolean a0) {
        this.a0 = a0;
        this.l();
    }
    
    public void setShowTimeoutMs(final int q) {
        this.Q = q;
        if (this.e()) {
            this.d();
        }
    }
    
    public void setShowVrButton(final boolean b) {
        final View p = this.p;
        if (p != null) {
            int visibility;
            if (b) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            p.setVisibility(visibility);
        }
    }
    
    public void setTimeBarMinUpdateInterval(final int n) {
        this.R = ad.c0.i(n, 16, 1000);
    }
    
    public void setVrButtonListener(final View$OnClickListener onClickListener) {
        final View p = this.p;
        if (p != null) {
            p.setOnClickListener(onClickListener);
            this.g(this.p, this.getShowVrButton(), onClickListener != null);
        }
    }
    
    public static final class a
    {
        public static boolean a(final View view) {
            return view.isAccessibilityFocused();
        }
    }
    
    public interface c
    {
        void a();
    }
    
    public interface d
    {
        void j();
    }
}
