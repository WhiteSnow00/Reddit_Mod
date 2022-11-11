// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.font;

import zg2.l;
import n2.p;
import n2.f;
import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
@c(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", l = { 399 }, m = "runCached")
final class AsyncTypefaceCache$runCached$1 extends ContinuationImpl
{
    public Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ b this$0;
    
    public AsyncTypefaceCache$runCached$1(final b this$0, final tg2.c<? super AsyncTypefaceCache$runCached$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, null, (tg2.c)this);
    }
}
