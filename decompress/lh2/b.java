// 
// Decompiled by Procyon v0.6.0
// 

package lh2;

import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities$f;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities$e;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities$d;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities$Internal;
import sg2.e;
import hh2.o0;

public final class b extends o0
{
    public static final b a;
    
    static {
        a = new b();
    }
    
    public b() {
        super("protected_and_package", true);
    }
    
    @Override
    public final Integer compareTo(final o0 o0) {
        e.f((Object)o0, "visibility");
        final boolean a = e.a((Object)this, (Object)o0);
        boolean b = false;
        if (a) {
            return 0;
        }
        if (o0 == Visibilities$Internal.INSTANCE) {
            return null;
        }
        final Map a2 = Visibilities.a;
        final Visibilities$d a3 = Visibilities$d.a;
        final int n = 1;
        if (o0 == a3 || o0 == Visibilities$e.a) {
            b = true;
        }
        int n2;
        if (b) {
            n2 = n;
        }
        else {
            n2 = -1;
        }
        return n2;
    }
    
    @Override
    public final String getInternalDisplayName() {
        return "protected/*protected and package*/";
    }
    
    @Override
    public final o0 normalize() {
        return (o0)Visibilities$f.a;
    }
}
