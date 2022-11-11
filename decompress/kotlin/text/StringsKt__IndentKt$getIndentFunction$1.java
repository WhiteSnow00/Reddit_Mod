// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.text;

import sg2.e;
import kotlin.Metadata;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003" }, d2 = { "<anonymous>", "", "line", "invoke" }, k = 3, mv = { 1, 7, 1 }, xi = 48)
final class StringsKt__IndentKt$getIndentFunction$1 extends Lambda implements l<String, String>
{
    public static final StringsKt__IndentKt$getIndentFunction$1 INSTANCE;
    
    static {
        INSTANCE = new StringsKt__IndentKt$getIndentFunction$1();
    }
    
    public StringsKt__IndentKt$getIndentFunction$1() {
        super(1);
    }
    
    public final String invoke(final String s) {
        e.f((Object)s, "line");
        return s;
    }
}
