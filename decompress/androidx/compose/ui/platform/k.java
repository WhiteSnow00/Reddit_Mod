// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.content.ClipData$Item;
import cg.d;
import h.s;
import java.util.ArrayList;
import android.text.Spanned;
import android.content.ClipDescription;
import t2.g;
import t2.i;
import n2.l;
import n2.o;
import java.util.List;
import android.content.ClipData;
import android.text.Annotation;
import android.util.Base64;
import n1.c;
import u2.j;
import android.os.Parcel;
import o1.r;
import i2.a$b;
import android.text.SpannableString;
import i2.a;
import ng2.e;
import android.content.Context;
import android.content.ClipboardManager;

public final class k implements d0
{
    public final ClipboardManager a;
    
    public k(final Context context) {
        final Object systemService = context.getSystemService("clipboard");
        e.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        final ClipboardManager a = (ClipboardManager)systemService;
        this.a = a;
    }
    
    @Override
    public final void a(final a a) {
        final ClipboardManager a2 = this.a;
        Object f;
        if (a.g.isEmpty()) {
            f = a.f;
        }
        else {
            final SpannableString spannableString = new SpannableString((CharSequence)a.f);
            final k0 k0 = new k0(0);
            final List g = a.g;
            for (int size = g.size(), i = 0; i < size; ++i) {
                final a$b a$b = g.get(i);
                final i2.k j = (i2.k)a$b.a;
                final int b = a$b.b;
                final int c = a$b.c;
                k0.p();
                e.f((Object)j, "spanStyle");
                final long b2 = j.b();
                final long l = r.l;
                if (!r.c(b2, l)) {
                    k0.i((byte)1);
                    ((Parcel)k0.g).writeLong(j.b());
                }
                final long b3 = j.b;
                final long c2 = u2.j.c;
                if (!u2.j.a(b3, c2)) {
                    k0.i((byte)2);
                    k0.l(j.b);
                }
                final o c3 = j.c;
                if (c3 != null) {
                    k0.i((byte)3);
                    ((Parcel)k0.g).writeInt(c3.f);
                }
                final n2.k d = j.d;
                if (d != null) {
                    final int a3 = d.a;
                    k0.i((byte)4);
                    byte b4 = 0;
                    Label_0325: {
                        if (a3 != 0) {
                            if (a3 == 1) {
                                b4 = 1;
                                break Label_0325;
                            }
                        }
                        b4 = 0;
                    }
                    k0.i(b4);
                }
                final l e = j.e;
                if (e != null) {
                    final int a4 = e.a;
                    k0.i((byte)5);
                    byte b5 = 0;
                    Label_0455: {
                        if (a4 != 0) {
                            b5 = 1;
                            if (a4 == 1) {
                                break Label_0455;
                            }
                            b5 = 2;
                            if (a4 == 2) {
                                break Label_0455;
                            }
                            if (a4 == 3) {
                                b5 = 3;
                                break Label_0455;
                            }
                        }
                        b5 = 0;
                    }
                    k0.i(b5);
                }
                final String g2 = j.g;
                if (g2 != null) {
                    k0.i((byte)6);
                    ((Parcel)k0.g).writeString(g2);
                }
                if (!u2.j.a(j.h, c2)) {
                    k0.i((byte)7);
                    k0.l(j.h);
                }
                final t2.a m = j.i;
                if (m != null) {
                    final float a5 = m.a;
                    k0.i((byte)8);
                    k0.j(a5);
                }
                final i j2 = j.j;
                if (j2 != null) {
                    k0.i((byte)9);
                    k0.j(j2.a);
                    k0.j(j2.b);
                }
                if (!r.c(j.l, l)) {
                    k0.i((byte)10);
                    ((Parcel)k0.g).writeLong(j.l);
                }
                final g m2 = j.m;
                if (m2 != null) {
                    k0.i((byte)11);
                    ((Parcel)k0.g).writeInt(m2.a);
                }
                final o1.k0 n = j.n;
                if (n != null) {
                    k0.i((byte)12);
                    ((Parcel)k0.g).writeLong(n.a);
                    k0.j(n1.c.e(n.b));
                    k0.j(n1.c.f(n.b));
                    k0.j(n.c);
                }
                final String encodeToString = Base64.encodeToString(((Parcel)k0.g).marshall(), 0);
                ng2.e.e((Object)encodeToString, "encodeToString(bytes, Base64.DEFAULT)");
                spannableString.setSpan((Object)new Annotation("androidx.compose.text.SpanStyle", encodeToString), b, c, 33);
            }
            f = spannableString;
        }
        a2.setPrimaryClip(ClipData.newPlainText((CharSequence)"plain text", (CharSequence)f));
    }
    
    public final boolean b() {
        final ClipDescription primaryClipDescription = this.a.getPrimaryClipDescription();
        return primaryClipDescription != null && primaryClipDescription.hasMimeType("text/plain");
    }
    
