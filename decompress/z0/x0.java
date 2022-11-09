// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import java.util.Iterator;
import androidx.compose.runtime.ComposerKt;
import ah2.f;
import java.util.ArrayList;
import bh2.a;

public final class x0 implements Iterable<Object>, a
{
    public int[] f;
    public int g;
    public Object[] h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public ArrayList<b> m;
    
    public x0() {
        this.f = new int[0];
        this.h = new Object[0];
        this.m = new ArrayList<b>();
    }
    
    public final int a(final b b) {
        ah2.f.f((Object)b, "anchor");
        if (!(this.k ^ true)) {
            ComposerKt.c("Use active SlotWriter to determine anchor location instead".toString());
            throw null;
        }
        if (b.a()) {
            return b.a;
        }
        throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
    }
    
    public final boolean b(final b b, int n) {
        final boolean k = this.k;
        boolean b2 = true;
        if (!(k ^ true)) {
            ComposerKt.c("Writer is active".toString());
            throw null;
        }
        if (n >= 0 && n < this.g) {
            if (this.g(b)) {
                final int q = at1.a.q(n, this.f);
                final int a = b.a;
                if (n <= a && a < q + n) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                if (n != 0) {
                    return b2;
                }
            }
            b2 = false;
            return b2;
        }
        ComposerKt.c("Invalid group index".toString());
        throw null;
    }
    
    public final w0 c() {
        if (!this.k) {
            ++this.j;
            return new w0(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending".toString());
    }
    
    public final y0 d() {
        if (!(this.k ^ true)) {
            ComposerKt.c("Cannot start a writer when another writer is pending".toString());
            throw null;
        }
        if (this.j <= 0) {
            this.k = true;
            ++this.l;
            return new y0(this);
        }
        ComposerKt.c("Cannot start a writer when a reader is pending".toString());
        throw null;
    }
    
    public final boolean g(final b b) {
        final boolean a = b.a();
        boolean b2 = true;
        if (a) {
            final int f1 = at1.a.F1((ArrayList)this.m, b.a, this.g);
            if (f1 >= 0 && ah2.f.a((Object)this.m.get(f1), (Object)b)) {
                return b2;
            }
        }
        b2 = false;
        return b2;
    }
    
    @Override
    public final Iterator<Object> iterator() {
        return new v(0, this.g, this);
    }
}
