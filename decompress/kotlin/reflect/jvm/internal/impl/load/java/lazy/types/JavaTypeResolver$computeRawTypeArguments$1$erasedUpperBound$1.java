// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import oi2.x;
import ng2.e;
import java.util.Set;
import ch2.j0;
import rh2.j;
import oi2.l0;
import oi2.t;
import mg2.a;
import kotlin.jvm.internal.Lambda;

final class JavaTypeResolver$computeRawTypeArguments$1$erasedUpperBound$1 extends Lambda implements a<t>
{
    public final ph2.a $attr;
    public final l0 $constructor;
    public final j $javaType;
    public final j0 $parameter;
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a this$0;
    
    public JavaTypeResolver$computeRawTypeArguments$1$erasedUpperBound$1(final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a this$0, final j0 $parameter, final j $javaType, final ph2.a $attr, final l0 $constructor) {
        this.this$0 = this$0;
        this.$parameter = $parameter;
        this.$javaType = $javaType;
        this.$attr = $attr;
        this.$constructor = $constructor;
        super(0);
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
    
    public final t invoke() {
        final TypeParameterUpperBoundEraser c = this.this$0.c;
        final j0 $parameter = this.$parameter;
        final boolean f = this.$javaType.F();
        final ph2.a $attr = this.$attr;
        final ch2.e f2 = this.$constructor.f();
        x r;
        if (f2 != null) {
            r = f2.r();
        }
        else {
            r = null;
        }
        $attr.getClass();
        final t a = c.a($parameter, f, ph2.a.a($attr, (JavaTypeFlexibility)null, (Set)null, r, 15));
        e.e((Object)a, "typeParameterUpperBoundE\u2026efaultType)\n            )");
        return a;
    }
}
