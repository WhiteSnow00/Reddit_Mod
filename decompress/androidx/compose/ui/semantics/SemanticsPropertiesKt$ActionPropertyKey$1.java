// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.semantics;

import ah2.f;
import kotlin.Metadata;
import pg2.d;
import h2.a;
import zg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007" }, d2 = { "Lpg2/d;", "", "T", "Lh2/a;", "parentValue", "childValue", "invoke", "(Lh2/a;Lh2/a;)Lh2/a;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
public final class SemanticsPropertiesKt$ActionPropertyKey$1 extends Lambda implements p<a<d<? extends Boolean>>, a<d<? extends Boolean>>, a<d<? extends Boolean>>>
{
    public static final SemanticsPropertiesKt$ActionPropertyKey$1 INSTANCE;
    
    static {
        INSTANCE = new SemanticsPropertiesKt$ActionPropertyKey$1();
    }
    
    public SemanticsPropertiesKt$ActionPropertyKey$1() {
        super(2);
    }
    
    public final a<d<? extends Boolean>> invoke(final a<d<? extends Boolean>> a, final a<d<? extends Boolean>> a2) {
        f.f((Object)a2, "childValue");
        String s;
        if (a == null || (s = a.a) == null) {
            s = a2.a;
        }
        d d;
        if (a == null || (d = a.b) == null) {
            d = a2.b;
        }
        return (a<d<? extends Boolean>>)new a(s, d);
    }
}
