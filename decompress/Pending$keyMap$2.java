// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import zg2.q;
import z0.y;
import kotlin.Metadata;
import z0.z;
import java.util.LinkedHashSet;
import java.util.HashMap;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a>\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0000j\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004`\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007" }, d2 = { "Ljava/util/HashMap;", "", "Ljava/util/LinkedHashSet;", "Lz0/z;", "Lkotlin/collections/LinkedHashSet;", "Lkotlin/collections/HashMap;", "invoke", "()Ljava/util/HashMap;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class Pending$keyMap$2 extends Lambda implements a<HashMap<Object, LinkedHashSet<z>>>
{
    public final /* synthetic */ b this$0;
    
    public Pending$keyMap$2(final b this$0) {
        this.this$0 = this$0;
        super(0);
    }
    
    public final HashMap<Object, LinkedHashSet<z>> invoke() {
        final q a = ComposerKt.a;
        final HashMap hashMap = new HashMap();
        final b this$0 = this.this$0;
        for (int size = this$0.a.size(), i = 0; i < size; ++i) {
            final z z = this$0.a.get(i);
            Object value;
            if (z.b != null) {
                value = new y(z.a, z.b);
            }
            else {
                value = z.a;
            }
            Object value2;
            if ((value2 = hashMap.get(value)) == null) {
                value2 = new LinkedHashSet();
                hashMap.put(value, value2);
            }
            ((LinkedHashSet)value2).add(z);
        }
        return hashMap;
    }
}
