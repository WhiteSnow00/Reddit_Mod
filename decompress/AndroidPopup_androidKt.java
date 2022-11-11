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
import androidx.compose.ui.platform.h1;
import lg2.c;
import rg2.l;
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
import rg2.p;
import w2.e;
import hg2.j;
import w2.d;
import rg2.a;
import androidx.compose.runtime.CompositionLocalKt;
import z0.r;

public final class AndroidPopup_androidKt
{
    public static final r a;
    
    static {
        a = CompositionLocalKt.c((a)AndroidPopup_androidKt$LocalPopupTestTag.AndroidPopup_androidKt$LocalPopupTestTag$1.INSTANCE);
    }
    
    public static final void a(final d d, a<j> a, final e e, final p<? super z0.d, ? super Integer, j> p7, final z0.d d2, final int n, final int n2) {
        sg2.e.f((Object)d, "popupPositionProvider");
        sg2.e.f((Object)p7, "content");
        final ComposerImpl s = d2.s(-830247068);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (s.m((Object)d)) {
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
                    if (s.m((Object)a)) {
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
            if ((n2 & 0x4) == 0x0 && s.m((Object)e)) {
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
                if (s.m((Object)p7)) {
                    n11 = 2048;
                }
                else {
                    n11 = 1024;
                }
                n10 = (n8 | n11);
            }
        }
        e e2;
        if ((n10 & 0x16DB) == 0x492 && s.c()) {
            s.k();
            e2 = e;
        }
        else {
            s.v0();
            a<j> a3 = null;
            e e4 = null;
            Label_0368: {
                a<j> a2;
                if ((n & 0x1) != 0x0 && !s.Y()) {
                    s.k();
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
            s.S();
            final View view = (View)s.u((o0)AndroidCompositionLocals_androidKt.f);
            final f1 e5 = CompositionLocalsKt.e;
            final b b = (b)s.u((o0)e5);
            final String s2 = (String)s.u((o0)AndroidPopup_androidKt.a);
            final f1 k = CompositionLocalsKt.k;
            final LayoutDirection layoutDirection = (LayoutDirection)s.u((o0)k);
            final g w0 = bg.d.w0((z0.d)s);
            final h0 x0 = bg.d.x0((Object)p7, (z0.d)s);
            final UUID uuid = (UUID)androidx.compose.runtime.saveable.b.a(new Object[0], null, (a)AndroidPopup_androidKt$Popup$popupId.AndroidPopup_androidKt$Popup$popupId$1.INSTANCE, (z0.d)s, 6);
            s.A(-492369756);
            Object c0;
            if ((c0 = s.c0()) == d$a.a) {
                sg2.e.e((Object)uuid, "popupId");
                c0 = new PopupLayout((a)a3, e4, s2, view, b, d, uuid);
                ((PopupLayout)c0).k(w0, aa1.a.S((Lambda)new AndroidPopup_androidKt$Popup$popupLayout$1$1.AndroidPopup_androidKt$Popup$popupLayout$1$1$1((PopupLayout)c0, (e1)x0), 1302892335, true));
                s.I0(c0);
            }
            s.R(false);
            final PopupLayout popupLayout = (PopupLayout)c0;
            z0.s.c((Object)popupLayout, (l)new AndroidPopup_androidKt$Popup.AndroidPopup_androidKt$Popup$2(popupLayout, (a)a3, e4, s2, layoutDirection), (z0.d)s);
            z0.s.h((a)new AndroidPopup_androidKt$Popup.AndroidPopup_androidKt$Popup$3(popupLayout, (a)a3, e4, s2, layoutDirection), (z0.d)s);
            z0.s.c((Object)d, (l)new AndroidPopup_androidKt$Popup.AndroidPopup_androidKt$Popup$4(popupLayout, d), (z0.d)s);
            z0.s.f((Object)popupLayout, (p)new AndroidPopup_androidKt$Popup$5(popupLayout, (c)null), (z0.d)s);
            final j1.d k2 = aa1.a.K0((j1.d)d.a.f, (l)new AndroidPopup_androidKt$Popup.AndroidPopup_androidKt$Popup$7(popupLayout));
            final AndroidPopup_androidKt$Popup$8 androidPopup_androidKt$Popup$8 = new AndroidPopup_androidKt$Popup$8(popupLayout, layoutDirection);
            s.A(-1323940314);
            final b b2 = (b)s.u((o0)e5);
            final LayoutDirection layoutDirection2 = (LayoutDirection)s.u((o0)k);
            final h1 h1 = (h1)s.u((o0)CompositionLocalsKt.o);
            ComposeUiNode.u2.getClass();
            final a b3 = ComposeUiNode$Companion.b;
            final ComposableLambdaImpl b4 = LayoutKt.b(k2);
            if (!(s.a instanceof z0.c)) {
                bg.d.k0();
                throw null;
            }
            s.j();
            if (s.K) {
                s.E(b3);
            }
            else {
                s.f();
            }
            s.x = false;
            Updater.b((z0.d)s, androidPopup_androidKt$Popup$8, ComposeUiNode$Companion.e);
            Updater.b((z0.d)s, b2, ComposeUiNode$Companion.d);
            Updater.b((z0.d)s, layoutDirection2, ComposeUiNode$Companion.f);
            a81.e.w(0, b4, d.v(s, h1, ComposeUiNode$Companion.g, s), s, 2058660585, 2085825549);
            aw.b.r(s, false, false, true, false);
            e2 = e4;
            a = a3;
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = (p)new AndroidPopup_androidKt$Popup.AndroidPopup_androidKt$Popup$9(d, (a)a, e2, (p)p7, n, n2);
        }
    }
}
