// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.data;

import java.util.HashMap;

public final class f
{
    public static final f$a b;
    public final HashMap a;
    
    static {
        b = new e.a<Object>() {
            @Override
            public final Class<Object> a() {
                throw new UnsupportedOperationException("Not implemented");
            }
            
            @Override
            public final e<Object> b(final Object o) {
                return new b(o);
            }
        };
    }
    
    public f() {
        this.a = new HashMap();
    }
    
    public static final class b implements e<Object>
    {
        public final Object a;
        
        public b(final Object a) {
            this.a = a;
        }
        
        @Override
        public final Object a() {
            return this.a;
        }
        
        @Override
        public final void b() {
        }
    }
}
