// 
// Decompiled by Procyon v0.6.0
// 

package okio.internal;

import java.util.List;
import java.util.Collection;
import bj2.l;
import rg2.p;
import bj2.n;
import java.io.IOException;
import kk2.f;
import sg2.e;
import kotlin.collections.EmptyList;
import java.util.Iterator;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import lg2.c;
import ig2.h;
import jk2.j;
import jk2.y;
import bj2.m;

public final class _FileSystemKt
{
    public static final Object a(m<? super y> l$0, j o, final h<y> l$2, y l$3, boolean b, boolean b2, c<? super hg2.j> b3) {
        final y l$4 = l$3;
        _FileSystemKt$collectRecursively$1 fileSystemKt$collectRecursively$1 = null;
        Label_0057: {
            if (b3 instanceof _FileSystemKt$collectRecursively$1) {
                fileSystemKt$collectRecursively$1 = (_FileSystemKt$collectRecursively$1)b3;
                final int label = fileSystemKt$collectRecursively$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    fileSystemKt$collectRecursively$1.label = label + Integer.MIN_VALUE;
                    break Label_0057;
                }
            }
            fileSystemKt$collectRecursively$1 = new _FileSystemKt$collectRecursively$1((c)b3);
        }
        final Object result = fileSystemKt$collectRecursively$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = fileSystemKt$collectRecursively$1.label;
        boolean b5 = false;
        Object c = null;
        Label_0707: {
            Object l$5 = null;
            Label_0532: {
                Object o2;
                Object o3;
                m i;
                if (label2 != 0) {
                    if (label2 != 1) {
                        if (label2 != 2) {
                            if (label2 == 3) {
                                b.k0(result);
                                return hg2.j.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            b = fileSystemKt$collectRecursively$1.Z$1;
                            b2 = fileSystemKt$collectRecursively$1.Z$0;
                            final Iterator iterator = (Iterator)fileSystemKt$collectRecursively$1.L$4;
                            final y y = (y)fileSystemKt$collectRecursively$1.L$3;
                            l$3 = (y)fileSystemKt$collectRecursively$1.L$2;
                            b3 = fileSystemKt$collectRecursively$1.L$1;
                            final m m = (m)fileSystemKt$collectRecursively$1.L$0;
                            l$0 = l$3;
                            try {
                                b.k0(result);
                                break Label_0532;
                            }
                            finally {
                                o = l$0;
                                break Label_0532;
                            }
                        }
                    }
                    b = fileSystemKt$collectRecursively$1.Z$1;
                    b2 = fileSystemKt$collectRecursively$1.Z$0;
                    o2 = fileSystemKt$collectRecursively$1.L$3;
                    o = fileSystemKt$collectRecursively$1.L$2;
                    o3 = fileSystemKt$collectRecursively$1.L$1;
                    i = (m)fileSystemKt$collectRecursively$1.L$0;
                    b.k0(result);
                }
                else {
                    b.k0(result);
                    if (!b2) {
                        fileSystemKt$collectRecursively$1.L$0 = l$0;
                        fileSystemKt$collectRecursively$1.L$1 = o;
                        fileSystemKt$collectRecursively$1.L$2 = l$2;
                        fileSystemKt$collectRecursively$1.L$3 = l$4;
                        fileSystemKt$collectRecursively$1.Z$0 = b;
                        fileSystemKt$collectRecursively$1.Z$1 = b2;
                        fileSystemKt$collectRecursively$1.label = 1;
                        if (((m)l$0).a((Object)l$4, (c)fileSystemKt$collectRecursively$1) == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                    }
                    final boolean b4 = b;
                    i = (m)l$0;
                    o3 = o;
                    o = l$2;
                    b = b2;
                    o2 = l$4;
                    b2 = b4;
                }
                Object o4;
                if ((o4 = ((j)o3).listOrNull((y)o2)) == null) {
                    o4 = EmptyList.INSTANCE;
                }
                b3 = o2;
                b5 = b;
                c = i;
                Object o5 = null;
                Label_0504: {
                    if (((Collection)o4).isEmpty() ^ true) {
                        o5 = o2;
                        int n = 0;
                        while (!b2 || !((h)o).contains(o5)) {
                            e.f(o5, "path");
                            c = ((j)o3).metadata((y)o5).c;
                            if (c == null) {
                                b3 = null;
                            }
                            else {
                                final y c2 = ((y)o5).c();
                                e.c((Object)c2);
                                b3 = f.b(c2, (y)c, false);
                            }
                            if (b3 == null) {
                                if (b2) {
                                    break Label_0504;
                                }
                                b3 = o2;
                                b5 = b;
                                c = i;
                                if (n == 0) {
                                    break Label_0504;
                                }
                                break Label_0707;
                            }
                            else {
                                ++n;
                                o5 = b3;
                            }
                        }
                        throw new IOException(e.l(o2, "symlink cycle at "));
                    }
                    break Label_0707;
                }
                ((h)o).addLast(o5);
                try {
                    final Iterator iterator = ((List)o4).iterator();
                    final Object o6 = o;
                    o = i;
                    b3 = o3;
                    l$3 = (y)o6;
                    l$5 = o2;
                    while (iterator.hasNext()) {
                        final y y2 = iterator.next();
                        b5 = b;
                        fileSystemKt$collectRecursively$1.L$0 = o;
                        fileSystemKt$collectRecursively$1.L$1 = b3;
                        fileSystemKt$collectRecursively$1.L$2 = l$3;
                        fileSystemKt$collectRecursively$1.L$3 = l$5;
                        fileSystemKt$collectRecursively$1.L$4 = iterator;
                        fileSystemKt$collectRecursively$1.Z$0 = b2;
                        fileSystemKt$collectRecursively$1.Z$1 = b;
                        fileSystemKt$collectRecursively$1.label = 2;
                        if (a((m<? super y>)o, (j)b3, (h<y>)l$3, y2, b2, b5, (c<? super hg2.j>)fileSystemKt$collectRecursively$1) == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                    }
                    ((h)l$3).removeLast();
                    b3 = l$5;
                    b5 = b;
                    break Label_0707;
                }
                finally {
                    final j j;
                    l$5 = j;
                }
            }
            ((h)o).removeLast();
            throw l$5;
        }
        if (!b5) {
            return hg2.j.a;
        }
        fileSystemKt$collectRecursively$1.L$0 = null;
        fileSystemKt$collectRecursively$1.L$1 = null;
        fileSystemKt$collectRecursively$1.L$2 = null;
        fileSystemKt$collectRecursively$1.L$3 = null;
        fileSystemKt$collectRecursively$1.L$4 = null;
        fileSystemKt$collectRecursively$1.label = 3;
        if (((m)c).a(b3, (c)fileSystemKt$collectRecursively$1) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return hg2.j.a;
    }
    
    public static final void b(final j j, final y y, final boolean b) throws IOException {
        e.f((Object)j, "<this>");
        e.f((Object)y, "fileOrDirectory");
        final Iterator iterator = new n((p)new _FileSystemKt$commonDeleteRecursively$sequence$1(j, y, (c)null)).iterator();
        while (true) {
            final l l = (l)iterator;
            if (!l.hasNext()) {
                break;
            }
            j.delete((y)l.next(), b && !l.hasNext());
        }
    }
    
    public static final n c(final j j, final y y, final boolean b) throws IOException {
        e.f((Object)j, "<this>");
        e.f((Object)y, "dir");
        return new n((p)new _FileSystemKt$commonListRecursively$1(y, j, b, (c)null));
    }
}
