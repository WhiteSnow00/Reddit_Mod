// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import fh2.d0;
import rh2.n;
import ci2.g;
import ni2.f;
import mg2.a;
import kotlin.jvm.internal.Lambda;

final class LazyJavaScope$resolveProperty$1 extends Lambda implements a<f<? extends g<?>>>
{
    public final n $field;
    public final d0 $propertyDescriptor;
    public final LazyJavaScope this$0;
    
    public LazyJavaScope$resolveProperty$1(final LazyJavaScope this$0, final n $field, final d0 $propertyDescriptor) {
        this.this$0 = this$0;
        this.$field = $field;
        this.$propertyDescriptor = $propertyDescriptor;
        super(0);
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
    
    public final f<g<?>> invoke() {
        final LazyJavaScope this$0 = this.this$0;
        return (f<g<?>>)this$0.b.a.a.g((a)new a<g<?>>(this$0, this.$field, this.$propertyDescriptor) {
            public final n $field;
            public final d0 $propertyDescriptor;
            public final LazyJavaScope this$0;
            
            public final g<?> invoke() {
                this.this$0.b.a.h.a(this.$field, this.$propertyDescriptor);
                return null;
            }
            
            public /* bridge */ Object invoke() {
                return this.invoke();
            }
        });
    }
}
