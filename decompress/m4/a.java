// 
// Decompiled by Procyon v0.6.0
// 

package m4;

import java.util.Arrays;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.Spannable;
import n4.i;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import android.text.Selection;
import android.text.Editable;
import android.view.inputmethod.InputConnection;
import ej2.c0;
import android.os.Looper;
import android.os.Handler;
import j0.d;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class a
{
    public static final Object g;
    public static volatile a h;
    public final ReentrantReadWriteLock a;
    public final j0.d b;
    public int c;
    public final Handler d;
    public final a.a$a e;
    public final f f;
    
    static {
        g = new Object();
    }
    
    public a(final m4.e e) {
        final ReentrantReadWriteLock a = new ReentrantReadWriteLock();
        this.a = a;
        this.c = 3;
        this.f = ((c)e).a;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new j0.d();
        final a.a$a e2 = new a.a$a(this);
        this.e = e2;
        a.writeLock().lock();
        try {
            this.c = 0;
            a.writeLock().unlock();
            if (this.b() == 0) {
                e2.a();
            }
        }
        finally {
            this.a.writeLock().unlock();
        }
    }
    
    public static a a() {
        synchronized (a.g) {
            c0.M2("EmojiCompat is not initialized. Please call EmojiCompat.init() first", a.h != null);
            return a.h;
        }
    }
    
    public static boolean c(final InputConnection inputConnection, final Editable editable, int n, int i, final boolean b) {
        boolean b3;
        final boolean b2 = b3 = false;
        if (editable != null) {
            if (inputConnection == null) {
                b3 = b2;
            }
            else {
                b3 = b2;
                if (n >= 0) {
                    if (i < 0) {
                        b3 = b2;
                    }
                    else {
                        final int selectionStart = Selection.getSelectionStart((CharSequence)editable);
                        final int selectionEnd = Selection.getSelectionEnd((CharSequence)editable);
                        if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) {
                            b3 = b2;
                        }
                        else {
                            int n4;
                            if (b) {
                                final int max = Math.max(n, 0);
                                n = ((CharSequence)editable).length();
                                Label_0239: {
                                    Label_0237: {
                                        if (selectionStart >= 0) {
                                            if (n >= selectionStart) {
                                                n = selectionStart;
                                                int j;
                                                if ((j = max) >= 0) {
                                                Label_0144:
                                                    while (true) {
                                                        int n2 = 0;
                                                        while (j != 0) {
                                                            if (--n < 0) {
                                                                if (n2 != 0) {
                                                                    break Label_0237;
                                                                }
                                                                n = 0;
                                                                break;
                                                            }
                                                            else {
                                                                final char char1 = ((CharSequence)editable).charAt(n);
                                                                if (n2 != 0) {
                                                                    if (!Character.isHighSurrogate(char1)) {
                                                                        break Label_0237;
                                                                    }
                                                                    --j;
                                                                    continue Label_0144;
                                                                }
                                                                else if (!Character.isSurrogate(char1)) {
                                                                    --j;
                                                                }
                                                                else {
                                                                    if (Character.isHighSurrogate(char1)) {
                                                                        break Label_0237;
                                                                    }
                                                                    n2 = 1;
                                                                }
                                                            }
                                                        }
                                                        break Label_0239;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    n = -1;
                                }
                                final int max2 = Math.max(i, 0);
                                final int length = ((CharSequence)editable).length();
                                Label_0385: {
                                    Label_0383: {
                                        if (selectionEnd >= 0) {
                                            if (length >= selectionEnd) {
                                                i = selectionEnd;
                                                int k;
                                                if ((k = max2) >= 0) {
                                                Label_0284:
                                                    while (true) {
                                                        int n3 = 0;
                                                        while (k != 0) {
                                                            if (i >= length) {
                                                                i = length;
                                                                if (n3 != 0) {
                                                                    break Label_0383;
                                                                }
                                                                break;
                                                            }
                                                            else {
                                                                final char char2 = ((CharSequence)editable).charAt(i);
                                                                if (n3 != 0) {
                                                                    if (!Character.isLowSurrogate(char2)) {
                                                                        break Label_0383;
                                                                    }
                                                                    --k;
                                                                    ++i;
                                                                    continue Label_0284;
                                                                }
                                                                else if (!Character.isSurrogate(char2)) {
                                                                    --k;
                                                                    ++i;
                                                                }
                                                                else {
                                                                    if (Character.isLowSurrogate(char2)) {
                                                                        break Label_0383;
                                                                    }
                                                                    ++i;
                                                                    n3 = 1;
                                                                }
                                                            }
                                                        }
                                                        break Label_0385;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = -1;
                                }
                                b3 = b2;
                                if (n == -1) {
                                    return b3;
                                }
                                if ((n4 = i) == -1) {
                                    b3 = b2;
                                    return b3;
                                }
                            }
                            else {
                                n = Math.max(selectionStart - n, 0);
                                n4 = Math.min(selectionEnd + i, ((CharSequence)editable).length());
                            }
                            final m4.d[] array = (m4.d[])((Spanned)editable).getSpans(n, n4, (Class)m4.d.class);
                            b3 = b2;
                            if (array != null) {
                                b3 = b2;
                                if (array.length > 0) {
                                    int length2;
                                    m4.d d;
                                    int spanStart;
                                    int spanEnd;
                                    for (length2 = array.length, i = 0; i < length2; ++i) {
                                        d = array[i];
                                        spanStart = ((Spanned)editable).getSpanStart((Object)d);
                                        spanEnd = ((Spanned)editable).getSpanEnd((Object)d);
                                        n = Math.min(spanStart, n);
                                        n4 = Math.max(spanEnd, n4);
                                    }
                                    n = Math.max(n, 0);
                                    i = Math.min(n4, ((CharSequence)editable).length());
                                    inputConnection.beginBatchEdit();
                                    editable.delete(n, i);
                                    inputConnection.endBatchEdit();
                                    b3 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return b3;
    }
    
    public final int b() {
        this.a.readLock().lock();
        try {
            return this.c;
        }
        finally {
            this.a.readLock().unlock();
        }
    }
    
    public final void d(final Throwable t) {
        final ArrayList list = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            list.addAll((Collection)this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post((Runnable)new e(list, this.c, t));
        }
        finally {
            this.a.writeLock().unlock();
        }
    }
    
    public final void e() {
        final ArrayList list = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 1;
            list.addAll((Collection)this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post((Runnable)new e(list, this.c, null));
        }
        finally {
            this.a.writeLock().unlock();
        }
    }
    
    public final CharSequence f(int n, int max, final CharSequence charSequence, int codePoint, int n2) {
        int min = n;
        c0.M2("Not initialized yet", this.b() == 1);
        c0.G2(min, "start cannot be negative");
        c0.G2(max, "end cannot be negative");
        c0.G2(codePoint, "maxEmojiCount cannot be negative");
        c0.D2(min <= max, "start should be <= than end");
        if (charSequence == null) {
            return charSequence;
        }
        c0.D2(min <= charSequence.length(), "start should be < than charSequence length");
        c0.D2(max <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() != 0) {
            if (min != max) {
                if (n2 != 1) {
                    n2 = 0;
                }
                else {
                    n2 = 1;
                }
                final m4.c b = this.e.b;
                b.getClass();
                final boolean b2 = charSequence instanceof i;
                if (b2) {
                    ((i)charSequence).a();
                }
                final CharSequence charSequence2 = null;
                Label_0262: {
                    if (b2) {
                        break Label_0262;
                    }
                    try {
                        Object o;
                        if (charSequence instanceof Spannable) {
                            o = charSequence;
                        }
                        else {
                            o = charSequence2;
                            if (charSequence instanceof Spanned) {
                                o = charSequence2;
                                if (((Spanned)charSequence).nextSpanTransition(min - 1, max + 1, (Class)m4.d.class) <= max) {
                                    o = new SpannableString(charSequence);
                                }
                            }
                        }
                        n = min;
                        int n3 = max;
                        if (o != null) {
                            final m4.d[] array = (m4.d[])((Spanned)o).getSpans(min, max, (Class)m4.d.class);
                            n = min;
                            n3 = max;
                            if (array != null) {
                                n = min;
                                n3 = max;
                                if (array.length > 0) {
                                    final int length = array.length;
                                    int n4 = 0;
                                    while (true) {
                                        n = min;
                                        n3 = max;
                                        if (n4 >= length) {
                                            break;
                                        }
                                        final m4.d d = array[n4];
                                        final int spanStart = ((Spanned)o).getSpanStart((Object)d);
                                        n = ((Spanned)o).getSpanEnd((Object)d);
                                        if (spanStart != max) {
                                            ((Spannable)o).removeSpan((Object)d);
                                        }
                                        min = Math.min(spanStart, min);
                                        max = Math.max(n, max);
                                        ++n4;
                                    }
                                }
                            }
                        }
                        CharSequence charSequence3;
                        if (n != n3 && n < charSequence.length()) {
                            int n5;
                            if ((n5 = codePoint) != Integer.MAX_VALUE) {
                                n5 = codePoint;
                                if (o != null) {
                                    n5 = codePoint - ((m4.d[])((Spanned)o).getSpans(0, ((CharSequence)o).length(), (Class)m4.d.class)).length;
                                }
                            }
                            final m4.c.b b3 = new m4.c.b(b.b.c, b.d, b.e);
                            codePoint = Character.codePointAt(charSequence, n);
                            int n6 = 0;
                            max = n;
                        Label_0509:
                            while (true) {
                                n = codePoint;
                                codePoint = max;
                                while (max < n3 && n6 < n5) {
                                    final int a = b3.a(n);
                                    int n8;
                                    if (a != 1) {
                                        if (a != 2) {
                                            if (a == 3) {
                                                Object o2 = null;
                                                int n7 = 0;
                                                Label_0665: {
                                                    if (n2 == 0) {
                                                        o2 = o;
                                                        n7 = n6;
                                                        if (b.b(charSequence, codePoint, max, b3.d.b)) {
                                                            break Label_0665;
                                                        }
                                                    }
                                                    if ((o2 = o) == null) {
                                                        o2 = new SpannableString(charSequence);
                                                    }
                                                    final m4.b b4 = b3.d.b;
                                                    b.a.getClass();
                                                    ((Spannable)o2).setSpan((Object)new m4.i(b4), codePoint, max, 33);
                                                    n7 = n6 + 1;
                                                }
                                                o = o2;
                                                codePoint = n;
                                                n6 = n7;
                                                continue Label_0509;
                                            }
                                            n8 = codePoint;
                                        }
                                        else {
                                            final int n9 = max += Character.charCount(n);
                                            n8 = codePoint;
                                            if (n9 < n3) {
                                                n = Character.codePointAt(charSequence, n9);
                                                max = n9;
                                                n8 = codePoint;
                                            }
                                        }
                                    }
                                    else {
                                        max = Character.charCount(Character.codePointAt(charSequence, codePoint)) + codePoint;
                                        if (max < n3) {
                                            n = Character.codePointAt(charSequence, max);
                                        }
                                        n8 = max;
                                    }
                                    codePoint = n8;
                                }
                                break;
                            }
                            Label_0808: {
                                if (b3.a == 2 && b3.c.b != null) {
                                    final int f = b3.f;
                                    final int n10 = n = 1;
                                    if (f > 1) {
                                        break Label_0808;
                                    }
                                    if (b3.c()) {
                                        n = n10;
                                        break Label_0808;
                                    }
                                }
                                n = 0;
                            }
                            Object o3 = o;
                            Label_0921: {
                                if (n != 0) {
                                    o3 = o;
                                    if (n6 < n5) {
                                        if (n2 == 0) {
                                            o3 = o;
                                            if (b.b(charSequence, codePoint, max, b3.c.b)) {
                                                break Label_0921;
                                            }
                                        }
                                        if ((o3 = o) == null) {
                                            o3 = new SpannableString(charSequence);
                                        }
                                        final m4.b b5 = b3.c.b;
                                        b.a.getClass();
                                        ((Spannable)o3).setSpan((Object)new m4.i(b5), codePoint, max, 33);
                                    }
                                }
                            }
                            Object o4;
                            if ((o4 = o3) == null) {
                                o4 = charSequence;
                            }
                            charSequence3 = (CharSequence)o4;
                            if (b2) {
                                ((i)charSequence).b();
                                charSequence3 = (CharSequence)o4;
                            }
                        }
                        else {
                            if (b2) {
                                ((i)charSequence).b();
                            }
                            charSequence3 = charSequence;
                        }
                        return charSequence3;
                    }
                    finally {
                        if (b2) {
                            ((i)charSequence).b();
                        }
                    }
                }
            }
        }
        return charSequence;
    }
    
    public final void g(final d d) {
        c0.J2((Object)d, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            final int c = this.c;
            if (c != 1 && c != 2) {
                this.b.add((Object)d);
            }
            else {
                this.d.post((Runnable)new e(Arrays.asList(d), c, null));
            }
        }
        finally {
            this.a.writeLock().unlock();
        }
    }
    
    public static class b
    {
        public final a a;
        
        public b(final a a) {
            this.a = a;
        }
    }
    
    public abstract static class c
    {
        public final f a;
        
        public c(final e$b a) {
            this.a = (f)a;
        }
    }
    
    public abstract static class d
    {
        public void a() {
        }
    }
    
    public static final class e implements Runnable
    {
        public final ArrayList f;
        public final int g;
        
        public e(final List list, final int g, final Throwable t) {
            c0.J2((Object)list, "initCallbacks cannot be null");
            this.f = new ArrayList(list);
            this.g = g;
        }
        
        @Override
        public final void run() {
            final int size = this.f.size();
            final int g = this.g;
            int i = 0;
            final int n = 0;
            if (g != 1) {
                for (int j = n; j < size; ++j) {
                    ((d)this.f.get(j)).getClass();
                }
            }
            else {
                while (i < size) {
                    ((d)this.f.get(i)).a();
                    ++i;
                }
            }
        }
    }
    
    public interface f
    {
    }
    
    public abstract static class g
    {
        public abstract void a(final m4.h p0);
    }
    
    public static final class h
    {
    }
}
