// 
// Decompiled by Procyon v0.6.0
// 

package androidx.paging;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.NoWhenBranchMatchedException;
import ig2.o;
import yg2.i;
import c5.k;
import sg2.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import lw0.b;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import c5.z;
import c5.l;
import c5.n;
import java.util.ArrayList;
import lg2.c;
import rg2.q;

public final class SeparatorState<R, T extends R>
{
    public final TerminalSeparatorType a;
    public final q<T, T, c<? super R>, Object> b;
    public final ArrayList c;
    public boolean d;
    public boolean e;
    public final n f;
    public l g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    
    public SeparatorState(final TerminalSeparatorType a, final q<? super T, ? super T, ? super c<? super R>, ?> b) {
        this.a = a;
        this.b = (q<T, T, c<? super R>, Object>)b;
        this.c = new ArrayList();
        this.f = new n();
    }
    
    public static z c(final z z) {
        final int[] a = z.a;
        final List s1 = b.s1(new Object[] { CollectionsKt___CollectionsKt.A3((List)z.b), CollectionsKt___CollectionsKt.K3((List)z.b) });
        final int c = z.c;
        final List<Integer> d = z.d;
        int intValue = 0;
        Label_0080: {
            if (d != null) {
                final Integer n = (Integer)CollectionsKt___CollectionsKt.A3((List)d);
                if (n != null) {
                    intValue = n;
                    break Label_0080;
                }
            }
            intValue = 0;
        }
        final List<Integer> d2 = z.d;
        Integer n2;
        if (d2 == null) {
            n2 = null;
        }
        else {
            n2 = (Integer)CollectionsKt___CollectionsKt.K3((List)d2);
        }
        int n3;
        if (n2 == null) {
            n3 = b.L0((List)z.b);
        }
        else {
            n3 = n2;
        }
        return new z(a, s1, c, b.s1((Object[])new Integer[] { intValue, n3 }));
    }
    
