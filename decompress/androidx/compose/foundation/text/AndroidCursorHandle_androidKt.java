// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text;

import zg2.q;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.foundation.layout.SizeKt;
import z0.r0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import kotlin.jvm.internal.Lambda;
import at1.a;
import androidx.compose.foundation.text.selection.HandleReferencePoint;
import ah2.f;
import pg2.j;
import zg2.p;
import j1.d;

public final class AndroidCursorHandle_androidKt
{
    public static final float a;
    public static final float b;
    
    static {
        b = (a = 25) * 2.0f / 2.4142137f;
    }
    
    public static final void a(final long n, final d d, final p<? super z0.d, ? super Integer, j> p5, final z0.d d2, final int n2) {
        f.f((Object)d, "modifier");
        final ComposerImpl r = d2.r(-5185995);
        int n4;
        if ((n2 & 0xE) == 0x0) {
            int n3;
            if (r.K(n)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n2);
        }
        else {
            n4 = n2;
        }
        int n5 = n4;
        if ((n2 & 0x70) == 0x0) {
            int n6;
            if (r.l((Object)d)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n5 = (n4 | n6);
        }
        int n7 = n5;
        if ((n2 & 0x380) == 0x0) {
            int n8;
            if (r.l((Object)p5)) {
                n8 = 256;
            }
            else {
                n8 = 128;
            }
            n7 = (n5 | n8);
        }
        if ((n7 & 0x2DB) == 0x92 && r.b()) {
            r.j();
        }
        else {
            AndroidSelectionHandles_androidKt.b(n, HandleReferencePoint.TopMiddle, (p<? super z0.d, ? super Integer, j>)at1.a.a0((z0.d)r, -1458480226, (Lambda)new AndroidCursorHandle_androidKt$CursorHandle$1((p)p5, d, n7)), (z0.d)r, (n7 & 0xE) | 0x1B0);
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super z0.d, ? super Integer, j>)new AndroidCursorHandle_androidKt$CursorHandle$2(n, d, (p)p5, n2);
        }
    }
    
    public static final void b(final d d, final z0.d d2, final int n) {
        f.f((Object)d, "modifier");
        final ComposerImpl r = d2.r(694251107);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (r.l((Object)d)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        if ((n3 & 0xB) == 0x2 && r.b()) {
            r.j();
        }
        else {
            final d t = SizeKt.t(d, AndroidCursorHandle_androidKt.b, AndroidCursorHandle_androidKt.a);
            f.f((Object)t, "<this>");
            a80.a.g(ComposedModifierKt.b(t, (q)AndroidCursorHandle_androidKt$drawCursorHandle$1.INSTANCE), (z0.d)r, 0);
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super z0.d, ? super Integer, j>)new AndroidCursorHandle_androidKt$DefaultCursorHandle$1(d, n);
        }
    }
}
