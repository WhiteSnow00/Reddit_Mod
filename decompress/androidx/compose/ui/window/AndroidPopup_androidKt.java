// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.window;

import z0.r0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import z0.h0;
import z0.g;
import z0.f1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.k1;
import tg2.c;
import zg2.l;
import z0.s;
import kotlin.jvm.internal.Lambda;
import z0.e1;
import z0.d$a;
import java.util.UUID;
import androidx.compose.ui.unit.LayoutDirection;
import u2.b;
import androidx.compose.ui.platform.CompositionLocalsKt;
import z0.o0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import android.view.View;
import ah2.f;
import zg2.p;
import w2.e;
import pg2.j;
import w2.d;
import zg2.a;
import androidx.compose.runtime.CompositionLocalKt;
import z0.r;

public final class AndroidPopup_androidKt
{
    public static final r a;
    
    static {
        a = CompositionLocalKt.c((a)AndroidPopup_androidKt$LocalPopupTestTag.AndroidPopup_androidKt$LocalPopupTestTag$1.INSTANCE);
    }
    
    public static final void a(final d d, a<j> a, final e e, final p<? super z0.d, ? super Integer, j> p7, final z0.d d2, final int n, final int n2) {
        f.f((Object)d, "popupPositionProvider");
        f.f((Object)p7, "content");
        final ComposerImpl r = d2.r(-830247068);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (r.l((Object)d)) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n3 = (n4 | n);
        }
        else {
            n3 = n;
        }
        final int n5 = n2 & 0x2;
        int n8 = 0;
        Label_0147: {
            int n6;
            if (n5 != 0) {
                n6 = (n3 | 0x30);
            }
            else {
                n6 = n3;
                if ((n & 0x70) == 0x0) {
                    int n7;
                    if (r.l((Object)a)) {
                        n7 = 32;
                    }
                    else {
                        n7 = 16;
                    }
                    n8 = (n3 | n7);
                    break Label_0147;
                }
            }
            n8 = n6;
        }
        if ((n & 0x380) == 0x0) {
            int n9;
            if ((n2 & 0x4) == 0x0 && r.l((Object)e)) {
                n9 = 256;
            }
            else {
                n9 = 128;
            }
            n8 |= n9;
        }
        int n10;
        if ((n2 & 0x8) != 0x0) {
            n10 = (n8 | 0xC00);
        }
        else {
            n10 = n8;
            if ((n & 0x1C00) == 0x0) {
                int n11;
                if (r.l((Object)p7)) {
                    n11 = 2048;
                }
                else {
                    n11 = 1024;
                }
                n10 = (n8 | n11);
            }
        }
        e e2;
        if ((n10 & 0x16DB) == 0x492 && r.b()) {
            r.j();
            e2 = e;
        }
        else {
            r.v0();
            a<j> a3 = null;
            e e4 = null;
            Label_0368: {
                a<j> a2;
                if ((n & 0x1) != 0x0 && !r.Y()) {
                    r.j();
                    a2 = a;
                }
                else {
                    if (n5 != 0) {
                        a = null;
                    }
                    a2 = a;
                    if ((n2 & 0x4) != 0x0) {
                        final e e3 = new e(false, false, false, 63);
                        a3 = a;
                        e4 = e3;
                        break Label_0368;
                    }
                }
                e4 = e;
                a3 = a2;
            }
            r.S();
            final View view = (View)r.t((o0)AndroidCompositionLocals_androidKt.f);
            final f1 e5 = CompositionLocalsKt.e;
            final b b = (b)r.t((o0)e5);
            final String s = (String)r.t((o0)AndroidPopup_androidKt.a);
            final f1 k = CompositionLocalsKt.k;
            final LayoutDirection layoutDirection = (LayoutDirection)r.t((o0)k);
            final g z0 = yl.a.Z0((z0.d)r);
            final h0 v0 = a80.a.v0(p7, (z0.d)r);
            final UUID uuid = (UUID)androidx.compose.runtime.saveable.b.a(new Object[0], (h1.e)null, (a)AndroidPopup_androidKt$Popup$popupId.AndroidPopup_androidKt$Popup$popupId$1.INSTANCE, (z0.d)r, 6);
            r.A(-492369756);
            Object c0;
            if ((c0 = r.c0()) == d$a.a) {
                f.e((Object)uuid, "popupId");
                c0 = new PopupLayout(a3, e4, s, view, b, d, uuid);
                ((PopupLayout)c0).k(z0, at1.a.b0((Lambda)new AndroidPopup_androidKt$Popup$popupLayout$1$1.AndroidPopup_androidKt$Popup$popupLayout$1$1$1((PopupLayout)c0, (e1)v0), 1302892335, true));
                r.I0(c0);
            }
            r.R(false);
            final PopupLayout popupLayout = (PopupLayout)c0;
            z0.s.c(popupLayout, (l)new AndroidPopup_androidKt$Popup.AndroidPopup_androidKt$Popup$2(popupLayout, (a)a3, e4, s, layoutDirection), (z0.d)r);
            z0.s.h((a)new AndroidPopup_androidKt$Popup.AndroidPopup_androidKt$Popup$3(popupLayout, (a)a3, e4, s, layoutDirection), (z0.d)r);
            z0.s.c(d, (l)new AndroidPopup_androidKt$Popup.AndroidPopup_androidKt$Popup$4(popupLayout, d), (z0.d)r);
            z0.s.f(popupLayout, (p)new AndroidPopup_androidKt$Popup.AndroidPopup_androidKt$Popup$5(popupLayout, (c)null), (z0.d)r);
            final j1.d n12 = at1.a.n1((j1.d)d.a.f, (l)new AndroidPopup_androidKt$Popup.AndroidPopup_androidKt$Popup$7(popupLayout));
            final AndroidPopup_androidKt$Popup.AndroidPopup_androidKt$Popup$8 androidPopup_androidKt$Popup$8 = new AndroidPopup_androidKt$Popup.AndroidPopup_androidKt$Popup$8(popupLayout, layoutDirection);
            r.A(-1323940314);
            final b b2 = (b)r.t((o0)e5);
            final LayoutDirection layoutDirection2 = (LayoutDirection)r.t((o0)k);
            final k1 k2 = (k1)r.t((o0)CompositionLocalsKt.o);
            ComposeUiNode.w2.getClass();
            final a b3 = ComposeUiNode$Companion.b;
            final ComposableLambdaImpl b4 = LayoutKt.b(n12);
            if (!(r.a instanceof z0.c)) {
                yl.a.B0();
                throw null;
            }
            r.h();
            if (r.K) {
                r.i(b3);
            }
            else {
                r.e();
            }
            r.x = false;
            Updater.b((z0.d)r, (Object)androidPopup_androidKt$Popup$8, ComposeUiNode$Companion.e);
            Updater.b((z0.d)r, (Object)b2, ComposeUiNode$Companion.d);
            Updater.b((z0.d)r, (Object)layoutDirection2, ComposeUiNode$Companion.f);
            b.p(0, b4, a.m(r, k2, ComposeUiNode$Companion.g, r), r, 2058660585, 2085825549);
            d.x(r, false, false, true, false);
            e2 = e4;
            a = a3;
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super z0.d, ? super Integer, j>)new AndroidPopup_androidKt$Popup.AndroidPopup_androidKt$Popup$9(d, (a)a, e2, (p)p7, n, n2);
        }
    }
}
