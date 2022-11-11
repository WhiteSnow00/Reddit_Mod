// 
// Decompiled by Procyon v0.6.0
// 

package androidx.paging;

import c5.g;
import mg2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 5, 1 }, xi = 48)
@c(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = { 609, 620, 398, 406, 631, 642, 448, 653, 470, 496, 664 }, m = "doLoad")
final class PageFetcherSnapshot$doLoad$1 extends ContinuationImpl
{
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public Object L$10;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PageFetcherSnapshot<Object, Object> this$0;
    
    public PageFetcherSnapshot$doLoad$1(final PageFetcherSnapshot<Object, Object> this$0, final lg2.c<? super PageFetcherSnapshot$doLoad$1> c) {
        this.this$0 = this$0;
        super((lg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return PageFetcherSnapshot.b(this.this$0, null, null, (lg2.c)this);
    }
}
