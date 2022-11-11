// 
// Decompiled by Procyon v0.6.0
// 

package qj2;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import zg2.d;

public final class b implements e
{
    public final e a;
    public final d<?> b;
    public final String c;
    
    public b(final SerialDescriptorImpl a, final d b) {
        this.a = a;
        this.b = (d<?>)b;
        final StringBuilder sb = new StringBuilder();
        sb.append(a.a);
        sb.append('<');
        sb.append(b.o());
        sb.append('>');
        this.c = sb.toString();
    }
    
    @Override
    public final boolean b() {
        return this.a.b();
    }
    
    @Override
    public final int c(final String s) {
        sg2.e.f((Object)s, "name");
        return this.a.c(s);
    }
    
    @Override
    public final e d(final int n) {
        return this.a.d(n);
    }
    
    @Override
    public final int e() {
        return this.a.e();
    }
    
    @Override
    public final boolean equals(final Object o) {
        b b;
        if (o instanceof b) {
            b = (b)o;
        }
        else {
            b = null;
        }
        final boolean b2 = false;
        if (b == null) {
            return false;
        }
        boolean b3 = b2;
        if (sg2.e.a((Object)this.a, (Object)b.a)) {
            b3 = b2;
            if (sg2.e.a((Object)b.b, (Object)this.b)) {
                b3 = true;
            }
        }
        return b3;
    }
    
    @Override
    public final String f(final int n) {
        return this.a.f(n);
    }
    
    @Override
    public final List<Annotation> g(final int n) {
        return this.a.g(n);
    }
    
    @Override
    public final List<Annotation> getAnnotations() {
        return this.a.getAnnotations();
    }
    
    @Override
    public final h getKind() {
        return this.a.getKind();
    }
    
    @Override
    public final String h() {
        return this.c;
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + this.b.hashCode() * 31;
    }
    
    @Override
    public final boolean i(final int n) {
        return this.a.i(n);
    }
    
    @Override
    public final boolean isInline() {
        return this.a.isInline();
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("ContextDescriptor(kClass: ");
        r.append(this.b);
        r.append(", original: ");
        r.append(this.a);
        r.append(')');
        return r.toString();
    }
}
