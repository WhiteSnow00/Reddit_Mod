// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.sequences;

import sg2.e;
import kotlin.Metadata;
import java.util.Iterator;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "T", "it", "", "invoke" }, k = 3, mv = { 1, 7, 1 }, xi = 48)
final class SequencesKt__SequencesKt$flatten$2 extends Lambda implements l<Iterable<Object>, Iterator<Object>>
{
    public static final SequencesKt__SequencesKt$flatten$2 INSTANCE;
    
    static {
        INSTANCE = new SequencesKt__SequencesKt$flatten$2();
    }
    
    public SequencesKt__SequencesKt$flatten$2() {
        super(1);
    }
    
    public final Iterator<Object> invoke(final Iterable<Object> iterable) {
        e.f((Object)iterable, "it");
        return iterable.iterator();
    }
}
