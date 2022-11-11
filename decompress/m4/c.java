// 
// Decompiled by Procyon v0.6.0
// 

package m4;

import android.text.Spanned;
import java.util.Arrays;
import android.util.SparseArray;
import android.text.TextPaint;
import android.graphics.Paint;
import q3.g$a;
import q3.g;
import android.text.Selection;
import android.view.KeyEvent;
import android.text.Editable;

public final class c
{
    public final m4.a.h a;
    public final h b;
    public a c;
    public final boolean d;
    public final int[] e;
    
    public c(final h b, final m4.a.h a) {
        this.c = new a();
        this.a = a;
        this.b = b;
        this.d = false;
        this.e = null;
    }
    
    public static boolean a(final Editable editable, final KeyEvent keyEvent, final boolean b) {
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) ^ true) {
            return false;
        }
        final int selectionStart = Selection.getSelectionStart((CharSequence)editable);
        final int selectionEnd = Selection.getSelectionEnd((CharSequence)editable);
        if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) {
            return false;
        }
        final d[] array = (d[])((Spanned)editable).getSpans(selectionStart, selectionEnd, (Class)d.class);
        if (array != null && array.length > 0) {
            for (final d d : array) {
                final int spanStart = ((Spanned)editable).getSpanStart((Object)d);
                final int spanEnd = ((Spanned)editable).getSpanEnd((Object)d);
                if ((b && spanStart == selectionStart) || (!b && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd)) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }
    
    public final boolean b(final CharSequence charSequence, int i, final int n, final m4.b b) {
        final int c = b.c;
        boolean b2 = false;
        if (c == 0) {
            final a c2 = this.c;
            c2.getClass();
            final ThreadLocal<StringBuilder> b3 = m4.c.a.b;
            if (b3.get() == null) {
                b3.set(new StringBuilder());
            }
            final StringBuilder sb = b3.get();
            sb.setLength(0);
            while (i < n) {
                sb.append(charSequence.charAt(i));
                ++i;
            }
            final TextPaint a = c2.a;
            final String string = sb.toString();
            i = g.a;
            if (g$a.a((Paint)a, string)) {
                i = 2;
            }
            else {
                i = 1;
            }
            b.c = i;
        }
        if (b.c == 2) {
            b2 = true;
        }
        return b2;
    }
    
    public static final class a
    {
        public static final ThreadLocal<StringBuilder> b;
        public final TextPaint a;
        
        static {
            b = new ThreadLocal<StringBuilder>();
        }
        
        public a() {
            ((Paint)(this.a = new TextPaint())).setTextSize(10.0f);
        }
    }
    
    public static final class b
    {
        public int a;
        public final h.a b;
        public h.a c;
        public h.a d;
        public int e;
        public int f;
        public final boolean g;
        public final int[] h;
        
        public b(final h.a a, final boolean g, final int[] h) {
            this.a = 1;
            this.b = a;
            this.c = a;
            this.g = g;
            this.h = h;
        }
        
        public final int a(final int e) {
            final SparseArray<h.a> a = this.c.a;
            h.a a2;
            if (a == null) {
                a2 = null;
            }
            else {
                a2 = (h.a)a.get(e);
            }
            final int a3 = this.a;
            final int n = 3;
            int n4 = 0;
            Label_0210: {
                Label_0208: {
                    if (a3 != 2) {
                        if (a2 == null) {
                            this.b();
                            break Label_0208;
                        }
                        this.a = 2;
                        this.c = a2;
                        this.f = 1;
                    }
                    else if (a2 != null) {
                        this.c = a2;
                        ++this.f;
                    }
                    else {
                        final int n2 = 0;
                        if (e == 65038) {
                            this.b();
                            break Label_0208;
                        }
                        int n3 = n2;
                        if (e == 65039) {
                            n3 = 1;
                        }
                        if (n3 == 0) {
                            final h.a c = this.c;
                            if (c.b == null) {
                                this.b();
                                break Label_0208;
                            }
                            if (this.f != 1) {
                                this.d = c;
                                this.b();
                                n4 = n;
                                break Label_0210;
                            }
                            if (this.c()) {
                                this.d = this.c;
                                this.b();
                                n4 = n;
                                break Label_0210;
                            }
                            this.b();
                            break Label_0208;
                        }
                    }
                    n4 = 2;
                    break Label_0210;
                }
                n4 = 1;
            }
            this.e = e;
            return n4;
        }
        
        public final void b() {
            this.a = 1;
            this.c = this.b;
            this.f = 0;
        }
        
        public final boolean c() {
            final s5.a c = this.c.b.c();
            final int a = ((s5.c)c).a(6);
            if (a != 0 && ((s5.c)c).b.get(a + ((s5.c)c).a) != 0) {
                return true;
            }
            if (this.e == 65039) {
                return true;
            }
            if (this.g) {
                if (this.h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.h, this.c.b.a(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }
}
