// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.common;

import java.util.RandomAccess;
import java.util.Collections;
import java.util.List;

public final class ListUtil
{
    private ListUtil() {
    }
    
    public static <T> List<T> copyToImmutableList(final List<T> list) {
        if (list instanceof ImmutableList) {
            return list;
        }
        final int size = list.size();
        if (size == 0) {
            return Collections.emptyList();
        }
        if (size == 1) {
            return (List<T>)new ListUtil.ListUtil$OneItemImmutableList(list.get(0));
        }
        if (size == 2) {
            return (List<T>)new ListUtil.ListUtil$TwoItemImmutableList(list.get(0), list.get(1));
        }
        if (size == 3) {
            return (List<T>)new ListUtil.ListUtil$ThreeItemImmutableList(list.get(0), list.get(1), list.get(2));
        }
        if (size == 4) {
            return (List<T>)new ListUtil.ListUtil$FourItemImmutableList(list.get(0), list.get(1), list.get(2), list.get(3));
        }
        if (size != 5) {
            return (List<T>)new ListUtil.ListUtil$ImmutableArrayList(list.toArray());
        }
        return (List<T>)new ListUtil.ListUtil$FiveItemImmutableList(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4));
    }
    
    public static <T> boolean identityEquals(final List<? extends T> list, final List<? extends T> list2) {
        if (list == list2) {
            return true;
        }
        final int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < size; ++i) {
            if (list.get(i) != list2.get(i)) {
                return false;
            }
        }
        return true;
    }
    
    public static <T> List<T> newImmutableList(final T t) {
        return (List<T>)new ListUtil.ListUtil$OneItemImmutableList((Object)t);
    }
    
    public static <T> List<T> newImmutableList(final T t, final T t2) {
        return (List<T>)new ListUtil.ListUtil$TwoItemImmutableList((Object)t, (Object)t2);
    }
    
    public interface ImmutableList<E> extends List<E>, RandomAccess
    {
    }
}
