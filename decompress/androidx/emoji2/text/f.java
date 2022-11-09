// 
// Decompiled by Procyon v0.6.0
// 

package androidx.emoji2.text;

import java.util.Arrays;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.Spannable;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import mj2.c0;
import android.os.Looper;
import android.os.Handler;
import j0.d;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class f
{
    public static final Object i;
    public static volatile f j;
    public final ReentrantReadWriteLock a;
    public final j0.d b;
    public volatile int c;
    public final Handler d;
    public final a e;
    public final g f;
    public final int g;
    public final androidx.emoji2.text.d h;
    
    static {
        i = new Object();
    }
    
    public f(EmojiCompatInitializer.a e) {
        final ReentrantReadWriteLock a = new ReentrantReadWriteLock();
        this.a = a;
        this.c = 3;
        final g a2 = ((c)e).a;
        this.f = a2;
        final int b = ((c)e).b;
        this.g = b;
        this.h = ((c)e).c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new j0.d();
        e = new a(this);
        this.e = (a)e;
        a.writeLock().lock();
        if (b == 0) {
            try {
                this.c = 0;
            }
            finally {
                this.a.writeLock().unlock();
            }
        }
        a.writeLock().unlock();
        if (this.b() == 0) {
            try {
                a2.a(new androidx.emoji2.text.e((a)e));
            }
            finally {
                final Throwable t;
                ((b)e).a.d(t);
            }
        }
    }
    
    public static f a() {
        synchronized (f.i) {
            final f j = f.j;
            c0.t("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", j != null);
            return j;
        }
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
    
    public final void c() {
        final int g = this.g;
        boolean b = true;
        c0.t("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", g == 1);
        if (this.b() != 1) {
            b = false;
        }
        if (b) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            final a e = this.e;
            e.getClass();
            try {
                ((b)e).a.f.a(new androidx.emoji2.text.e(e));
            }
            finally {
                final Throwable t;
                ((b)e).a.d(t);
            }
        }
        finally {
            this.a.writeLock().unlock();
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
            this.d.post((Runnable)new f(list, this.c, t));
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
            this.d.post((Runnable)new f(list, this.c, null));
        }
        finally {
            this.a.writeLock().unlock();
        }
    }
    
    public final CharSequence f(int spanEnd, int n, final CharSequence charSequence) {
        int min = spanEnd;
        c0.t("Not initialized yet", this.b() == 1);
        c0.r(min, "start cannot be negative");
        c0.r(n, "end cannot be negative");
        c0.r(Integer.MAX_VALUE, "maxEmojiCount cannot be negative");
        c0.o(min <= n, "start should be <= than end");
        final q q = null;
        if (charSequence == null) {
            return null;
        }
        c0.o(min <= charSequence.length(), "start should be < than charSequence length");
        c0.o(n <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() != 0) {
            if (min != n) {
                final j b = this.e.b;
                b.getClass();
                final boolean b2 = charSequence instanceof o;
                if (b2) {
                    ((o)charSequence).a();
                }
                Label_0247: {
                    if (b2) {
                        break Label_0247;
                    }
                    try {
                        q q2;
                        if (charSequence instanceof Spannable) {
                            q2 = new q((Spannable)charSequence);
                        }
                        else {
                            q2 = q;
                            if (charSequence instanceof Spanned) {
                                q2 = q;
                                if (((Spanned)charSequence).nextSpanTransition(min - 1, n + 1, (Class)k.class) <= n) {
                                    q2 = new q(charSequence);
                                }
                            }
                        }
                        spanEnd = min;
                        int n2 = n;
                        if (q2 != null) {
                            final k[] array = q2.getSpans(min, n, k.class);
                            spanEnd = min;
                            n2 = n;
                            if (array != null) {
                                spanEnd = min;
                                n2 = n;
                                if (array.length > 0) {
                                    final int length = array.length;
                                    int n3 = 0;
                                    while (true) {
                                        spanEnd = min;
                                        n2 = n;
                                        if (n3 >= length) {
                                            break;
                                        }
                                        final k k = array[n3];
                                        final int spanStart = q2.getSpanStart(k);
                                        spanEnd = q2.getSpanEnd(k);
                                        if (spanStart != n) {
                                            q2.removeSpan(k);
                                        }
                                        min = Math.min(spanStart, min);
                                        n = Math.max(spanEnd, n);
                                        ++n3;
                                    }
                                }
                            }
                        }
                        if (spanEnd != n2 && spanEnd < charSequence.length()) {
                            final j.a a = new j.a(b.b.c);
                            n = Character.codePointAt(charSequence, spanEnd);
                            int n4 = 0;
                            int n5 = 0;
                        Label_0435:
                            while (true) {
                                n5 = spanEnd;
                                while (n5 < n2 && n4 < Integer.MAX_VALUE) {
                                    final int a2 = a.a(n);
                                    if (a2 != 1) {
                                        if (a2 != 2) {
                                            if (a2 != 3) {
                                                continue;
                                            }
                                            q q3 = q2;
                                            int n6 = n4;
                                            if (!b.b(charSequence, spanEnd, n5, a.d.b)) {
                                                if ((q3 = q2) == null) {
                                                    q3 = new q((Spannable)new SpannableString(charSequence));
                                                }
                                                final androidx.emoji2.text.i b3 = a.d.b;
                                                b.a.getClass();
                                                q3.setSpan(new p(b3), spanEnd, n5, 33);
                                                n6 = n4 + 1;
                                            }
                                            spanEnd = n5;
                                            q2 = q3;
                                            n4 = n6;
                                            continue Label_0435;
                                        }
                                        else {
                                            final int n7 = n5 + Character.charCount(n);
                                            if ((n5 = n7) >= n2) {
                                                continue;
                                            }
                                            n = Character.codePointAt(charSequence, n7);
                                            n5 = n7;
                                        }
                                    }
                                    else {
                                        final int n8 = Character.charCount(Character.codePointAt(charSequence, spanEnd)) + spanEnd;
                                        if ((spanEnd = n8) < n2) {
                                            n = Character.codePointAt(charSequence, n8);
                                            spanEnd = n8;
                                            continue Label_0435;
                                        }
                                        continue Label_0435;
                                    }
                                }
                                break;
                            }
                            if (a.a == 2 && a.c.b != null && (a.f > 1 || a.c())) {
                                n = 1;
                            }
                            else {
                                n = 0;
                            }
                            q q4 = q2;
                            if (n != 0) {
                                q4 = q2;
                                if (n4 < Integer.MAX_VALUE) {
                                    q4 = q2;
                                    if (!b.b(charSequence, spanEnd, n5, a.c.b)) {
                                        if ((q4 = q2) == null) {
                                            q4 = new q(charSequence);
                                        }
                                        final androidx.emoji2.text.i b4 = a.c.b;
                                        b.a.getClass();
                                        q4.setSpan(new p(b4), spanEnd, n5, 33);
                                    }
                                }
                            }
                            if (q4 != null) {
                                Object g;
                                final Spannable spannable = (Spannable)(g = q4.g);
                                if (b2) {
                                    ((o)charSequence).b();
                                    g = spannable;
                                    return (CharSequence)g;
                                }
                                return (CharSequence)g;
                            }
                            else if (!b2) {
                                return charSequence;
                            }
                        }
                        else if (!b2) {
                            return charSequence;
                        }
                        ((o)charSequence).b();
                        Object g = charSequence;
                        return (CharSequence)g;
                    }
                    finally {
                        if (b2) {
                            ((o)charSequence).b();
                        }
                    }
                }
            }
        }
        return charSequence;
    }
    
    public final void g(final e e) {
        c0.s((Object)e, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.b.add((Object)e);
            }
            else {
                this.d.post((Runnable)new f(Arrays.asList(e), this.c, null));
            }
        }
        finally {
            this.a.writeLock().unlock();
        }
    }
    
    public static final class a extends b
    {
        public volatile j b;
        public volatile n c;
        
        public a(final f f) {
            super(f);
        }
    }
    
    public static class b
    {
        public final f a;
        
        public b(final f a) {
            this.a = a;
        }
    }
    
    public abstract static class c
    {
        public final g a;
        public int b;
        public androidx.emoji2.text.d c;
        
        public c(final g a) {
            this.b = 0;
            this.c = new androidx.emoji2.text.d();
            this.a = a;
        }
    }
    
    public interface d
    {
    }
    
    public abstract static class e
    {
        public void a() {
        }
        
        public void b() {
        }
    }
    
    public static final class f implements Runnable
    {
        public final ArrayList f;
        public final int g;
        
        public f(final List list, final int g, final Throwable t) {
            c0.s((Object)list, "initCallbacks cannot be null");
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
                    ((e)this.f.get(j)).a();
                }
            }
            else {
                while (i < size) {
                    ((e)this.f.get(i)).b();
                    ++i;
                }
            }
        }
    }
    
    public interface g
    {
        void a(final h p0);
    }
    
    public abstract static class h
    {
        public abstract void a(final Throwable p0);
        
        public abstract void b(final n p0);
    }
    
    public static final class i
    {
    }
}
