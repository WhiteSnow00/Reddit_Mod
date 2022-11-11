// 
// Decompiled by Procyon v0.6.0
// 

package yh2;

import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import java.util.List;
import hh2.e0;
import di2.b;
import hi2.j$a;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import di2.e;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import hh2.t;
import hi2.g;
import ih2.c;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader;

public final class d extends AbstractBinaryClassAnnotationAndConstantLoader<c, g<?>>
{
    public final t c;
    public final NotFoundClasses d;
    public final pi2.c e;
    
    public d(final kotlin.reflect.jvm.internal.impl.descriptors.impl.c c, final NotFoundClasses d, final LockBasedStorageManager lockBasedStorageManager, final mh2.d d2) {
        super(lockBasedStorageManager, d2);
        this.c = (t)c;
        this.d = d;
        this.e = new pi2.c((t)c, d);
    }
    
    public static final g w(final d d, final e e, final Object o) {
        d.getClass();
        Object c;
        if ((c = ConstantValueFactory.c(o)) == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unsupported annotation argument: ");
            sb.append(e);
            final String string = sb.toString();
            sg2.e.f((Object)string, "message");
            c = new j$a(string);
        }
        return (g)c;
    }
    
    public final yh2.e s(final b b, final e0 e0, final List list) {
        sg2.e.f((Object)list, "result");
        return new yh2.e(this, FindClassInModuleKt.c(this.c, b, this.d), b, list, e0);
    }
}
