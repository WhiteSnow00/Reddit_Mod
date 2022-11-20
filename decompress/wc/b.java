// 
// Decompiled by Procyon v0.6.0
// 

package wc;

import androidx.compose.runtime.ComposerKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Iterator;
import v20.a;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import nc.f;

public final class b implements f
{
    public final List f;
    
    public b() {
        final ArrayList f = new ArrayList();
        this.f = f;
    }
    
    public b(final int n) {
        if (n != 2) {
            this.f = new ArrayList();
            return;
        }
        this.f = new ArrayList();
    }
    
    public b(final ArrayList list) {
        this.f = Collections.unmodifiableList((List<?>)list);
    }
    
    @Override
    public long a(final int n) {
        ah0.b.C(n == 0);
        return 0L;
    }
    
    public void b(final int n) {
        Label_0067: {
            if (this.f.isEmpty() ^ true) {
                if (this.f.get(0).intValue() != n) {
                    final List f = this.f;
                    if (((Number)f.get(f.size() - 1)).intValue() != n) {
                        break Label_0067;
                    }
                }
                return;
            }
        }
        int i = this.f.size();
        this.f.add(n);
        while (i > 0) {
            final int n2 = (i + 1 >>> 1) - 1;
            final int intValue = this.f.get(n2).intValue();
            if (n <= intValue) {
                break;
            }
            this.f.set(i, intValue);
            i = n2;
        }
        this.f.set(i, n);
    }
    
    @Override
    public int c() {
        return 1;
    }
    
    @Override
    public int d(final long n) {
        int n2;
        if (n < 0L) {
            n2 = 0;
        }
        else {
            n2 = -1;
        }
        return n2;
    }
    
    @Override
    public List e(final long n) {
        List<Object> list;
        if (n >= 0L) {
            list = this.f;
        }
        else {
            list = Collections.emptyList();
        }
        return list;
    }
    
    public void f() {
        final Iterator iterator = this.f.iterator();
        while (iterator.hasNext()) {
            ((a)iterator.next()).invalidate();
        }
    }
    
    public Object g() {
        if (this.f.isEmpty() ^ true) {
            final List f = this.f;
            return f.remove(f.size() - 1);
        }
        throw new IllegalStateException("Stack is empty.".toString());
    }
    
    public void h(final Object o) {
        this.f.add(o);
    }
    
    public int i() {
        if (this.f.size() > 0) {
            final int intValue = this.f.get(0).intValue();
            while ((this.f.isEmpty() ^ true) && this.f.get(0).intValue() == intValue) {
                final List f = this.f;
                f.set(0, CollectionsKt___CollectionsKt.c5(f));
                final List f2 = this.f;
                f2.remove(f2.size() - 1);
                final int size = this.f.size();
                final int size2 = this.f.size();
                int i = 0;
                while (i < size2 >>> 1) {
                    final int intValue2 = this.f.get(i).intValue();
                    final int n = (i + 1) * 2;
                    final int n2 = n - 1;
                    final int intValue3 = this.f.get(n2).intValue();
                    if (n < size) {
                        final int intValue4 = this.f.get(n).intValue();
                        if (intValue4 > intValue3) {
                            if (intValue4 > intValue2) {
                                this.f.set(i, intValue4);
                                this.f.set(n, intValue2);
                                i = n;
                                continue;
                            }
                            break;
                        }
                    }
                    if (intValue3 <= intValue2) {
                        break;
                    }
                    this.f.set(i, intValue3);
                    this.f.set(n2, intValue2);
                    i = n2;
                }
            }
            return intValue;
        }
        ComposerKt.c("Set is empty".toString());
        throw null;
    }
}
