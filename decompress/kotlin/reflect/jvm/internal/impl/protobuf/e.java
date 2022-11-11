// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class e
{
    public final Map<a, GeneratedMessageLite.e<?, ?>> a;
    
    static {
        new e(0);
    }
    
    public e() {
        this.a = new HashMap<a, GeneratedMessageLite.e<?, ?>>();
    }
    
    public e(final int n) {
        this.a = Collections.emptyMap();
    }
    
    public final void a(final GeneratedMessageLite.e<?, ?> e) {
        this.a.put(new a(e.a, e.d.g), e);
    }
    
    public static final class a
    {
        public final Object a;
        public final int b;
        
        public a(final Object a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            final boolean b = o instanceof a;
            final boolean b2 = false;
            if (!b) {
                return false;
            }
            final a a = (a)o;
            boolean b3 = b2;
            if (this.a == a.a) {
                b3 = b2;
                if (this.b == a.b) {
                    b3 = true;
                }
            }
            return b3;
        }
        
        @Override
        public final int hashCode() {
            return System.identityHashCode(this.a) * 65535 + this.b;
        }
    }
}
