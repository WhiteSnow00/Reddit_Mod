// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import oi2.t;
import ch2.g;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import ng2.e;
import bh2.c;
import oi2.w0;
import mg2.l;
import kotlin.jvm.internal.Lambda;

final class SignatureEnhancement$containsFunctionN$1 extends Lambda implements l<w0, Boolean>
{
    public static final SignatureEnhancement$containsFunctionN$1 INSTANCE;
    
    static {
        INSTANCE = new SignatureEnhancement$containsFunctionN$1();
    }
    
    public SignatureEnhancement$containsFunctionN$1() {
        super(1);
    }
    
    public final Boolean invoke(final w0 w0) {
        final ch2.e f = ((t)w0).I0().f();
        if (f == null) {
            return Boolean.FALSE;
        }
        final yh2.e name = ((g)f).getName();
        final String a = c.a;
        final yh2.c f2 = c.f;
        return e.a((Object)name, (Object)f2.f()) && e.a((Object)DescriptorUtilsKt.c((g)f), (Object)f2);
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke((w0)o);
    }
}
