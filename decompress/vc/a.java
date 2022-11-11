// 
// Decompiled by Procyon v0.6.0
// 

package vc;

import java.util.regex.Pattern;
import mc.a$a;
import java.util.Collections;
import ad.c0;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.List;
import pc.b;
import java.util.ArrayList;
import mc.f;
import ad.s;
import mc.e;

public final class a extends e
{
    public final s m;
    
    public a() {
        this.m = new s();
    }
    
    public final f g(final byte[] array, int i, final boolean b) throws SubtitleDecoderException {
        this.m.z(i, array);
        final ArrayList list = new ArrayList();
        while (true) {
            final s m = this.m;
            i = m.c - m.b;
            if (i <= 0) {
                return (f)new b((List)list, 1);
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
                    int c = j.c();
                    final int c2 = j.c();
                    c -= 8;
                    final byte[] a2 = j.a;
                    final int b2 = j.b;
                    final int a3 = c0.a;
                    final String s = new String(a2, b2, c, rg.b.c);
                    j.C(c);
                    final int n = i - 8 - c;
                    if (c2 == 1937011815) {
                        final e$d e$d = new e$d();
                        vc.e.e(s, e$d);
                        a = e$d.a();
                        i = n;
                    }
                    else {
                        i = n;
                        if (c2 != 1885436268) {
                            continue;
                        }
                        f = vc.e.f((String)null, s.trim(), (List)Collections.emptyList());
                        i = n;
                    }
                }
                CharSequence charSequence;
                if ((charSequence = (CharSequence)f) == null) {
                    charSequence = "";
                }
                mc.a a4;
                if (a != null) {
                    a.a = charSequence;
                    a4 = a.a();
                }
                else {
                    final Pattern a5 = vc.e.a;
                    final e$d e$d2 = new e$d();
                    e$d2.c = charSequence;
                    a4 = e$d2.a().a();
                }
                list.add(a4);
            }
            else {
                this.m.C(i - 8);
            }
        }
    }
}
