// 
// Decompiled by Procyon v0.6.0
// 

package dg2;

import java.util.Comparator;
import java.util.Collections;
import ng2.e;
import java.util.List;

public class n extends m
{
    public static final <T extends Comparable<? super T>> void w4(final List<T> list) {
        e.f((Object)list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
    
    public static final <T> void x4(final List<T> list, final Comparator<? super T> comparator) {
        e.f((Object)list, "<this>");
        e.f((Object)comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