    public final Object a(final PageEvent<T> pageEvent, final c<? super PageEvent<R>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof SeparatorState$onEvent.SeparatorState$onEvent$1) {
                final SeparatorState$onEvent.SeparatorState$onEvent$1 separatorState$onEvent$1 = (SeparatorState$onEvent.SeparatorState$onEvent$1)c;
                final int label = separatorState$onEvent$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    separatorState$onEvent$1.label = label + Integer.MIN_VALUE;
                    o = separatorState$onEvent$1;
                    break Label_0050;
                }
            }
            o = new SeparatorState$onEvent.SeparatorState$onEvent$1(this, (c)c);
        }
        Object o2 = ((SeparatorState$onEvent.SeparatorState$onEvent$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((SeparatorState$onEvent.SeparatorState$onEvent$1)o).label;
        SeparatorState separatorState = null;
        Object o3 = null;
        Label_0663: {
            Label_0658: {
                if (label2 != 0) {
                    if (label2 != 1) {
                        if (label2 == 2) {
                            separatorState = (SeparatorState)((SeparatorState$onEvent.SeparatorState$onEvent$1)o).L$0;
                            yd.b.k0(o2);
                            break Label_0658;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        separatorState = (SeparatorState)((SeparatorState$onEvent.SeparatorState$onEvent$1)o).L$0;
                        yd.b.k0(o2);
                    }
                }
                else {
                    yd.b.k0(o2);
                    if (pageEvent instanceof PageEvent$Insert) {
                        final PageEvent$Insert pageEvent$Insert = (PageEvent$Insert)pageEvent;
                        ((SeparatorState$onEvent.SeparatorState$onEvent$1)o).L$0 = this;
                        ((SeparatorState$onEvent.SeparatorState$onEvent$1)o).label = 1;
                        o2 = this.b((PageEvent$Insert<T>)pageEvent$Insert, (c<? super PageEvent$Insert<R>>)o);
                        if (o2 == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                        separatorState = this;
                    }
                    else {
                        if (pageEvent instanceof PageEvent$a) {
                            o3 = pageEvent;
                            sg2.e.f(o3, "event");
                            this.f.b(((PageEvent$a)o3).a, c5.k.c.c);
                            final LoadType a = ((PageEvent$a)o3).a;
                            final LoadType prepend = LoadType.PREPEND;
                            if (a == prepend) {
                                this.h = ((PageEvent$a)o3).d;
                                this.k = false;
                            }
                            else if (a == LoadType.APPEND) {
                                this.i = ((PageEvent$a)o3).d;
                                this.j = false;
                            }
                            if (this.c.isEmpty()) {
                                if (((PageEvent$a)o3).a == prepend) {
                                    this.e = false;
                                }
                                else {
                                    this.d = false;
                                }
                            }
                            ig2.o.m3((List)this.c, (rg2.l)new SeparatorState$onDrop$1(new i(((PageEvent$a)o3).b, ((PageEvent$a)o3).c)));
                            separatorState = this;
                            break Label_0663;
                        }
                        if (!(pageEvent instanceof PageEvent$b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        final PageEvent$b pageEvent$b = (PageEvent$b)pageEvent;
                        ((SeparatorState$onEvent.SeparatorState$onEvent$1)o).L$0 = this;
                        ((SeparatorState$onEvent.SeparatorState$onEvent$1)o).label = 2;
                        final l g = this.g;
                        Object o4 = null;
                        Label_0645: {
                            if (sg2.e.a((Object)this.f.d(), (Object)pageEvent$b.a) && sg2.e.a((Object)g, (Object)pageEvent$b.b)) {
                                o4 = pageEvent$b;
                            }
                            else {
                                this.f.c(pageEvent$b.a);
                                final l b = pageEvent$b.b;
                                this.g = b;
                                Object c2 = null;
                                if (b != null) {
                                    final k b2 = b.b;
                                    if (b2.a) {
                                        Object b3;
                                        if (g == null) {
                                            b3 = null;
                                        }
                                        else {
                                            b3 = g.b;
                                        }
                                        if (!sg2.e.a(b3, (Object)b2)) {
                                            final PageEvent$Insert g2 = PageEvent$Insert.g;
                                            final EmptyList instance = EmptyList.INSTANCE;
                                            final int h = this.h;
                                            final l a2 = pageEvent$b.a;
                                            final l b4 = pageEvent$b.b;
                                            sg2.e.f((Object)instance, "pages");
                                            sg2.e.f((Object)a2, "sourceLoadStates");
                                            o4 = this.b((PageEvent$Insert<T>)new PageEvent$Insert(LoadType.PREPEND, (List)instance, h, -1, a2, b4), (c<? super PageEvent$Insert<R>>)o);
                                            break Label_0645;
                                        }
                                    }
                                }
                                final l b5 = pageEvent$b.b;
                                o4 = pageEvent$b;
                                if (b5 != null) {
                                    final k c3 = b5.c;
                                    o4 = pageEvent$b;
                                    if (c3.a) {
                                        if (g != null) {
                                            c2 = g.c;
                                        }
                                        o4 = pageEvent$b;
                                        if (!sg2.e.a(c2, (Object)c3)) {
                                            final PageEvent$Insert g3 = PageEvent$Insert.g;
                                            final EmptyList instance2 = EmptyList.INSTANCE;
                                            final int i = this.i;
                                            final l a3 = pageEvent$b.a;
                                            final l b6 = pageEvent$b.b;
                                            sg2.e.f((Object)instance2, "pages");
                                            sg2.e.f((Object)a3, "sourceLoadStates");
                                            o4 = this.b((PageEvent$Insert<T>)new PageEvent$Insert(LoadType.APPEND, (List)instance2, -1, i, a3, b6), (c<? super PageEvent$Insert<R>>)o);
                                        }
                                    }
                                }
                            }
                        }
                        o2 = o4;
                        if (o2 == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                        separatorState = this;
                        break Label_0658;
                    }
                }
                o3 = o2;
                break Label_0663;
            }
            o3 = o2;
        }
        if (separatorState.d && !separatorState.c.isEmpty()) {
            throw new IllegalStateException("deferred endTerm, page stash should be empty".toString());
        }
        if (separatorState.e && !separatorState.c.isEmpty()) {
            throw new IllegalStateException("deferred startTerm, page stash should be empty".toString());
        }
        return o3;
    }
    
    public final Object b(final PageEvent$Insert<T> pageEvent$Insert, final c<? super PageEvent$Insert<R>> c) {
        Object o = pageEvent$Insert;
        Object o2 = null;
        Label_0050: {
            if (c instanceof SeparatorState$onInsert.SeparatorState$onInsert$1) {
                o2 = c;
                final int label = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).label = label + Integer.MIN_VALUE;
                    break Label_0050;
                }
            }
            o2 = new SeparatorState$onInsert.SeparatorState$onInsert$1(this, (c)c);
        }
        Object o3 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).result;
        CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        Object o5 = null;
        Object o6 = null;
        SeparatorState l$0 = null;
        PageEvent$Insert l$2 = null;
        Label_5105: {
            Object o4 = null;
            z z = null;
            Object invoke = null;
            Label_5028: {
                int n = 0;
                int n2 = 0;
                CoroutineSingletons coroutineSingletons8 = null;
                Object o43 = null;
                Label_4874: {
                    SeparatorState l$3 = null;
                    Object o8 = null;
                    CoroutineSingletons coroutineSingletons = null;
                    PageEvent$Insert pageEvent$Insert4 = null;
                    ArrayList list2 = null;
                    while (true) {
                        int i$3 = 0;
                        int i$4 = 0;
                        int i$5 = 0;
                        Object o7 = null;
                        Object b = null;
                        Label_4741: {
                            z z27 = null;
                            int n15 = 0;
                            Object o54 = null;
                            int n16 = 0;
                            Object o55 = null;
                            Object o56 = null;
                            Object o57 = null;
                            PageEvent$Insert pageEvent$Insert18 = null;
                            SeparatorState separatorState19 = null;
                            Label_4519: {
                                z z2 = null;
                                Object o9 = null;
                                z z3 = null;
                                Object o10 = null;
                                Object o11 = null;
                                Object o12 = null;
                                ArrayList list4 = null;
                                CoroutineSingletons coroutineSingletons2 = null;
                                PageEvent$Insert pageEvent$Insert7 = null;
                                SeparatorState separatorState2 = null;
                                Label_4407: {
                                    while (true) {
                                        z l$4 = null;
                                        z l$5 = null;
                                        Iterator iterator = null;
                                        Object l$6 = null;
                                        PageEvent$Insert l$7 = null;
                                        SeparatorState l$8 = null;
                                        CoroutineSingletons coroutineSingletons3 = null;
                                        ArrayList list6 = null;
                                        Object l$11 = null;
                                        z l$36 = null;
                                        Label_3904: {
                                            int i$6 = 0;
                                            z z6 = null;
                                            Iterator iterator2 = null;
                                            Object o16 = null;
                                            z z7 = null;
                                            Object o17 = null;
                                            CoroutineSingletons coroutineSingletons4 = null;
                                            Object o18 = null;
                                            Object o19 = null;
                                            PageEvent$Insert pageEvent$Insert9 = null;
                                            z z9 = null;
                                            SeparatorState separatorState4 = null;
                                            Label_3665: {
                                                CoroutineSingletons coroutineSingletons5 = null;
                                                SeparatorState separatorState11 = null;
                                                z z19 = null;
                                                z z20 = null;
                                                Object o38 = null;
                                                Integer n8 = null;
                                                Object o39 = null;
                                                Label_3438: {
                                                    Object o20 = null;
                                                    Object l$9 = null;
                                                    z z10 = null;
                                                    Object l$10 = null;
                                                    Object o21 = null;
                                                    SeparatorState l$12 = null;
                                                    Object o22 = null;
                                                    Label_3346: {
                                                        z l$15 = null;
                                                        PageEvent$Insert pageEvent$Insert15 = null;
                                                        Object l$33 = null;
                                                        Object o49 = null;
                                                        Label_3189: {
                                                            z l$13 = null;
                                                            Object o23 = null;
                                                            z z11 = null;
                                                            Object l$14 = null;
                                                            Object o24 = null;
                                                            Object o25 = null;
                                                            ArrayList list8 = null;
                                                            Object o26 = null;
                                                            CoroutineSingletons coroutineSingletons6 = null;
                                                            PageEvent$Insert pageEvent$Insert11 = null;
                                                            SeparatorState separatorState6 = null;
                                                            Label_3052: {
                                                                SeparatorState l$28 = null;
                                                                Object l$29 = null;
                                                                Object l$30 = null;
                                                                Object l$31 = null;
                                                                Label_2834: {
                                                                    Object l$16 = null;
                                                                    z l$17 = null;
                                                                    Object l$18 = null;
                                                                    z l$19 = null;
                                                                    Object l$20 = null;
                                                                    PageEvent$Insert l$21 = null;
                                                                    CoroutineSingletons coroutineSingletons7 = null;
                                                                    SeparatorState separatorState8 = null;
                                                                    Object o28 = null;
                                                                    ArrayList list10 = null;
                                                                    while (true) {
                                                                        int i$7 = 0;
                                                                        int i$8 = 0;
                                                                        Object o27 = null;
                                                                        Object b3 = null;
                                                                        Label_2697: {
                                                                            Object o30 = null;
                                                                            SeparatorState separatorState9 = null;
                                                                            z l$22 = null;
                                                                            PageEvent$Insert pageEvent$Insert13 = null;
                                                                            Integer l$24 = null;
                                                                            z z15 = null;
                                                                            Object o35 = null;
                                                                            Label_2459: {
                                                                                Object o29 = null;
                                                                                z z12 = null;
                                                                                Object o31 = null;
                                                                                z z14 = null;
                                                                                Object o32 = null;
                                                                                Object o33 = null;
                                                                                Object o34 = null;
                                                                                Label_2349: {
                                                                                    SeparatorState separatorState10 = null;
                                                                                    Label_1791: {
                                                                                        final Object o13;
                                                                                        final z z4;
                                                                                        final Object o14;
                                                                                        final Object o15;
                                                                                        final Object b2;
                                                                                        switch (((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).label) {
                                                                                            default: {
                                                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                            }
                                                                                            case 10: {
                                                                                                o4 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$5;
                                                                                                z = (z)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$4;
                                                                                                o5 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$3;
                                                                                                o6 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$2;
                                                                                                final PageEvent$Insert pageEvent$Insert2 = (PageEvent$Insert)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$1;
                                                                                                l$0 = (SeparatorState)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$0;
                                                                                                yd.b.k0(o3);
                                                                                                invoke = o3;
                                                                                                l$2 = pageEvent$Insert2;
                                                                                                break Label_5028;
                                                                                            }
                                                                                            case 9: {
                                                                                                i$3 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).I$3;
                                                                                                i$4 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).I$2;
                                                                                                i$5 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).I$1;
                                                                                                n = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).I$0;
                                                                                                n2 = (((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).Z$0 ? 1 : 0);
                                                                                                o7 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$5;
                                                                                                z = (z)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$4;
                                                                                                o5 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$3;
                                                                                                final ArrayList list = (ArrayList)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$2;
                                                                                                final PageEvent$Insert pageEvent$Insert3 = (PageEvent$Insert)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$1;
                                                                                                l$3 = (SeparatorState)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$0;
                                                                                                yd.b.k0(o3);
                                                                                                b = o3;
                                                                                                o8 = o2;
                                                                                                coroutineSingletons = coroutine_SUSPENDED;
                                                                                                pageEvent$Insert4 = pageEvent$Insert3;
                                                                                                list2 = list;
                                                                                                break Label_4741;
                                                                                            }
                                                                                            case 8: {
                                                                                                n = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).I$0;
                                                                                                n2 = (((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).Z$0 ? 1 : 0);
                                                                                                z2 = (z)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$6;
                                                                                                o9 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$5;
                                                                                                z3 = (z)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$4;
                                                                                                o10 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$3;
                                                                                                final ArrayList list3 = (ArrayList)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$2;
                                                                                                final PageEvent$Insert pageEvent$Insert5 = (PageEvent$Insert)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$1;
                                                                                                final SeparatorState separatorState = (SeparatorState)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$0;
                                                                                                yd.b.k0(o3);
                                                                                                o11 = o2;
                                                                                                final PageEvent$Insert pageEvent$Insert6 = pageEvent$Insert5;
                                                                                                o12 = o3;
                                                                                                list4 = list3;
                                                                                                coroutineSingletons2 = coroutine_SUSPENDED;
                                                                                                pageEvent$Insert7 = pageEvent$Insert6;
                                                                                                separatorState2 = separatorState;
                                                                                                break Label_4407;
                                                                                            }
                                                                                            case 7: {
                                                                                                n = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).I$0;
                                                                                                n2 = (((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).Z$0 ? 1 : 0);
                                                                                                o13 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$9;
                                                                                                l$4 = (z)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$8;
                                                                                                l$5 = (z)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$7;
                                                                                                iterator = (Iterator)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$6;
                                                                                                l$6 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$5;
                                                                                                z4 = (z)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$4;
                                                                                                o14 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$3;
                                                                                                o15 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$2;
                                                                                                l$7 = (PageEvent$Insert)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$1;
                                                                                                l$8 = (SeparatorState)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$0;
                                                                                                yd.b.k0(o3);
                                                                                                coroutineSingletons3 = coroutine_SUSPENDED;
                                                                                                b2 = o3;
                                                                                                break;
                                                                                            }
                                                                                            case 6: {
                                                                                                i$6 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).I$0;
                                                                                                n2 = (((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).Z$0 ? 1 : 0);
                                                                                                final z z5 = (z)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$8;
                                                                                                z6 = (z)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$7;
                                                                                                iterator2 = (Iterator)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$6;
                                                                                                o16 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$5;
                                                                                                z7 = (z)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$4;
                                                                                                o17 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$3;
                                                                                                final ArrayList list5 = (ArrayList)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$2;
                                                                                                final PageEvent$Insert pageEvent$Insert8 = (PageEvent$Insert)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$1;
                                                                                                final SeparatorState separatorState3 = (SeparatorState)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$0;
                                                                                                yd.b.k0(o3);
                                                                                                coroutineSingletons4 = coroutine_SUSPENDED;
                                                                                                final z z8 = z5;
                                                                                                o18 = o2;
                                                                                                o19 = o3;
                                                                                                pageEvent$Insert9 = pageEvent$Insert8;
                                                                                                z9 = z8;
                                                                                                list6 = list5;
                                                                                                separatorState4 = separatorState3;
                                                                                                break Label_3665;
                                                                                            }
                                                                                            case 5: {
                                                                                                n = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).I$0;
                                                                                                n2 = (((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).Z$0 ? 1 : 0);
                                                                                                o20 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$7;
                                                                                                l$9 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$6;
                                                                                                z10 = (z)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$5;
                                                                                                l$10 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$4;
                                                                                                l$11 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$3;
                                                                                                o21 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$2;
                                                                                                l$7 = (PageEvent$Insert)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$1;
                                                                                                l$12 = (SeparatorState)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$0;
                                                                                                yd.b.k0(o3);
                                                                                                o22 = o2;
                                                                                                coroutineSingletons5 = coroutine_SUSPENDED;
                                                                                                break Label_3346;
                                                                                            }
                                                                                            case 4: {
                                                                                                n = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).I$0;
                                                                                                n2 = (((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).Z$0 ? 1 : 0);
                                                                                                l$13 = (z)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$8;
                                                                                                o23 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$7;
                                                                                                z11 = (z)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$6;
                                                                                                l$14 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$5;
                                                                                                l$15 = (z)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$4;
                                                                                                final ArrayList list7 = (ArrayList)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$3;
                                                                                                o24 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$2;
                                                                                                final PageEvent$Insert pageEvent$Insert10 = (PageEvent$Insert)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$1;
                                                                                                final SeparatorState separatorState5 = (SeparatorState)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$0;
                                                                                                yd.b.k0(o3);
                                                                                                o25 = o2;
                                                                                                list8 = list7;
                                                                                                o26 = o3;
                                                                                                coroutineSingletons6 = coroutine_SUSPENDED;
                                                                                                pageEvent$Insert11 = pageEvent$Insert10;
                                                                                                separatorState6 = separatorState5;
                                                                                                break Label_3052;
                                                                                            }
                                                                                            case 3: {
                                                                                                i$7 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).I$2;
                                                                                                i$8 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).I$1;
                                                                                                n = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).I$0;
                                                                                                n2 = (((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).Z$0 ? 1 : 0);
                                                                                                o27 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$8;
                                                                                                l$16 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$7;
                                                                                                l$17 = (z)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$6;
                                                                                                l$18 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$5;
                                                                                                l$19 = (z)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$4;
                                                                                                l$20 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$3;
                                                                                                final ArrayList list9 = (ArrayList)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$2;
                                                                                                l$21 = (PageEvent$Insert)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$1;
                                                                                                final SeparatorState separatorState7 = (SeparatorState)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$0;
                                                                                                yd.b.k0(o3);
                                                                                                coroutineSingletons7 = coroutine_SUSPENDED;
                                                                                                separatorState8 = separatorState7;
                                                                                                b3 = o3;
                                                                                                o28 = o2;
                                                                                                list10 = list9;
                                                                                                break Label_2697;
                                                                                            }
                                                                                            case 2: {
                                                                                                n = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).I$0;
                                                                                                n2 = (((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).Z$0 ? 1 : 0);
                                                                                                o29 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$9;
                                                                                                z12 = (z)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$8;
                                                                                                o30 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$7;
                                                                                                final z z13 = (z)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$6;
                                                                                                o31 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$5;
                                                                                                z14 = (z)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$4;
                                                                                                o32 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$3;
                                                                                                o33 = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$2;
                                                                                                final PageEvent$Insert pageEvent$Insert12 = (PageEvent$Insert)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$1;
                                                                                                separatorState9 = (SeparatorState)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$0;
                                                                                                yd.b.k0(o3);
                                                                                                o34 = o3;
                                                                                                l$22 = z13;
                                                                                                pageEvent$Insert13 = pageEvent$Insert12;
                                                                                                break Label_2349;
                                                                                            }
                                                                                            case 1: {
                                                                                                o = ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$1;
                                                                                                separatorState10 = (SeparatorState)((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$0;
                                                                                                yd.b.k0(o3);
                                                                                                break Label_1791;
                                                                                            }
                                                                                            case 0: {
                                                                                                yd.b.k0(o3);
                                                                                                final TerminalSeparatorType a = this.a;
                                                                                                sg2.e.f(o, "<this>");
                                                                                                sg2.e.f((Object)a, "terminalSeparatorType");
                                                                                                boolean b4 = false;
                                                                                                Label_1318: {
                                                                                                    if (((PageEvent$Insert)o).a == LoadType.APPEND) {
                                                                                                        b4 = this.e;
                                                                                                    }
                                                                                                    else {
                                                                                                        final int n3 = SeparatorState.a.a[((Enum)a).ordinal()];
                                                                                                        if (n3 != 1) {
                                                                                                            if (n3 != 2) {
                                                                                                                throw new NoWhenBranchMatchedException();
                                                                                                            }
                                                                                                            b4 = ((PageEvent$Insert)o).e.b.a;
                                                                                                        }
                                                                                                        else {
                                                                                                            if (((PageEvent$Insert)o).e.b.a) {
                                                                                                                final l f = ((PageEvent$Insert)o).f;
                                                                                                                boolean b6 = false;
                                                                                                                Label_1304: {
                                                                                                                    if (f != null) {
                                                                                                                        final k b5 = f.b;
                                                                                                                        if (b5 != null) {
                                                                                                                            if (!b5.a) {
                                                                                                                                b6 = true;
                                                                                                                                break Label_1304;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    b6 = false;
                                                                                                                }
                                                                                                                if (!b6) {
                                                                                                                    b4 = true;
                                                                                                                    break Label_1318;
                                                                                                                }
                                                                                                            }
                                                                                                            b4 = false;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                final TerminalSeparatorType a2 = this.a;
                                                                                                sg2.e.f((Object)a2, "terminalSeparatorType");
                                                                                                Label_1470: {
                                                                                                    if (((PageEvent$Insert)o).a == LoadType.PREPEND) {
                                                                                                        n2 = (this.d ? 1 : 0);
                                                                                                    }
                                                                                                    else {
                                                                                                        final int n4 = SeparatorState.a.a[((Enum)a2).ordinal()];
                                                                                                        if (n4 != 1) {
                                                                                                            if (n4 != 2) {
                                                                                                                throw new NoWhenBranchMatchedException();
                                                                                                            }
                                                                                                            n2 = (((PageEvent$Insert)o).e.c.a ? 1 : 0);
                                                                                                        }
                                                                                                        else {
                                                                                                            if (((PageEvent$Insert)o).e.c.a) {
                                                                                                                final l f2 = ((PageEvent$Insert)o).f;
                                                                                                                boolean b7 = false;
                                                                                                                Label_1456: {
                                                                                                                    if (f2 != null) {
                                                                                                                        final k c2 = f2.c;
                                                                                                                        if (c2 != null) {
                                                                                                                            if (!c2.a) {
                                                                                                                                b7 = true;
                                                                                                                                break Label_1456;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    b7 = false;
                                                                                                                }
                                                                                                                if (!b7) {
                                                                                                                    n2 = 1;
                                                                                                                    break Label_1470;
                                                                                                                }
                                                                                                            }
                                                                                                            n2 = 0;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                final List b8 = ((PageEvent$Insert)o).b;
                                                                                                Label_1546: {
                                                                                                    if (!(b8 instanceof Collection) || !b8.isEmpty()) {
                                                                                                        final Iterator iterator3 = b8.iterator();
                                                                                                        while (iterator3.hasNext()) {
                                                                                                            if (!((z)iterator3.next()).b.isEmpty()) {
                                                                                                                n = 0;
                                                                                                                break Label_1546;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    n = 1;
                                                                                                }
                                                                                                if (this.k && ((PageEvent$Insert)o).a == LoadType.PREPEND && n == 0) {
                                                                                                    throw new IllegalArgumentException("Additional prepend event after prepend state is done".toString());
                                                                                                }
                                                                                                if (this.j && ((PageEvent$Insert)o).a == LoadType.APPEND && n == 0) {
                                                                                                    throw new IllegalArgumentException("Additional append event after append state is done".toString());
                                                                                                }
                                                                                                this.f.c(((PageEvent$Insert)o).e);
                                                                                                this.g = ((PageEvent$Insert)o).f;
                                                                                                final LoadType a3 = ((PageEvent$Insert)o).a;
                                                                                                if (a3 != LoadType.APPEND) {
                                                                                                    this.h = ((PageEvent$Insert)o).c;
                                                                                                }
                                                                                                if (a3 != LoadType.PREPEND) {
                                                                                                    this.i = ((PageEvent$Insert)o).d;
                                                                                                }
                                                                                                if (n != 0) {
                                                                                                    if (!b4 && n2 == 0) {
                                                                                                        return o;
                                                                                                    }
                                                                                                    if (this.k && this.j) {
                                                                                                        return o;
                                                                                                    }
                                                                                                    if (this.c.isEmpty()) {
                                                                                                        if (!b4 || n2 == 0 || this.k || this.j) {
                                                                                                            if (n2 && !this.j) {
                                                                                                                this.d = true;
                                                                                                            }
                                                                                                            if (b4 && !this.k) {
                                                                                                                this.e = true;
                                                                                                            }
                                                                                                            return o;
                                                                                                        }
                                                                                                        final q<T, T, c<? super R>, Object> b9 = this.b;
                                                                                                        ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$0 = this;
                                                                                                        ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$1 = o;
                                                                                                        ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).label = 1;
                                                                                                        o3 = b9.invoke(null, null, (c<? super R>)o2);
                                                                                                        if (o3 == coroutine_SUSPENDED) {
                                                                                                            return coroutine_SUSPENDED;
                                                                                                        }
                                                                                                        separatorState10 = this;
                                                                                                        break Label_1791;
                                                                                                    }
                                                                                                }
                                                                                                final ArrayList list11 = new ArrayList(((PageEvent$Insert)o).b.size());
                                                                                                final ArrayList l$23 = new ArrayList(((PageEvent$Insert)o).b.size());
                                                                                                z l$25;
                                                                                                Integer l$26;
                                                                                                if (n == 0) {
                                                                                                    int n5;
                                                                                                    for (n5 = 0; n5 < lw0.b.L0(((PageEvent$Insert)o).b) && ((z)((PageEvent$Insert)o).b.get(n5)).b.isEmpty(); ++n5) {}
                                                                                                    l$24 = new Integer(n5);
                                                                                                    l$25 = ((PageEvent$Insert)o).b.get(n5);
                                                                                                    int l0;
                                                                                                    for (l0 = lw0.b.L0(((PageEvent$Insert)o).b); l0 > 0 && ((z)((PageEvent$Insert)o).b.get(l0)).b.isEmpty(); --l0) {}
                                                                                                    l$26 = new Integer(l0);
                                                                                                    l$22 = (z)((PageEvent$Insert)o).b.get(l0);
                                                                                                }
                                                                                                else {
                                                                                                    l$25 = null;
                                                                                                    l$24 = null;
                                                                                                    l$22 = null;
                                                                                                    l$26 = null;
                                                                                                }
                                                                                                if (!b4 || this.k) {
                                                                                                    separatorState9 = this;
                                                                                                    pageEvent$Insert13 = (PageEvent$Insert)o;
                                                                                                    o30 = l$26;
                                                                                                    o5 = l$23;
                                                                                                    z15 = l$25;
                                                                                                    o35 = list11;
                                                                                                    break Label_2459;
                                                                                                }
                                                                                                this.k = true;
                                                                                                z l$27;
                                                                                                if (n != 0) {
                                                                                                    l$27 = (z)CollectionsKt___CollectionsKt.A3((List)this.c);
                                                                                                }
                                                                                                else {
                                                                                                    sg2.e.c((Object)l$25);
                                                                                                    l$27 = l$25;
                                                                                                }
                                                                                                final q<T, T, c<? super R>, Object> b10 = this.b;
                                                                                                final Object a4 = CollectionsKt___CollectionsKt.A3((List)l$27.b);
                                                                                                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$0 = this;
                                                                                                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$1 = o;
                                                                                                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$2 = list11;
                                                                                                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$3 = l$23;
                                                                                                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$4 = l$25;
                                                                                                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$5 = l$24;
                                                                                                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$6 = l$22;
                                                                                                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$7 = l$26;
                                                                                                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$8 = l$27;
                                                                                                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$9 = list11;
                                                                                                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).Z$0 = (n2 != 0);
                                                                                                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).I$0 = n;
                                                                                                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).label = 2;
                                                                                                final CoroutineSingletons invoke2 = b10.invoke(null, (T)a4, (c<? super R>)o2);
                                                                                                if (invoke2 == coroutine_SUSPENDED) {
                                                                                                    return coroutine_SUSPENDED;
                                                                                                }
                                                                                                final ArrayList list12 = list11;
                                                                                                final z z16 = l$25;
                                                                                                o32 = l$23;
                                                                                                z12 = l$27;
                                                                                                o29 = list12;
                                                                                                final Integer n6 = l$24;
                                                                                                o34 = invoke2;
                                                                                                final PageEvent$Insert pageEvent$Insert14 = (PageEvent$Insert)o;
                                                                                                separatorState9 = this;
                                                                                                o33 = list12;
                                                                                                z14 = z16;
                                                                                                pageEvent$Insert13 = pageEvent$Insert14;
                                                                                                o30 = l$26;
                                                                                                o31 = n6;
                                                                                                break Label_2349;
                                                                                            }
                                                                                        }
                                                                                        final z z17 = z4;
                                                                                        final Object o36 = o14;
                                                                                        separatorState11 = l$8;
                                                                                        ((ArrayList<CoroutineSingletons>)o13).add((CoroutineSingletons)b2);
                                                                                        z z18;
                                                                                        if (l$5.b.isEmpty() ^ true) {
                                                                                            z18 = l$5;
                                                                                        }
                                                                                        else {
                                                                                            z18 = l$4;
                                                                                        }
                                                                                        final Integer n7 = (Integer)l$6;
                                                                                        final Object o37 = o15;
                                                                                        z19 = z17;
                                                                                        z20 = z18;
                                                                                        o38 = o2;
                                                                                        coroutineSingletons5 = coroutineSingletons3;
                                                                                        n8 = n7;
                                                                                        l$11 = o36;
                                                                                        o39 = o37;
                                                                                        break Label_3438;
                                                                                    }
                                                                                    separatorState10.d = false;
                                                                                    separatorState10.e = false;
                                                                                    separatorState10.k = true;
                                                                                    separatorState10.j = true;
                                                                                    if (o3 == null) {
                                                                                        sg2.e.f(o, "<this>");
                                                                                    }
                                                                                    else {
                                                                                        o = new PageEvent$Insert(((PageEvent$Insert)o).a, lw0.b.r1((Object)new z(new int[] { 0 }, lw0.b.r1(o3), 0, lw0.b.r1((Object)0))), ((PageEvent$Insert)o).c, ((PageEvent$Insert)o).d, ((PageEvent$Insert)o).e, ((PageEvent$Insert)o).f);
                                                                                    }
                                                                                    return o;
                                                                                }
                                                                                final int c3 = z12.c;
                                                                                final List<Integer> d = z12.d;
                                                                                int intValue = 0;
                                                                                Label_2399: {
                                                                                    if (d != null) {
                                                                                        final Integer n9 = (Integer)CollectionsKt___CollectionsKt.A3((List)d);
                                                                                        if (n9 != null) {
                                                                                            intValue = n9;
                                                                                            break Label_2399;
                                                                                        }
                                                                                    }
                                                                                    intValue = 0;
                                                                                }
                                                                                SeparatorsKt.a((List<z<Object>>)o29, o34, null, (z<Object>)z12, c3, intValue);
                                                                                final Object o40 = o31;
                                                                                z15 = z14;
                                                                                final Object o41 = o32;
                                                                                o35 = o33;
                                                                                l$24 = (Integer)o40;
                                                                                o5 = o41;
                                                                            }
                                                                            if (n != 0) {
                                                                                final c<? super R> c4 = (c<? super R>)o2;
                                                                                final Object o42 = o35;
                                                                                l$0 = separatorState9;
                                                                                z = l$22;
                                                                                l$2 = pageEvent$Insert13;
                                                                                coroutineSingletons8 = coroutine_SUSPENDED;
                                                                                o6 = o42;
                                                                                o43 = c4;
                                                                                break Label_4874;
                                                                            }
                                                                            sg2.e.c((Object)l$24);
                                                                            i$7 = l$24;
                                                                            if (i$7 <= 0) {
                                                                                final Integer n10 = l$24;
                                                                                final Object o44 = o30;
                                                                                final SeparatorState separatorState12 = separatorState9;
                                                                                final z z21 = z15;
                                                                                l$28 = separatorState12;
                                                                                pageEvent$Insert15 = pageEvent$Insert13;
                                                                                l$29 = o35;
                                                                                l$30 = o5;
                                                                                l$15 = z21;
                                                                                l$14 = n10;
                                                                                z10 = l$22;
                                                                                l$31 = o44;
                                                                                break Label_2834;
                                                                            }
                                                                            final SeparatorState separatorState13 = separatorState9;
                                                                            final Object o45 = o5;
                                                                            l$19 = z15;
                                                                            final Object o46 = o35;
                                                                            final CoroutineSingletons coroutineSingletons9 = coroutine_SUSPENDED;
                                                                            i$8 = 0;
                                                                            l$21 = pageEvent$Insert13;
                                                                            l$20 = o45;
                                                                            l$18 = l$24;
                                                                            l$17 = l$22;
                                                                            l$16 = o30;
                                                                            final Object o47 = o46;
                                                                            coroutineSingletons7 = coroutineSingletons9;
                                                                            o28 = o2;
                                                                            final SeparatorState l$32 = separatorState13;
                                                                            final int i$9 = i$8 + 1;
                                                                            final z z22 = l$21.b.get(i$8);
                                                                            final q<T, T, c<? super R>, Object> b11 = l$32.b;
                                                                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o28).L$0 = l$32;
                                                                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o28).L$1 = l$21;
                                                                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o28).L$2 = o47;
                                                                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o28).L$3 = l$20;
                                                                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o28).L$4 = l$19;
                                                                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o28).L$5 = l$18;
                                                                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o28).L$6 = l$17;
                                                                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o28).L$7 = l$16;
                                                                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o28).L$8 = o47;
                                                                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o28).L$9 = null;
                                                                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o28).Z$0 = (n2 != 0);
                                                                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o28).I$0 = n;
                                                                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o28).I$1 = i$9;
                                                                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o28).I$2 = i$7;
                                                                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o28).label = 3;
                                                                            b3 = SeparatorsKt.b((z<Object>)z22, (q<? super Object, ? super Object, ? super lg2.c<? super Object>, ?>)b11, (lg2.c<? super z<Object>>)o28);
                                                                            if (b3 == coroutineSingletons7) {
                                                                                return coroutineSingletons7;
                                                                            }
                                                                            i$8 = i$9;
                                                                            final SeparatorState separatorState14 = l$32;
                                                                            list10 = (ArrayList)o47;
                                                                            o27 = o47;
                                                                            separatorState8 = separatorState14;
                                                                        }
                                                                        ((ArrayList<CoroutineSingletons>)o27).add((CoroutineSingletons)b3);
                                                                        if (i$8 < i$7) {
                                                                            final ArrayList list13 = list10;
                                                                            final SeparatorState l$32 = separatorState8;
                                                                            final Object o47 = list13;
                                                                            continue;
                                                                        }
                                                                        break;
                                                                    }
                                                                    final CoroutineSingletons coroutineSingletons10 = coroutineSingletons7;
                                                                    final Integer n11 = (Integer)l$16;
                                                                    final Integer n12 = (Integer)l$18;
                                                                    final z z23 = l$19;
                                                                    final ArrayList<z> list14 = (ArrayList<z>)l$20;
                                                                    final ArrayList list15 = list10;
                                                                    pageEvent$Insert15 = l$21;
                                                                    final SeparatorState separatorState15 = separatorState8;
                                                                    o2 = o28;
                                                                    coroutine_SUSPENDED = coroutineSingletons10;
                                                                    l$31 = n11;
                                                                    z10 = l$17;
                                                                    l$14 = n12;
                                                                    l$15 = z23;
                                                                    l$30 = list14;
                                                                    l$29 = list15;
                                                                    l$28 = separatorState15;
                                                                }
                                                                if (pageEvent$Insert15.a != LoadType.APPEND || !(l$28.c.isEmpty() ^ true)) {
                                                                    final Object o48 = l$29;
                                                                    l$33 = l$30;
                                                                    l$12 = l$28;
                                                                    l$10 = l$14;
                                                                    l$9 = l$31;
                                                                    o49 = o48;
                                                                    o22 = o2;
                                                                    break Label_3189;
                                                                }
                                                                l$13 = (z)CollectionsKt___CollectionsKt.K3((List)l$28.c);
                                                                final q<T, T, c<? super R>, Object> b12 = l$28.b;
                                                                final Object k3 = CollectionsKt___CollectionsKt.K3((List)l$13.b);
                                                                sg2.e.c((Object)l$15);
                                                                final Object a5 = CollectionsKt___CollectionsKt.A3((List)l$15.b);
                                                                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$0 = l$28;
                                                                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$1 = pageEvent$Insert15;
                                                                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$2 = l$29;
                                                                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$3 = l$30;
                                                                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$4 = l$15;
                                                                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$5 = l$14;
                                                                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$6 = z10;
                                                                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$7 = l$31;
                                                                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$8 = l$13;
                                                                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$9 = null;
                                                                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).Z$0 = (n2 != 0);
                                                                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).I$0 = n;
                                                                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).label = 4;
                                                                final CoroutineSingletons invoke3 = b12.invoke((T)k3, (T)a5, (c<? super R>)o2);
                                                                if (invoke3 == coroutine_SUSPENDED) {
                                                                    return coroutine_SUSPENDED;
                                                                }
                                                                final c<? super R> c5 = (c<? super R>)o2;
                                                                final Object o50 = l$29;
                                                                final SeparatorState separatorState16 = l$28;
                                                                final CoroutineSingletons coroutineSingletons11 = invoke3;
                                                                final Object o51 = l$30;
                                                                o23 = l$31;
                                                                z11 = z10;
                                                                final CoroutineSingletons coroutineSingletons12 = coroutine_SUSPENDED;
                                                                separatorState6 = separatorState16;
                                                                pageEvent$Insert11 = pageEvent$Insert15;
                                                                o24 = o50;
                                                                list8 = (ArrayList)o51;
                                                                coroutineSingletons6 = coroutineSingletons12;
                                                                o26 = coroutineSingletons11;
                                                                o25 = c5;
                                                            }
                                                            final int c6 = l$15.c;
                                                            final List<Integer> d2 = l$15.d;
                                                            int intValue2 = 0;
                                                            Label_3102: {
                                                                if (d2 != null) {
                                                                    final Integer n13 = (Integer)CollectionsKt___CollectionsKt.A3((List)d2);
                                                                    if (n13 != null) {
                                                                        intValue2 = n13;
                                                                        break Label_3102;
                                                                    }
                                                                }
                                                                intValue2 = 0;
                                                            }
                                                            SeparatorsKt.a((List<z<Object>>)o24, o26, l$13, (z<Object>)l$15, c6, intValue2);
                                                            final Object o52 = o25;
                                                            l$9 = o23;
                                                            final PageEvent$Insert pageEvent$Insert16 = pageEvent$Insert11;
                                                            final SeparatorState separatorState17 = separatorState6;
                                                            o22 = o52;
                                                            coroutine_SUSPENDED = coroutineSingletons6;
                                                            o49 = o24;
                                                            z10 = z11;
                                                            l$10 = l$14;
                                                            pageEvent$Insert15 = pageEvent$Insert16;
                                                            l$12 = separatorState17;
                                                            l$33 = list8;
                                                        }
                                                        sg2.e.c((Object)l$15);
                                                        l$12.getClass();
                                                        ((ArrayList<z>)l$33).add(c(l$15));
                                                        final q<T, T, c<? super R>, Object> b13 = l$12.b;
                                                        ((SeparatorState$onInsert.SeparatorState$onInsert$1)o22).L$0 = l$12;
                                                        ((SeparatorState$onInsert.SeparatorState$onInsert$1)o22).L$1 = pageEvent$Insert15;
                                                        ((SeparatorState$onInsert.SeparatorState$onInsert$1)o22).L$2 = o49;
                                                        ((SeparatorState$onInsert.SeparatorState$onInsert$1)o22).L$3 = l$33;
                                                        ((SeparatorState$onInsert.SeparatorState$onInsert$1)o22).L$4 = l$10;
                                                        ((SeparatorState$onInsert.SeparatorState$onInsert$1)o22).L$5 = z10;
                                                        ((SeparatorState$onInsert.SeparatorState$onInsert$1)o22).L$6 = l$9;
                                                        ((SeparatorState$onInsert.SeparatorState$onInsert$1)o22).L$7 = o49;
                                                        ((SeparatorState$onInsert.SeparatorState$onInsert$1)o22).L$8 = null;
                                                        ((SeparatorState$onInsert.SeparatorState$onInsert$1)o22).L$9 = null;
                                                        ((SeparatorState$onInsert.SeparatorState$onInsert$1)o22).Z$0 = (n2 != 0);
                                                        ((SeparatorState$onInsert.SeparatorState$onInsert$1)o22).I$0 = n;
                                                        ((SeparatorState$onInsert.SeparatorState$onInsert$1)o22).label = 5;
                                                        final Object b14 = SeparatorsKt.b((z<Object>)l$15, (q<? super Object, ? super Object, ? super lg2.c<? super Object>, ?>)b13, (lg2.c<? super z<Object>>)o22);
                                                        if (b14 == coroutine_SUSPENDED) {
                                                            return coroutine_SUSPENDED;
                                                        }
                                                        final Object o53 = o49;
                                                        l$11 = l$33;
                                                        l$7 = pageEvent$Insert15;
                                                        o21 = o53;
                                                        o20 = o49;
                                                        coroutineSingletons5 = coroutine_SUSPENDED;
                                                        o3 = b14;
                                                    }
                                                    ((ArrayList<CoroutineSingletons>)o20).add((CoroutineSingletons)o3);
                                                    final List b15 = l$7.b;
                                                    final int intValue3 = (int)l$10;
                                                    sg2.e.c(l$9);
                                                    final Iterator iterator4 = b15.subList(intValue3, (int)l$9 + 1).iterator();
                                                    if (!iterator4.hasNext()) {
                                                        throw new UnsupportedOperationException("Empty collection can't be reduced.");
                                                    }
                                                    final Object next = iterator4.next();
                                                    final z z24 = z10;
                                                    separatorState11 = l$12;
                                                    o39 = o21;
                                                    iterator = iterator4;
                                                    n8 = (Integer)l$9;
                                                    o38 = o22;
                                                    z20 = (z)next;
                                                    z19 = z24;
                                                }
                                                if (iterator.hasNext()) {
                                                    final z l$34 = iterator.next();
                                                    final z l$35 = z20;
                                                    if (!(l$34.b.isEmpty() ^ true)) {
                                                        final SeparatorState separatorState18 = separatorState11;
                                                        l$36 = z19;
                                                        l$6 = n8;
                                                        final z z25 = l$35;
                                                        l$8 = separatorState18;
                                                        l$5 = l$34;
                                                        l$4 = z25;
                                                        list6 = (ArrayList)o39;
                                                        coroutineSingletons3 = coroutineSingletons5;
                                                        o2 = o38;
                                                        break Label_3904;
                                                    }
                                                    final q<T, T, c<? super R>, Object> b16 = separatorState11.b;
                                                    final Object k4 = CollectionsKt___CollectionsKt.K3((List)l$35.b);
                                                    final Object a6 = CollectionsKt___CollectionsKt.A3((List)l$34.b);
                                                    ((SeparatorState$onInsert.SeparatorState$onInsert$1)o38).L$0 = separatorState11;
                                                    ((SeparatorState$onInsert.SeparatorState$onInsert$1)o38).L$1 = l$7;
                                                    ((SeparatorState$onInsert.SeparatorState$onInsert$1)o38).L$2 = o39;
                                                    ((SeparatorState$onInsert.SeparatorState$onInsert$1)o38).L$3 = l$11;
                                                    ((SeparatorState$onInsert.SeparatorState$onInsert$1)o38).L$4 = z19;
                                                    ((SeparatorState$onInsert.SeparatorState$onInsert$1)o38).L$5 = n8;
                                                    ((SeparatorState$onInsert.SeparatorState$onInsert$1)o38).L$6 = iterator;
                                                    ((SeparatorState$onInsert.SeparatorState$onInsert$1)o38).L$7 = l$34;
                                                    ((SeparatorState$onInsert.SeparatorState$onInsert$1)o38).L$8 = l$35;
                                                    ((SeparatorState$onInsert.SeparatorState$onInsert$1)o38).L$9 = null;
                                                    ((SeparatorState$onInsert.SeparatorState$onInsert$1)o38).Z$0 = (n2 != 0);
                                                    ((SeparatorState$onInsert.SeparatorState$onInsert$1)o38).I$0 = n;
                                                    ((SeparatorState$onInsert.SeparatorState$onInsert$1)o38).label = 6;
                                                    final CoroutineSingletons invoke4 = b16.invoke((T)k4, (T)a6, (c<? super R>)o38);
                                                    if (invoke4 == coroutineSingletons5) {
                                                        return coroutineSingletons5;
                                                    }
                                                    o18 = o38;
                                                    separatorState4 = separatorState11;
                                                    final z z26 = l$35;
                                                    o19 = invoke4;
                                                    final Integer n14 = n8;
                                                    final PageEvent$Insert pageEvent$Insert17 = l$7;
                                                    list6 = (ArrayList)o39;
                                                    o17 = l$11;
                                                    z7 = z19;
                                                    o16 = n14;
                                                    iterator2 = iterator;
                                                    z6 = l$34;
                                                    z9 = z26;
                                                    coroutineSingletons4 = coroutineSingletons5;
                                                    pageEvent$Insert9 = pageEvent$Insert17;
                                                    i$6 = n;
                                                }
                                                else {
                                                    z27 = z19;
                                                    n15 = n;
                                                    o54 = o38;
                                                    coroutineSingletons8 = coroutineSingletons5;
                                                    n16 = n2;
                                                    o55 = n8;
                                                    o56 = l$11;
                                                    o57 = o39;
                                                    pageEvent$Insert18 = l$7;
                                                    separatorState19 = separatorState11;
                                                    if (l$7.a != LoadType.PREPEND) {
                                                        break Label_4519;
                                                    }
                                                    z27 = z19;
                                                    n15 = n;
                                                    o54 = o38;
                                                    coroutineSingletons8 = coroutineSingletons5;
                                                    n16 = n2;
                                                    o55 = n8;
                                                    o56 = l$11;
                                                    o57 = o39;
                                                    pageEvent$Insert18 = l$7;
                                                    separatorState19 = separatorState11;
                                                    if (!(separatorState11.c.isEmpty() ^ true)) {
                                                        break Label_4519;
                                                    }
                                                    final z l$37 = (z)CollectionsKt___CollectionsKt.A3((List)separatorState11.c);
                                                    final q<T, T, c<? super R>, Object> b17 = separatorState11.b;
                                                    sg2.e.c((Object)z19);
                                                    final Object k5 = CollectionsKt___CollectionsKt.K3((List)z19.b);
                                                    final Object a7 = CollectionsKt___CollectionsKt.A3((List)l$37.b);
                                                    ((SeparatorState$onInsert.SeparatorState$onInsert$1)o38).L$0 = separatorState11;
                                                    ((SeparatorState$onInsert.SeparatorState$onInsert$1)o38).L$1 = l$7;
                                                    ((SeparatorState$onInsert.SeparatorState$onInsert$1)o38).L$2 = o39;
                                                    ((SeparatorState$onInsert.SeparatorState$onInsert$1)o38).L$3 = l$11;
                                                    ((SeparatorState$onInsert.SeparatorState$onInsert$1)o38).L$4 = z19;
                                                    ((SeparatorState$onInsert.SeparatorState$onInsert$1)o38).L$5 = n8;
                                                    ((SeparatorState$onInsert.SeparatorState$onInsert$1)o38).L$6 = l$37;
                                                    ((SeparatorState$onInsert.SeparatorState$onInsert$1)o38).L$7 = null;
                                                    ((SeparatorState$onInsert.SeparatorState$onInsert$1)o38).L$8 = null;
                                                    ((SeparatorState$onInsert.SeparatorState$onInsert$1)o38).L$9 = null;
                                                    ((SeparatorState$onInsert.SeparatorState$onInsert$1)o38).Z$0 = (n2 != 0);
                                                    ((SeparatorState$onInsert.SeparatorState$onInsert$1)o38).I$0 = n;
                                                    ((SeparatorState$onInsert.SeparatorState$onInsert$1)o38).label = 8;
                                                    final CoroutineSingletons invoke5 = b17.invoke((T)k5, (T)a7, (c<? super R>)o38);
                                                    if (invoke5 == coroutineSingletons5) {
                                                        return coroutineSingletons5;
                                                    }
                                                    final CoroutineSingletons coroutineSingletons13 = coroutineSingletons5;
                                                    separatorState2 = separatorState11;
                                                    final z z28 = z19;
                                                    o11 = o38;
                                                    final Integer n17 = n8;
                                                    pageEvent$Insert7 = l$7;
                                                    list4 = (ArrayList)o39;
                                                    o10 = l$11;
                                                    z3 = z28;
                                                    o9 = n17;
                                                    coroutineSingletons2 = coroutineSingletons13;
                                                    z2 = l$37;
                                                    o12 = invoke5;
                                                    break Label_4407;
                                                }
                                            }
                                            final LoadType a8 = pageEvent$Insert9.a;
                                            final LoadType prepend = LoadType.PREPEND;
                                            int n18;
                                            if (a8 == prepend) {
                                                n18 = z9.c;
                                            }
                                            else {
                                                n18 = z6.c;
                                            }
                                            int n20 = 0;
                                            Label_3806: {
                                                if (a8 == prepend) {
                                                    final List<Integer> d3 = z9.d;
                                                    Integer n19;
                                                    if (d3 == null) {
                                                        n19 = null;
                                                    }
                                                    else {
                                                        n19 = (Integer)CollectionsKt___CollectionsKt.K3((List)d3);
                                                    }
                                                    if (n19 == null) {
                                                        n20 = lw0.b.L0((List)z9.b);
                                                    }
                                                    else {
                                                        n20 = n19;
                                                    }
                                                }
                                                else {
                                                    final List<Integer> d4 = z6.d;
                                                    if (d4 != null) {
                                                        final Integer n21 = (Integer)CollectionsKt___CollectionsKt.A3((List)d4);
                                                        if (n21 != null) {
                                                            n20 = n21;
                                                            break Label_3806;
                                                        }
                                                    }
                                                    n20 = 0;
                                                }
                                            }
                                            SeparatorsKt.a(list6, o19, z9, (z<Object>)z6, n18, n20);
                                            final Object o58 = o17;
                                            l$8 = separatorState4;
                                            final PageEvent$Insert pageEvent$Insert19 = pageEvent$Insert9;
                                            n = i$6;
                                            o2 = o18;
                                            coroutineSingletons3 = coroutineSingletons4;
                                            l$4 = z9;
                                            l$5 = z6;
                                            iterator = iterator2;
                                            l$6 = o16;
                                            l$36 = z7;
                                            l$11 = o58;
                                            l$7 = pageEvent$Insert19;
                                        }
                                        if (l$5.b.isEmpty() ^ true) {
                                            l$8.getClass();
                                            ((ArrayList<z>)l$11).add(c(l$5));
                                        }
                                        final q<T, T, c<? super R>, Object> b18 = l$8.b;
                                        ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$0 = l$8;
                                        ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$1 = l$7;
                                        ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$2 = list6;
                                        ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$3 = l$11;
                                        ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$4 = l$36;
                                        ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$5 = l$6;
                                        ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$6 = iterator;
                                        ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$7 = l$5;
                                        ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$8 = l$4;
                                        ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).L$9 = list6;
                                        ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).Z$0 = (n2 != 0);
                                        ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).I$0 = n;
                                        ((SeparatorState$onInsert.SeparatorState$onInsert$1)o2).label = 7;
                                        Object b2 = SeparatorsKt.b((z<Object>)l$5, (q<? super Object, ? super Object, ? super lg2.c<? super Object>, ?>)b18, (lg2.c<? super z<Object>>)o2);
                                        if (b2 == coroutineSingletons3) {
                                            return coroutineSingletons3;
                                        }
                                        final ArrayList list16 = list6;
                                        Object o13 = list6;
                                        z z4 = l$36;
                                        Object o14 = l$11;
                                        Object o15 = list16;
                                        continue;
                                    }
                                }
                                final int c7 = z3.c;
                                final List<Integer> d5 = z3.d;
                                Integer n22;
                                if (d5 == null) {
                                    n22 = null;
                                }
                                else {
                                    n22 = (Integer)CollectionsKt___CollectionsKt.K3((List)d5);
                                }
                                int n23;
                                if (n22 == null) {
                                    n23 = lw0.b.L0((List)z3.b);
                                }
                                else {
                                    n23 = n22;
                                }
                                SeparatorsKt.a(list4, o12, z3, (z<Object>)z2, c7, n23);
                                separatorState19 = separatorState2;
                                pageEvent$Insert18 = pageEvent$Insert7;
                                o57 = list4;
                                o56 = o10;
                                o55 = o9;
                                n16 = n2;
                                coroutineSingletons8 = coroutineSingletons2;
                                o54 = o11;
                                n15 = n;
                                z27 = z3;
                            }
                            i$3 = (int)o55 + 1;
                            i$4 = lw0.b.L0(pageEvent$Insert18.b);
                            if (i$3 > i$4) {
                                n = n15;
                                o5 = o56;
                                o6 = o57;
                                l$2 = pageEvent$Insert18;
                                z = z27;
                                o43 = o54;
                                l$0 = separatorState19;
                                n2 = n16;
                                break Label_4874;
                            }
                            o5 = o56;
                            final PageEvent$Insert l$38 = pageEvent$Insert18;
                            l$3 = separatorState19;
                            z = z27;
                            n = n15;
                            final Object o59 = o57;
                            n2 = n16;
                            o8 = o54;
                            i$5 = i$3 + 1;
                            final z z29 = l$38.b.get(i$3);
                            final q<T, T, c<? super R>, Object> b19 = l$3.b;
                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o8).L$0 = l$3;
                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o8).L$1 = l$38;
                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o8).L$2 = o59;
                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o8).L$3 = o5;
                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o8).L$4 = z;
                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o8).L$5 = o59;
                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o8).L$6 = null;
                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o8).L$7 = null;
                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o8).L$8 = null;
                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o8).L$9 = null;
                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o8).Z$0 = (n2 != 0);
                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o8).I$0 = n;
                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o8).I$1 = i$5;
                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o8).I$2 = i$4;
                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o8).I$3 = i$3;
                            ((SeparatorState$onInsert.SeparatorState$onInsert$1)o8).label = 9;
                            b = SeparatorsKt.b((z<Object>)z29, (q<? super Object, ? super Object, ? super lg2.c<? super Object>, ?>)b19, (lg2.c<? super z<Object>>)o8);
                            if (b == coroutineSingletons8) {
                                return coroutineSingletons8;
                            }
                            list2 = (ArrayList)o59;
                            o7 = o59;
                            pageEvent$Insert4 = l$38;
                            coroutineSingletons = coroutineSingletons8;
                        }
                        ((ArrayList<CoroutineSingletons>)o7).add((CoroutineSingletons)b);
                        if (i$3 != i$4) {
                            i$3 = i$5;
                            coroutineSingletons8 = coroutineSingletons;
                            final PageEvent$Insert l$38 = pageEvent$Insert4;
                            final Object o59 = list2;
                            continue;
                        }
                        break;
                    }
                    final lg2.c<? super z<Object>> c8 = (lg2.c<? super z<Object>>)o8;
                    final SeparatorState separatorState20 = l$3;
                    final PageEvent$Insert pageEvent$Insert20 = pageEvent$Insert4;
                    o43 = c8;
                    o6 = list2;
                    l$0 = separatorState20;
                    coroutineSingletons8 = coroutineSingletons;
                    l$2 = pageEvent$Insert20;
                }
                if (n2 == 0 || l$0.j) {
                    break Label_5105;
                }
                l$0.j = true;
                if (n != 0) {
                    z = (z)CollectionsKt___CollectionsKt.K3((List)l$0.c);
                }
                else {
                    sg2.e.c((Object)z);
                }
                final q<T, T, c<? super R>, Object> b20 = l$0.b;
                final Object k6 = CollectionsKt___CollectionsKt.K3((List)z.b);
                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o43).L$0 = l$0;
                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o43).L$1 = l$2;
                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o43).L$2 = o6;
                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o43).L$3 = o5;
                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o43).L$4 = z;
                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o43).L$5 = o6;
                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o43).L$6 = null;
                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o43).L$7 = null;
                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o43).L$8 = null;
                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o43).L$9 = null;
                ((SeparatorState$onInsert.SeparatorState$onInsert$1)o43).label = 10;
                invoke = b20.invoke((T)k6, null, (c<? super R>)o43);
                if (invoke == coroutineSingletons8) {
                    return coroutineSingletons8;
                }
                o4 = o6;
            }
            Integer n24 = null;
            final int c9 = z.c;
            final List<Integer> d6 = z.d;
            if (d6 != null) {
                n24 = (Integer)CollectionsKt___CollectionsKt.K3((List)d6);
            }
            int n25;
            if (n24 == null) {
                n25 = lw0.b.L0((List)z.b);
            }
            else {
                n25 = n24;
            }
            SeparatorsKt.a((List<z<CoroutineSingletons>>)o4, (CoroutineSingletons)invoke, z, (z<Object>)null, c9, n25);
        }
        l$0.d = false;
        l$0.e = false;
        if (l$2.a == LoadType.APPEND) {
            l$0.c.addAll((Collection)o5);
        }
        else {
            l$0.c.addAll(0, (Collection)o5);
        }
        return new PageEvent$Insert(l$2.a, (List)o6, l$2.c, l$2.d, l$2.e, l$2.f);
    }
}
