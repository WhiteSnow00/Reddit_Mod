// 
// Decompiled by Procyon v0.6.0
// 

package e2;

import d2.d;
import ah2.f;
import androidx.compose.ui.node.ModifierLocalConsumerEntity;
import a1.e;
import d2.c;
import androidx.compose.ui.node.LayoutNode;
import pg2.j;
import zg2.a;

public final class i implements a<j>
{
    public final LayoutNode f;
    public final c<?> g;
    public i h;
    public i i;
    public boolean j;
    public final e<ModifierLocalConsumerEntity> k;
    
    public i(final LayoutNode f, final c<?> g) {
        ah2.f.f((Object)f, "layoutNode");
        ah2.f.f((Object)g, "modifier");
        this.f = f;
        this.g = g;
        this.k = new e<ModifierLocalConsumerEntity>(new ModifierLocalConsumerEntity[16]);
    }
    
    public final void a() {
        this.j = false;
        final e<ModifierLocalConsumerEntity> k = this.k;
        final int h = k.h;
        if (h > 0) {
            final ModifierLocalConsumerEntity[] f = k.f;
            int n = 0;
            do {
                final ModifierLocalConsumerEntity modifierLocalConsumerEntity = f[n];
                modifierLocalConsumerEntity.g.C0((d)ModifierLocalConsumerEntity.k);
                modifierLocalConsumerEntity.i = false;
            } while (++n < h);
        }
        this.c(this.g.getKey(), false);
    }
    
    public final c b(final d2.e e) {
        ah2.f.f((Object)e, "local");
        if (ah2.f.a((Object)this.g.getKey(), (Object)e)) {
            return this.g;
        }
        final i i = this.i;
        c c;
        if (i == null || (c = i.b(e)) == null) {
            final LayoutNode s = this.f.s();
            if (s != null) {
                final i o = s.O;
                if (o != null) {
                    c = o.b(e);
                    return c;
                }
            }
            c = null;
        }
        return c;
    }
    
    public final void c(final d2.e e, final boolean b) {
        if (b && ah2.f.a((Object)this.g.getKey(), (Object)e)) {
            return;
        }
        final e<ModifierLocalConsumerEntity> k = this.k;
        final int h = k.h;
        final int n = 0;
        if (h > 0) {
            final ModifierLocalConsumerEntity[] f = k.f;
            int n2 = 0;
            do {
                final ModifierLocalConsumerEntity modifierLocalConsumerEntity = f[n2];
                modifierLocalConsumerEntity.getClass();
                ah2.f.f((Object)e, "local");
                if (modifierLocalConsumerEntity.h.f(e)) {
                    final m l = modifierLocalConsumerEntity.f.f.l;
                    if (l == null) {
                        continue;
                    }
                    l.v((a)modifierLocalConsumerEntity);
                }
            } while (++n2 < h);
        }
        final i h2 = this.h;
        j a;
        if (h2 != null) {
            h2.c(e, true);
            a = pg2.j.a;
        }
        else {
            a = null;
        }
        if (a == null) {
            final e v = this.f.v();
            final int h3 = v.h;
            if (h3 > 0) {
                final T[] f2 = v.f;
                int n3 = n;
                do {
                    ((LayoutNode)f2[n3]).N.c(e, true);
                } while (++n3 < h3);
            }
        }
    }
    
    public final Object invoke() {
        if (this.j) {
            this.c(this.g.getKey(), false);
        }
        return pg2.j.a;
    }
}
