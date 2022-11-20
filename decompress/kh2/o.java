// 
// Decompiled by Procyon v0.6.0
// 

package kh2;

import cg2.e;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStatesImpl;
import yh2.c;

public final class o
{
    public static final c a;
    public static final NullabilityAnnotationStatesImpl b;
    public static final p c;
    
    static {
        final c c2 = a = new c("org.jspecify.nullness");
        final c c3 = new c("org.checkerframework.checker.nullness.compatqual");
        final c c4 = new c("org.jetbrains.annotations");
        final p d = p.d;
        final Pair pair = new Pair((Object)c4, (Object)d);
        final Pair pair2 = new Pair((Object)new c("androidx.annotation"), (Object)d);
        final Pair pair3 = new Pair((Object)new c("android.support.annotation"), (Object)d);
        final Pair pair4 = new Pair((Object)new c("android.annotation"), (Object)d);
        final Pair pair5 = new Pair((Object)new c("com.android.annotations"), (Object)d);
        final Pair pair6 = new Pair((Object)new c("org.eclipse.jdt.annotation"), (Object)d);
        final Pair pair7 = new Pair((Object)new c("org.checkerframework.checker.nullness.qual"), (Object)d);
        final Pair pair8 = new Pair((Object)c3, (Object)d);
        final Pair pair9 = new Pair((Object)new c("javax.annotation"), (Object)d);
        final Pair pair10 = new Pair((Object)new c("edu.umd.cs.findbugs.annotations"), (Object)d);
        final Pair pair11 = new Pair((Object)new c("io.reactivex.annotations"), (Object)d);
        final c c5 = new c("androidx.annotation.RecentlyNullable");
        final ReportLevel warn = ReportLevel.WARN;
        final Pair pair12 = new Pair((Object)c5, (Object)new p(warn, 4));
        final Pair pair13 = new Pair((Object)new c("androidx.annotation.RecentlyNonNull"), (Object)new p(warn, 4));
        final Pair pair14 = new Pair((Object)new c("lombok"), (Object)d);
        final e e = new e(8, 0);
        final ReportLevel strict = ReportLevel.STRICT;
        b = new NullabilityAnnotationStatesImpl(kotlin.collections.c.w4(new Pair[] { pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, new Pair((Object)c2, (Object)new p(warn, e, strict)), new Pair((Object)new c("io.reactivex.rxjava3.annotations"), (Object)new p(warn, new e(8, 0), strict)) }));
        c = new p(warn, 4);
    }
}
