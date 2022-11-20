// 
// Decompiled by Procyon v0.6.0
// 

package com.google.accompanist.pager;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import java.util.Iterator;
import q0.o;
import kotlin.collections.CollectionsKt___CollectionsKt;
import q0.k;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import gg2.c;
import n0.i;
import androidx.compose.foundation.MutatePriority;
import ah0.b;
import mg2.p;
import mg2.l;
import androidx.compose.runtime.saveable.a;
import androidx.compose.runtime.DerivedSnapshotState;
import z0.k0;
import androidx.compose.foundation.lazy.LazyListState;
import h1.e;
import n0.j;

public final class PagerState implements j
{
    public static final e h;
    public final LazyListState a;
    public final k0 b;
    public int c;
    public final DerivedSnapshotState d;
    public final DerivedSnapshotState e;
    public final k0 f;
    public final k0 g;
    
    static {
        h = a.a((l)PagerState$Companion$Saver$2.INSTANCE, (p)PagerState$Companion$Saver$1.INSTANCE);
    }
    
    public PagerState() {
        this(0);
    }
    
    public PagerState(final int n) {
        this.a = new LazyListState(n, 2, 0);
        this.b = ah0.b.Z0((Object)n);
        this.d = ah0.b.S((mg2.a)new PagerState$pageCount$2(this));
        this.e = ah0.b.S((mg2.a)new PagerState$currentPageOffset$2(this));
        this.f = ah0.b.Z0((Object)null);
        this.g = ah0.b.Z0((Object)null);
    }
    
    public final boolean b() {
        return this.a.b();
    }
    
    public final float c(final float n) {
        return this.a.c(n);
    }
    
    public final Object d(final MutatePriority mutatePriority, final p<? super i, ? super c<? super cg2.j>, ?> p3, final c<? super cg2.j> c) {
        final Object d = this.a.d(mutatePriority, (p)p3, (c)c);
        if (d == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return d;
        }
        return cg2.j.a;
    }
    
