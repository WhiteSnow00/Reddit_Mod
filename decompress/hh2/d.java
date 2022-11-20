// 
// Decompiled by Procyon v0.6.0
// 

package hh2;

import java.io.InputStream;
import xi2.j;
import yh2.b;
import zg.a;
import ng2.e;
import th2.k$a$b;
import rh2.g;
import li2.c;
import th2.k;

public final class d implements k
{
    public final ClassLoader a;
    public final c b;
    
    public d(final ClassLoader a) {
        this.a = a;
        this.b = new c();
    }
    
    public final k$a$b a(final g g) {
        e.f((Object)g, "javaClass");
        final yh2.c d = g.d();
        k$a$b k$a$b2;
        final k$a$b k$a$b = k$a$b2 = null;
        if (d != null) {
            final String b = d.b();
            if (b == null) {
                k$a$b2 = k$a$b;
            }
            else {
                final Class w0 = zg.a.w0(this.a, b);
                k$a$b2 = k$a$b;
                if (w0 != null) {
                    final hh2.c a = c$a.a(w0);
                    k$a$b2 = k$a$b;
                    if (a != null) {
                        k$a$b2 = new k$a$b(a);
                    }
                }
            }
        }
        return k$a$b2;
    }
    
    public final k$a$b b(final b b) {
        e.f((Object)b, "classId");
        final String b2 = b.i().b();
        e.e((Object)b2, "relativeClassName.asString()");
        final String f0 = j.F0(b2, '.', '$');
        String string;
        if (b.h().d()) {
            string = f0;
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append(b.h());
            sb.append('.');
            sb.append(f0);
            string = sb.toString();
        }
        final Class w0 = zg.a.w0(this.a, string);
        if (w0 != null) {
            final hh2.c a = c$a.a(w0);
            if (a != null) {
                return new k$a$b(a);
            }
        }
        return null;
    }
    
    public final InputStream c(final yh2.c c) {
        e.f((Object)c, "packageFqName");
        if (!c.h(kotlin.reflect.jvm.internal.impl.builtins.e.i)) {
            return null;
        }
        final c b = this.b;
        li2.a.m.getClass();
        final String a = li2.a.a(c);
        b.getClass();
        return c.a(a);
    }
}
