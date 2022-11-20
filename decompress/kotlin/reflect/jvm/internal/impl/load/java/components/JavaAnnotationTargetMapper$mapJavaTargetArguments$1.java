// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.load.java.components;

import ch2.l0;
import ch2.m0;
import qi2.h;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import vl.a;
import kotlin.reflect.jvm.internal.impl.builtins.e$a;
import lh2.b;
import ng2.e;
import ch2.t;
import mg2.l;
import kotlin.jvm.internal.Lambda;

final class JavaAnnotationTargetMapper$mapJavaTargetArguments$1 extends Lambda implements l<t, oi2.t>
{
    public static final JavaAnnotationTargetMapper$mapJavaTargetArguments$1 INSTANCE;
    
    static {
        INSTANCE = new JavaAnnotationTargetMapper$mapJavaTargetArguments$1();
    }
    
    public JavaAnnotationTargetMapper$mapJavaTargetArguments$1() {
        super(1);
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke((t)o);
    }
    
    public final oi2.t invoke(final t t) {
        e.f((Object)t, "module");
        final yh2.e a = b.a;
        final m0 l1 = vl.a.L1(b.b, t.p().j(e$a.t));
        oi2.t type;
        if (l1 != null) {
            type = ((l0)l1).getType();
        }
        else {
            type = null;
        }
        Object c = type;
        if (type == null) {
            c = h.c(ErrorTypeKind.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]);
        }
        return (oi2.t)c;
    }
}
