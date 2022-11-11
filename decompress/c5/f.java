// 
// Decompiled by Procyon v0.6.0
// 

package c5;

import ig2.w;
import androidx.paging.LoadType;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import java.util.List;
import androidx.paging.PageEvent$b;
import androidx.paging.PageEvent$a;
import yg2.g;
import java.util.Collection;
import androidx.paging.PageEvent$Insert;
import sg2.e;
import androidx.paging.PageEvent;
import ig2.h;

public final class f<T>
{
    public int a;
    public int b;
    public final h<z<T>> c;
    public final n d;
    public l e;
    public boolean f;
    
    public f() {
        this.c = (h<z<T>>)new h();
        this.d = new n();
    }
    
    public final void a(final PageEvent<T> pageEvent) {
        sg2.e.f((Object)pageEvent, "event");
        this.f = true;
        final boolean b = pageEvent instanceof PageEvent$Insert;
        final int n = 0;
        int i = 0;
        if (b) {
            final PageEvent$Insert pageEvent$Insert = (PageEvent$Insert)pageEvent;
            this.d.c(pageEvent$Insert.e);
            this.e = pageEvent$Insert.f;
            final int n2 = c5.f.a.a[pageEvent$Insert.a.ordinal()];
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 == 3) {
                        this.c.clear();
                        this.b = pageEvent$Insert.d;
                        this.a = pageEvent$Insert.c;
                        this.c.addAll((Collection)pageEvent$Insert.b);
                    }
                }
                else {
                    this.b = pageEvent$Insert.d;
                    this.c.addAll((Collection)pageEvent$Insert.b);
                }
            }
            else {
                this.a = pageEvent$Insert.c;
                final yg2.h e = new g(pageEvent$Insert.b.size() - 1, 0, -1).e();
                while (e.h) {
                    this.c.addFirst(pageEvent$Insert.b.get(((w)e).nextInt()));
                }
            }
        }
        else if (pageEvent instanceof PageEvent$a) {
            final PageEvent$a pageEvent$a = (PageEvent$a)pageEvent;
            this.d.b(pageEvent$a.a, k.c.c);
            final int n3 = c5.f.a.a[pageEvent$a.a.ordinal()];
            if (n3 != 1) {
                if (n3 != 2) {
                    throw new IllegalArgumentException("Page drop type must be prepend or append");
                }
                this.b = pageEvent$a.d;
                while (i < pageEvent$a.c()) {
                    this.c.removeLast();
                    ++i;
                }
            }
            else {
                this.a = pageEvent$a.d;
                for (int c = pageEvent$a.c(), j = n; j < c; ++j) {
                    this.c.removeFirst();
                }
            }
        }
        else if (pageEvent instanceof PageEvent$b) {
            final PageEvent$b pageEvent$b = (PageEvent$b)pageEvent;
            this.d.c(pageEvent$b.a);
            this.e = pageEvent$b.b;
        }
    }
    
    public final List<PageEvent<T>> b() {
        if (!this.f) {
            return (List<PageEvent<T>>)EmptyList.INSTANCE;
        }
        final ArrayList list = new ArrayList();
        final l d = this.d.d();
        if (this.c.isEmpty() ^ true) {
            final PageEvent$Insert g = PageEvent$Insert.g;
            list.add(PageEvent.PageEvent$Insert.a.a(CollectionsKt___CollectionsKt.q4((Iterable)this.c), this.a, this.b, d, this.e));
        }
        else {
            list.add(new PageEvent$b(d, this.e));
        }
        return list;
    }
}
