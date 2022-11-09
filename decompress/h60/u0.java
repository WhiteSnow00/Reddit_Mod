// 
// Decompiled by Procyon v0.6.0
// 

package h60;

import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import qg2.m;
import nf2.c0;
import com.reddit.notification.common.NotificationLevel;
import java.util.List;
import pj2.s;
import j60.f;
import java.util.ArrayList;
import nf2.n;
import nf2.t;
import i60.u;
import s70.a;

public interface u0 extends s70.a<u>
{
    t C0(final boolean p0);
    
    n C1(final boolean p0);
    
    t D0(final boolean p0);
    
    n F1(final boolean p0);
    
    void G(final ArrayList p0, final boolean p1, final boolean p2);
    
    void I0(final ArrayList p0, final boolean p1, final boolean p2);
    
    nf2.a J0(final String p0, final boolean p1);
    
    Boolean K(final String p0);
    
    n<f> L1(final String p0, final boolean p1);
    
    void O();
    
    n O1(final boolean p0);
    
    n Q(final boolean p0);
    
    s Q0();
    
    void T(final u p0);
    
    void T0(final ArrayList p0);
    
    n<List<f>> T1(final List<String> p0, final boolean p1);
    
    void W(final List<String> p0);
    
    nf2.a Y0(final String p0, final NotificationLevel p1);
    
    n g0(final boolean p0);
    
    void h0(final u p0);
    
    c0 k0(final String p0, final boolean p1);
    
    s m0();
    
    t q0(final boolean p0);
    
    t u(final boolean p0);
    
    s y0();
    
    n z(final boolean p0);
    
    c0 z0(final ArrayList p0);
    
    public static final class a
    {
        public static void a(final u0 u0, u u2) {
            final Boolean k = u0.K(u2.c);
            if (k == null) {
                ((s70.a)u0).N((Object[])new u[] { u2 });
            }
            else {
                if (k) {
                    final String a = u2.a;
                    final String b = u2.b;
                    final String c = u2.c;
                    final String d = u2.d;
                    final String e = u2.e;
                    final String f = u2.f;
                    final String g = u2.g;
                    final String h = u2.h;
                    final String i = u2.i;
                    final String j = u2.j;
                    final String l = u2.k;
                    final String m = u2.l;
                    final String m2 = u2.m;
                    final String n = u2.n;
                    final long o = u2.o;
                    final Long p2 = u2.p;
                    final long q = u2.q;
                    final String r = u2.r;
                    final String s = u2.s;
                    final boolean t = u2.t;
                    final Boolean u3 = u2.u;
                    final String v = u2.v;
                    final Boolean w = u2.w;
                    final Boolean x = u2.x;
                    final String y = u2.y;
                    final Boolean z = u2.z;
                    final Boolean a2 = u2.A;
                    final Boolean b2 = u2.B;
                    final Boolean c2 = u2.C;
                    final Boolean d2 = u2.D;
                    final Boolean e2 = u2.E;
                    final Boolean f2 = u2.F;
                    final Boolean g2 = u2.G;
                    final Boolean h2 = u2.H;
                    final Boolean i2 = u2.I;
                    final Boolean j2 = u2.J;
                    final NotificationLevel k2 = u2.K;
                    final long l2 = u2.L;
                    final String m3 = u2.M;
                    final String n2 = u2.N;
                    final String o2 = u2.O;
                    final String p3 = u2.P;
                    final String r2 = u2.R;
                    final Boolean s2 = u2.S;
                    final Boolean t2 = u2.T;
                    final Boolean u4 = u2.U;
                    final String v2 = u2.V;
                    final String w2 = u2.W;
                    final String x2 = u2.X;
                    final String y2 = u2.Y;
                    final Boolean z2 = u2.Z;
                    final Boolean a3 = u2.a0;
                    final String b3 = u2.b0;
                    final String c3 = u2.c0;
                    final String d3 = u2.d0;
                    final Boolean e3 = u2.e0;
                    final String f3 = u2.f0;
                    final String g3 = u2.g0;
                    final String h3 = u2.h0;
                    final Boolean i3 = u2.i0;
                    final Boolean j3 = u2.j0;
                    final String k3 = u2.k0;
                    final Boolean l3 = u2.l0;
                    final Boolean m4 = u2.m0;
                    final String n3 = u2.n0;
                    final boolean o3 = u2.o0;
                    final Boolean p4 = u2.p0;
                    ah2.f.f((Object)a, "subredditId");
                    ah2.f.f((Object)b, "subredditKindWithId");
                    ah2.f.f((Object)c, "displayName");
                    ah2.f.f((Object)d, "displayNamePrefixed");
                    ah2.f.f((Object)f, "keyColor");
                    ah2.f.f((Object)j, "description");
                    ah2.f.f((Object)m, "publicDescription");
                    ah2.f.f((Object)r, "subredditType");
                    ah2.f.f((Object)s, "url");
                    u2 = new u(a, b, c, d, e, f, g, h, i, j, l, m, m2, n, o, p2, q, r, s, t, u3, v, w, x, y, z, a2, b2, c2, d2, e2, f2, g2, h2, i2, j2, k2, l2, m3, n2, o2, p3, true, r2, s2, t2, u4, v2, w2, x2, y2, z2, a3, b3, c3, d3, e3, f3, g3, h3, i3, j3, k3, l3, m4, n3, o3, p4);
                }
                ((s70.a)u0).update((Object)u2);
            }
        }
        
        public static void b(final u0 u0, final ArrayList list, final boolean b, final boolean b2) {
            if (b) {
                if (b2) {
                    final ArrayList list2 = new ArrayList(m.P0((Iterable)list, 10));
                    final Iterator iterator = list.iterator();
                    while (iterator.hasNext()) {
                        list2.add(((u)iterator.next()).b);
                    }
                    final Iterator iterator2 = CollectionsKt___CollectionsKt.f1((Iterable)list2, 1000).iterator();
                    while (iterator2.hasNext()) {
                        u0.W((List<String>)iterator2.next());
                    }
                }
                else {
                    u0.O();
                }
            }
            final Iterator iterator3 = list.iterator();
            while (iterator3.hasNext()) {
                u0.h0((u)iterator3.next());
            }
        }
    }
}
