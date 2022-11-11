// 
// Decompiled by Procyon v0.6.0
// 

package yf2;

import io.reactivex.internal.util.NotificationLite;
import qt2.c;

public final class a<T>
{
    public final Object[] a;
    public Object[] b;
    public int c;
    
    public a() {
        final Object[] array = new Object[5];
        this.a = array;
        this.b = array;
    }
    
    public final <U> boolean a(final c<? super U> c) {
        Object[] a = this.a;
        while (true) {
            int i = 0;
            if (a == null) {
                return false;
            }
            while (i < 4) {
                final Object o = a[i];
                if (o == null) {
                    break;
                }
                if (NotificationLite.acceptFull(o, (qt2.c<? super Object>)c)) {
                    return true;
                }
                ++i;
            }
            a = (Object[])a[4];
        }
    }
    
    public final void b(final T t) {
        int c;
        if ((c = this.c) == 4) {
            final Object[] b = new Object[5];
            this.b[4] = b;
            this.b = b;
            c = 0;
        }
        this.b[c] = t;
        this.c = c + 1;
    }
    
    public final void c(final a.a$a<? super T> a$a) {
        for (Object[] a = this.a; a != null; a = (Object[])a[4]) {
            for (int i = 0; i < 4; ++i) {
                final Object o = a[i];
                if (o == null) {
                    break;
                }
                if (a$a.test(o)) {
                    return;
                }
            }
        }
    }
}
