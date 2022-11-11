// 
// Decompiled by Procyon v0.6.0
// 

package androidx.paging;

import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import lg2.c;
import rg2.q;
import lw0.b;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.LinkedHashSet;
import bg.d;
import java.util.Arrays;
import sg2.e;
import c5.z;
import java.util.List;

public final class SeparatorsKt
{
    public static final <R, T extends R> void a(final List<z<R>> list, final R r, final z<T> z, final z<T> z2, final int n, final int n2) {
        e.f((Object)list, "<this>");
        final int[] array = null;
        int[] array2;
        if (z == null) {
            array2 = null;
        }
        else {
            array2 = z.a;
        }
        int[] a;
        if (z2 == null) {
            a = array;
        }
        else {
            a = z2.a;
        }
        if (array2 != null && a != null) {
            final int length = array2.length;
            final int length2 = a.length;
            final int[] copy = Arrays.copyOf(array2, length + length2);
            int i = 0;
            System.arraycopy(a, 0, copy, length, length2);
            e.e((Object)copy, "result");
            final LinkedHashSet set = new LinkedHashSet(d.o0(copy.length));
            while (i < copy.length) {
                set.add((Object)copy[i]);
                ++i;
            }
            array2 = CollectionsKt___CollectionsKt.p4((Collection)CollectionsKt___CollectionsKt.e4((Collection)CollectionsKt___CollectionsKt.q4((Iterable)set)));
        }
        else if (array2 == null && a != null) {
            array2 = a;
        }
        else if (array2 == null || a != null) {
            throw new IllegalArgumentException("Separator page expected adjacentPageBefore or adjacentPageAfter, but both were null.");
        }
        if (r != null) {
            list.add((z)new z(array2, b.r1((Object)r), n, b.r1((Object)n2)));
        }
    }
    
