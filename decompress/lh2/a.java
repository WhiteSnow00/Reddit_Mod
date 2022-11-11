// 
// Decompiled by Procyon v0.6.0
// 

package lh2;

import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities$f;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities$e;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities$d;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import sg2.e;
import hh2.o0;

public final class a extends o0
{
    public static final a a;
    
    static {
        a = new a();
    }
    
    public a() {
        super("package", false);
    }
    
    @Override
    public final Integer compareTo(final o0 o0) {
        e.f((Object)o0, "visibility");
        boolean b = false;
        if (this == o0) {
            return 0;
        }
        final Map a = Visibilities.a;
        if (o0 == Visibilities$d.a || o0 == Visibilities$e.a) {
            b = true;
        }
        if (b) {
            return 1;
        }
        return -1;
    }
    
    @Override
    public final String getInternalDisplayName() {
        return "public/*package*/";
    }
    
    @Override
    public final o0 normalize() {
        return (o0)Visibilities$f.a;
    }
}
