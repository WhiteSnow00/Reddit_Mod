// 
// Decompiled by Procyon v0.6.0
// 

package c5;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import lg2.c;
import androidx.paging.LoadType;
import androidx.paging.PageFetcherSnapshot;
import hj2.f;

public final class o implements f<g>
{
    public final /* synthetic */ PageFetcherSnapshot f;
    public final /* synthetic */ LoadType g;
    
    public o(final PageFetcherSnapshot f, final LoadType g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final Object emit(g g, final c<? super j> c) {
        g = g;
        final Object b = PageFetcherSnapshot.b(this.f, this.g, g, c);
        if (b == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return b;
        }
        return j.a;
    }
}
