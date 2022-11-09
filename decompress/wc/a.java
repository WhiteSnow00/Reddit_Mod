// 
// Decompiled by Procyon v0.6.0
// 

package wc;

import java.util.regex.Pattern;
import nc.a$a;
import java.util.Collections;
import bd.c0;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.List;
import qc.b;
import java.util.ArrayList;
import nc.f;
import bd.s;
import nc.e;

public final class a extends e
{
    public final s m;
    
    public a() {
        this.m = new s();
    }
    
    @Override
    public final f g(final byte[] array, int i, final boolean b) throws SubtitleDecoderException {
        this.m.z(i, array);
        final ArrayList list = new ArrayList();
        while (true) {
            final s m = this.m;
            i = m.c - m.b;
            if (i <= 0) {
                return (f)new b(list, 1);
            }
            if (i < 8) {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
            i = m.c();
            if (this.m.c() == 1987343459) {
                final s j = this.m;
                i -= 8;
                a$a a;
                Object f = a = null;
                while (i > 0) {
                    if (i < 8) {
                        throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
                    }
                    final int c = j.c();
                    final int c2 = j.c();
                    final int n = c - 8;
                    final byte[] a2 = j.a;
                    final int b2 = j.b;
                    final int a3 = c0.a;
                    final String s = new String(a2, b2, n, tg.b.c);
                    j.C(n);
                    final int n2 = i - 8 - n;
                    if (c2 == 1937011815) {
                        final wc.e.d d = new wc.e.d();
                        wc.e.e(s, d);
                        a = d.a();
                        i = n2;
                    }
                    else {
                        i = n2;
                        if (c2 != 1885436268) {
                            continue;
                        }
                        f = wc.e.f(null, s.trim(), Collections.emptyList());
                        i = n2;
                    }
                }
                CharSequence charSequence;
                if ((charSequence = (CharSequence)f) == null) {
                    charSequence = "";
                }
                nc.a a4;
                if (a != null) {
                    a.a = charSequence;
                    a4 = a.a();
                }
                else {
                    final Pattern a5 = wc.e.a;
                    final wc.e.d d2 = new wc.e.d();
                    d2.c = charSequence;
                    a4 = d2.a().a();
                }
                list.add(a4);
            }
            else {
                this.m.C(i - 8);
            }
        }
    }
}
