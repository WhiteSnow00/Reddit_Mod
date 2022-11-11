// 
// Decompiled by Procyon v0.6.0
// 

package c6;

import androidx.work.impl.utils.futures.a;
import java.util.UUID;
import d6.b;
import d6.f;
import java.util.List;
import java.util.Collections;
import androidx.work.d;
import androidx.work.ExistingWorkPolicy;

public abstract class m
{
    public final l a(final ExistingWorkPolicy existingWorkPolicy, final d d, final String s) {
        return this.b(s, existingWorkPolicy, Collections.singletonList(d));
    }
    
    public abstract f b(final String p0, final ExistingWorkPolicy p1, final List p2);
    
    public abstract b c(final String p0);
    
    public abstract b d(final UUID p0);
    
    public abstract j e(final String p0, final ExistingWorkPolicy p1, final List<d> p2);
    
    public final void f(final ExistingWorkPolicy existingWorkPolicy, final d d, final String s) {
        this.e(s, existingWorkPolicy, Collections.singletonList(d));
    }
    
    public abstract a g(final UUID p0);
}
