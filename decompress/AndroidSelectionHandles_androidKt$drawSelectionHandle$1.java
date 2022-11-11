// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text.selection;

import androidx.compose.ui.draw.DrawModifierKt;
import q1.e;
import o1.w;
import o1.s;
import pg2.j;
import q1.c;
import o1.s$a;
import l1.g;
import l1.b;
import z0.o0;
import w0.l;
import ah2.f;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import j1.d;
import zg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lj1/d;", "invoke", "(Lj1/d;Lz0/d;I)Lj1/d;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class AndroidSelectionHandles_androidKt$drawSelectionHandle$1 extends Lambda implements q<d, z0.d, Integer, d>
{
    public final /* synthetic */ ResolvedTextDirection $direction;
    public final /* synthetic */ boolean $handlesCrossed;
    public final /* synthetic */ boolean $isStartHandle;
    
    public AndroidSelectionHandles_androidKt$drawSelectionHandle$1(final boolean $isStartHandle, final ResolvedTextDirection $direction, final boolean $handlesCrossed) {
        this.$isStartHandle = $isStartHandle;
        this.$direction = $direction;
        this.$handlesCrossed = $handlesCrossed;
        super(3);
    }
    
    public final d invoke(d f0, final z0.d d, final int n) {
        f.f((Object)f0, "$this$composed");
        d.A(-1538687176);
        f0 = f0.f0(DrawModifierKt.b((d)d.a.f, (zg2.l)new zg2.l<b, g>() {
            public final /* synthetic */ ResolvedTextDirection $direction = AndroidSelectionHandles_androidKt$drawSelectionHandle$1.this.$direction;
            public final /* synthetic */ long $handleColor = ((l)d.t(TextSelectionColorsKt.a)).a;
            public final /* synthetic */ boolean $handlesCrossed = AndroidSelectionHandles_androidKt$drawSelectionHandle$1.this.$handlesCrossed;
            public final /* synthetic */ boolean $isStartHandle = AndroidSelectionHandles_androidKt$drawSelectionHandle$1.this.$isStartHandle;
            
            public final g invoke(final b b) {
                f.f((Object)b, "$this$drawWithCache");
                return b.c((zg2.l<? super c, j>)new zg2.l<c, j>() {
                    public final /* synthetic */ s $colorFilter = s$a.a(5, AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1.this.$handleColor);
                    public final /* synthetic */ ResolvedTextDirection $direction = AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1.this.$direction;
                    public final /* synthetic */ w $handleImage = AndroidSelectionHandles_androidKt.d(b, n1.f.e(b.b()) / 2.0f);
                    public final /* synthetic */ boolean $handlesCrossed = AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1.this.$handlesCrossed;
                    public final /* synthetic */ boolean $isStartHandle = AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1.this.$isStartHandle;
                    
                    public final void invoke(final c c) {
                        f.f((Object)c, "$this$onDrawWithContent");
                        c.c0();
                        final boolean $isStartHandle = this.$isStartHandle;
                        final ResolvedTextDirection $direction = this.$direction;
                        final boolean $handlesCrossed = this.$handlesCrossed;
                        final boolean b = true;
                        int n = 0;
                        Label_0130: {
                            if ($isStartHandle) {
                                f.f((Object)$direction, "direction");
                                if ($direction == ResolvedTextDirection.Ltr) {
                                    n = (b ? 1 : 0);
                                    if (!$handlesCrossed) {
                                        break Label_0130;
                                    }
                                }
                                if ($direction == ResolvedTextDirection.Rtl && $handlesCrossed) {
                                    n = (b ? 1 : 0);
                                    break Label_0130;
                                }
                            }
                            else {
                                f.f((Object)$direction, "direction");
                                if (($direction != ResolvedTextDirection.Ltr || $handlesCrossed) && ($direction != ResolvedTextDirection.Rtl || !$handlesCrossed)) {
                                    n = (b ? 1 : 0);
                                    break Label_0130;
                                }
                            }
                            n = 0;
                        }
                        if (n != 0) {
                            final w $handleImage = this.$handleImage;
                            final s $colorFilter = this.$colorFilter;
                            final long z = c.Z();
                            final q1.d y = c.Y();
                            final long b2 = y.b();
                            y.a().save();
                            y.a.e(-1.0f, 1.0f, z);
                            e.A0(c, $handleImage, $colorFilter);
                            y.a().restore();
                            y.c(b2);
                        }
                        else {
                            e.A0(c, this.$handleImage, this.$colorFilter);
                        }
                    }
                });
            }
        }));
        d.I();
        return f0;
    }
}
