// 
// Decompiled by Procyon v0.6.0
// 

package androidx.emoji2.text;

import o4.c;
import android.text.Spanned;
import android.util.SparseArray;
import android.text.TextPaint;
import o4.a;
import android.graphics.Paint;
import q3.g;
import android.text.Selection;
import android.view.KeyEvent;
import android.text.Editable;

public final class j
{
    public final f.i a;
    public final n b;
    public f.d c;
    
    public j(final n b, final f.i a, final d c) {
        this.a = a;
        this.b = b;
        this.c = c;
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
        final k[] array = (k[])((Spanned)editable).getSpans(selectionStart, selectionEnd, (Class)k.class);
        if (array != null && array.length > 0) {
            for (final k k : array) {
                final int spanStart = ((Spanned)editable).getSpanStart((Object)k);
                final int spanEnd = ((Spanned)editable).getSpanEnd((Object)k);
                if ((b && spanStart == selectionStart) || (!b && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd)) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }
    
    public final boolean b(final CharSequence charSequence, int i, final int n, final i j) {
        final int c = j.c;
        boolean b = false;
        if (c == 0) {
            final f.d c2 = this.c;
            final o4.a c3 = j.c();
            final int a = ((c)c3).a(8);
            if (a != 0) {
                ((c)c3).b.getShort(a + ((c)c3).a);
            }
            final d d = (d)c2;
            d.getClass();
            final ThreadLocal<StringBuilder> b2 = androidx.emoji2.text.d.b;
            if (b2.get() == null) {
                b2.set(new StringBuilder());
            }
            final StringBuilder sb = b2.get();
            sb.setLength(0);
            while (i < n) {
                sb.append(charSequence.charAt(i));
                ++i;
            }
            final TextPaint a2 = d.a;
            final String string = sb.toString();
            i = g.a;
            if (g.a.a((Paint)a2, string)) {
                i = 2;
            }
            else {
                i = 1;
            }
            j.c = i;
        }
        if (j.c == 2) {
            b = true;
        }
        return b;
    }
    
    public static final class a
    {
        public int a;
        public final n.a b;
        public n.a c;
        public n.a d;
        public int e;
        public int f;
        
        public a(final n.a a) {
            this.a = 1;
            this.b = a;
            this.c = a;
        }
        
        public final int a(final int e) {
            final SparseArray<n.a> a = this.c.a;
            n.a a2;
            if (a == null) {
                a2 = null;
            }
            else {
                a2 = (n.a)a.get(e);
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
                            final n.a c = this.c;
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
            final o4.a c = this.c.b.c();
            final int a = ((c)c).a(6);
            return (a != 0 && ((c)c).b.get(a + ((c)c).a) != 0) || this.e == 65039;
        }
    }
}
