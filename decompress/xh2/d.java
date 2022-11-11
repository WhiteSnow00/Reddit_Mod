// 
// Decompiled by Procyon v0.6.0
// 

package xh2;

import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

public final class d
{
    public static final d e;
    public final NullabilityQualifier a;
    public final MutabilityQualifier b;
    public final boolean c;
    public final boolean d;
    
    static {
        e = new d(null, false);
    }
    
    public d(final NullabilityQualifier a, final MutabilityQualifier b, final boolean c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
}
