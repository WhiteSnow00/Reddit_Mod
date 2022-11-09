// 
// Decompiled by Procyon v0.6.0
// 

package b8;

import java.util.Map;
import ah2.f;

public abstract class e
{
    public static final class a extends e
    {
        public final String a;
        
        public a(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return o instanceof a && ah2.f.a((Object)((a)o).a, (Object)this.a);
        }
        
        @Override
        public final int hashCode() {
            final String a = this.a;
            int hashCode;
            if (a == null) {
                hashCode = 0;
            }
            else {
                hashCode = a.hashCode();
            }
            return hashCode;
        }
    }
    
    public static final class b extends e
    {
        @Override
        public final boolean equals(final Object o) {
            return o instanceof b;
        }
        
        @Override
        public final int hashCode() {
            return b.class.hashCode();
        }
    }
    
    public static final class c extends e
    {
        public final Map<String, Object> a;
        
        public c(final Map<String, ?> a) {
            this.a = (Map<String, Object>)a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return o instanceof c && ah2.f.a((Object)((c)o).a, (Object)this.a);
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
    }
    
    public static final class d extends e
    {
        @Override
        public final boolean equals(final Object o) {
            return o instanceof d;
        }
        
        @Override
        public final int hashCode() {
            return d.class.hashCode();
        }
    }
    
    public static final class e extends b8.e
    {
        public final String a;
        public final Map<String, Object> b;
        
        public e(final String a, final Map<String, ?> b) {
            this.a = a;
            this.b = (Map<String, Object>)b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (o instanceof e) {
                final e e = (e)o;
                if (ah2.f.a((Object)e.a, (Object)this.a) && ah2.f.a((Object)e.b, (Object)this.b)) {
                    return true;
                }
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            final String a = this.a;
            int hashCode;
            if (a == null) {
                hashCode = 0;
            }
            else {
                hashCode = a.hashCode();
            }
            return this.b.hashCode() + hashCode * 31;
        }
    }
    
    public static final class f extends e
    {
        public final String a;
        public final Map<String, Object> b;
        
        public f(final String a, final Map<String, ?> b) {
            this.a = a;
            this.b = (Map<String, Object>)b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (o instanceof f) {
                final f f = (f)o;
                if (ah2.f.a((Object)f.a, (Object)this.a) && ah2.f.a((Object)f.b, (Object)this.b)) {
                    return true;
                }
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            final String a = this.a;
            int hashCode;
            if (a == null) {
                hashCode = 0;
            }
            else {
                hashCode = a.hashCode();
            }
            return this.b.hashCode() + hashCode * 31;
        }
    }
    
    public static final class g extends e
    {
        public final String a;
        
        public g(final String a) {
            ah2.f.g((Object)a, "rawMessage");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return o instanceof g && ah2.f.a((Object)((g)o).a, (Object)this.a);
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
    }
}
