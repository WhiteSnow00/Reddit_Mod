// 
// Decompiled by Procyon v0.6.0
// 

package vc;

import android.util.Log;
import nc.a$a;
import android.text.style.TypefaceSpan;
import android.text.style.ForegroundColorSpan;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import nc.f;
import android.text.style.UnderlineSpan;
import android.text.style.StyleSpan;
import android.text.SpannableStringBuilder;
import tg.b;
import bd.c0;
import java.util.List;
import bd.s;
import nc.e;

public final class a extends e
{
    public final s m;
    public final boolean n;
    public final int o;
    public final int p;
    public final String q;
    public final float r;
    public final int s;
    
    public a(final List<byte[]> list) {
        this.m = new s();
        final int size = list.size();
        final String s = "sans-serif";
        boolean n = true;
        if (size == 1 && (((byte[])list.get(0)).length == 48 || ((byte[])list.get(0)).length == 53)) {
            final byte[] array = list.get(0);
            this.o = array[24];
            this.p = ((array[26] & 0xFF) << 24 | (array[27] & 0xFF) << 16 | (array[28] & 0xFF) << 8 | (array[29] & 0xFF));
            final int length = array.length;
            final int a = c0.a;
            String q = s;
            if ("Serif".equals(new String(array, 43, length - 43, b.c))) {
                q = "serif";
            }
            this.q = q;
            final int s2 = array[25] * 20;
            this.s = s2;
            if ((array[0] & 0x20) == 0x0) {
                n = false;
            }
            this.n = n;
            if (n) {
                this.r = c0.h(((array[11] & 0xFF) | (array[10] & 0xFF) << 8) / (float)s2, 0.0f, 0.95f);
            }
            else {
                this.r = 0.85f;
            }
        }
        else {
            this.o = 0;
            this.p = -1;
            this.q = "sans-serif";
            this.n = false;
            this.r = 0.85f;
            this.s = -1;
        }
    }
    
    public static void h(final SpannableStringBuilder spannableStringBuilder, int n, int n2, final int n3, final int n4, int n5) {
        if (n != n2) {
            final int n6 = n5 | 0x21;
            final int n7 = 1;
            if ((n & 0x1) != 0x0) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            if ((n & 0x2) != 0x0) {
                n5 = 1;
            }
            else {
                n5 = 0;
            }
            if (n2 != 0) {
                if (n5 != 0) {
                    spannableStringBuilder.setSpan((Object)new StyleSpan(3), n3, n4, n6);
                }
                else {
                    spannableStringBuilder.setSpan((Object)new StyleSpan(1), n3, n4, n6);
                }
            }
            else if (n5 != 0) {
                spannableStringBuilder.setSpan((Object)new StyleSpan(2), n3, n4, n6);
            }
            if ((n & 0x4) != 0x0) {
                n = n7;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                spannableStringBuilder.setSpan((Object)new UnderlineSpan(), n3, n4, n6);
            }
            if (n == 0 && n2 == 0 && n5 == 0) {
                spannableStringBuilder.setSpan((Object)new StyleSpan(0), n3, n4, n6);
            }
        }
    }
    
    @Override
    public final f g(final byte[] array, int n, final boolean b) throws SubtitleDecoderException {
        this.m.z(n, array);
        final s m = this.m;
        n = m.c;
        final int b2 = m.b;
        final int n2 = 2;
        if (n - b2 >= 2) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n == 0) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
        n = m.w();
        String s = null;
        Label_0155: {
            if (n == 0) {
                s = "";
            }
            else {
                final int c = m.c;
                final int b3 = m.b;
                if (c - b3 >= 2) {
                    final byte[] a = m.a;
                    final char c2 = (char)((a[b3 + 1] & 0xFF) | (a[b3] & 0xFF) << 8);
                    if (c2 == '\ufeff' || c2 == '\ufffe') {
                        s = m.p(n, b.e);
                        break Label_0155;
                    }
                }
                s = m.p(n, b.c);
            }
        }
        if (s.isEmpty()) {
            return (f)b.g;
        }
        final SpannableStringBuilder a2 = new SpannableStringBuilder((CharSequence)s);
        h(a2, this.o, 0, 0, a2.length(), 16711680);
        final int p3 = this.p;
        n = a2.length();
        if (p3 != -1) {
            a2.setSpan((Object)new ForegroundColorSpan(p3 >>> 8 | (p3 & 0xFF) << 24), 0, n, 16711713);
        }
        final String q = this.q;
        n = a2.length();
        if (q != "sans-serif") {
            a2.setSpan((Object)new TypefaceSpan(q), 0, n, 16711713);
        }
        float e = this.r;
        n = n2;
        while (true) {
            final s i = this.m;
            final int c3 = i.c;
            final int b4 = i.b;
            if (c3 - b4 < 8) {
                final a$a a$a = new a$a();
                a$a.a = (CharSequence)a2;
                a$a.e = e;
                a$a.f = 0;
                a$a.g = 0;
                return (f)new vc.b(a$a.a());
            }
            final int c4 = i.c();
            final int c5 = this.m.c();
            if (c5 == 1937013100) {
                final s j = this.m;
                if (j.c - j.b < n) {
                    throw new SubtitleDecoderException("Unexpected subtitle format.");
                }
                for (int w = j.w(), k = 0; k < w; ++k, n = 2) {
                    final s l = this.m;
                    if (l.c - l.b < 12) {
                        throw new SubtitleDecoderException("Unexpected subtitle format.");
                    }
                    final int w2 = l.w();
                    final int w3 = l.w();
                    l.C(n);
                    final int r = l.r();
                    l.C(1);
                    final int c6 = l.c();
                    if (w3 > a2.length()) {
                        n = a2.length();
                        final StringBuilder sb = new StringBuilder(68);
                        sb.append("Truncating styl end (");
                        sb.append(w3);
                        sb.append(") to cueText.length() (");
                        sb.append(n);
                        sb.append(").");
                        Log.w("Tx3gDecoder", sb.toString());
                        n = a2.length();
                    }
                    else {
                        n = w3;
                    }
                    if (w2 >= n) {
                        final StringBuilder sb2 = new StringBuilder(60);
                        sb2.append("Ignoring styl with start (");
                        sb2.append(w2);
                        sb2.append(") >= end (");
                        sb2.append(n);
                        sb2.append(").");
                        Log.w("Tx3gDecoder", sb2.toString());
                    }
                    else {
                        h(a2, r, this.o, w2, n, 0);
                        if (c6 != this.p) {
                            a2.setSpan((Object)new ForegroundColorSpan((c6 & 0xFF) << 24 | c6 >>> 8), w2, n, 33);
                        }
                    }
                }
            }
            else if (c5 == 1952608120 && this.n) {
                final s m2 = this.m;
                final int c7 = m2.c;
                n = m2.b;
                final int n3 = 2;
                if (c7 - n >= 2) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                if (n == 0) {
                    throw new SubtitleDecoderException("Unexpected subtitle format.");
                }
                e = c0.h(m2.w() / (float)this.s, 0.0f, 0.95f);
                n = n3;
            }
            else {
                n = 2;
            }
            this.m.B(b4 + c4);
        }
    }
}