    public static final <R, T extends R> Object b(final z<T> z, final q<? super T, ? super T, ? super c<? super R>, ?> q, final c<? super z<R>> c) {
        SeparatorsKt$insertInternalSeparators.SeparatorsKt$insertInternalSeparators$1 separatorsKt$insertInternalSeparators$2 = null;
        Label_0049: {
            if (c instanceof SeparatorsKt$insertInternalSeparators.SeparatorsKt$insertInternalSeparators$1) {
                final SeparatorsKt$insertInternalSeparators.SeparatorsKt$insertInternalSeparators$1 separatorsKt$insertInternalSeparators$1 = (SeparatorsKt$insertInternalSeparators.SeparatorsKt$insertInternalSeparators$1)c;
                final int label = separatorsKt$insertInternalSeparators$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    separatorsKt$insertInternalSeparators$1.label = label + Integer.MIN_VALUE;
                    separatorsKt$insertInternalSeparators$2 = separatorsKt$insertInternalSeparators$1;
                    break Label_0049;
                }
            }
            separatorsKt$insertInternalSeparators$2 = new SeparatorsKt$insertInternalSeparators.SeparatorsKt$insertInternalSeparators$1((c)c);
        }
        Object o = separatorsKt$insertInternalSeparators$2.result;
        CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = separatorsKt$insertInternalSeparators$2.label;
        List<E> list3 = null;
        ArrayList<Integer> list4 = null;
        z<T> z4 = null;
        Label_0560: {
            Object l$5 = null;
            Object o2 = null;
            z<T> z3 = null;
            while (true) {
                int i$2 = 0;
                int i$3 = 0;
                int i$4 = 0;
                Object l$4 = null;
                q<? super T, ? super T, ? super c<? super R>, ?> q2 = null;
                SeparatorsKt$insertInternalSeparators.SeparatorsKt$insertInternalSeparators$1 separatorsKt$insertInternalSeparators$3 = null;
                Label_0474: {
                    List<E> l$6;
                    SeparatorsKt$insertInternalSeparators.SeparatorsKt$insertInternalSeparators$1 separatorsKt$insertInternalSeparators$4;
                    q<? super T, ? super T, ? super c<? super R>, ?> l$7;
                    z<T> l$8;
                    CoroutineSingletons coroutineSingletons2;
                    if (label2 != 0) {
                        if (label2 == 1) {
                            i$2 = separatorsKt$insertInternalSeparators$2.I$2;
                            i$3 = separatorsKt$insertInternalSeparators$2.I$1;
                            i$4 = separatorsKt$insertInternalSeparators$2.I$0;
                            l$4 = separatorsKt$insertInternalSeparators$2.L$4;
                            l$5 = separatorsKt$insertInternalSeparators$2.L$3;
                            o2 = separatorsKt$insertInternalSeparators$2.L$2;
                            q2 = (q)separatorsKt$insertInternalSeparators$2.L$1;
                            final z z2 = (z)separatorsKt$insertInternalSeparators$2.L$0;
                            yd.b.k0(o);
                            separatorsKt$insertInternalSeparators$3 = separatorsKt$insertInternalSeparators$2;
                            z3 = z2;
                            break Label_0474;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        yd.b.k0(o);
                        if (z.b.isEmpty()) {
                            return z;
                        }
                        final int n = z.b.size() + 4;
                        final ArrayList list = new ArrayList<Object>(n);
                        final ArrayList list2 = new ArrayList<Integer>(n);
                        list.add(CollectionsKt___CollectionsKt.A3((List)z.b));
                        final List<Integer> d = z.d;
                        int intValue = 0;
                        if (d != null) {
                            final Integer n2 = (Integer)CollectionsKt___CollectionsKt.A3((List)d);
                            if (n2 != null) {
                                intValue = n2;
                            }
                        }
                        list2.add(new Integer(intValue));
                        i$3 = z.b.size();
                        list3 = list;
                        list4 = (ArrayList<Integer>)list2;
                        z4 = z;
                        if (1 >= i$3) {
                            break Label_0560;
                        }
                        l$6 = list;
                        final CoroutineSingletons coroutineSingletons = coroutine_SUSPENDED;
                        separatorsKt$insertInternalSeparators$4 = separatorsKt$insertInternalSeparators$2;
                        i$4 = 1;
                        l$7 = q;
                        l$8 = z;
                        l$5 = list2;
                        coroutineSingletons2 = coroutineSingletons;
                    }
                    final int i$5 = i$4 + 1;
                    l$4 = l$8.b.get(i$4);
                    final R value = l$8.b.get(i$4 - 1);
                    separatorsKt$insertInternalSeparators$4.L$0 = l$8;
                    separatorsKt$insertInternalSeparators$4.L$1 = l$7;
                    separatorsKt$insertInternalSeparators$4.L$2 = l$6;
                    separatorsKt$insertInternalSeparators$4.L$3 = l$5;
                    separatorsKt$insertInternalSeparators$4.L$4 = l$4;
                    separatorsKt$insertInternalSeparators$4.I$0 = i$5;
                    separatorsKt$insertInternalSeparators$4.I$1 = i$3;
                    separatorsKt$insertInternalSeparators$4.I$2 = i$4;
                    separatorsKt$insertInternalSeparators$4.label = 1;
                    o = l$7.invoke((Object)value, (Object)l$4, (Object)separatorsKt$insertInternalSeparators$4);
                    if (o == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    final q<? super T, ? super T, ? super c<? super R>, ?> q3 = l$7;
                    final CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                    z3 = l$8;
                    i$2 = i$4;
                    o2 = l$6;
                    q2 = q3;
                    coroutine_SUSPENDED = coroutineSingletons3;
                    i$4 = i$5;
                    separatorsKt$insertInternalSeparators$3 = separatorsKt$insertInternalSeparators$4;
                }
                if (o != null) {
                    ((ArrayList<CoroutineSingletons>)o2).add((CoroutineSingletons)o);
                    ((ArrayList<Integer>)l$5).add(new Integer(i$2));
                }
                ((ArrayList<CoroutineSingletons>)o2).add((CoroutineSingletons)l$4);
                ((ArrayList<Integer>)l$5).add(new Integer(i$2));
                if (i$4 < i$3) {
                    final q<? super T, ? super T, ? super c<? super R>, ?> q4 = q2;
                    final List<E> l$6 = (List<E>)o2;
                    final SeparatorsKt$insertInternalSeparators.SeparatorsKt$insertInternalSeparators$1 separatorsKt$insertInternalSeparators$4 = separatorsKt$insertInternalSeparators$3;
                    final CoroutineSingletons coroutineSingletons2 = coroutine_SUSPENDED;
                    final z<T> l$8 = z3;
                    final q<? super T, ? super T, ? super c<? super R>, ?> l$7 = q4;
                    continue;
                }
                break;
            }
            list3 = (List<E>)o2;
            list4 = (ArrayList<Integer>)l$5;
            z4 = z3;
        }
        if (((ArrayList)list3).size() != z4.b.size()) {
            z4 = new z<T>(z4.a, list3, z4.c, list4);
        }
        return z4;
    }
}
