// 
// Decompiled by Procyon v0.6.0
// 

package m1;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.focus.FocusModifier;
import a1.e;

public final class m
{
    public static final m b;
    public final e<o> a;
    
    static {
        b = new m();
    }
    
    public m() {
        this.a = (e<o>)new e((Object[])new o[16]);
    }
    
    public final void a() {
        if (this.a.k()) {
            final e<o> a = this.a;
            final int h = a.h;
            if (h > 0) {
                final Object[] f = a.f;
                int n = 0;
                do {
                    final e<FocusModifier> g = ((o)f[n]).g;
                    final int h2 = g.h;
                    FocusModifier focusModifier = null;
                    FocusModifier focusModifier2 = null;
                    if (h2 > 0) {
                        final Object[] f2 = g.f;
                        int n2 = 0;
                        int n3;
                        do {
                            final FocusModifier focusModifier3 = (FocusModifier)f2[n2];
                            Label_0290: {
                                if (focusModifier2 != null) {
                                    final LayoutNodeWrapper q = focusModifier2.q;
                                    if (q != null) {
                                        final LayoutNode j = q.j;
                                        if (j != null) {
                                            final LayoutNodeWrapper q2 = focusModifier3.q;
                                            focusModifier = focusModifier2;
                                            if (q2 == null) {
                                                break Label_0290;
                                            }
                                            final LayoutNode i = q2.j;
                                            LayoutNode t = j;
                                            if (i == null) {
                                                focusModifier = focusModifier2;
                                                break Label_0290;
                                            }
                                            LayoutNode t2;
                                            while (true) {
                                                t2 = i;
                                                if (t.m <= i.m) {
                                                    break;
                                                }
                                                t = t.t();
                                                sg2.e.c((Object)t);
                                            }
                                            LayoutNode t3;
                                            LayoutNode t4;
                                            while (true) {
                                                t3 = t;
                                                t4 = t2;
                                                if (t2.m <= t.m) {
                                                    break;
                                                }
                                                t2 = t2.t();
                                                sg2.e.c((Object)t2);
                                            }
                                            while (!sg2.e.a((Object)t3.t(), (Object)t4.t())) {
                                                t3 = t3.t();
                                                sg2.e.c((Object)t3);
                                                t4 = t4.t();
                                                sg2.e.c((Object)t4);
                                            }
                                            final LayoutNode t5 = t3.t();
                                            sg2.e.c((Object)t5);
                                            final e v = t5.v();
                                            if (v.i((Object)t3) < v.i((Object)t4)) {
                                                focusModifier = focusModifier2;
                                                break Label_0290;
                                            }
                                        }
                                    }
                                }
                                focusModifier = focusModifier3;
                            }
                            n3 = n2 + 1;
                            focusModifier2 = focusModifier;
                        } while ((n2 = n3) < h2);
                    }
                    if (focusModifier != null) {
                        q.f(focusModifier);
                    }
                } while (++n < h);
            }
            return;
        }
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
    }
}
