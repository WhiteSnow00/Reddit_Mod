// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.collections;

import lg.e0;
import kotlin.Metadata;
import java.util.Iterator;
import rg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\n\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003" }, d2 = { "<anonymous>", "", "T", "invoke" }, k = 3, mv = { 1, 7, 1 }, xi = 48)
final class ArraysKt___ArraysKt$withIndex$1 extends Lambda implements a<Iterator<Object>>
{
    public final /* synthetic */ Object[] $this_withIndex;
    
    public ArraysKt___ArraysKt$withIndex$1(final Object[] $this_withIndex) {
        this.$this_withIndex = $this_withIndex;
        super(0);
    }
    
    public final Iterator<Object> invoke() {
        return (Iterator<Object>)e0.X(this.$this_withIndex);
    }
}
