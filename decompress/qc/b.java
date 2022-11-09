// 
// Decompiled by Procyon v0.6.0
// 

package qc;

import bd.d0;
import java.util.Collections;
import java.util.List;
import nc.f;

public final class b implements f
{
    public final /* synthetic */ int f;
    public final List g;
    
    public b(final List g, final int f) {
        this.f = f;
        if (f != 1) {
            this.g = g;
            return;
        }
        this.g = Collections.unmodifiableList((List<?>)g);
    }
    
    public final long a(final int n) {
        switch (this.f) {
            default: {
                d0.c(n == 0);
                return 0L;
            }
            case 0: {
                return 0L;
            }
        }
    }
    
    public final int c() {
        return 1;
    }
    
    public final int d(final long n) {
        final int f = this.f;
        int n2 = -1;
        switch (f) {
            default: {
                if (n < 0L) {
                    n2 = 0;
                }
                return n2;
            }
            case 0: {
                return -1;
            }
        }
    }
    
    public final List f(final long n) {
        switch (this.f) {
            default: {
                List<Object> list;
                if (n >= 0L) {
                    list = this.g;
                }
                else {
                    list = Collections.emptyList();
                }
                return list;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
