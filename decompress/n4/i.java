// 
// Decompiled by Procyon v0.6.0
// 

package n4;

import m4.d;
import android.text.Spannable;
import java.util.concurrent.atomic.AtomicInteger;
import android.text.SpanWatcher;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.io.IOException;
import android.text.Editable;
import ej2.c0;
import java.util.ArrayList;
import android.text.SpannableStringBuilder;

public final class i extends SpannableStringBuilder
{
    public final Class<?> f;
    public final ArrayList g;
    
    public i(final Class<?> f, final CharSequence charSequence) {
        super(charSequence);
        this.g = new ArrayList();
        c0.J2((Object)f, "watcherClass cannot be null");
        this.f = f;
    }
    
    public i(final Class<?> f, final CharSequence charSequence, final int n, final int n2) {
        super(charSequence, n, n2);
        this.g = new ArrayList();
        c0.J2((Object)f, "watcherClass cannot be null");
        this.f = f;
    }
    
    public final void a() {
        for (int i = 0; i < this.g.size(); ++i) {
            ((a)this.g.get(i)).g.incrementAndGet();
        }
    }
    
    public final Editable append(final char c) {
        super.append(c);
        return (Editable)this;
    }
    
    public final Editable append(final CharSequence charSequence) {
        super.append(charSequence);
        return (Editable)this;
    }
    
    public final Editable append(final CharSequence charSequence, final int n, final int n2) {
        super.append(charSequence, n, n2);
        return (Editable)this;
    }
    
    public final SpannableStringBuilder append(final char c) {
        super.append(c);
        return this;
    }
    
    public final SpannableStringBuilder append(final CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }
    
    public final SpannableStringBuilder append(final CharSequence charSequence, final int n, final int n2) {
        super.append(charSequence, n, n2);
        return this;
    }
    
    public final SpannableStringBuilder append(final CharSequence charSequence, final Object o, final int n) {
        super.append(charSequence, o, n);
        return this;
    }
    
    public final Appendable append(final char c) throws IOException {
        super.append(c);
        return (Appendable)this;
    }
    
    public final Appendable append(final CharSequence charSequence) throws IOException {
        super.append(charSequence);
        return (Appendable)this;
    }
    
    public final Appendable append(final CharSequence charSequence, final int n, final int n2) throws IOException {
        super.append(charSequence, n, n2);
        return (Appendable)this;
    }
    
    public final void b() {
        this.e();
        for (int i = 0; i < this.g.size(); ++i) {
            ((a)this.g.get(i)).onTextChanged((CharSequence)this, 0, this.length(), this.length());
        }
    }
    
    public final a c(final Object o) {
        for (int i = 0; i < this.g.size(); ++i) {
            final a a = this.g.get(i);
            if (a.f == o) {
                return a;
            }
        }
        return null;
    }
    
    public final boolean d(final Object o) {
        boolean b = true;
        if (o == null || this.f != o.getClass()) {
            b = false;
        }
        return b;
    }
    
    public final Editable delete(final int n, final int n2) {
        super.delete(n, n2);
        return (Editable)this;
    }
    
    public final SpannableStringBuilder delete(final int n, final int n2) {
        super.delete(n, n2);
        return this;
    }
    
    public final void e() {
        for (int i = 0; i < this.g.size(); ++i) {
            ((a)this.g.get(i)).g.decrementAndGet();
        }
    }
    
    public final int getSpanEnd(final Object o) {
        Object o2 = o;
        if (this.d(o)) {
            final a c = this.c(o);
            o2 = o;
            if (c != null) {
                o2 = c;
            }
        }
        return super.getSpanEnd(o2);
    }
    
    public final int getSpanFlags(final Object o) {
        Object o2 = o;
        if (this.d(o)) {
            final a c = this.c(o);
            o2 = o;
            if (c != null) {
                o2 = c;
            }
        }
        return super.getSpanFlags(o2);
    }
    
    public final int getSpanStart(final Object o) {
        Object o2 = o;
        if (this.d(o)) {
            final a c = this.c(o);
            o2 = o;
            if (c != null) {
                o2 = c;
            }
        }
        return super.getSpanStart(o2);
    }
    
