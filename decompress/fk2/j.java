// 
// Decompiled by Procyon v0.6.0
// 

package fk2;

import java.util.AbstractCollection;
import java.io.FileNotFoundException;
import java.util.List;
import okio.internal._FileSystemKt;
import java.util.Iterator;
import wi2.k;
import java.io.IOException;
import xd.a;
import ng2.e;
import mg2.l;

public abstract class j
{
    public static final a Companion;
    public static final j RESOURCES;
    public static final j SYSTEM;
    public static final y SYSTEM_TEMPORARY_DIRECTORY;
    
    public static Object -write$default(j j, y y, boolean b, final l l, final int n, Object a) throws IOException {
        if (a != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((n & 0x2) != 0x0) {
            b = false;
        }
        e.f((Object)y, "file");
        e.f((Object)l, "writerAction");
        a = u.a(j.sink(y, b));
        try {
            l.invoke(a);
        }
        finally {
            y = null;
        }
        try {
            ((a0)a).close();
        }
        finally {
            if (j == null) {
                final j i;
                j = i;
            }
            else {
                final j i;
                a.t((Throwable)j, (Throwable)i);
            }
        }
        if (j == null) {
            e.c((Object)y);
            return y;
        }
    }
    
    static {
        Companion = new a();
        Object system;
        try {
            Class.forName("java.nio.file.Files");
            system = new t();
        }
        catch (final ClassNotFoundException ex) {
            system = new s();
        }
        SYSTEM = (j)system;
        final String g = y.g;
        final String property = System.getProperty("java.io.tmpdir");
        e.e((Object)property, "getProperty(\"java.io.tmpdir\")");
        SYSTEM_TEMPORARY_DIRECTORY = y.a.a(property, false);
        final ClassLoader classLoader = okio.internal.a.class.getClassLoader();
        e.e((Object)classLoader, "ResourceFileSystem::class.java.classLoader");
        RESOURCES = new okio.internal.a(classLoader);
    }
    
    public static e0 appendingSink$default(final j j, final y y, boolean b, final int n, final Object o) throws IOException {
        if (o == null) {
            if ((n & 0x2) != 0x0) {
                b = false;
            }
            return j.appendingSink(y, b);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
    }
    
    public static void createDirectories$default(final j j, final y y, boolean b, final int n, final Object o) throws IOException {
        if (o == null) {
            if ((n & 0x2) != 0x0) {
                b = false;
            }
            j.createDirectories(y, b);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
    }
    
    public static void createDirectory$default(final j j, final y y, boolean b, final int n, final Object o) throws IOException {
        if (o == null) {
            if ((n & 0x2) != 0x0) {
                b = false;
            }
            j.createDirectory(y, b);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
    }
    
    public static void delete$default(final j j, final y y, boolean b, final int n, final Object o) throws IOException {
        if (o == null) {
            if ((n & 0x2) != 0x0) {
                b = false;
            }
            j.delete(y, b);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
    }
    
    public static void deleteRecursively$default(final j j, final y y, boolean b, final int n, final Object o) throws IOException {
        if (o == null) {
            if ((n & 0x2) != 0x0) {
                b = false;
            }
            j.deleteRecursively(y, b);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
    }
    
    public static k listRecursively$default(final j j, final y y, boolean b, final int n, final Object o) {
        if (o == null) {
            if ((n & 0x2) != 0x0) {
                b = false;
            }
            return j.listRecursively(y, b);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
    }
    
    public static h openReadWrite$default(final j j, final y y, boolean b, boolean b2, final int n, final Object o) throws IOException {
        if (o == null) {
            if ((n & 0x2) != 0x0) {
                b = false;
            }
            if ((n & 0x4) != 0x0) {
                b2 = false;
            }
            return j.openReadWrite(y, b, b2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
    }
    
    public static e0 sink$default(final j j, final y y, boolean b, final int n, final Object o) throws IOException {
        if (o == null) {
            if ((n & 0x2) != 0x0) {
                b = false;
            }
            return j.sink(y, b);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
    }
    
    public final <T> T -read(y y, l<? super f, ? extends T> l) throws IOException {
        e.f((Object)y, "file");
        e.f((Object)l, "readerAction");
        final b0 b = u.b(this.source(y));
        try {
            l.invoke((Object)b);
        }
        finally {
            l = null;
        }
        try {
            b.close();
        }
        finally {
            if (y == null) {
                final y y2;
                y = y2;
            }
            else {
                final y y2;
                xd.a.t((Throwable)y, (Throwable)y2);
            }
        }
        if (y == null) {
            e.c((Object)l);
            return (T)l;
        }
    }
    
    public final <T> T -write(y y, final boolean b, l<? super fk2.e, ? extends T> l) throws IOException {
        e.f((Object)y, "file");
        e.f((Object)l, "writerAction");
        final a0 a = u.a(this.sink(y, b));
        try {
            l.invoke((Object)a);
        }
        finally {
            l = null;
        }
        try {
            a.close();
        }
        finally {
            if (y == null) {
                final y y2;
                y = y2;
            }
            else {
                final y y2;
                xd.a.t((Throwable)y, (Throwable)y2);
            }
        }
        if (y == null) {
            e.c((Object)l);
            return (T)l;
        }
    }
    
    public final e0 appendingSink(final y y) throws IOException {
        e.f((Object)y, "file");
        return this.appendingSink(y, false);
    }
    
    public abstract e0 appendingSink(final y p0, final boolean p1) throws IOException;
    
    public abstract void atomicMove(final y p0, final y p1) throws IOException;
    
    public abstract y canonicalize(final y p0) throws IOException;
    
    public void copy(y y, y y2) throws IOException {
        e.f((Object)y, "source");
        e.f((Object)y2, "target");
        final g0 source = this.source(y);
        try {
            final a0 a = u.a(this.sink(y2));
            try {
                a.T1(source);
            }
            finally {
                y2 = null;
            }
            try {
                a.close();
            }
            finally {
                if (y == null) {
                    final y y3;
                    y = y3;
                }
                else {
                    final y y3;
                    xd.a.t((Throwable)y, (Throwable)y3);
                }
            }
            if (y == null) {
                e.c((Object)y2);
                ((Number)y2).longValue();
            }
        }
        finally {
            y2 = null;
        }
        if (source != null) {
            try {
                source.close();
            }
            finally {
                if (y == null) {
                    final y y4;
                    y = y4;
                }
                else {
                    final y y4;
                    xd.a.t((Throwable)y, (Throwable)y4);
                }
            }
        }
        if (y == null) {
            e.c((Object)y2);
        }
    }
    
    public final void createDirectories(final y y) throws IOException {
        e.f((Object)y, "dir");
        this.createDirectories(y, false);
    }
    
    public final void createDirectories(final y y, final boolean b) throws IOException {
        e.f((Object)y, "dir");
        final dg2.h h = new dg2.h();
        for (y c = y; c != null && !this.exists(c); c = c.c()) {
            h.addFirst((Object)c);
        }
        if (b && h.isEmpty()) {
            final StringBuilder sb = new StringBuilder();
            sb.append(y);
            sb.append(" already exist.");
            throw new IOException(sb.toString());
        }
        final Iterator iterator = ((AbstractCollection)h).iterator();
        while (iterator.hasNext()) {
            this.createDirectory((y)iterator.next());
        }
    }
    
    public final void createDirectory(final y y) throws IOException {
        e.f((Object)y, "dir");
        this.createDirectory(y, false);
    }
    
    public abstract void createDirectory(final y p0, final boolean p1) throws IOException;
    
    public abstract void createSymlink(final y p0, final y p1) throws IOException;
    
    public final void delete(final y y) throws IOException {
        e.f((Object)y, "path");
        this.delete(y, false);
    }
    
    public abstract void delete(final y p0, final boolean p1) throws IOException;
    
    public final void deleteRecursively(final y y) throws IOException {
        e.f((Object)y, "fileOrDirectory");
        this.deleteRecursively(y, false);
    }
    
    public void deleteRecursively(final y y, final boolean b) throws IOException {
        e.f((Object)y, "fileOrDirectory");
        _FileSystemKt.b(this, y, b);
    }
    
    public final boolean exists(final y y) throws IOException {
        e.f((Object)y, "path");
        return this.metadataOrNull(y) != null;
    }
    
    public abstract List<y> list(final y p0) throws IOException;
    
    public abstract List<y> listOrNull(final y p0);
    
    public final k<y> listRecursively(final y y) {
        e.f((Object)y, "dir");
        return this.listRecursively(y, false);
    }
    
    public k<y> listRecursively(final y y, final boolean b) {
        e.f((Object)y, "dir");
        return (k<y>)_FileSystemKt.c(this, y, b);
    }
    
    public final i metadata(final y y) throws IOException {
        e.f((Object)y, "path");
        final i metadataOrNull = this.metadataOrNull(y);
        if (metadataOrNull != null) {
            return metadataOrNull;
        }
        throw new FileNotFoundException(e.l((Object)y, "no such file: "));
    }
    
    public abstract i metadataOrNull(final y p0) throws IOException;
    
    public abstract h openReadOnly(final y p0) throws IOException;
    
    public final h openReadWrite(final y y) throws IOException {
        e.f((Object)y, "file");
        return this.openReadWrite(y, false, false);
    }
    
    public abstract h openReadWrite(final y p0, final boolean p1, final boolean p2) throws IOException;
    
    public final e0 sink(final y y) throws IOException {
        e.f((Object)y, "file");
        return this.sink(y, false);
    }
    
    public abstract e0 sink(final y p0, final boolean p1) throws IOException;
    
    public abstract g0 source(final y p0) throws IOException;
    
    public static final class a
    {
    }
}
