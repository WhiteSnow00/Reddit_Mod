// 
// Decompiled by Procyon v0.6.0
// 

package xc;

import android.view.Display$Mode;
import android.view.Display;
import android.view.WindowManager;
import com.google.common.collect.ImmutableCollection$a;
import com.google.common.collect.ImmutableCollection;
import android.os.BaseBundle;
import android.util.Log;
import android.graphics.Point;
import android.text.TextUtils;
import android.hardware.display.DisplayManager;
import android.content.Context;
import com.google.common.collect.ImmutableList$a;
import bd.c0;
import ia.c;
import java.util.Collection;
import com.google.common.primitives.Ints;
import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.android.exoplayer2.f;

public class l implements f
{
    public static final l E;
    public final boolean A;
    public final boolean B;
    public final k C;
    public final ImmutableSet<Integer> D;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final boolean p;
    public final ImmutableList<String> q;
    public final int r;
    public final ImmutableList<String> s;
    public final int t;
    public final int u;
    public final int v;
    public final ImmutableList<String> w;
    public final ImmutableList<String> x;
    public final int y;
    public final boolean z;
    
    static {
        E = new l(new a());
    }
    
    public l(final a a) {
        this.f = a.a;
        this.g = a.b;
        this.h = a.c;
        this.i = a.d;
        this.j = a.e;
        this.k = a.f;
        this.l = a.g;
        this.m = a.h;
        this.n = a.i;
        this.o = a.j;
        this.p = a.k;
        this.q = a.l;
        this.r = a.m;
        this.s = a.n;
        this.t = a.o;
        this.u = a.p;
        this.v = a.q;
        this.w = a.r;
        this.x = a.s;
        this.y = a.t;
        this.z = a.u;
        this.A = a.v;
        this.B = a.w;
        this.C = a.x;
        this.D = a.y;
    }
    
