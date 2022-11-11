// 
// Decompiled by Procyon v0.6.0
// 

package c5;

import kotlin.NoWhenBranchMatchedException;
import sg2.e;
import androidx.paging.LoadType;

public final class n
{
    public k a;
    public k b;
    public k c;
    
    public n() {
        final k.c c = k.c.c;
        this.a = c;
        this.b = c;
        this.c = c;
    }
    
    public final k a(final LoadType loadType) {
        e.f((Object)loadType, "loadType");
        final int n = c5.n.a.a[loadType.ordinal()];
        k k;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                k = this.b;
            }
            else {
                k = this.c;
            }
        }
        else {
            k = this.a;
        }
        return k;
    }
    
    public final void b(final LoadType loadType, final k a) {
        e.f((Object)loadType, "type");
        e.f((Object)a, "state");
        final int n = c5.n.a.a[loadType.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                this.b = a;
            }
            else {
                this.c = a;
            }
        }
        else {
            this.a = a;
        }
    }
    
    public final void c(final l l) {
        e.f((Object)l, "states");
        this.a = l.a;
        this.c = l.c;
        this.b = l.b;
    }
    
    public final l d() {
        return new l(this.a, this.b, this.c);
    }
}
