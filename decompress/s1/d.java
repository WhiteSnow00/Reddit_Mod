// 
// Decompiled by Procyon v0.6.0
// 

package s1;

import aq2.a;
import ng2.e;

public abstract class d
{
    public final boolean a;
    public final boolean b;
    
    public d(boolean a, boolean b, final int n) {
        if ((n & 0x1) != 0x0) {
            a = false;
        }
        if ((n & 0x2) != 0x0) {
            b = false;
        }
        this.a = a;
        this.b = b;
    }
    
    public static final class a extends d
    {
        public final float c;
        public final float d;
        public final float e;
        public final boolean f;
        public final boolean g;
        public final float h;
        public final float i;
        
        public a(final float c, final float d, final float e, final boolean f, final boolean g, final float h, final float i) {
            super(false, false, 3);
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return ng2.e.a((Object)this.c, (Object)a.c) && ng2.e.a((Object)this.d, (Object)a.d) && ng2.e.a((Object)this.e, (Object)a.e) && this.f == a.f && this.g == a.g && ng2.e.a((Object)this.h, (Object)a.h) && ng2.e.a((Object)this.i, (Object)a.i);
        }
        
        @Override
        public final int hashCode() {
            final int b = aq2.a.b(this.e, aq2.a.b(this.d, Float.hashCode(this.c) * 31, 31), 31);
            final int f = this.f ? 1 : 0;
            int n = 1;
            int n2 = f;
            if (f != 0) {
                n2 = 1;
            }
            final int g = this.g ? 1 : 0;
            if (g == 0) {
                n = g;
            }
            return Float.hashCode(this.i) + aq2.a.b(this.h, ((b + n2) * 31 + n) * 31, 31);
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("ArcTo(horizontalEllipseRadius=");
            t.append(this.c);
            t.append(", verticalEllipseRadius=");
            t.append(this.d);
            t.append(", theta=");
            t.append(this.e);
            t.append(", isMoreThanHalf=");
            t.append(this.f);
            t.append(", isPositiveArc=");
            t.append(this.g);
            t.append(", arcStartX=");
            t.append(this.h);
            t.append(", arcStartY=");
            return aq2.a.n(t, this.i, ')');
        }
    }
    
    public static final class b extends d
    {
        public static final b c;
        
        static {
            c = new b();
        }
        
        public b() {
            super(false, false, 3);
        }
    }
    
    public static final class c extends d
    {
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;
        
        public c(final float c, final float d, final float e, final float f, final float g, final float h) {
            super(true, false, 2);
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            return ng2.e.a((Object)this.c, (Object)c.c) && ng2.e.a((Object)this.d, (Object)c.d) && ng2.e.a((Object)this.e, (Object)c.e) && ng2.e.a((Object)this.f, (Object)c.f) && ng2.e.a((Object)this.g, (Object)c.g) && ng2.e.a((Object)this.h, (Object)c.h);
        }
        
        @Override
        public final int hashCode() {
            return Float.hashCode(this.h) + aq2.a.b(this.g, aq2.a.b(this.f, aq2.a.b(this.e, aq2.a.b(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("CurveTo(x1=");
            t.append(this.c);
            t.append(", y1=");
            t.append(this.d);
            t.append(", x2=");
            t.append(this.e);
            t.append(", y2=");
            t.append(this.f);
            t.append(", x3=");
            t.append(this.g);
            t.append(", y3=");
            return aq2.a.n(t, this.h, ')');
        }
    }
    
    public static final class d extends s1.d
    {
        public final float c;
        
        public d(final float c) {
            super(false, false, 3);
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof d && ng2.e.a((Object)this.c, (Object)((d)o).c));
        }
        
        @Override
        public final int hashCode() {
            return Float.hashCode(this.c);
        }
        
        @Override
        public final String toString() {
            return aq2.a.n(a.t("HorizontalTo(x="), this.c, ')');
        }
    }
    
    public static final class e extends d
    {
        public final float c;
        public final float d;
        
        public e(final float c, final float d) {
            super(false, false, 3);
            this.c = c;
            this.d = d;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof e)) {
                return false;
            }
            final e e = (e)o;
            return ng2.e.a((Object)this.c, (Object)e.c) && ng2.e.a((Object)this.d, (Object)e.d);
        }
        
        @Override
        public final int hashCode() {
            return Float.hashCode(this.d) + Float.hashCode(this.c) * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("LineTo(x=");
            t.append(this.c);
            t.append(", y=");
            return aq2.a.n(t, this.d, ')');
        }
    }
    
