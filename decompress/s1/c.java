// 
// Decompiled by Procyon v0.6.0
// 

package s1;

import java.util.List;
import java.util.ArrayList;
import t5.w;
import aq2.a;
import o1.r;
import u2.d;
import ng2.e;

public final class c
{
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final i f;
    public final long g;
    public final int h;
    public final boolean i;
    
    public c(final String a, final float b, final float c, final float d, final float e, final i f, final long g, final int h, final boolean i) {
        this.a = a;
        this.b = b;
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
        if (!(o instanceof c)) {
            return false;
        }
        final String a = this.a;
        final c c = (c)o;
        return ng2.e.a((Object)a, (Object)c.a) && u2.d.a(this.b, c.b) && u2.d.a(this.c, c.c) && this.d == c.d && this.e == c.e && ng2.e.a((Object)this.f, (Object)c.f) && r.c(this.g, c.g) && this.h == c.h && this.i == c.i;
    }
    
    @Override
    public final int hashCode() {
        final int b = aq2.a.b(this.e, aq2.a.b(this.d, aq2.a.b(this.c, aq2.a.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        final int hashCode = this.f.hashCode();
        final long g = this.g;
        final int m = r.m;
        return Boolean.hashCode(this.i) + aq2.a.c(this.h, w.c(g, (hashCode + b) * 31, 31), 31);
    }
    
    public static final class a
    {
        public final String a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final long f;
        public final int g;
        public final boolean h;
        public final ArrayList i;
        public c.a.a j;
        public boolean k;
        
        public a(final float b, final float c, final float d, final float e, final long f, final int g, final boolean h) {
            this.a = "";
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            (this.i = new ArrayList()).add(this.j = new c.a.a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023));
        }
        
        public final void a(final String s, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final List list) {
            ng2.e.f((Object)s, "name");
            ng2.e.f((Object)list, "clipPathData");
            this.c();
            this.i.add(new c.a.a(s, n, n2, n3, n4, n5, n6, n7, list, 512));
        }
        
        public final void b() {
            this.c();
            final ArrayList i = this.i;
            final c.a.a a = i.remove(i.size() - 1);
            final ArrayList j = this.i;
            ((c.a.a)j.get(j.size() - 1)).j.add(new i(a.a, a.b, a.c, a.d, a.e, a.f, a.g, a.h, a.i, a.j));
        }
        
        public final void c() {
            if (this.k ^ true) {
                return;
            }
            throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
        }
        
        public static final class a
        {
            public String a;
            public float b;
            public float c;
            public float d;
            public float e;
            public float f;
            public float g;
            public float h;
            public List<? extends s1.d> i;
            public List<k> j;
            
            public a() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
            }
            
            public a(String a, float b, float c, float d, float e, float f, float g, float h, List a2, final int n) {
                if ((n & 0x1) != 0x0) {
                    a = "";
                }
                if ((n & 0x2) != 0x0) {
                    b = 0.0f;
                }
                if ((n & 0x4) != 0x0) {
                    c = 0.0f;
                }
                if ((n & 0x8) != 0x0) {
                    d = 0.0f;
                }
                if ((n & 0x10) != 0x0) {
                    e = 1.0f;
                }
                if ((n & 0x20) != 0x0) {
                    f = 1.0f;
                }
                if ((n & 0x40) != 0x0) {
                    g = 0.0f;
                }
                if ((n & 0x80) != 0x0) {
                    h = 0.0f;
                }
                if ((n & 0x100) != 0x0) {
                    a2 = j.a;
                }
                List<k> j;
                if ((n & 0x200) != 0x0) {
                    j = new ArrayList<k>();
                }
                else {
                    j = null;
                }
                e.f((Object)a, "name");
                e.f((Object)a2, "clipPathData");
                e.f((Object)j, "children");
                this.a = a;
                this.b = b;
                this.c = c;
                this.d = d;
                this.e = e;
                this.f = f;
                this.g = g;
                this.h = h;
                this.i = (List<? extends s1.d>)a2;
                this.j = j;
            }
        }
    }
}
