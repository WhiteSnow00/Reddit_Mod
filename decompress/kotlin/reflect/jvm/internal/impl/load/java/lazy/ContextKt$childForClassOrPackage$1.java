// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import ng2.e;
import nh2.c;
import ch2.d;
import kh2.q;
import mg2.a;
import kotlin.jvm.internal.Lambda;

final class ContextKt$childForClassOrPackage$1 extends Lambda implements a<q>
{
    public final d $containingDeclaration;
    public final c $this_childForClassOrPackage;
    
    public ContextKt$childForClassOrPackage$1(final c $this_childForClassOrPackage, final d $containingDeclaration) {
        this.$this_childForClassOrPackage = $this_childForClassOrPackage;
        this.$containingDeclaration = $containingDeclaration;
        super(0);
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
    
    public final q invoke() {
        final c $this_childForClassOrPackage = this.$this_childForClassOrPackage;
        final dh2.e annotations = ((dh2.a)this.$containingDeclaration).getAnnotations();
        e.f((Object)$this_childForClassOrPackage, "<this>");
        e.f((Object)annotations, "additionalAnnotations");
        return $this_childForClassOrPackage.a.q.b((q)$this_childForClassOrPackage.d.getValue(), (Iterable)annotations);
    }
}
