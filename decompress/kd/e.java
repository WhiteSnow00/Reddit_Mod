// 
// Decompiled by Procyon v0.6.0
// 

package kd;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

public final class e implements Comparator<Scope>
{
    @Override
    public final int compare(final Object o, final Object o2) {
        return ((Scope)o).g.compareTo(((Scope)o2).g);
    }
}
