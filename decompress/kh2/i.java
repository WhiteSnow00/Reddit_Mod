// 
// Decompiled by Procyon v0.6.0
// 

package kh2;

import java.util.Arrays;
import ng2.e;
import rh2.g;
import yh2.b;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a;
import ih2.t;
import yh2.c;

public interface i
{
    void a(final c p0);
    
    t b(final c p0);
    
    kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a c(final a p0);
    
    public static final class a
    {
        public final b a;
        public final byte[] b;
        public final g c;
        
        public a(final b a, g c, final int n) {
            if ((n & 0x4) != 0x0) {
                c = null;
            }
            this.a = a;
            this.b = null;
            this.c = c;
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
            return e.a((Object)this.a, (Object)a.a) && e.a((Object)this.b, (Object)a.b) && e.a((Object)this.c, (Object)a.c);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final byte[] b = this.b;
            int hashCode2 = 0;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = Arrays.hashCode(b);
            }
            final g c = this.c;
            if (c != null) {
                hashCode2 = c.hashCode();
            }
            return (hashCode * 31 + hashCode3) * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("Request(classId=");
            t.append(this.a);
            t.append(", previouslyFoundClassFileContent=");
            t.append(Arrays.toString(this.b));
            t.append(", outerClass=");
            t.append(this.c);
            t.append(')');
            return t.toString();
        }
    }
}
