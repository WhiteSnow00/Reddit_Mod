// 
// Decompiled by Procyon v0.6.0
// 

package th2;

import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature;
import wh2.c;
import kotlin.NoWhenBranchMatchedException;
import xh2.d$a;
import xh2.d$b;
import xh2.d;
import p1.h;
import ng2.e;

public final class o
{
    public final String a;
    
    public o(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof o && e.a((Object)this.a, (Object)((o)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return h.c(a.t("MemberSignature(signature="), this.a, ')');
    }
    
    public static final class a
    {
        public static o a(final String s, final String s2) {
            e.f((Object)s, "name");
            e.f((Object)s2, "desc");
            return new o(b.h(s, '#', s2));
        }
        
        public static o b(final d d) {
            o o;
            if (d instanceof d$b) {
                o = d(d.c(), d.b());
            }
            else {
                if (!(d instanceof d$a)) {
                    throw new NoWhenBranchMatchedException();
                }
                o = a(d.c(), d.b());
            }
            return o;
        }
        
        public static o c(final c c, final JvmProtoBuf$JvmMethodSignature jvmProtoBuf$JvmMethodSignature) {
            e.f((Object)c, "nameResolver");
            return d(c.getString(jvmProtoBuf$JvmMethodSignature.getName()), c.getString(jvmProtoBuf$JvmMethodSignature.getDesc()));
        }
        
        public static o d(final String s, final String s2) {
            e.f((Object)s, "name");
            e.f((Object)s2, "desc");
            return new o(b.l(s, s2));
        }
        
        public static o e(final o o, final int n) {
            e.f((Object)o, "signature");
            final StringBuilder sb = new StringBuilder();
            sb.append(o.a);
            sb.append('@');
            sb.append(n);
            return new o(sb.toString());
        }
    }
}
