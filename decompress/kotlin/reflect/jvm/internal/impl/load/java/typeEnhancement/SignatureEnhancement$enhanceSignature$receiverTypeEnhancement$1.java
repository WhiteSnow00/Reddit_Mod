// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import ch2.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import ch2.d0;
import ng2.e;
import oi2.t;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import mg2.l;
import kotlin.jvm.internal.Lambda;

final class SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 extends Lambda implements l<CallableMemberDescriptor, t>
{
    public static final SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 INSTANCE;
    
    static {
        INSTANCE = new SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1();
    }
    
    public SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1() {
        super(1);
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke((CallableMemberDescriptor)o);
    }
    
    public final t invoke(final CallableMemberDescriptor callableMemberDescriptor) {
        e.f((Object)callableMemberDescriptor, "it");
        final d0 d0 = ((a)callableMemberDescriptor).d0();
        e.c((Object)d0);
        final t type = ((l0)d0).getType();
        e.e((Object)type, "it.extensionReceiverParameter!!.type");
        return type;
    }
}