    public final <T> T[] getSpans(int i, final int n, final Class<T> clazz) {
        final Class<?> f = this.f;
        final int n2 = 0;
        if (f == clazz) {
            final a[] array = (a[])super.getSpans(i, n, (Class)a.class);
            final Object[] array2 = (Object[])Array.newInstance(clazz, array.length);
            for (i = n2; i < array.length; ++i) {
                array2[i] = array[i].f;
            }
            return (T[])array2;
        }
        return (T[])super.getSpans(i, n, (Class)clazz);
    }
    
    public final Editable insert(final int n, final CharSequence charSequence) {
        super.insert(n, charSequence);
        return (Editable)this;
    }
    
    public final Editable insert(final int n, final CharSequence charSequence, final int n2, final int n3) {
        super.insert(n, charSequence, n2, n3);
        return (Editable)this;
    }
    
    public final SpannableStringBuilder insert(final int n, final CharSequence charSequence) {
        super.insert(n, charSequence);
        return this;
    }
    
    public final SpannableStringBuilder insert(final int n, final CharSequence charSequence, final int n2, final int n3) {
        super.insert(n, charSequence, n2, n3);
        return this;
    }
    
    public final int nextSpanTransition(final int n, final int n2, Class clazz) {
        if (this.f == clazz) {
            clazz = a.class;
        }
        return super.nextSpanTransition(n, n2, (Class)clazz);
    }
    
    public final void removeSpan(Object o) {
        a a;
        if (this.d(o)) {
            final a c = this.c(o);
            if ((a = c) != null) {
                o = c;
                a = c;
            }
        }
        else {
            a = null;
        }
        super.removeSpan(o);
        if (a != null) {
            this.g.remove(a);
        }
    }
    
    public final SpannableStringBuilder replace(final int n, final int n2, final CharSequence charSequence) {
        this.a();
        super.replace(n, n2, charSequence);
        this.e();
        return this;
    }
    
    public final SpannableStringBuilder replace(final int n, final int n2, final CharSequence charSequence, final int n3, final int n4) {
        this.a();
        super.replace(n, n2, charSequence, n3, n4);
        this.e();
        return this;
    }
    
    public final void setSpan(final Object o, final int n, final int n2, final int n3) {
        Object o2 = o;
        if (this.d(o)) {
            o2 = new a(o);
            this.g.add(o2);
        }
        super.setSpan(o2, n, n2, n3);
    }
    
    public final CharSequence subSequence(final int n, final int n2) {
        return (CharSequence)new i(this.f, (CharSequence)this, n, n2);
    }
    
    public static final class a implements TextWatcher, SpanWatcher
    {
        public final Object f;
        public final AtomicInteger g;
        
        public a(final Object f) {
            this.g = new AtomicInteger(0);
            this.f = f;
        }
        
        public final void afterTextChanged(final Editable editable) {
            ((TextWatcher)this.f).afterTextChanged(editable);
        }
        
        public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
            ((TextWatcher)this.f).beforeTextChanged(charSequence, n, n2, n3);
        }
        
        public final void onSpanAdded(final Spannable spannable, final Object o, final int n, final int n2) {
            if (this.g.get() > 0 && o instanceof d) {
                return;
            }
            ((SpanWatcher)this.f).onSpanAdded(spannable, o, n, n2);
        }
        
        public final void onSpanChanged(final Spannable spannable, final Object o, final int n, final int n2, final int n3, final int n4) {
            if (this.g.get() > 0 && o instanceof d) {
                return;
            }
            ((SpanWatcher)this.f).onSpanChanged(spannable, o, n, n2, n3, n4);
        }
        
        public final void onSpanRemoved(final Spannable spannable, final Object o, final int n, final int n2) {
            if (this.g.get() > 0 && o instanceof d) {
                return;
            }
            ((SpanWatcher)this.f).onSpanRemoved(spannable, o, n, n2);
        }
        
        public final void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
            ((TextWatcher)this.f).onTextChanged(charSequence, n, n2, n3);
        }
    }
}
