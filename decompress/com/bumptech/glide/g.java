// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class g
{
    public final Map<Class<?>, Object> a;
    
    public g(final a a) {
        this.a = Collections.unmodifiableMap((Map<? extends Class<?>, ?>)new HashMap<Class<?>, Object>(a.a));
    }
    
    public static final class a
    {
        public final HashMap a;
        
        public a() {
            this.a = new HashMap();
        }
    }
}
