// 
// Decompiled by Procyon v0.6.0
// 

package lh2;

import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities$f;
import hh2.o0;

public final class c extends o0
{
    public static final c a;
    
    static {
        a = new c();
    }
    
    public c() {
        super("protected_static", true);
    }
    
    @Override
    public final String getInternalDisplayName() {
        return "protected/*protected static*/";
    }
    
    @Override
    public final o0 normalize() {
        return (o0)Visibilities$f.a;
    }
}
