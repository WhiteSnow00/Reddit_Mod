// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import l0.g;
import androidx.compose.ui.ComposedModifierKt;
import pg2.j;
import c2.l;
import i2.n;
import v0.r;
import androidx.compose.foundation.text.TextFieldState;
import mj2.c0;
import i2.o;
import kotlin.NoWhenBranchMatchedException;
import androidx.compose.foundation.text.Handle;
import n1.c;
import a80.a;
import z0.d$a;
import z0.o0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import u2.b;
import ah2.f;
import u2.i;
import z0.h0;
import kotlin.Metadata;
import j1.d;
import zg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lj1/d;", "invoke", "(Lj1/d;Lz0/d;I)Lj1/d;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class TextFieldSelectionManager_androidKt$textFieldMagnifier$1 extends Lambda implements q<d, z0.d, Integer, d>
{
    public final /* synthetic */ TextFieldSelectionManager $manager;
    
    public TextFieldSelectionManager_androidKt$textFieldMagnifier$1(final TextFieldSelectionManager $manager) {
        this.$manager = $manager;
        super(3);
    }
    
    public static final long access$invoke$lambda-1(final h0 h0) {
        return ((i)h0.getValue()).a;
    }
    
    public static final void access$invoke$lambda-2(final h0 h0, final long n) {
        h0.setValue(new i(n));
    }
    
    public final d invoke(d b, final z0.d d, final int n) {
        f.f((Object)b, "$this$composed");
        d.A(1980580247);
        final b b2 = (b)d.t(CompositionLocalsKt.e);
        d.A(-492369756);
        Object o;
        if ((o = d.B()) == d$a.a) {
            o = a.n0(new i(0L));
            d.v(o);
        }
        d.I();
        final h0 h0 = (h0)o;
        final zg2.a<c> a = (zg2.a<c>)new zg2.a<c>() {
            public final /* synthetic */ TextFieldSelectionManager $manager = TextFieldSelectionManager_androidKt$textFieldMagnifier$1.this.$manager;
            
            public final long invoke-F1C5BW0() {
                final TextFieldSelectionManager $manager = this.$manager;
                final long access$invoke$lambda-1 = TextFieldSelectionManager_androidKt$textFieldMagnifier$1.access$invoke$lambda-1(h0);
                f.f((Object)$manager, "manager");
                long n;
                if ($manager.j().a.f.length() == 0) {
                    n = c.d;
                }
                else {
                    final Handle handle = ((SnapshotMutableStateImpl<Handle>)$manager.o).getValue();
                    int n2;
                    if (handle == null) {
                        n2 = -1;
                    }
                    else {
                        n2 = TextFieldSelectionManagerKt$a.a[handle.ordinal()];
                    }
                    if (n2 != -1) {
                        int c;
                        if (n2 != 1 && n2 != 2) {
                            if (n2 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c = i2.o.c($manager.j().b);
                        }
                        else {
                            final long b = $manager.j().b;
                            final int c2 = i2.o.c;
                            c = (int)(b >> 32);
                        }
                        final int l = yl.a.L($manager.b.b(c), kotlin.text.b.k2((CharSequence)$manager.j().a.f));
                        final TextFieldState d = $manager.d;
                        if (d != null) {
                            final r c3 = d.c();
                            if (c3 != null) {
                                final n a = c3.a;
                                if (a != null) {
                                    final long b2 = a.b(l).b();
                                    final TextFieldState d2 = $manager.d;
                                    if (d2 != null) {
                                        final l f = d2.f;
                                        if (f != null) {
                                            final r c4 = d2.c();
                                            if (c4 != null) {
                                                final l b3 = c4.b;
                                                if (b3 != null) {
                                                    final c c5 = ((SnapshotMutableStateImpl<c>)$manager.p).getValue();
                                                    if (c5 == null) {
                                                        n = n1.c.d;
                                                        return n;
                                                    }
                                                    final float c6 = n1.c.c(b3.y(f, c5.a));
                                                    final int f2 = a.f(l);
                                                    final int j = a.j(f2);
                                                    final int e = a.e(f2, true);
                                                    final boolean b4 = (int)($manager.j().b >> 32) > i2.o.c($manager.j().b);
                                                    final float b5 = c0.B(a, j, true, b4);
                                                    final float b6 = c0.B(a, e, false, b4);
                                                    final float i = yl.a.J(c6, Math.min(b5, b6), Math.max(b5, b6));
                                                    if (Math.abs(c6 - i) > (int)(access$invoke$lambda-1 >> 32) / 2) {
                                                        n = n1.c.d;
                                                        return n;
                                                    }
                                                    n = f.y(b3, yd.a.y0(i, n1.c.d(b2)));
                                                    return n;
                                                }
                                            }
                                            n = n1.c.d;
                                            return n;
                                        }
                                    }
                                    n = n1.c.d;
                                    return n;
                                }
                            }
                        }
                        n = n1.c.d;
                    }
                    else {
                        n = c.d;
                    }
                }
                return n;
            }
        };
        final zg2.l<zg2.a<? extends c>, d> l = (zg2.l<zg2.a<? extends c>, d>)new zg2.l<zg2.a<? extends c>, d>() {
            public final d invoke(final zg2.a<c> a) {
                f.f((Object)a, "center");
                return androidx.compose.foundation.f.a((zg2.l)new zg2.l<b, c>() {
                    public final long invoke-tuRUvjQ(final b b) {
                        f.f((Object)b, "$this$magnifier");
                        return ((c)a.invoke()).a;
                    }
                }, m0.n.h, (zg2.l)new zg2.l<u2.f, j>() {
                    public final void invoke-EaSLcWc(final long n) {
                        final h0<i> $magnifierSize$delegate = h0;
                        final b $density = b2;
                        TextFieldSelectionManager_androidKt$textFieldMagnifier$1.access$invoke$lambda-2($magnifierSize$delegate, yl.a.c($density.s0(u2.f.b(n)), $density.s0(u2.f.a(n))));
                    }
                });
            }
        };
        final g a2 = SelectionMagnifierKt.a;
        b = ComposedModifierKt.b(b, (q)new SelectionMagnifierKt$animatedSelectionMagnifier$1((zg2.a<c>)a, (zg2.l<? super zg2.a<c>, ? extends d>)l));
        d.I();
        return b;
    }
}
