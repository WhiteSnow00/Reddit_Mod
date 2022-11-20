// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.f;
import java.util.Collection;
import yh2.e;
import mg2.l;
import kotlin.jvm.internal.Lambda;

final class LazyJavaClassMemberScope$computeNonDeclaredProperties$2 extends Lambda implements l<e, Collection<? extends f>>
{
    public final LazyJavaClassMemberScope this$0;
    
    public LazyJavaClassMemberScope$computeNonDeclaredProperties$2(final LazyJavaClassMemberScope this$0) {
        this.this$0 = this$0;
        super(1);
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke((e)o);
    }
    
    public final Collection<f> invoke(final e e) {
        ng2.e.f((Object)e, "it");
        return LazyJavaClassMemberScope.w(this.this$0, e);
    }
}
