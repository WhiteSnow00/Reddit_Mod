// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.sequences;

import kotlin.Metadata;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u0002H\n�\u0006\u0004\b\u0005\u0010\u0006" }, d2 = { "<anonymous>", "", "T", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;" }, k = 3, mv = { 1, 7, 1 }, xi = 48)
final class SequencesKt___SequencesKt$filterNotNull$1 extends Lambda implements l<Object, Boolean>
{
    public static final SequencesKt___SequencesKt$filterNotNull$1 INSTANCE;
    
    static {
        INSTANCE = new SequencesKt___SequencesKt$filterNotNull$1();
    }
    
    public SequencesKt___SequencesKt$filterNotNull$1() {
        super(1);
    }
    
    public final Boolean invoke(final Object o) {
        return o == null;
    }
}
