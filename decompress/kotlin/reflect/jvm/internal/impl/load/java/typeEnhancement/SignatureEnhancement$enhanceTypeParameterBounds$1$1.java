// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import oi2.w;
import ng2.e;
import oi2.w0;
import mg2.l;
import kotlin.jvm.internal.Lambda;

final class SignatureEnhancement$enhanceTypeParameterBounds$1$1 extends Lambda implements l<w0, Boolean>
{
    public static final SignatureEnhancement$enhanceTypeParameterBounds$1$1 INSTANCE;
    
    static {
        INSTANCE = new SignatureEnhancement$enhanceTypeParameterBounds$1$1();
    }
    
    public SignatureEnhancement$enhanceTypeParameterBounds$1$1() {
        super(1);
    }
    
    public final Boolean invoke(final w0 w0) {
        e.f((Object)w0, "it");
        return w0 instanceof w;
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke((w0)o);
    }
}
