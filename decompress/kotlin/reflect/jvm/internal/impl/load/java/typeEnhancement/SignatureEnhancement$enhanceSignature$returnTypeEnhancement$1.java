// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.reflect.jvm.internal.impl.descriptors.a;
import ng2.e;
import oi2.t;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import mg2.l;
import kotlin.jvm.internal.Lambda;

final class SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1 extends Lambda implements l<CallableMemberDescriptor, t>
{
    public static final SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1 INSTANCE;
    
    static {
        INSTANCE = new SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1();
    }
    
    public SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1() {
        super(1);
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke((CallableMemberDescriptor)o);
    }
    
    public final t invoke(final CallableMemberDescriptor callableMemberDescriptor) {
        e.f((Object)callableMemberDescriptor, "it");
        final t returnType = ((a)callableMemberDescriptor).getReturnType();
        e.c((Object)returnType);
        return returnType;
    }
}
