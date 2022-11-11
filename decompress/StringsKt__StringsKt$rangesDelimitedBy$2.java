// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.text;

import sg2.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import rg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "Lkotlin/Pair;", "", "", "currentIndex", "invoke" }, k = 3, mv = { 1, 7, 1 }, xi = 48)
final class StringsKt__StringsKt$rangesDelimitedBy$2 extends Lambda implements p<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>>
{
    public final /* synthetic */ List<String> $delimitersList;
    public final /* synthetic */ boolean $ignoreCase;
    
    public StringsKt__StringsKt$rangesDelimitedBy$2(final List<String> $delimitersList, final boolean $ignoreCase) {
        this.$delimitersList = $delimitersList;
        this.$ignoreCase = $ignoreCase;
        super(2);
    }
    
    public final Pair<Integer, Integer> invoke(final CharSequence charSequence, final int n) {
        e.f((Object)charSequence, "$this$$receiver");
        final Pair t0 = b.T0(charSequence, (List)this.$delimitersList, n, this.$ignoreCase, false);
        Pair pair;
        if (t0 != null) {
            pair = new Pair(t0.getFirst(), (Object)((String)t0.getSecond()).length());
        }
        else {
            pair = null;
        }
        return (Pair<Integer, Integer>)pair;
    }
}
