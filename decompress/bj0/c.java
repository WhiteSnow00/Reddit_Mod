// 
// Decompiled by Procyon v0.6.0
// 

package bj0;

import sg2.e;
import com.reddit.experiments.data.local.db.ExperimentsDataModelType;

public final class c
{
    public final ExperimentsDataModelType a;
    public final String b;
    public final long c;
    
    public c(final ExperimentsDataModelType a, final String b, final long c) {
        e.f((Object)a, "type");
        e.f((Object)b, "experimentsJson");
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
