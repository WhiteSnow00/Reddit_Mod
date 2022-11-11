// 
// Decompiled by Procyon v0.6.0
// 

package yh2;

import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature;
import bi2.c;
import kotlin.NoWhenBranchMatchedException;
import ci2.d$a;
import ci2.d$b;
import ci2.d;
import aw.b;
import al0.f0;
import sg2.e;

public final class p
{
    public final String a;
    
    public p(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof p && e.a((Object)this.a, (Object)((p)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return f0.n(a.r("MemberSignature(signature="), this.a, ')');
    }
    
    public static final class a
    {
        public static p a(final String s, final String s2) {
            e.f((Object)s, "name");
            e.f((Object)s2, "desc");
            return new p(b.g(s, '#', s2));
        }
        
        public static p b(final d d) {
            p p;
            if (d instanceof d$b) {
                p = d(d.c(), d.b());
            }
            else {
                if (!(d instanceof d$a)) {
                    throw new NoWhenBranchMatchedException();
                }
                p = a(d.c(), d.b());
            }
            return p;
        }
        
        public static p c(final c c, final JvmProtoBuf$JvmMethodSignature jvmProtoBuf$JvmMethodSignature) {
            e.f((Object)c, "nameResolver");
            return d(c.getString(jvmProtoBuf$JvmMethodSignature.getName()), c.getString(jvmProtoBuf$JvmMethodSignature.getDesc()));
        }
        
        public static p d(final String s, final String s2) {
            e.f((Object)s, "name");
            e.f((Object)s2, "desc");
            return new p(al0.b.h(s, s2));
        }
        
        public static p e(final p p2, final int n) {
            e.f((Object)p2, "signature");
            final StringBuilder sb = new StringBuilder();
            sb.append(p2.a);
            sb.append('@');
            sb.append(n);
            return new p(sb.toString());
        }
    }
}
