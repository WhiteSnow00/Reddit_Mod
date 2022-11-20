// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.modifier;

import xd.a;
import java.util.HashSet;
import ng2.e;
import androidx.compose.ui.node.LayoutNode;
import d2.c;
import androidx.compose.ui.node.BackwardsCompatNode;
import kotlin.Pair;
import a1.d;
import e2.b0;

public final class ModifierLocalManager
{
    public final b0 a;
    public final d<Pair<BackwardsCompatNode, c<?>>> b;
    public final d<Pair<BackwardsCompatNode, c<?>>> c;
    public final d<Pair<LayoutNode, c<?>>> d;
    public boolean e;
    
    public ModifierLocalManager(final b0 a) {
        ng2.e.f((Object)a, "owner");
        this.a = a;
        this.b = (d<Pair<BackwardsCompatNode, c<?>>>)new d((Object[])new Pair[16]);
        this.c = (d<Pair<BackwardsCompatNode, c<?>>>)new d((Object[])new Pair[16]);
        this.d = (d<Pair<LayoutNode, c<?>>>)new d((Object[])new Pair[16]);
    }
    
    public static void b(j1.d.c c, final c c2, final HashSet set) {
        c = c.f;
        if (c.l) {
            final d d = new d((Object[])new j1.d.c[16]);
            final j1.d.c j = c.j;
            if (j == null) {
                a.o(d, c);
            }
            else {
                d.b((Object)j);
            }
        Label_0053:
            while (d.k()) {
                final j1.d.c c3 = (j1.d.c)d.n(d.h - 1);
                if ((c3.h & 0x20) != 0x0) {
                    d2.e e;
                    BackwardsCompatNode backwardsCompatNode;
                    boolean b = false;
                    for (c = c3; c != null; c = c.j) {
                        if ((c.g & 0x20) != 0x0) {
                            Label_0188: {
                                if (c instanceof d2.e) {
                                    e = (d2.e)c;
                                    if (e instanceof BackwardsCompatNode) {
                                        backwardsCompatNode = (BackwardsCompatNode)e;
                                        if (backwardsCompatNode.m instanceof d2.d && backwardsCompatNode.q.contains(c2)) {
                                            set.add(e);
                                        }
                                    }
                                    if (e.j().E(c2)) {
                                        b = false;
                                        break Label_0188;
                                    }
                                }
                                b = true;
                            }
                            if (!b) {
                                continue Label_0053;
                            }
                        }
                    }
                }
                a.o(d, c3);
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final void a() {
        if (!this.e) {
            this.e = true;
            this.a.u((mg2.a)new ModifierLocalManager$invalidate$1(this));
        }
    }
}
