// 
// Decompiled by Procyon v0.6.0
// 

package androidx.paging;

import zg2.p;
import kotlin.coroutines.CoroutineContext;
import mj2.g;
import c5.d;
import kotlin.NoWhenBranchMatchedException;
import tg2.c;
import c5.u;

public final class LegacyPagingSource<Key, Value> extends PagingSource<Key, Value>
{
    public int b;
    
    public final boolean a() {
        throw null;
    }
    
    public final Key c(final u<Key, Value> u) {
        throw null;
    }
    
    public final Object d(final PagingSource$a<Key> pagingSource$a, final c<? super PagingSource$b<Key, Value>> c) {
        final boolean b = pagingSource$a instanceof PagingSource$a$c;
        LoadType loadType;
        if (b) {
            loadType = LoadType.REFRESH;
        }
        else if (pagingSource$a instanceof PagingSource$a$a) {
            loadType = LoadType.APPEND;
        }
        else {
            if (!(pagingSource$a instanceof PagingSource$a$b)) {
                throw new NoWhenBranchMatchedException();
            }
            loadType = LoadType.PREPEND;
        }
        if (this.b == Integer.MIN_VALUE) {
            System.out.println((Object)"WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106");
            int a2 = 0;
            Label_0093: {
                if (b) {
                    final int a = pagingSource$a.a;
                    if (a % 3 == 0) {
                        a2 = a / 3;
                        break Label_0093;
                    }
                }
                a2 = pagingSource$a.a;
            }
            this.b = a2;
        }
        return g.l((CoroutineContext)null, (p)new LegacyPagingSource$load$2(this, new d(loadType, pagingSource$a.a()), (PagingSource$a)pagingSource$a, (c)null), (c)c);
    }
}
