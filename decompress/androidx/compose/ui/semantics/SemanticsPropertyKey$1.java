// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.semantics;

import kotlin.Metadata;
import zg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\b\u0010\u0002\u001a\u0004\u0018\u0001H\u00012\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "<anonymous>", "T", "parentValue", "childValue", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;" }, k = 3, mv = { 1, 6, 0 }, xi = 48)
final class SemanticsPropertyKey$1 extends Lambda implements p<Object, Object, Object>
{
    public static final SemanticsPropertyKey$1 INSTANCE;
    
    static {
        INSTANCE = new SemanticsPropertyKey$1();
    }
    
    public SemanticsPropertyKey$1() {
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        Object o3 = o;
        if (o == null) {
            o3 = o2;
        }
        return o3;
    }
}