    public final Object e(int i$0, float f$0, c<? super cg2.j> pagerState) {
        PagerState$animateScrollToPage$2 pagerState$animateScrollToPage$2 = null;
        Label_0052: {
            if (pagerState instanceof PagerState$animateScrollToPage$2) {
                pagerState$animateScrollToPage$2 = (PagerState$animateScrollToPage$2)pagerState;
                final int label = pagerState$animateScrollToPage$2.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    pagerState$animateScrollToPage$2.label = label + Integer.MIN_VALUE;
                    break Label_0052;
                }
            }
            pagerState$animateScrollToPage$2 = new PagerState$animateScrollToPage$2(this, (c)pagerState);
        }
        final Object result = pagerState$animateScrollToPage$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        PagerState pagerState2 = null;
        PagerState l$0 = null;
        Label_1081: {
            Label_0198: {
                switch (pagerState$animateScrollToPage$2.label) {
                    default: {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    case 5: {
                        final int i$2 = pagerState$animateScrollToPage$2.I$1;
                        f$0 = pagerState$animateScrollToPage$2.F$0;
                        final int i$3 = pagerState$animateScrollToPage$2.I$0;
                        pagerState2 = (PagerState)pagerState$animateScrollToPage$2.L$0;
                        try {
                            cg.d.b4(result);
                            break Label_1081;
                        }
                        finally {
                            break Label_1081;
                        }
                    }
                    case 2:
                    case 4:
                    case 6: {
                        break Label_0198;
                    }
                    case 3:
                    case 1: {
                        while (true) {
                            break Label_0226;
                            f$0 = pagerState$animateScrollToPage$2.F$0;
                            i$0 = pagerState$animateScrollToPage$2.I$0;
                            pagerState2 = (PagerState)pagerState$animateScrollToPage$2.L$0;
                            try {
                                cg.d.b4(result);
                                break Label_1081;
                                f$0 = pagerState$animateScrollToPage$2.F$0;
                                i$0 = pagerState$animateScrollToPage$2.I$0;
                                pagerState2 = (PagerState)pagerState$animateScrollToPage$2.L$0;
                                cg.d.b4(result);
                                break Label_1081;
                                pagerState = (PagerState)pagerState$animateScrollToPage$2.L$0;
                                try {
                                    cg.d.b4(result);
                                    break Label_1081;
                                }
                                finally {
                                    pagerState2 = pagerState;
                                }
                                continue;
                            }
                            finally {
                                break Label_1081;
                            }
                            break;
                        }
                    }
                    case 0: {
                        cg.d.b4(result);
                        if (i$0 < 0) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("page");
                            sb.append('[');
                            sb.append(i$0);
                            sb.append("] must be >= 0");
                            throw new IllegalArgumentException(sb.toString().toString());
                        }
                        if (-1.0f <= f$0 && f$0 <= 1.0f) {
                            break;
                        }
                        throw new IllegalArgumentException("pageOffset must be >= 0 and <= 1".toString());
                    }
                }
            }
            try {
                ((SnapshotMutableStateImpl)this.f).setValue((Object)new Integer(i$0));
                final int f = this.a.f();
                if (Math.abs(i$0 - f) > 3) {
                    final LazyListState a = this.a;
                    int n;
                    if (i$0 > f) {
                        n = i$0 - 3;
                    }
                    else {
                        n = i$0 + 3;
                    }
                    pagerState$animateScrollToPage$2.L$0 = this;
                    pagerState$animateScrollToPage$2.I$0 = i$0;
                    pagerState$animateScrollToPage$2.F$0 = f$0;
                    pagerState$animateScrollToPage$2.label = 1;
                    if (LazyListState.i(a, n, (c)pagerState$animateScrollToPage$2) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                l$0 = this;
                if (Math.abs(f$0) <= 0.005f) {
                    final LazyListState a2 = l$0.a;
                    pagerState$animateScrollToPage$2.L$0 = l$0;
                    pagerState$animateScrollToPage$2.label = 2;
                    final e t = LazyListState.t;
                    if (a2.e(i$0, 0, (c)pagerState$animateScrollToPage$2) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                else {
                    final LazyListState a3 = l$0.a;
                    final PagerState$animateScrollToPage$3 pagerState$animateScrollToPage$3 = new PagerState$animateScrollToPage$3((c)null);
                    pagerState$animateScrollToPage$2.L$0 = l$0;
                    pagerState$animateScrollToPage$2.I$0 = i$0;
                    pagerState$animateScrollToPage$2.F$0 = f$0;
                    pagerState$animateScrollToPage$2.label = 3;
                    if (j.a((j)a3, (p)pagerState$animateScrollToPage$3, (c)pagerState$animateScrollToPage$2) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    final o h = l$0.a.h();
                    while (true) {
                        for (final Object next : h.b()) {
                            if (((k)next).getIndex() == i$0) {
                                final k k = (k)next;
                                PagerState pagerState3 = null;
                                Label_1078: {
                                    if (k != null) {
                                        final LazyListState a4 = l$0.a;
                                        final int w = p7.a.W(k.getSize() * f$0);
                                        pagerState$animateScrollToPage$2.L$0 = l$0;
                                        pagerState$animateScrollToPage$2.label = 4;
                                        pagerState3 = l$0;
                                        if (a4.e(i$0, w, (c)pagerState$animateScrollToPage$2) == coroutine_SUSPENDED) {
                                            return coroutine_SUSPENDED;
                                        }
                                    }
                                    else {
                                        pagerState3 = l$0;
                                        if (h.b().isEmpty() ^ true) {
                                            final int i$2 = ((k)CollectionsKt___CollectionsKt.S4(h.b())).getSize();
                                            final LazyListState a5 = l$0.a;
                                            final int w2 = p7.a.W(i$2 * f$0);
                                            pagerState$animateScrollToPage$2.L$0 = l$0;
                                            pagerState$animateScrollToPage$2.I$0 = i$0;
                                            pagerState$animateScrollToPage$2.F$0 = f$0;
                                            pagerState$animateScrollToPage$2.I$1 = i$2;
                                            pagerState$animateScrollToPage$2.label = 5;
                                            final int i$3 = i$0;
                                            if (a5.e(i$0, w2, (c)pagerState$animateScrollToPage$2) == coroutine_SUSPENDED) {
                                                return coroutine_SUSPENDED;
                                            }
                                            while (true) {
                                                for (final Object next2 : l$0.a.h().b()) {
                                                    if (((k)next2).getIndex() == i$3) {
                                                        i$0 = 1;
                                                    }
                                                    else {
                                                        i$0 = 0;
                                                    }
                                                    if (i$0 != 0) {
                                                        final k i = (k)next2;
                                                        pagerState3 = l$0;
                                                        if (i == null) {
                                                            break Label_1078;
                                                        }
                                                        pagerState3 = l$0;
                                                        if (i.getSize() == i$2) {
                                                            break Label_1078;
                                                        }
                                                        final LazyListState a6 = l$0.a;
                                                        i$0 = p7.a.W(i.getSize() * f$0);
                                                        pagerState$animateScrollToPage$2.L$0 = l$0;
                                                        pagerState$animateScrollToPage$2.label = 6;
                                                        final Object e = a6.e(i$3, i$0, (c)pagerState$animateScrollToPage$2);
                                                        pagerState3 = l$0;
                                                        if (e == coroutine_SUSPENDED) {
                                                            return coroutine_SUSPENDED;
                                                        }
                                                        break Label_1078;
                                                    }
                                                }
                                                Object next2 = null;
                                                continue;
                                            }
                                        }
                                    }
                                }
                                l$0 = pagerState3;
                                break Label_1081;
                            }
                        }
                        Object next = null;
                        continue;
                    }
                }
                ((SnapshotMutableStateImpl)l$0.f).setValue((Object)null);
                return cg2.j.a;
            }
            finally {
                pagerState2 = this;
            }
        }
        ((SnapshotMutableStateImpl)pagerState2.f).setValue((Object)null);
        throw l$0;
    }
    
    public final float f() {
        return this.e.getValue().floatValue();
    }
    
    public final k g() {
        final o h = this.a.h();
        final Iterator iterator = h.b().iterator();
        Object next;
        if (!iterator.hasNext()) {
            next = null;
        }
        else {
            next = iterator.next();
            if (iterator.hasNext()) {
                final k k = (k)next;
                int n = Math.min(k.getSize() + k.getOffset(), h.f() - this.c) - Math.max(k.getOffset(), 0);
                k i = (k)next;
                do {
                    final Object next2 = iterator.next();
                    final k j = (k)next2;
                    final int n2 = Math.min(j.getSize() + j.getOffset(), h.f() - this.c) - Math.max(j.getOffset(), 0);
                    next = i;
                    int n3;
                    if ((n3 = n) < n2) {
                        next = next2;
                        n3 = n2;
                    }
                    i = (k)next;
                    n = n3;
                } while (iterator.hasNext());
            }
        }
        return (k)next;
    }
    
    public final int h() {
        return this.d.getValue().intValue();
    }
    
    public final int i() {
        return ((Number)((SnapshotMutableStateImpl)this.b).getValue()).intValue();
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("PagerState(pageCount=");
        t.append(this.h());
        t.append(", currentPage=");
        t.append(this.i());
        t.append(", currentPageOffset=");
        t.append(this.f());
        t.append(')');
        return t.toString();
    }
}
