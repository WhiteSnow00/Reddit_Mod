// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import hh2.c;
import rg2.l;
import sg2.e;
import a4.a0;
import kotlin.reflect.jvm.internal.impl.builtins.e$a;
import si2.d;
import pi2.h;
import di2.b;
import java.util.Set;

public final class ClassDeserializer
{
    public static final Set<b> c;
    public final h a;
    public final d b;
    
    static {
        c = a0.A0(b.l(e$a.c.i()));
    }
    
    public ClassDeserializer(final h a) {
        e.f((Object)a, "components");
        this.a = a;
        this.b = (d)a.a.b((l)new ClassDeserializer$classes$1(this));
    }
    
    public final c a(final b b, final pi2.e e) {
        e.f((Object)b, "classId");
        return ((l<a, c>)this.b).invoke(new a(b, e));
    }
    
    public static final class a
    {
        public final b a;
        public final pi2.e b;
        
        public a(final b a, final pi2.e b) {
            e.f((Object)a, "classId");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return o instanceof a && e.a((Object)this.a, (Object)((a)o).a);
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
    }
}
