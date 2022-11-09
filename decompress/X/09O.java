// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.Spannable;
import java.util.concurrent.atomic.AtomicInteger;
import android.text.TextWatcher;
import android.text.SpanWatcher;
import java.lang.reflect.Array;
import android.text.Editable;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import java.util.List;
import android.text.SpannableStringBuilder;

public final class 09o extends SpannableStringBuilder
{
    public final Class<?> LIZ;
    public final List<a> LIZIZ;
    
    static {
        Covode.recordClassIndex(1020);
    }
    
    public 09o(final Class<?> liz, final CharSequence charSequence) {
        super(charSequence);
        this.LIZIZ = new ArrayList<a>();
        07U.LIZ(liz, "watcherClass cannot be null");
        this.LIZ = liz;
    }
    
    public 09o(final Class<?> liz, final CharSequence charSequence, final int n, final int n2) {
        super(charSequence, n, n2);
        this.LIZIZ = new ArrayList<a>();
        07U.LIZ(liz, "watcherClass cannot be null");
        this.LIZ = liz;
    }
    
    private boolean LIZ(final Class<?> clazz) {
        return this.LIZ == clazz;
    }
    
    private boolean LIZ(final Object o) {
        return o != null && this.LIZ(o.getClass());
    }
    
    private a LIZIZ(final Object o) {
        for (int i = 0; i < this.LIZIZ.size(); ++i) {
            final a a = this.LIZIZ.get(i);
            if (a.LIZ == o) {
                return a;
            }
        }
        return null;
    }
    
    private void LIZJ() {
        for (int i = 0; i < this.LIZIZ.size(); ++i) {
            this.LIZIZ.get(i).LIZIZ();
        }
    }
    
    private void LIZLLL() {
        for (int i = 0; i < this.LIZIZ.size(); ++i) {
            this.LIZIZ.get(i).onTextChanged((CharSequence)this, 0, this.length(), this.length());
        }
    }
    
    public final void LIZ() {
        this.LIZJ();
        this.LIZLLL();
    }
    
    public final void LIZIZ() {
        for (int i = 0; i < this.LIZIZ.size(); ++i) {
            this.LIZIZ.get(i).LIZ();
        }
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
    
    public final SpannableStringBuilder delete(final int n, final int n2) {
        super.delete(n, n2);
        return this;
    }
    
    public final int getSpanEnd(final Object o) {
        Object o2 = o;
        if (this.LIZ(o)) {
            final a liziz = this.LIZIZ(o);
            o2 = o;
            if (liziz != null) {
                o2 = liziz;
            }
        }
        return super.getSpanEnd(o2);
    }
    
    public final int getSpanFlags(final Object o) {
        Object o2 = o;
        if (this.LIZ(o)) {
            final a liziz = this.LIZIZ(o);
            o2 = o;
            if (liziz != null) {
                o2 = liziz;
            }
        }
        return super.getSpanFlags(o2);
    }
    
    public final int getSpanStart(final Object o) {
        Object o2 = o;
        if (this.LIZ(o)) {
            final a liziz = this.LIZIZ(o);
            o2 = o;
            if (liziz != null) {
                o2 = liziz;
            }
        }
        return super.getSpanStart(o2);
    }
    
    public final <T> T[] getSpans(int i, final int n, final Class<T> clazz) {
        if (this.LIZ(clazz)) {
            final a[] array = (a[])super.getSpans(i, n, (Class)a.class);
            final Object[] array2 = (Object[])Array.newInstance(clazz, array.length);
            for (i = 0; i < array.length; ++i) {
                array2[i] = array[i].LIZ;
            }
            return (T[])array2;
        }
        return (T[])super.getSpans(i, n, (Class)clazz);
    }
    
    public final SpannableStringBuilder insert(final int n, final CharSequence charSequence) {
        super.insert(n, charSequence);
        return this;
    }
    
    public final SpannableStringBuilder insert(final int n, final CharSequence charSequence, final int n2, final int n3) {
        super.insert(n, charSequence, n2, n3);
        return this;
    }
    
    public final int nextSpanTransition(final int n, final int n2, final Class clazz) {
        Class<a> clazz2 = clazz;
        if (this.LIZ(clazz)) {
            clazz2 = a.class;
        }
        return super.nextSpanTransition(n, n2, (Class)clazz2);
    }
    
    public final void removeSpan(Object o) {
        a a;
        if (this.LIZ(o)) {
            final a liziz = this.LIZIZ(o);
            if ((a = liziz) != null) {
                o = liziz;
                a = liziz;
            }
        }
        else {
            a = null;
        }
        super.removeSpan(o);
        if (a != null) {
            this.LIZIZ.remove(a);
        }
    }
    
    public final SpannableStringBuilder replace(final int n, final int n2, final CharSequence charSequence) {
        this.LIZIZ();
        super.replace(n, n2, charSequence);
        this.LIZJ();
        return this;
    }
    
    public final SpannableStringBuilder replace(final int n, final int n2, final CharSequence charSequence, final int n3, final int n4) {
        this.LIZIZ();
        super.replace(n, n2, charSequence, n3, n4);
        this.LIZJ();
        return this;
    }
    
    public final void setSpan(final Object o, final int n, final int n2, final int n3) {
        Object o2 = o;
        if (this.LIZ(o)) {
            o2 = new a(o);
            this.LIZIZ.add((a)o2);
        }
        super.setSpan(o2, n, n2, n3);
    }
    
    public final CharSequence subSequence(final int n, final int n2) {
        return (CharSequence)new 09o(this.LIZ, (CharSequence)this, n, n2);
    }
    
    public static class a implements SpanWatcher, TextWatcher
    {
        public final Object LIZ;
        public final AtomicInteger LIZIZ;
        
        static {
            Covode.recordClassIndex(1021);
        }
        
        public a(final Object liz) {
            this.LIZIZ = new AtomicInteger(0);
            this.LIZ = liz;
        }
        
        public final void LIZ() {
            this.LIZIZ.incrementAndGet();
        }
        
        public final void LIZIZ() {
            this.LIZIZ.decrementAndGet();
        }
        
        public void afterTextChanged(final Editable editable) {
            ((TextWatcher)this.LIZ).afterTextChanged(editable);
        }
        
        public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
            ((TextWatcher)this.LIZ).beforeTextChanged(charSequence, n, n2, n3);
        }
        
        public void onSpanAdded(final Spannable spannable, final Object o, final int n, final int n2) {
            if (this.LIZIZ.get() > 0 && o instanceof 09P) {
                return;
            }
            ((SpanWatcher)this.LIZ).onSpanAdded(spannable, o, n, n2);
        }
        
        public void onSpanChanged(final Spannable spannable, final Object o, final int n, final int n2, final int n3, final int n4) {
            if (this.LIZIZ.get() > 0 && o instanceof 09P) {
                return;
            }
            ((SpanWatcher)this.LIZ).onSpanChanged(spannable, o, n, n2, n3, n4);
        }
        
        public void onSpanRemoved(final Spannable spannable, final Object o, final int n, final int n2) {
            if (this.LIZIZ.get() > 0 && o instanceof 09P) {
                return;
            }
            ((SpanWatcher)this.LIZ).onSpanRemoved(spannable, o, n, n2);
        }
        
        public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
            ((TextWatcher)this.LIZ).onTextChanged(charSequence, n, n2, n3);
        }
    }
}
