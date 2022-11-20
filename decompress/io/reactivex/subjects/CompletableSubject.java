// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.subjects;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import af2.c;
import af2.a;

public final class CompletableSubject extends a implements c
{
    public static final CompletableDisposable[] i;
    public static final CompletableDisposable[] j;
    public final AtomicReference<CompletableDisposable[]> f;
    public final AtomicBoolean g;
    public Throwable h;
    
    static {
        i = new CompletableDisposable[0];
        j = new CompletableDisposable[0];
    }
    
    public CompletableSubject() {
        this.g = new AtomicBoolean();
        this.f = new AtomicReference<CompletableDisposable[]>(CompletableSubject.i);
    }
    
    public final boolean C() {
        return this.f.get() == CompletableSubject.j && this.h == null;
    }
    
    public final void D(final CompletableDisposable completableDisposable) {
        int i;
    Label_0150:
        do {
            final CompletableDisposable[] array = this.f.get();
            final int length = array.length;
            if (length == 0) {
                return;
            }
            final int n = -1;
            final int n2 = 0;
            int n3 = 0;
            int n4;
            while (true) {
                n4 = n;
                if (n3 >= length) {
                    break;
                }
                if (array[n3] == completableDisposable) {
                    n4 = n3;
                    break;
                }
                ++n3;
            }
            if (n4 < 0) {
                return;
            }
            CompletableDisposable[] j;
            if (length == 1) {
                j = CompletableSubject.i;
            }
            else {
                j = new CompletableDisposable[length - 1];
                System.arraycopy(array, 0, j, 0, n4);
                System.arraycopy(array, n4 + 1, j, n4, length - n4 - 1);
            }
            final AtomicReference<CompletableDisposable[]> f = this.f;
            while (!f.compareAndSet(array, j)) {
                if (f.get() != array) {
                    i = n2;
                    continue Label_0150;
                }
            }
            i = 1;
        } while (i == 0);
    }
    
    public final void onComplete() {
        final AtomicBoolean g = this.g;
        int i = 0;
        if (g.compareAndSet(false, true)) {
            for (CompletableDisposable[] array = this.f.getAndSet(CompletableSubject.j); i < array.length; ++i) {
                array[i].downstream.onComplete();
            }
        }
    }
    
    public final void onError(final Throwable h) {
        if (h != null) {
            final AtomicBoolean g = this.g;
            int i = 0;
            if (g.compareAndSet(false, true)) {
                this.h = h;
                for (CompletableDisposable[] array = this.f.getAndSet(CompletableSubject.j); i < array.length; ++i) {
                    array[i].downstream.onError(h);
                }
            }
            else {
                RxJavaPlugins.onError(h);
            }
            return;
        }
        throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
    }
    
    public final void onSubscribe(final df2.a a) {
        if (this.f.get() == CompletableSubject.j) {
            a.dispose();
        }
    }
    
    @Override
    public final void w(final c c) {
        final CompletableDisposable completableDisposable = new CompletableDisposable(c, this);
        c.onSubscribe((df2.a)completableDisposable);
    Label_0113:
        while (true) {
            boolean b;
            do {
                final CompletableDisposable[] array = this.f.get();
                final CompletableDisposable[] j = CompletableSubject.j;
                final int n = 0;
                b = false;
                if (array == j) {
                    final int n2 = n;
                    if (n2 != 0) {
                        if (completableDisposable.isDisposed()) {
                            this.D(completableDisposable);
                        }
                    }
                    else {
                        final Throwable h = this.h;
                        if (h != null) {
                            c.onError(h);
                        }
                        else {
                            c.onComplete();
                        }
                    }
                    return;
                }
                final int length = array.length;
                final CompletableDisposable[] array2 = new CompletableDisposable[length + 1];
                System.arraycopy(array, 0, array2, 0, length);
                array2[length] = completableDisposable;
                final AtomicReference<CompletableDisposable[]> f = this.f;
                while (!f.compareAndSet(array, array2)) {
                    if (f.get() != array) {
                        continue Label_0113;
                    }
                }
                b = true;
            } while (!b);
            final int n2 = 1;
            continue;
        }
    }
    
    public static final class CompletableDisposable extends AtomicReference<CompletableSubject> implements df2.a
    {
        private static final long serialVersionUID = -7650903191002190468L;
        public final c downstream;
        
        public CompletableDisposable(final c downstream, final CompletableSubject completableSubject) {
            this.downstream = downstream;
            this.lazySet(completableSubject);
        }
        
        public void dispose() {
            final CompletableSubject completableSubject = this.getAndSet(null);
            if (completableSubject != null) {
                completableSubject.D(this);
            }
        }
        
        public boolean isDisposed() {
            return this.get() == null;
        }
    }
}
