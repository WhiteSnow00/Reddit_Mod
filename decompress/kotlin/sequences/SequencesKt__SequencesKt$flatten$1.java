// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.sequences;

import sg2.e;
import kotlin.Metadata;
import java.util.Iterator;
import bj2.k;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "T", "Lbj2/k;", "it", "", "invoke", "(Lbj2/k;)Ljava/util/Iterator;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class SequencesKt__SequencesKt$flatten$1 extends Lambda implements l<k<Object>, Iterator<Object>>
{
    public static final SequencesKt__SequencesKt$flatten$1 INSTANCE;
    
    static {
        INSTANCE = new SequencesKt__SequencesKt$flatten$1();
    }
    
    public SequencesKt__SequencesKt$flatten$1() {
        super(1);
    }
    
    public final Iterator<Object> invoke(final k<Object> k) {
        e.f((Object)k, "it");
        return k.iterator();
    }
}
