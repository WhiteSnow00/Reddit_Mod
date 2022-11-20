// 
// Decompiled by Procyon v0.6.0
// 

package okio.internal;

import fk2.g0;
import fk2.h;
import fk2.i;
import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.io.FileNotFoundException;
import java.util.Collection;
import dg2.o;
import dg2.m;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import okio.ByteString;
import fk2.c;
import java.io.IOException;
import ng2.e;
import fk2.e0;
import kotlin.Pair;
import java.util.List;
import cg2.f;
import fk2.y;
import fk2.j;

public final class a extends j
{
    @Deprecated
    public static final y b;
    public final f a;
    
    static {
        new a.a$a();
        final String g = y.g;
        b = y.a.a("/", false);
    }
    
    public a(final ClassLoader classLoader) {
        this.a = kotlin.a.b((mg2.a)new ResourceFileSystem$roots$2(classLoader));
    }
    
    public final List<Pair<j, y>> a() {
        return (List)this.a.getValue();
    }
    
    @Override
    public final e0 appendingSink(final y y, final boolean b) {
        e.f((Object)y, "file");
        final StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" is read-only");
        throw new IOException(sb.toString());
    }
    
    @Override
    public final void atomicMove(final y y, final y y2) {
        e.f((Object)y, "source");
        e.f((Object)y2, "target");
        final StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" is read-only");
        throw new IOException(sb.toString());
    }
    
    public final String b(y y) {
        final y b = okio.internal.a.b;
        b.getClass();
        e.f((Object)y, "child");
        final y b2 = gk2.f.b(b, y, true);
        e.f((Object)b, "other");
        final int a = gk2.f.a(b2);
        Object o = null;
        if (a == -1) {
            y = null;
        }
        else {
            y = new y(b2.f.substring(0, a));
        }
        final int a2 = gk2.f.a(b);
        if (a2 != -1) {
            o = new y(b.f.substring(0, a2));
        }
        if (e.a((Object)y, o)) {
            ArrayList a3;
            ArrayList a4;
            int min;
            int n;
            for (a3 = b2.a(), a4 = b.a(), min = Math.min(a3.size(), a4.size()), n = 0; n < min && e.a(a3.get(n), a4.get(n)); ++n) {}
            if (n == min && b2.f.size() == b.f.size()) {
                final String g = y.g;
                y = fk2.y.a.a(".", false);
            }
            else {
                if (a4.subList(n, a4.size()).indexOf(gk2.f.e) != -1) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Impossible relative path to resolve: ");
                    sb.append(b2);
                    sb.append(" and ");
                    sb.append(b);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                final c c = new c();
                ByteString byteString;
                if ((byteString = gk2.f.c(b)) == null && (byteString = gk2.f.c(b2)) == null) {
                    byteString = gk2.f.f(y.g);
                }
                final int size = a4.size();
                if (n < size) {
                    int n2 = n;
                    int n3;
                    do {
                        n3 = n2 + 1;
                        c.R(gk2.f.e);
                        c.R(byteString);
                    } while ((n2 = n3) < size);
                }
                final int size2 = a3.size();
                if (n < size2) {
                    while (true) {
                        final int n4 = n + 1;
                        c.R((ByteString)a3.get(n));
                        c.R(byteString);
                        if (n4 >= size2) {
                            break;
                        }
                        n = n4;
                    }
                }
                y = gk2.f.d(c, false);
            }
            return y.toString();
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Paths of different roots cannot be relative to each other: ");
        sb2.append(b2);
        sb2.append(" and ");
        sb2.append(b);
        throw new IllegalArgumentException(sb2.toString().toString());
    }
    
    @Override
    public final y canonicalize(final y y) {
        e.f((Object)y, "path");
        final y b = okio.internal.a.b;
        b.getClass();
        return gk2.f.b(b, y, true);
    }
    
    @Override
    public final void createDirectory(final y y, final boolean b) {
        e.f((Object)y, "dir");
        final StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" is read-only");
        throw new IOException(sb.toString());
    }
    
    @Override
    public final void createSymlink(final y y, final y y2) {
        e.f((Object)y, "source");
        e.f((Object)y2, "target");
        final StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" is read-only");
        throw new IOException(sb.toString());
    }
    
    @Override
    public final void delete(final y y, final boolean b) {
        e.f((Object)y, "path");
        final StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" is read-only");
        throw new IOException(sb.toString());
    }
    
    @Override
    public final List<y> list(final y y) {
        e.f((Object)y, "dir");
        final String b = this.b(y);
        final LinkedHashSet set = new LinkedHashSet();
        final Iterator<Pair<j, y>> iterator = this.a().iterator();
        boolean b2 = false;
        while (true) {
            Label_0220: {
                if (!iterator.hasNext()) {
                    break Label_0220;
                }
                final Pair pair = iterator.next();
                final j j = (j)pair.component1();
                final y y2 = (y)pair.component2();
                try {
                    final List<y> list = j.list(y2.d(b));
                    final ArrayList<y> list2 = new ArrayList<y>();
                    for (final y next : list) {
                        if (okio.internal.a.a$a.a((y)next)) {
                            list2.add(next);
                        }
                    }
                    final ArrayList list3 = new ArrayList<y>(m.u4((Iterable)list2, 10));
                    final Iterator<y> iterator3 = list2.iterator();
                    while (iterator3.hasNext()) {
                        list3.add(okio.internal.a.a$a.b((y)iterator3.next(), y2));
                    }
                    o.B4((Iterable)list3, (Collection)set);
                    b2 = true;
                    continue;
                    Label_0230: {
                        throw new FileNotFoundException(e.l((Object)y, "file not found: "));
                    }
                    iftrue(Label_0230:)(!b2);
                    return CollectionsKt___CollectionsKt.I5((Iterable)set);
                }
                catch (final IOException ex) {}
            }
        }
    }
    
    @Override
    public final List<y> listOrNull(final y y) {
        e.f((Object)y, "dir");
        final String b = this.b(y);
        final LinkedHashSet set = new LinkedHashSet();
        final Iterator<Pair<j, y>> iterator = this.a().iterator();
        boolean b2 = false;
        List<y> list;
        while (true) {
            final boolean hasNext = iterator.hasNext();
            list = null;
            ArrayList<y> list2 = null;
            if (!hasNext) {
                break;
            }
            final Pair pair = iterator.next();
            final j j = (j)pair.component1();
            final y y2 = (y)pair.component2();
            final List<y> listOrNull = j.listOrNull(y2.d(b));
            if (listOrNull != null) {
                final ArrayList<y> list3 = new ArrayList<y>();
                for (final y next : listOrNull) {
                    if (okio.internal.a.a$a.a((y)next)) {
                        list3.add(next);
                    }
                }
                list2 = new ArrayList<y>(m.u4((Iterable)list3, 10));
                final Iterator<y> iterator3 = list3.iterator();
                while (iterator3.hasNext()) {
                    list2.add(okio.internal.a.a$a.b((y)iterator3.next(), y2));
                }
            }
            if (list2 == null) {
                continue;
            }
            o.B4((Iterable)list2, (Collection)set);
            b2 = true;
        }
        List<y> i5 = list;
        if (b2) {
            i5 = CollectionsKt___CollectionsKt.I5((Iterable)set);
        }
        return i5;
    }
    
    @Override
    public final i metadataOrNull(final y y) {
        e.f((Object)y, "path");
        if (!okio.internal.a.a$a.a(y)) {
            return null;
        }
        final String b = this.b(y);
        for (final Pair pair : this.a()) {
            final i metadataOrNull = ((j)pair.component1()).metadataOrNull(((y)pair.component2()).d(b));
            if (metadataOrNull == null) {
                continue;
            }
            return metadataOrNull;
        }
        return null;
    }
    
    @Override
    public final h openReadOnly(final y y) {
        e.f((Object)y, "file");
        Label_0100: {
            if (!okio.internal.a.a$a.a(y)) {
                break Label_0100;
            }
            final String b = this.b(y);
            final Iterator<Pair<j, y>> iterator = this.a().iterator();
            while (true) {
                Label_0085: {
                    if (!iterator.hasNext()) {
                        break Label_0085;
                    }
                    final Pair pair = iterator.next();
                    final j j = (j)pair.component1();
                    final y y2 = (y)pair.component2();
                    try {
                        return j.openReadOnly(y2.d(b));
                        throw new FileNotFoundException(e.l((Object)y, "file not found: "));
                        throw new FileNotFoundException(e.l((Object)y, "file not found: "));
                    }
                    catch (final FileNotFoundException ex) {
                        continue;
                    }
                }
                break;
            }
        }
    }
    
    @Override
    public final h openReadWrite(final y y, final boolean b, final boolean b2) {
        e.f((Object)y, "file");
        throw new IOException("resources are not writable");
    }
    
    @Override
    public final e0 sink(final y y, final boolean b) {
        e.f((Object)y, "file");
        final StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" is read-only");
        throw new IOException(sb.toString());
    }
    
    @Override
    public final g0 source(final y y) {
        e.f((Object)y, "file");
        Label_0100: {
            if (!okio.internal.a.a$a.a(y)) {
                break Label_0100;
            }
            final String b = this.b(y);
            final Iterator<Pair<j, y>> iterator = this.a().iterator();
            while (true) {
                Label_0085: {
                    if (!iterator.hasNext()) {
                        break Label_0085;
                    }
                    final Pair pair = iterator.next();
                    final j j = (j)pair.component1();
                    final y y2 = (y)pair.component2();
                    try {
                        return j.source(y2.d(b));
                        throw new FileNotFoundException(e.l((Object)y, "file not found: "));
                        throw new FileNotFoundException(e.l((Object)y, "file not found: "));
                    }
                    catch (final FileNotFoundException ex) {
                        continue;
                    }
                }
                break;
            }
        }
    }
}