    public static String a(final int n) {
        return Integer.toString(n, 36);
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final l l = (l)o;
            if (this.f != l.f || this.g != l.g || this.h != l.h || this.i != l.i || this.j != l.j || this.k != l.k || this.l != l.l || this.m != l.m || this.p != l.p || this.n != l.n || this.o != l.o || !this.q.equals((Object)l.q) || this.r != l.r || !this.s.equals((Object)l.s) || this.t != l.t || this.u != l.u || this.v != l.v || !this.w.equals((Object)l.w) || !this.x.equals((Object)l.x) || this.y != l.y || this.z != l.z || this.A != l.A || this.B != l.B || !this.C.equals(l.C) || !this.D.equals((Object)l.D)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.D.hashCode() + (this.C.hashCode() + (((((this.x.hashCode() + (this.w.hashCode() + ((((this.s.hashCode() + ((this.q.hashCode() + (((((((((((this.f + 31) * 31 + this.g) * 31 + this.h) * 31 + this.i) * 31 + this.j) * 31 + this.k) * 31 + this.l) * 31 + this.m) * 31 + (this.p ? 1 : 0)) * 31 + this.n) * 31 + this.o) * 31) * 31 + this.r) * 31) * 31 + this.t) * 31 + this.u) * 31 + this.v) * 31) * 31) * 31 + this.y) * 31 + (this.z ? 1 : 0)) * 31 + (this.A ? 1 : 0)) * 31 + (this.B ? 1 : 0)) * 31) * 31;
    }
    
    public Bundle toBundle() {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt(a(6), this.f);
        ((BaseBundle)bundle).putInt(a(7), this.g);
        ((BaseBundle)bundle).putInt(a(8), this.h);
        ((BaseBundle)bundle).putInt(a(9), this.i);
        ((BaseBundle)bundle).putInt(a(10), this.j);
        ((BaseBundle)bundle).putInt(a(11), this.k);
        ((BaseBundle)bundle).putInt(a(12), this.l);
        ((BaseBundle)bundle).putInt(a(13), this.m);
        ((BaseBundle)bundle).putInt(a(14), this.n);
        ((BaseBundle)bundle).putInt(a(15), this.o);
        ((BaseBundle)bundle).putBoolean(a(16), this.p);
        ((BaseBundle)bundle).putStringArray(a(17), (String[])((ImmutableCollection)this.q).toArray((Object[])new String[0]));
        ((BaseBundle)bundle).putInt(a(26), this.r);
        ((BaseBundle)bundle).putStringArray(a(1), (String[])((ImmutableCollection)this.s).toArray((Object[])new String[0]));
        ((BaseBundle)bundle).putInt(a(2), this.t);
        ((BaseBundle)bundle).putInt(a(18), this.u);
        ((BaseBundle)bundle).putInt(a(19), this.v);
        ((BaseBundle)bundle).putStringArray(a(20), (String[])((ImmutableCollection)this.w).toArray((Object[])new String[0]));
        ((BaseBundle)bundle).putStringArray(a(3), (String[])((ImmutableCollection)this.x).toArray((Object[])new String[0]));
        ((BaseBundle)bundle).putInt(a(4), this.y);
        ((BaseBundle)bundle).putBoolean(a(5), this.z);
        ((BaseBundle)bundle).putBoolean(a(21), this.A);
        ((BaseBundle)bundle).putBoolean(a(22), this.B);
        bundle.putBundle(a(23), this.C.toBundle());
        ((BaseBundle)bundle).putIntArray(a(25), Ints.v2((Collection)this.D));
        return bundle;
    }
    
    public static class a
    {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public boolean k;
        public ImmutableList<String> l;
        public int m;
        public ImmutableList<String> n;
        public int o;
        public int p;
        public int q;
        public ImmutableList<String> r;
        public ImmutableList<String> s;
        public int t;
        public boolean u;
        public boolean v;
        public boolean w;
        public k x;
        public ImmutableSet<Integer> y;
        
        @Deprecated
        public a() {
            this.a = Integer.MAX_VALUE;
            this.b = Integer.MAX_VALUE;
            this.c = Integer.MAX_VALUE;
            this.d = Integer.MAX_VALUE;
            this.i = Integer.MAX_VALUE;
            this.j = Integer.MAX_VALUE;
            this.k = true;
            this.l = (ImmutableList<String>)ImmutableList.of();
            this.m = 0;
            this.n = (ImmutableList<String>)ImmutableList.of();
            this.o = 0;
            this.p = Integer.MAX_VALUE;
            this.q = Integer.MAX_VALUE;
            this.r = (ImmutableList<String>)ImmutableList.of();
            this.s = (ImmutableList<String>)ImmutableList.of();
            this.t = 0;
            this.u = false;
            this.v = false;
            this.w = false;
            this.x = k.g;
            this.y = (ImmutableSet<Integer>)ImmutableSet.of();
        }
        
        public a(final Bundle bundle) {
            final String a = l.a(6);
            final l e = l.E;
            this.a = ((BaseBundle)bundle).getInt(a, e.f);
            this.b = ((BaseBundle)bundle).getInt(l.a(7), e.g);
            this.c = ((BaseBundle)bundle).getInt(l.a(8), e.h);
            this.d = ((BaseBundle)bundle).getInt(l.a(9), e.i);
            this.e = ((BaseBundle)bundle).getInt(l.a(10), e.j);
            this.f = ((BaseBundle)bundle).getInt(l.a(11), e.k);
            this.g = ((BaseBundle)bundle).getInt(l.a(12), e.l);
            this.h = ((BaseBundle)bundle).getInt(l.a(13), e.m);
            this.i = ((BaseBundle)bundle).getInt(l.a(14), e.n);
            this.j = ((BaseBundle)bundle).getInt(l.a(15), e.o);
            this.k = ((BaseBundle)bundle).getBoolean(l.a(16), e.p);
            this.l = (ImmutableList<String>)ImmutableList.copyOf((Object[])tg.f.a((Object)((BaseBundle)bundle).getStringArray(l.a(17)), (Object)new String[0]));
            this.m = ((BaseBundle)bundle).getInt(l.a(26), e.r);
            this.n = b((String[])tg.f.a((Object)((BaseBundle)bundle).getStringArray(l.a(1)), (Object)new String[0]));
            this.o = ((BaseBundle)bundle).getInt(l.a(2), e.t);
            this.p = ((BaseBundle)bundle).getInt(l.a(18), e.u);
            this.q = ((BaseBundle)bundle).getInt(l.a(19), e.v);
            this.r = (ImmutableList<String>)ImmutableList.copyOf((Object[])tg.f.a((Object)((BaseBundle)bundle).getStringArray(l.a(20)), (Object)new String[0]));
            this.s = b((String[])tg.f.a((Object)((BaseBundle)bundle).getStringArray(l.a(3)), (Object)new String[0]));
            this.t = ((BaseBundle)bundle).getInt(l.a(4), e.y);
            this.u = ((BaseBundle)bundle).getBoolean(l.a(5), e.z);
            this.v = ((BaseBundle)bundle).getBoolean(l.a(21), e.A);
            this.w = ((BaseBundle)bundle).getBoolean(l.a(22), e.B);
            final c h = k.h;
            final Bundle bundle2 = bundle.getBundle(l.a(23));
            Object o = k.g;
            if (bundle2 != null) {
                o = h.a(bundle2);
            }
            this.x = (k)o;
            this.y = (ImmutableSet<Integer>)ImmutableSet.copyOf((Collection)Ints.r2((int[])tg.f.a((Object)((BaseBundle)bundle).getIntArray(l.a(25)), (Object)new int[0])));
        }
        
        public a(final l l) {
            this.a(l);
        }
        
        public static ImmutableList<String> b(final String[] array) {
            final ImmutableList$a builder = ImmutableList.builder();
            for (final String s : array) {
                s.getClass();
                ((ImmutableCollection$a)builder).c((Object)c0.K(s));
            }
            return (ImmutableList<String>)builder.f();
        }
        
        public final void a(final l l) {
            this.a = l.f;
            this.b = l.g;
            this.c = l.h;
            this.d = l.i;
            this.e = l.j;
            this.f = l.k;
            this.g = l.l;
            this.h = l.m;
            this.i = l.n;
            this.j = l.o;
            this.k = l.p;
            this.l = l.q;
            this.m = l.r;
            this.n = l.s;
            this.o = l.t;
            this.p = l.u;
            this.q = l.v;
            this.r = l.w;
            this.s = l.x;
            this.t = l.y;
            this.u = l.z;
            this.v = l.A;
            this.w = l.B;
            this.x = l.C;
            this.y = l.D;
        }
        
        public a c(final int i, final int j, final boolean k) {
            this.i = i;
            this.j = j;
            this.k = k;
            return this;
        }
        
        public void d(Context context) {
            final int a = c0.a;
            Object o = null;
            Label_0036: {
                if (a >= 17) {
                    final DisplayManager displayManager = (DisplayManager)context.getSystemService("display");
                    if (displayManager != null) {
                        o = displayManager.getDisplay(0);
                        break Label_0036;
                    }
                }
                o = null;
            }
            Object defaultDisplay = o;
            if (o == null) {
                o = context.getSystemService("window");
                o.getClass();
                defaultDisplay = ((WindowManager)o).getDefaultDisplay();
            }
            Label_0273: {
                if (((Display)defaultDisplay).getDisplayId() != 0 || !c0.I(context)) {
                    break Label_0273;
                }
                if (a < 28) {
                    o = c0.B("sys.display-size");
                }
                else {
                    o = c0.B("vendor.display-size");
                }
                Label_0219: {
                    if (TextUtils.isEmpty((CharSequence)o)) {
                        break Label_0219;
                    }
                    while (true) {
                        try {
                            final String[] split = ((String)o).trim().split("x", -1);
                            Label_0337: {
                                if (split.length == 2) {
                                    final int int1 = Integer.parseInt(split[0]);
                                    final int int2 = Integer.parseInt(split[1]);
                                    if (int1 > 0 && int2 > 0) {
                                        context = (Context)new Point(int1, int2);
                                        break Label_0337;
                                    }
                                }
                                o = String.valueOf(o);
                                if (((String)o).length() != 0) {
                                    o = "Invalid display size: ".concat((String)o);
                                }
                                else {
                                    o = new String("Invalid display size: ");
                                }
                                Log.e("Util", (String)o);
                                if ("Sony".equals(c0.c) && c0.d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                                    context = (Context)new Point(3840, 2160);
                                }
                                else {
                                    context = (Context)new Point();
                                    final int a2 = c0.a;
                                    if (a2 >= 23) {
                                        o = ((Display)defaultDisplay).getMode();
                                        ((Point)context).x = ((Display$Mode)o).getPhysicalWidth();
                                        ((Point)context).y = ((Display$Mode)o).getPhysicalHeight();
                                    }
                                    else if (a2 >= 17) {
                                        ((Display)defaultDisplay).getRealSize((Point)context);
                                    }
                                    else {
                                        ((Display)defaultDisplay).getSize((Point)context);
                                    }
                                }
                            }
                            this.c(((Point)context).x, ((Point)context).y, true);
                        }
                        catch (final NumberFormatException ex) {
                            continue;
                        }
                        break;
                    }
                }
            }
        }
    }
}
