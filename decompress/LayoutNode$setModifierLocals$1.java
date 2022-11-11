// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.node;

import d2.c;
import d2.b;
import androidx.compose.ui.platform.p0;
import m1.j;
import androidx.compose.ui.platform.InspectableValueKt;
import m1.l;
import m1.g;
import ah2.f;
import a1.e;
import kotlin.Metadata;
import j1.d;
import e2.i;
import zg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "Le2/i;", "lastProvider", "Lj1/d$b;", "mod", "invoke", "(Le2/i;Lj1/d$b;)Le2/i;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class LayoutNode$setModifierLocals$1 extends Lambda implements p<i, d.b, i>
{
    public final /* synthetic */ e<ModifierLocalConsumerEntity> $consumers;
    public final /* synthetic */ LayoutNode this$0;
    
    public LayoutNode$setModifierLocals$1(final LayoutNode this$0, final e<ModifierLocalConsumerEntity> $consumers) {
        this.this$0 = this$0;
        this.$consumers = $consumers;
        super(2);
    }
    
    public final i invoke(i j, final d.b b) {
        f.f((Object)j, "lastProvider");
        f.f((Object)b, "mod");
        i i = j;
        if (b instanceof g) {
            final LayoutNode this$0 = this.this$0;
            final g g = (g)b;
            final e<ModifierLocalConsumerEntity> $consumers = this.$consumers;
            final LayoutNode$b y = LayoutNode.Y;
            this$0.getClass();
            final int h = $consumers.h;
            final l l = null;
            ModifierLocalConsumerEntity modifierLocalConsumerEntity = null;
            Label_0162: {
                if (h > 0) {
                    final ModifierLocalConsumerEntity[] f = $consumers.f;
                    int n = 0;
                    do {
                        modifierLocalConsumerEntity = f[n];
                        final b g2 = modifierLocalConsumerEntity.g;
                        boolean b2 = false;
                        Label_0135: {
                            if (g2 instanceof l) {
                                final zg2.l<j, pg2.j> g3 = ((l)g2).g;
                                if (g3 instanceof m1.i && ((m1.i)g3).f == g) {
                                    b2 = true;
                                    break Label_0135;
                                }
                            }
                            b2 = false;
                        }
                        if (b2) {
                            break Label_0162;
                        }
                    } while (++n < h);
                }
                modifierLocalConsumerEntity = null;
            }
            final ModifierLocalConsumerEntity modifierLocalConsumerEntity2 = modifierLocalConsumerEntity;
            b g4;
            if (modifierLocalConsumerEntity2 != null) {
                g4 = modifierLocalConsumerEntity2.g;
            }
            else {
                g4 = null;
            }
            l k = l;
            if (g4 instanceof l) {
                k = (l)g4;
            }
            l m;
            if ((m = k) == null) {
                m = new l((zg2.l<? super j, pg2.j>)new m1.i(g), (zg2.l<? super p0, pg2.j>)InspectableValueKt.a);
            }
            LayoutNode.i(this.this$0, (b)m, j, (e)this.$consumers);
            i = LayoutNode.j(this.this$0, (c)m, j);
        }
        if (b instanceof b) {
            LayoutNode.i(this.this$0, (b)b, i, (e)this.$consumers);
        }
        j = i;
        if (b instanceof c) {
            j = LayoutNode.j(this.this$0, (c)b, i);
        }
        return j;
    }
}
