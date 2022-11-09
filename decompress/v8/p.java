// 
// Decompiled by Procyon v0.6.0
// 

package v8;

import java.util.List;
import java.util.HashMap;
import m9.a;

public final class p
{
    public final r a;
    public final a b;
    
    public p(final m9.a.c c) {
        final r a = new r(c);
        this.b = new a();
        this.a = a;
    }
    
    public static final class a
    {
        public final HashMap a;
        
        public a() {
            this.a = new HashMap();
        }
        
        public final <Model> void a(final Class<Model> clazz, final List<n<Model, ?>> list) {
            if (this.a.put(clazz, new p.a.a((List<n<Object, ?>>)list)) == null) {
                return;
            }
            throw new IllegalStateException(ak0.n.m("Already cached loaders for model: ", (Class)clazz));
        }
        
        public static final class a<Model>
        {
            public final List<n<Model, ?>> a;
            
            public a(final List<n<Model, ?>> a) {
                this.a = a;
            }
        }
    }
}
