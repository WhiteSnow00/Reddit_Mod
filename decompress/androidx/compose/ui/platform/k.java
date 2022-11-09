// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.content.ClipData$Item;
import z0.d1;
import java.util.ArrayList;
import android.text.Spanned;
import o1.k0;
import t2.e;
import t2.g;
import n2.l;
import n2.m;
import java.util.List;
import android.content.ClipData;
import android.text.Annotation;
import android.util.Base64;
import u2.j;
import o1.r;
import ah2.f;
import android.os.Parcel;
import i2.a$b;
import c1.c;
import android.text.SpannableString;
import i2.a;
import android.content.Context;
import android.content.ClipboardManager;

public final class k implements f0
{
    public final ClipboardManager a;
    
    public k(final Context context) {
        final Object systemService = context.getSystemService("clipboard");
        if (systemService != null) {
            final ClipboardManager a = (ClipboardManager)systemService;
            this.a = a;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.content.ClipboardManager");
    }
    
    public final void a(final a a) {
        final ClipboardManager a2 = this.a;
        Object f;
        if (a.g.isEmpty()) {
            f = a.f;
        }
        else {
            final SpannableString spannableString = new SpannableString((CharSequence)a.f);
            final byte b = 1;
            final c c = new c(1, 0);
            final List g = a.g;
            final int size = g.size();
            int i = 0;
            byte b2 = b;
            while (i < size) {
                final a$b a$b = g.get(i);
                final i2.k k = (i2.k)a$b.a;
                final int b3 = a$b.b;
                final int c2 = a$b.c;
                ((Parcel)c.f).recycle();
                final Parcel obtain = Parcel.obtain();
                ah2.f.e((Object)obtain, "obtain()");
                c.f = obtain;
                ah2.f.f((Object)k, "spanStyle");
                final long b4 = k.b();
                final long l = r.l;
                if (!r.c(b4, l)) {
                    c.d(b2);
                    ((Parcel)c.f).writeLong(k.b());
                }
                final long b5 = k.b;
                final long c3 = j.c;
                if (!j.a(b5, c3)) {
                    c.d((byte)2);
                    c.f(k.b);
                }
                final m c4 = k.c;
                final byte b6 = 3;
                if (c4 != null) {
                    c.d((byte)3);
                    ((Parcel)c.f).writeInt(c4.f);
                }
                final n2.k d = k.d;
                if (d != null) {
                    final int a3 = d.a;
                    c.d((byte)4);
                    byte b7 = 0;
                    Label_0367: {
                        if (a3 != 0) {
                            if (a3 == 1) {
                                b7 = 1;
                                break Label_0367;
                            }
                        }
                        b7 = 0;
                    }
                    c.d(b7);
                }
                final l e = k.e;
                if (e != null) {
                    final int a4 = e.a;
                    c.d((byte)5);
                    byte b8 = 0;
                    Label_0515: {
                        if (a4 != 0) {
                            if (a4 == 1) {
                                b8 = 1;
                                break Label_0515;
                            }
                            if (a4 == 2) {
                                b8 = 2;
                                break Label_0515;
                            }
                            if (a4 == 3) {
                                b8 = b6;
                                break Label_0515;
                            }
                        }
                        b8 = 0;
                    }
                    c.d(b8);
                }
                final String g2 = k.g;
                if (g2 != null) {
                    c.d((byte)6);
                    ((Parcel)c.f).writeString(g2);
                }
                if (!j.a(k.h, c3)) {
                    c.d((byte)7);
                    c.f(k.h);
                }
                final t2.a j = k.i;
                if (j != null) {
                    final float a5 = j.a;
                    c.d((byte)8);
                    c.e(a5);
                }
                final g m = k.j;
                if (m != null) {
                    c.d((byte)9);
                    c.e(m.a);
                    c.e(m.b);
                }
                if (!r.c(k.l, l)) {
                    c.d((byte)10);
                    ((Parcel)c.f).writeLong(k.l);
                }
                final e m2 = k.m;
                if (m2 != null) {
                    c.d((byte)11);
                    ((Parcel)c.f).writeInt(m2.a);
                }
                final k0 n = k.n;
                if (n != null) {
                    c.d((byte)12);
                    ((Parcel)c.f).writeLong(n.a);
                    c.e(n1.c.c(n.b));
                    c.e(n1.c.d(n.b));
                    c.e(n.c);
                }
                final String encodeToString = Base64.encodeToString(((Parcel)c.f).marshall(), 0);
                ah2.f.e((Object)encodeToString, "encodeToString(bytes, Base64.DEFAULT)");
                spannableString.setSpan((Object)new Annotation("androidx.compose.text.SpanStyle", encodeToString), b3, c2, 33);
                ++i;
                b2 = 1;
            }
            f = spannableString;
        }
        a2.setPrimaryClip(ClipData.newPlainText((CharSequence)"plain text", (CharSequence)f));
    }
    
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
                    f.e((Object)array, "annotations");
                    final int n = array.length - 1;
                    if (n >= 0) {
                        int n2 = 0;
                        while (true) {
                            final Annotation annotation = array[n2];
                            if (f.a((Object)annotation.getKey(), (Object)"androidx.compose.text.SpanStyle")) {
                                final int spanStart = spanned.getSpanStart((Object)annotation);
                                final int spanEnd = spanned.getSpanEnd((Object)annotation);
                                final String value = annotation.getValue();
                                f.e((Object)value, "span.value");
                                final d1 d1 = new d1(value);
                                final t0 t0 = new t0();
                                while (true) {
                                    final int dataAvail = ((Parcel)d1.f).dataAvail();
                                    final int n3 = 1;
                                    int n4 = 1;
                                    if (dataAvail <= 1) {
                                        break;
                                    }
                                    final byte byte1 = ((Parcel)d1.f).readByte();
                                    if (byte1 == 1) {
                                        if (d1.s() < 8) {
                                            break;
                                        }
                                        final long long1 = ((Parcel)d1.f).readLong();
                                        final int m = r.m;
                                        t0.a = long1;
                                    }
                                    else if (byte1 == 2) {
                                        if (d1.s() < 5) {
                                            break;
                                        }
                                        t0.b = d1.w();
                                    }
                                    else if (byte1 == 3) {
                                        if (d1.s() < 4) {
                                            break;
                                        }
                                        t0.c = new m(((Parcel)d1.f).readInt());
                                    }
                                    else if (byte1 == 4) {
                                        if (d1.s() < 1) {
                                            break;
                                        }
                                        final byte byte2 = ((Parcel)d1.f).readByte();
                                        Label_0409: {
                                            if (byte2 != 0) {
                                                if (byte2 == 1) {
                                                    break Label_0409;
                                                }
                                            }
                                            n4 = 0;
                                        }
                                        t0.d = new n2.k(n4);
                                    }
                                    else if (byte1 == 5) {
                                        if (d1.s() < 1) {
                                            break;
                                        }
                                        final byte byte3 = ((Parcel)d1.f).readByte();
                                        int n5 = 0;
                                        Label_0502: {
                                            if (byte3 != 0) {
                                                if (byte3 == 1) {
                                                    n5 = n3;
                                                    break Label_0502;
                                                }
                                                if (byte3 == 3) {
                                                    n5 = 3;
                                                    break Label_0502;
                                                }
                                                if (byte3 == 2) {
                                                    n5 = 2;
                                                    break Label_0502;
                                                }
                                            }
                                            n5 = 0;
                                        }
                                        t0.e = new l(n5);
                                    }
                                    else if (byte1 == 6) {
                                        t0.g = ((Parcel)d1.f).readString();
                                    }
                                    else if (byte1 == 7) {
                                        if (d1.s() < 5) {
                                            break;
                                        }
                                        t0.h = d1.w();
                                    }
                                    else if (byte1 == 8) {
                                        if (d1.s() < 4) {
                                            break;
                                        }
                                        t0.i = new t2.a(d1.v());
                                    }
                                    else if (byte1 == 9) {
                                        if (d1.s() < 8) {
                                            break;
                                        }
                                        t0.j = new g(d1.v(), d1.v());
                                    }
                                    else if (byte1 == 10) {
                                        if (d1.s() < 8) {
                                            break;
                                        }
                                        final long long2 = ((Parcel)d1.f).readLong();
                                        final int i = r.m;
                                        t0.l = long2;
                                    }
                                    else if (byte1 == 11) {
                                        if (d1.s() < 4) {
                                            break;
                                        }
                                        final int int1 = ((Parcel)d1.f).readInt();
                                        e j = e.d;
                                        final boolean b = (int1 & 0x2) != 0x0;
                                        final e c = e.c;
                                        final boolean b2 = (int1 & 0x1) != 0x0;
                                        if (b && b2) {
                                            final List y = ah2.c.Y((Object[])new e[] { j, c });
                                            f.f((Object)y, "decorations");
                                            Integer n6 = 0;
                                            for (int size = y.size(), k = 0; k < size; ++k) {
                                                n6 = (n6.intValue() | ((e)y.get(k)).a);
                                            }
                                            j = new e(n6.intValue());
                                        }
                                        else if (!b) {
                                            if (b2) {
                                                j = c;
                                            }
                                            else {
                                                j = e.b;
                                            }
                                        }
                                        t0.m = j;
                                    }
                                    else {
                                        if (byte1 != 12) {
                                            continue;
                                        }
                                        if (d1.s() < 20) {
                                            break;
                                        }
                                        final long long3 = ((Parcel)d1.f).readLong();
                                        final int l = r.m;
                                        t0.n = new k0(long3, yd.a.y0(d1.v(), d1.v()), d1.v());
                                    }
                                }
                                list.add(new a$b((Object)new i2.k(t0.a, t0.b, t0.c, t0.d, t0.e, t0.f, t0.g, t0.h, t0.i, t0.j, t0.k, t0.l, t0.m, t0.n), spanStart, spanEnd));
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
