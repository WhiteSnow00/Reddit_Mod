// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.common;

import java.util.ArrayList;

public final class ArrayListAccumulator<E> extends ArrayList<E> implements Accumulator<E>
{
    public void store(final E e) {
        this.add(e);
    }
}
