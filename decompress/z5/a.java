// 
// Decompiled by Procyon v0.6.0
// 

package z5;

import java.util.Comparator;

public final class a implements Comparator<int[]>
{
    @Override
    public final int compare(final Object o, final Object o2) {
        return ((int[])o)[0] - ((int[])o2)[0];
    }
}
