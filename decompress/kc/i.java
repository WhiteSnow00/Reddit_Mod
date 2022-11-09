// 
// Decompiled by Procyon v0.6.0
// 

package kc;

import java.util.Collection;
import com.google.common.collect.ImmutableList;

public final class i
{
    public final k a;
    public final ImmutableList<l> b;
    
    public i(final k a, final ImmutableList list) {
        this.a = a;
        this.b = (ImmutableList<l>)ImmutableList.copyOf((Collection)list);
    }
}
