// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import z0.p0;
import n2.g$a;
import n2.f$a;
import mg2.q;
import androidx.compose.runtime.ComposerImpl;
import z0.k;
import z0.n0;
import androidx.compose.runtime.ComposerKt;
import ng2.e;
import cg2.j;
import z0.d;
import mg2.p;
import e2.b0;
import mg2.a;
import androidx.compose.runtime.CompositionLocalKt;
import z0.d1;

public final class CompositionLocalsKt
{
    public static final d1 a;
    public static final d1 b;
    public static final d1 c;
    public static final d1 d;
    public static final d1 e;
    public static final d1 f;
    public static final d1 g;
    public static final d1 h;
    public static final d1 i;
    public static final d1 j;
    public static final d1 k;
    public static final d1 l;
    public static final d1 m;
    public static final d1 n;
    public static final d1 o;
    public static final d1 p;
    public static final d1 q;
    
    static {
        a = CompositionLocalKt.d((a)CompositionLocalsKt$LocalAccessibilityManager$1.INSTANCE);
        b = CompositionLocalKt.d((a)CompositionLocalsKt$LocalAutofill$1.INSTANCE);
        c = CompositionLocalKt.d((a)CompositionLocalsKt$LocalAutofillTree$1.INSTANCE);
        d = CompositionLocalKt.d((a)CompositionLocalsKt$LocalClipboardManager$1.INSTANCE);
        e = CompositionLocalKt.d((a)CompositionLocalsKt$LocalDensity$1.INSTANCE);
        f = CompositionLocalKt.d((a)CompositionLocalsKt$LocalFocusManager$1.INSTANCE);
        g = CompositionLocalKt.d((a)CompositionLocalsKt$LocalFontLoader$1.INSTANCE);
        h = CompositionLocalKt.d((a)CompositionLocalsKt$LocalFontFamilyResolver$1.INSTANCE);
        i = CompositionLocalKt.d((a)CompositionLocalsKt$LocalHapticFeedback$1.INSTANCE);
        j = CompositionLocalKt.d((a)CompositionLocalsKt$LocalInputModeManager$1.INSTANCE);
        k = CompositionLocalKt.d((a)CompositionLocalsKt$LocalLayoutDirection$1.INSTANCE);
        l = CompositionLocalKt.d((a)CompositionLocalsKt$LocalTextInputService$1.INSTANCE);
        m = CompositionLocalKt.d((a)CompositionLocalsKt$LocalTextToolbar$1.INSTANCE);
        n = CompositionLocalKt.d((a)CompositionLocalsKt$LocalUriHandler$1.INSTANCE);
        o = CompositionLocalKt.d((a)CompositionLocalsKt$LocalViewConfiguration$1.INSTANCE);
        p = CompositionLocalKt.d((a)CompositionLocalsKt$LocalWindowInfo$1.INSTANCE);
        q = CompositionLocalKt.d((a)CompositionLocalsKt$LocalPointerIconService$1.INSTANCE);
    }
    
    public static final void a(final b0 b0, final f1 f1, final p<? super d, ? super Integer, j> p5, final d d, final int n) {
        ng2.e.f((Object)b0, "owner");
        ng2.e.f((Object)f1, "uriHandler");
        ng2.e.f((Object)p5, "content");
        final ComposerImpl s = d.s(874662829);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (s.m((Object)b0)) {
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
        int n4 = n3;
        if ((n & 0x70) == 0x0) {
            int n5;
            if (s.m((Object)f1)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        int n6 = n4;
        if ((n & 0x380) == 0x0) {
            int n7;
            if (s.m((Object)p5)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        if ((n6 & 0x2DB) == 0x92 && s.d()) {
            s.j();
        }
        else {
            final q a = ComposerKt.a;
            final n0 b2 = CompositionLocalsKt.a.b((Object)b0.getAccessibilityManager());
            final n0 b3 = CompositionLocalsKt.b.b((Object)b0.getAutofill());
            final n0 b4 = CompositionLocalsKt.c.b((Object)b0.getAutofillTree());
            final n0 b5 = CompositionLocalsKt.d.b((Object)b0.getClipboardManager());
            final n0 b6 = CompositionLocalsKt.e.b((Object)b0.getDensity());
            final n0 b7 = CompositionLocalsKt.f.b((Object)b0.getFocusManager());
            final d1 g = CompositionLocalsKt.g;
            final f$a fontLoader = b0.getFontLoader();
            g.getClass();
            final n0 n8 = new n0((k<Object>)g, fontLoader, false);
            final d1 h = CompositionLocalsKt.h;
            final g$a fontFamilyResolver = b0.getFontFamilyResolver();
            h.getClass();
            CompositionLocalKt.a(new n0[] { b2, b3, b4, b5, b6, b7, n8, new n0((k<Object>)h, fontFamilyResolver, false), CompositionLocalsKt.i.b((Object)b0.getHapticFeedBack()), CompositionLocalsKt.j.b((Object)b0.getInputModeManager()), CompositionLocalsKt.k.b((Object)b0.getLayoutDirection()), CompositionLocalsKt.l.b((Object)b0.getTextInputService()), CompositionLocalsKt.m.b((Object)b0.getTextToolbar()), CompositionLocalsKt.n.b((Object)f1), CompositionLocalsKt.o.b((Object)b0.getViewConfiguration()), CompositionLocalsKt.p.b((Object)b0.getWindowInfo()), CompositionLocalsKt.q.b((Object)b0.getPointerIconService()) }, (p)p5, (d)s, (n6 >> 3 & 0x70) | 0x8);
        }
        final p0 v = s.V();
        if (v != null) {
            v.d = (p)new CompositionLocalsKt$ProvideCommonCompositionLocals$1(b0, f1, (p)p5, n);
        }
    }
    
    public static final void b(final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append("CompositionLocal ");
        sb.append(s);
        sb.append(" not present");
        throw new IllegalStateException(sb.toString().toString());
    }
}
