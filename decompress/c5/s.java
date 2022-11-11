// 
// Decompiled by Procyon v0.6.0
// 

package c5;

import hj2.g;
import androidx.paging.PageEvent$Insert;
import androidx.paging.PageEvent;
import hj2.e;

public final class s<T>
{
    public static final s<Object> c;
    public final e<PageEvent<T>> a;
    public final a0 b;
    
    static {
        c = new s<Object>((e<? extends PageEvent<Object>>)new g((Object)PageEvent$Insert.g), new a0() {
            @Override
            public final void a() {
            }
            
            @Override
            public final void b(final b0 b0) {
            }
            
            @Override
            public final void retry() {
            }
        });
    }
    
    public s(final e<? extends PageEvent<T>> a, final a0 b) {
        sg2.e.f((Object)a, "flow");
        sg2.e.f((Object)b, "receiver");
        this.a = (e<PageEvent<T>>)a;
        this.b = b;
    }
}
