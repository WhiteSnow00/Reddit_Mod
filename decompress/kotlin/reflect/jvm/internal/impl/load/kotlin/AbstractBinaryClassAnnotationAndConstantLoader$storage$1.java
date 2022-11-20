// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.load.kotlin;

import th2.a;
import java.util.HashMap;
import ng2.e;
import mg2.l;
import kotlin.jvm.internal.Lambda;

final class AbstractBinaryClassAnnotationAndConstantLoader$storage$1 extends Lambda implements l<th2.l, AbstractBinaryClassAnnotationAndConstantLoader$a<Object, Object>>
{
    public final AbstractBinaryClassAnnotationAndConstantLoader<Object, Object> this$0;
    
    public AbstractBinaryClassAnnotationAndConstantLoader$storage$1(final AbstractBinaryClassAnnotationAndConstantLoader<Object, Object> this$0) {
        this.this$0 = this$0;
        super(1);
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke((th2.l)o);
    }
    
    public final AbstractBinaryClassAnnotationAndConstantLoader$a<Object, Object> invoke(final th2.l l) {
        e.f((Object)l, "kotlinClass");
        final AbstractBinaryClassAnnotationAndConstantLoader<Object, Object> this$0 = this.this$0;
        this$0.getClass();
        final HashMap hashMap = new HashMap();
        final HashMap hashMap2 = new HashMap();
        final HashMap hashMap3 = new HashMap();
        l.d(new a(this$0, hashMap, l, hashMap2));
        return (AbstractBinaryClassAnnotationAndConstantLoader$a<Object, Object>)new AbstractBinaryClassAnnotationAndConstantLoader$a(hashMap, hashMap2, hashMap3);
    }
}
