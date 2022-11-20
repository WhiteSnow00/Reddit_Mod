// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.resolve.constants;

import ng2.e;
import oi2.t;
import mg2.l;
import kotlin.jvm.internal.Lambda;

final class IntegerLiteralTypeConstructor$valueToString$1 extends Lambda implements l<t, CharSequence>
{
    public static final IntegerLiteralTypeConstructor$valueToString$1 INSTANCE;
    
    static {
        INSTANCE = new IntegerLiteralTypeConstructor$valueToString$1();
    }
    
    public IntegerLiteralTypeConstructor$valueToString$1() {
        super(1);
    }
    
    public final CharSequence invoke(final t t) {
        e.f((Object)t, "it");
        return t.toString();
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke((t)o);
    }
}
