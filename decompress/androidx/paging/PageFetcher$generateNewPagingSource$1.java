// 
// Decompiled by Procyon v0.6.0
// 

package androidx.paging;

import mg2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 5, 1 }, xi = 48)
@c(c = "androidx.paging.PageFetcher", f = "PageFetcher.kt", l = { 188 }, m = "generateNewPagingSource")
final class PageFetcher$generateNewPagingSource$1 extends ContinuationImpl
{
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ d<Object, Object> this$0;
    
    public PageFetcher$generateNewPagingSource$1(final d<Object, Object> this$0, final lg2.c<? super PageFetcher$generateNewPagingSource$1> c) {
        this.this$0 = this$0;
        super((lg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return d.a((d)this.this$0, (PagingSource)null, (lg2.c)this);
    }
}
