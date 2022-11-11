// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.io;

import sg2.e;
import java.util.ArrayList;
import kotlin.Metadata;
import hg2.j;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004" }, d2 = { "", "it", "Lhg2/j;", "invoke", "(Ljava/lang/String;)V", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class TextStreamsKt$readLines$1 extends Lambda implements l<String, j>
{
    public final /* synthetic */ ArrayList<String> $result;
    
    public TextStreamsKt$readLines$1(final ArrayList<String> $result) {
        this.$result = $result;
        super(1);
    }
    
    public final void invoke(final String s) {
        e.f((Object)s, "it");
        this.$result.add(s);
    }
}
