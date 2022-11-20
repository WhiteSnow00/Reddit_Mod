// 
// Decompiled by Procyon v0.6.0
// 

package k7;

import h7.c;
import h7.c$c;
import h7.c$d;
import h7.c$e;
import h7.c$f;
import h7.c$b;
import h7.c$g;
import h7.o;
import j7.f;
import cg2.j;
import mg2.l;
import java.io.IOException;
import j7.e$a;
import j7.e$b;
import com.apollographql.apollo.api.ScalarTypeAdapters;
import j7.e;

public final class b implements e
{
    public final d a;
    public final ScalarTypeAdapters b;
    
    public b(final d a, final ScalarTypeAdapters b) {
        ng2.e.g((Object)a, "jsonWriter");
        ng2.e.g((Object)b, "scalarTypeAdapters");
        this.a = a;
        this.b = b;
    }
    
    public final void a(final String s, final e$b e$b) throws IOException {
        if (e$b == null) {
            this.a.s(s).t();
        }
        else {
            this.a.s(s).b();
            e$b.a((e$a)new a(this.a, this.b));
            this.a.q();
        }
    }
    
    public final void b(final Boolean b, final String s) throws IOException {
        if (b == null) {
            this.a.s(s).t();
        }
        else {
            this.a.s(s).x(b);
        }
    }
    
    public final void c(final String s, final j7.d d) throws IOException {
        if (d == null) {
            this.a.s(s).t();
        }
        else {
            this.a.s(s).h();
            d.a((e)this);
            this.a.r();
        }
    }
    
    public final void d(final String s, final l<? super e$a, j> l) {
        this.a(s, (e$b)new f(l));
    }
    
    public final void e(final String s, final Integer n) throws IOException {
        if (n == null) {
            this.a.s(s).t();
        }
        else {
            this.a.s(s).y(n);
        }
    }
    
    public final void f(final String s, final o o, final Object o2) throws IOException {
        ng2.e.g((Object)o, "scalarType");
        if (o2 == null) {
            this.a.s(s).t();
            return;
        }
        final c b = this.b.a(o).b(o2);
        if (b instanceof c$g) {
            this.g(s, (String)((c)b).a);
        }
        else if (b instanceof c$b) {
            this.b((Boolean)((c)b).a, s);
        }
        else if (b instanceof c$f) {
            final Number n = (Number)((c)b).a;
            if (n == null) {
                this.a.s(s).t();
            }
            else {
                this.a.s(s).y(n);
            }
        }
        else if (b instanceof c$e) {
            this.g(s, null);
        }
        else if (b instanceof c$d) {
            k7.f.a(((c)b).a, (d)this.a.s(s));
        }
        else if (b instanceof c$c) {
            k7.f.a(((c)b).a, (d)this.a.s(s));
        }
    }
    
    public final void g(final String s, final String s2) throws IOException {
        if (s2 == null) {
            this.a.s(s).t();
        }
        else {
            this.a.s(s).A(s2);
        }
    }
    
    public static final class a implements e$a
    {
        public final d a;
        public final ScalarTypeAdapters b;
        
        public a(final d a, final ScalarTypeAdapters b) {
            ng2.e.g((Object)a, "jsonWriter");
            ng2.e.g((Object)b, "scalarTypeAdapters");
            this.a = a;
            this.b = b;
        }
        
        public final void a(final String s) throws IOException {
            if (s == null) {
                this.a.t();
            }
            else {
                this.a.A(s);
            }
        }
        
        public final void b(final Integer n) throws IOException {
            if (n == null) {
                this.a.t();
            }
            else {
                this.a.y((Number)n);
            }
        }
        
        public final void c(final j7.d d) throws IOException {
            this.a.h();
            d.a((e)new b(this.a, this.b));
            this.a.r();
        }
        
        public final void d(final o o, final Object o2) throws IOException {
            ng2.e.g((Object)o, "scalarType");
            if (o2 == null) {
                this.a.t();
                return;
            }
            final c b = this.b.a(o).b(o2);
            if (b instanceof c$g) {
                this.a((String)((c)b).a);
            }
            else if (b instanceof c$b) {
                final Boolean b2 = (Boolean)((c)b).a;
                if (b2 == null) {
                    this.a.t();
                }
                else {
                    this.a.x(b2);
                }
            }
            else if (b instanceof c$f) {
                final Number n = (Number)((c)b).a;
                if (n == null) {
                    this.a.t();
                }
                else {
                    this.a.y(n);
                }
            }
            else if (b instanceof c$d) {
                k7.f.a(((c)b).a, this.a);
            }
            else if (b instanceof c$c) {
                k7.f.a(((c)b).a, this.a);
            }
            else if (b instanceof c$e) {
                this.a(null);
            }
        }
    }
}
