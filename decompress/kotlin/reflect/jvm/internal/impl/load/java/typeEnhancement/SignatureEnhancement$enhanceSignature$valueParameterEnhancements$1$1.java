// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import ch2.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import ng2.e;
import ch2.m0;
import oi2.t;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import mg2.l;
import kotlin.jvm.internal.Lambda;

final class SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$1 extends Lambda implements l<CallableMemberDescriptor, t>
{
    public final m0 $p;
    
    public SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$1(final m0 $p) {
        this.$p = $p;
        super(1);
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke((CallableMemberDescriptor)o);
    }
    
    public final t invoke(final CallableMemberDescriptor callableMemberDescriptor) {
        e.f((Object)callableMemberDescriptor, "it");
        final t type = ((l0)((a)callableMemberDescriptor).g().get(this.$p.getIndex())).getType();
        e.e((Object)type, "it.valueParameters[p.index].type");
        return type;
    }
}
