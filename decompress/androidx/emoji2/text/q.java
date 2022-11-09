// 
// Decompiled by Procyon v0.6.0
// 

package androidx.emoji2.text;

import android.text.Spanned;
import android.text.PrecomputedText;
import y3.d;
import java.util.stream.IntStream;
import android.os.Build$VERSION;
import android.text.SpannableString;
import android.text.Spannable;

public final class q implements Spannable
{
    public boolean f;
    public Spannable g;
    
    public q(final Spannable g) {
        this.f = false;
        this.g = g;
    }
    
    public q(final CharSequence charSequence) {
        this.f = false;
        this.g = (Spannable)new SpannableString(charSequence);
    }
    
    public final void a() {
        final Spannable g = this.g;
        if (!this.f) {
            Object o;
            if (Build$VERSION.SDK_INT < 28) {
                o = new a();
            }
            else {
                o = new b();
            }
            if (((a)o).a(g)) {
                this.g = (Spannable)new SpannableString((CharSequence)g);
            }
        }
        this.f = true;
    }
    
    public final char charAt(final int n) {
        return ((CharSequence)this.g).charAt(n);
    }
    
    public final IntStream chars() {
        return ((CharSequence)this.g).chars();
    }
    
    public final IntStream codePoints() {
        return ((CharSequence)this.g).codePoints();
    }
    
    public final int getSpanEnd(final Object o) {
        return ((Spanned)this.g).getSpanEnd(o);
    }
    
    public final int getSpanFlags(final Object o) {
        return ((Spanned)this.g).getSpanFlags(o);
    }
    
    public final int getSpanStart(final Object o) {
        return ((Spanned)this.g).getSpanStart(o);
    }
    
    public final <T> T[] getSpans(final int n, final int n2, final Class<T> clazz) {
        return (T[])((Spanned)this.g).getSpans(n, n2, (Class)clazz);
    }
    
    public final int length() {
        return ((CharSequence)this.g).length();
    }
    
    public final int nextSpanTransition(final int n, final int n2, final Class clazz) {
        return ((Spanned)this.g).nextSpanTransition(n, n2, clazz);
    }
    
    public final void removeSpan(final Object o) {
        this.a();
        this.g.removeSpan(o);
    }
    
    public final void setSpan(final Object o, final int n, final int n2, final int n3) {
        this.a();
        this.g.setSpan(o, n, n2, n3);
    }
    
    public final CharSequence subSequence(final int n, final int n2) {
        return ((CharSequence)this.g).subSequence(n, n2);
    }
    
    @Override
    public final String toString() {
        return this.g.toString();
    }
    
    public static class a
    {
        public boolean a(final Spannable spannable) {
            return spannable instanceof d;
        }
    }
    
    public static final class b extends a
    {
        @Override
        public final boolean a(final Spannable spannable) {
            return spannable instanceof PrecomputedText || spannable instanceof d;
        }
    }
}
