// 
// Decompiled by Procyon v0.6.0
// 

package r0;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$c;
import cg.d;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import vl.a;
import l0.v0;
import u2.g;
import l0.e0;

public final class h
{
    public static final e0<g> a;
    
    static {
        final int c = g.c;
        a = vl.a.j3(0.0f, 400.0f, (Object)new g(v0.a()), 1);
    }
    
    public static final int a(final LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider, int n, final int n2, final int n3, final ArrayList list) {
        final int n4 = 0;
        int i = n;
        n = n4;
        while (i <= n2) {
            final int n5 = b(lazyGridSpanLayoutProvider, i) - 1;
            int n6 = n;
            if (n5 <= n2) {
                int n9 = 0;
                Label_0260: {
                    Label_0257: {
                        if (!list.isEmpty() && n5 >= ((q)CollectionsKt___CollectionsKt.S4((List)list)).c) {
                            if (n5 <= ((q)CollectionsKt___CollectionsKt.c5((List)list)).c) {
                                int n7 = 0;
                                int n8 = 0;
                                Label_0234: {
                                    if (n5 - ((q)CollectionsKt___CollectionsKt.S4((List)list)).c < ((q)CollectionsKt___CollectionsKt.c5((List)list)).c - n5) {
                                        for (int size = list.size(), j = 0; j < size; ++j) {
                                            final q q = list.get(j);
                                            final int c = q.c;
                                            if (c == n5) {
                                                n7 = q.i;
                                                n8 = q.h;
                                                break Label_0234;
                                            }
                                            if (c > n5) {
                                                break;
                                            }
                                        }
                                        break Label_0257;
                                    }
                                    for (int r2 = d.R2((List)list); -1 < r2; --r2) {
                                        final q q2 = list.get(r2);
                                        final int c2 = q2.c;
                                        if (c2 == n5) {
                                            n7 = q2.i;
                                            n8 = q2.h;
                                            break Label_0234;
                                        }
                                        if (c2 < n5) {
                                            break;
                                        }
                                    }
                                    break Label_0257;
                                }
                                n9 = n7 + n8;
                                break Label_0260;
                            }
                        }
                    }
                    n9 = n3;
                }
                n6 = n + n9;
            }
            final int n10 = n5 + 1;
            n = n6;
            i = n10;
        }
        return n;
    }
    
    public static final int b(final LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider, int a) {
        final LazyGridSpanLayoutProvider$c b = lazyGridSpanLayoutProvider.b(lazyGridSpanLayoutProvider.c(a));
        a = b.a;
        return b.b.size() + a;
    }
}