    public static final class f extends d
    {
        public final float c;
        public final float d;
        
        public f(final float c, final float d) {
            super(false, false, 3);
            this.c = c;
            this.d = d;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof f)) {
                return false;
            }
            final f f = (f)o;
            return ng2.e.a((Object)this.c, (Object)f.c) && ng2.e.a((Object)this.d, (Object)f.d);
        }
        
        @Override
        public final int hashCode() {
            return Float.hashCode(this.d) + Float.hashCode(this.c) * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("MoveTo(x=");
            t.append(this.c);
            t.append(", y=");
            return aq2.a.n(t, this.d, ')');
        }
    }
    
    public static final class g extends d
    {
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        
        public g(final float c, final float d, final float e, final float f) {
            super(false, true, 1);
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof g)) {
                return false;
            }
            final g g = (g)o;
            return ng2.e.a((Object)this.c, (Object)g.c) && ng2.e.a((Object)this.d, (Object)g.d) && ng2.e.a((Object)this.e, (Object)g.e) && ng2.e.a((Object)this.f, (Object)g.f);
        }
        
        @Override
        public final int hashCode() {
            return Float.hashCode(this.f) + aq2.a.b(this.e, aq2.a.b(this.d, Float.hashCode(this.c) * 31, 31), 31);
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("QuadTo(x1=");
            t.append(this.c);
            t.append(", y1=");
            t.append(this.d);
            t.append(", x2=");
            t.append(this.e);
            t.append(", y2=");
            return aq2.a.n(t, this.f, ')');
        }
    }
    
    public static final class h extends d
    {
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        
        public h(final float c, final float d, final float e, final float f) {
            super(true, false, 2);
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof h)) {
                return false;
            }
            final h h = (h)o;
            return ng2.e.a((Object)this.c, (Object)h.c) && ng2.e.a((Object)this.d, (Object)h.d) && ng2.e.a((Object)this.e, (Object)h.e) && ng2.e.a((Object)this.f, (Object)h.f);
        }
        
        @Override
        public final int hashCode() {
            return Float.hashCode(this.f) + aq2.a.b(this.e, aq2.a.b(this.d, Float.hashCode(this.c) * 31, 31), 31);
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("ReflectiveCurveTo(x1=");
            t.append(this.c);
            t.append(", y1=");
            t.append(this.d);
            t.append(", x2=");
            t.append(this.e);
            t.append(", y2=");
            return aq2.a.n(t, this.f, ')');
        }
    }
    
    public static final class i extends d
    {
        public final float c;
        public final float d;
        
        public i(final float c, final float d) {
            super(false, true, 1);
            this.c = c;
            this.d = d;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof i)) {
                return false;
            }
            final i i = (i)o;
            return ng2.e.a((Object)this.c, (Object)i.c) && ng2.e.a((Object)this.d, (Object)i.d);
        }
        
        @Override
        public final int hashCode() {
            return Float.hashCode(this.d) + Float.hashCode(this.c) * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("ReflectiveQuadTo(x=");
            t.append(this.c);
            t.append(", y=");
            return aq2.a.n(t, this.d, ')');
        }
    }
    
    public static final class j extends d
    {
        public final float c;
        public final float d;
        public final float e;
        public final boolean f;
        public final boolean g;
        public final float h;
        public final float i;
        
        public j(final float c, final float d, final float e, final boolean f, final boolean g, final float h, final float i) {
            super(false, false, 3);
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof j)) {
                return false;
            }
            final j j = (j)o;
            return ng2.e.a((Object)this.c, (Object)j.c) && ng2.e.a((Object)this.d, (Object)j.d) && ng2.e.a((Object)this.e, (Object)j.e) && this.f == j.f && this.g == j.g && ng2.e.a((Object)this.h, (Object)j.h) && ng2.e.a((Object)this.i, (Object)j.i);
        }
        
        @Override
        public final int hashCode() {
            final int b = aq2.a.b(this.e, aq2.a.b(this.d, Float.hashCode(this.c) * 31, 31), 31);
            final int f = this.f ? 1 : 0;
            int n = 1;
            int n2 = f;
            if (f != 0) {
                n2 = 1;
            }
            final int g = this.g ? 1 : 0;
            if (g == 0) {
                n = g;
            }
            return Float.hashCode(this.i) + aq2.a.b(this.h, ((b + n2) * 31 + n) * 31, 31);
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("RelativeArcTo(horizontalEllipseRadius=");
            t.append(this.c);
            t.append(", verticalEllipseRadius=");
            t.append(this.d);
            t.append(", theta=");
            t.append(this.e);
            t.append(", isMoreThanHalf=");
            t.append(this.f);
            t.append(", isPositiveArc=");
            t.append(this.g);
            t.append(", arcStartDx=");
            t.append(this.h);
            t.append(", arcStartDy=");
            return aq2.a.n(t, this.i, ')');
        }
    }
    
    public static final class k extends d
    {
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;
        
        public k(final float c, final float d, final float e, final float f, final float g, final float h) {
            super(true, false, 2);
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof k)) {
                return false;
            }
            final k k = (k)o;
            return ng2.e.a((Object)this.c, (Object)k.c) && ng2.e.a((Object)this.d, (Object)k.d) && ng2.e.a((Object)this.e, (Object)k.e) && ng2.e.a((Object)this.f, (Object)k.f) && ng2.e.a((Object)this.g, (Object)k.g) && ng2.e.a((Object)this.h, (Object)k.h);
        }
        
        @Override
        public final int hashCode() {
            return Float.hashCode(this.h) + aq2.a.b(this.g, aq2.a.b(this.f, aq2.a.b(this.e, aq2.a.b(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("RelativeCurveTo(dx1=");
            t.append(this.c);
            t.append(", dy1=");
            t.append(this.d);
            t.append(", dx2=");
            t.append(this.e);
            t.append(", dy2=");
            t.append(this.f);
            t.append(", dx3=");
            t.append(this.g);
            t.append(", dy3=");
            return aq2.a.n(t, this.h, ')');
        }
    }
    
    public static final class l extends d
    {
        public final float c;
        
        public l(final float c) {
            super(false, false, 3);
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof l && ng2.e.a((Object)this.c, (Object)((l)o).c));
        }
        
        @Override
        public final int hashCode() {
            return Float.hashCode(this.c);
        }
        
        @Override
        public final String toString() {
            return aq2.a.n(a.t("RelativeHorizontalTo(dx="), this.c, ')');
        }
    }
    
    public static final class m extends d
    {
        public final float c;
        public final float d;
        
        public m(final float c, final float d) {
            super(false, false, 3);
            this.c = c;
            this.d = d;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof m)) {
                return false;
            }
            final m m = (m)o;
            return ng2.e.a((Object)this.c, (Object)m.c) && ng2.e.a((Object)this.d, (Object)m.d);
        }
        
        @Override
        public final int hashCode() {
            return Float.hashCode(this.d) + Float.hashCode(this.c) * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("RelativeLineTo(dx=");
            t.append(this.c);
            t.append(", dy=");
            return aq2.a.n(t, this.d, ')');
        }
    }
    
    public static final class n extends d
    {
        public final float c;
        public final float d;
        
        public n(final float c, final float d) {
            super(false, false, 3);
            this.c = c;
            this.d = d;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof n)) {
                return false;
            }
            final n n = (n)o;
            return ng2.e.a((Object)this.c, (Object)n.c) && ng2.e.a((Object)this.d, (Object)n.d);
        }
        
        @Override
        public final int hashCode() {
            return Float.hashCode(this.d) + Float.hashCode(this.c) * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("RelativeMoveTo(dx=");
            t.append(this.c);
            t.append(", dy=");
            return aq2.a.n(t, this.d, ')');
        }
    }
    
    public static final class o extends d
    {
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        
        public o(final float c, final float d, final float e, final float f) {
            super(false, true, 1);
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof o)) {
                return false;
            }
            final o o2 = (o)o;
            return ng2.e.a((Object)this.c, (Object)o2.c) && ng2.e.a((Object)this.d, (Object)o2.d) && ng2.e.a((Object)this.e, (Object)o2.e) && ng2.e.a((Object)this.f, (Object)o2.f);
        }
        
        @Override
        public final int hashCode() {
            return Float.hashCode(this.f) + aq2.a.b(this.e, aq2.a.b(this.d, Float.hashCode(this.c) * 31, 31), 31);
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("RelativeQuadTo(dx1=");
            t.append(this.c);
            t.append(", dy1=");
            t.append(this.d);
            t.append(", dx2=");
            t.append(this.e);
            t.append(", dy2=");
            return aq2.a.n(t, this.f, ')');
        }
    }
    
    public static final class p extends d
    {
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        
        public p(final float c, final float d, final float e, final float f) {
            super(true, false, 2);
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof p)) {
                return false;
            }
            final p p = (p)o;
            return ng2.e.a((Object)this.c, (Object)p.c) && ng2.e.a((Object)this.d, (Object)p.d) && ng2.e.a((Object)this.e, (Object)p.e) && ng2.e.a((Object)this.f, (Object)p.f);
        }
        
        @Override
        public final int hashCode() {
            return Float.hashCode(this.f) + aq2.a.b(this.e, aq2.a.b(this.d, Float.hashCode(this.c) * 31, 31), 31);
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("RelativeReflectiveCurveTo(dx1=");
            t.append(this.c);
            t.append(", dy1=");
            t.append(this.d);
            t.append(", dx2=");
            t.append(this.e);
            t.append(", dy2=");
            return aq2.a.n(t, this.f, ')');
        }
    }
    
    public static final class q extends d
    {
        public final float c;
        public final float d;
        
        public q(final float c, final float d) {
            super(false, true, 1);
            this.c = c;
            this.d = d;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof q)) {
                return false;
            }
            final q q = (q)o;
            return ng2.e.a((Object)this.c, (Object)q.c) && ng2.e.a((Object)this.d, (Object)q.d);
        }
        
        @Override
        public final int hashCode() {
            return Float.hashCode(this.d) + Float.hashCode(this.c) * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("RelativeReflectiveQuadTo(dx=");
            t.append(this.c);
            t.append(", dy=");
            return aq2.a.n(t, this.d, ')');
        }
    }
    
    public static final class r extends d
    {
        public final float c;
        
        public r(final float c) {
            super(false, false, 3);
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof r && ng2.e.a((Object)this.c, (Object)((r)o).c));
        }
        
        @Override
        public final int hashCode() {
            return Float.hashCode(this.c);
        }
        
        @Override
        public final String toString() {
            return aq2.a.n(a.t("RelativeVerticalTo(dy="), this.c, ')');
        }
    }
    
    public static final class s extends d
    {
        public final float c;
        
        public s(final float c) {
            super(false, false, 3);
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof s && ng2.e.a((Object)this.c, (Object)((s)o).c));
        }
        
        @Override
        public final int hashCode() {
            return Float.hashCode(this.c);
        }
        
        @Override
        public final String toString() {
            return aq2.a.n(a.t("VerticalTo(y="), this.c, ')');
        }
    }
}
