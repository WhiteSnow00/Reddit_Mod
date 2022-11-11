// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.sequences;

import kotlin.Metadata;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006" }, d2 = { "<anonymous>", "", "R", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;" }, k = 3, mv = { 1, 7, 1 }, xi = 48)
final class SequencesKt___SequencesJvmKt$filterIsInstance$1 extends Lambda implements l<Object, Boolean>
{
    public final /* synthetic */ Class<Object> $klass;
    
    public SequencesKt___SequencesJvmKt$filterIsInstance$1(final Class<Object> $klass) {
        this.$klass = $klass;
        super(1);
    }
    
    public final Boolean invoke(final Object o) {
        return this.$klass.isInstance(o);
    }
}