    @Override
    public final a getText() {
        final ClipData primaryClip = this.a.getPrimaryClip();
        a a2;
        final a a = a2 = null;
        if (primaryClip != null) {
            a2 = a;
            if (primaryClip.getItemCount() > 0) {
                final ClipData$Item item = primaryClip.getItemAt(0);
                CharSequence text;
                if (item != null) {
                    text = item.getText();
                }
                else {
                    text = null;
                }
                if (text == null) {
                    a2 = a;
                }
                else if (!(text instanceof Spanned)) {
                    a2 = new a(6, text.toString(), (List)null);
                }
                else {
                    final Spanned spanned = (Spanned)text;
                    final Annotation[] array = (Annotation[])spanned.getSpans(0, text.length(), (Class)Annotation.class);
                    final ArrayList<a$b> list = new ArrayList<a$b>();
                    e.e((Object)array, "annotations");
                    final int n = array.length - 1;
                    if (n >= 0) {
                        int n2 = 0;
                        while (true) {
                            final Annotation annotation = array[n2];
                            if (e.a((Object)annotation.getKey(), (Object)"androidx.compose.text.SpanStyle")) {
                                final int spanStart = spanned.getSpanStart((Object)annotation);
                                final int spanEnd = spanned.getSpanEnd((Object)annotation);
                                final String value = annotation.getValue();
                                e.e((Object)value, "span.value");
                                final s s = new s(value);
                                final s0 s2 = new s0();
                                while (true) {
                                    final int dataAvail = ((Parcel)s.g).dataAvail();
                                    final int n3 = 1;
                                    int n4 = 1;
                                    if (dataAvail <= 1) {
                                        break;
                                    }
                                    final byte byte1 = ((Parcel)s.g).readByte();
                                    if (byte1 == 1) {
                                        if (s.b() < 8) {
                                            break;
                                        }
                                        final long long1 = ((Parcel)s.g).readLong();
                                        final int m = r.m;
                                        s2.a = long1;
                                    }
                                    else if (byte1 == 2) {
                                        if (s.b() < 5) {
                                            break;
                                        }
                                        s2.b = s.s();
                                    }
                                    else if (byte1 == 3) {
                                        if (s.b() < 4) {
                                            break;
                                        }
                                        s2.c = new o(((Parcel)s.g).readInt());
                                    }
                                    else if (byte1 == 4) {
                                        if (s.b() < 1) {
                                            break;
                                        }
                                        final byte byte2 = ((Parcel)s.g).readByte();
                                        Label_0430: {
                                            if (byte2 != 0) {
                                                if (byte2 == 1) {
                                                    break Label_0430;
                                                }
                                            }
                                            n4 = 0;
                                        }
                                        s2.d = new n2.k(n4);
                                    }
                                    else if (byte1 == 5) {
                                        if (s.b() < 1) {
                                            break;
                                        }
                                        final byte byte3 = ((Parcel)s.g).readByte();
                                        int n5 = 0;
                                        Label_0512: {
                                            if (byte3 != 0) {
                                                if (byte3 == 1) {
                                                    n5 = n3;
                                                    break Label_0512;
                                                }
                                                if (byte3 == 3) {
                                                    n5 = 3;
                                                    break Label_0512;
                                                }
                                                if (byte3 == 2) {
                                                    n5 = 2;
                                                    break Label_0512;
                                                }
                                            }
                                            n5 = 0;
                                        }
                                        s2.e = new l(n5);
                                    }
                                    else if (byte1 == 6) {
                                        s2.g = ((Parcel)s.g).readString();
                                    }
                                    else if (byte1 == 7) {
                                        if (s.b() < 5) {
                                            break;
                                        }
                                        s2.h = s.s();
                                    }
                                    else if (byte1 == 8) {
                                        if (s.b() < 4) {
                                            break;
                                        }
                                        s2.i = new t2.a(s.r());
                                    }
                                    else if (byte1 == 9) {
                                        if (s.b() < 8) {
                                            break;
                                        }
                                        s2.j = new i(s.r(), s.r());
                                    }
                                    else if (byte1 == 10) {
                                        if (s.b() < 8) {
                                            break;
                                        }
                                        final long long2 = ((Parcel)s.g).readLong();
                                        final int i = r.m;
                                        s2.l = long2;
                                    }
                                    else if (byte1 == 11) {
                                        if (s.b() < 4) {
                                            break;
                                        }
                                        final int int1 = ((Parcel)s.g).readInt();
                                        g j = g.d;
                                        final boolean b = (int1 & 0x2) != 0x0;
                                        final g c = g.c;
                                        final boolean b2 = (int1 & 0x1) != 0x0;
                                        if (b && b2) {
                                            final List m2 = d.m3((Object[])new g[] { j, c });
                                            e.f((Object)m2, "decorations");
                                            Integer n6 = 0;
                                            for (int size = m2.size(), k = 0; k < size; ++k) {
                                                n6 = (n6.intValue() | ((g)m2.get(k)).a);
                                            }
                                            j = new g(n6.intValue());
                                        }
                                        else if (!b) {
                                            if (b2) {
                                                j = c;
                                            }
                                            else {
                                                j = g.b;
                                            }
                                        }
                                        s2.m = j;
                                    }
                                    else {
                                        if (byte1 != 12) {
                                            continue;
                                        }
                                        if (s.b() < 20) {
                                            break;
                                        }
                                        final long long3 = ((Parcel)s.g).readLong();
                                        final int l = r.m;
                                        s2.n = new o1.k0(long3, vl.a.T(s.r(), s.r()), s.r());
                                    }
                                }
                                list.add(new a$b((Object)new i2.k(s2.a, s2.b, s2.c, s2.d, s2.e, s2.f, s2.g, s2.h, s2.i, s2.j, s2.k, s2.l, s2.m, s2.n), spanStart, spanEnd));
                            }
                            if (n2 == n) {
                                break;
                            }
                            ++n2;
                        }
                    }
                    a2 = new a(4, text.toString(), (List)list);
                }
            }
        }
        return a2;
    }
}
