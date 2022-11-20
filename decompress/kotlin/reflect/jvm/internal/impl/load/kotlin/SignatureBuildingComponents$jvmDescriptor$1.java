// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.load.kotlin;

import ng2.e;
import mg2.l;
import kotlin.jvm.internal.Lambda;

final class SignatureBuildingComponents$jvmDescriptor$1 extends Lambda implements l<String, CharSequence>
{
    public static final SignatureBuildingComponents$jvmDescriptor$1 INSTANCE;
    
    static {
        INSTANCE = new SignatureBuildingComponents$jvmDescriptor$1();
    }
    
    public SignatureBuildingComponents$jvmDescriptor$1() {
        super(1);
    }
    
    public final CharSequence invoke(final String s) {
        e.f((Object)s, "it");
        return b.b(s);
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke((String)o);
    }
}
