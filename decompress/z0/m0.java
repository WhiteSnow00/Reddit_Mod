// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import androidx.compose.runtime.ComposerKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;
import java.util.List;

public final class m0
{
    public final List a = a;
    
    public final void a(final int n) {
        Label_0064: {
            if (this.a.isEmpty() ^ true) {
                if (this.a.get(0).intValue() != n) {
                    final List a = this.a;
                    if (((Number)a.get(a.size() - 1)).intValue() != n) {
                        break Label_0064;
                    }
                }
                return;
            }
        }
        int i = this.a.size();
        this.a.add(n);
        while (i > 0) {
            final int n2 = (i + 1 >>> 1) - 1;
            final int intValue = this.a.get(n2).intValue();
            if (n <= intValue) {
                break;
            }
            this.a.set(i, intValue);
            i = n2;
        }
        this.a.set(i, n);
    }
    
    public final Object b() {
        if (this.a.isEmpty() ^ true) {
            final List a = this.a;
            return a.remove(a.size() - 1);
        }
        throw new IllegalStateException("Stack is empty.".toString());
    }
    
    public final void c(final Object o) {
        this.a.add(o);
    }
    
    public final int d() {
        if (this.a.size() > 0) {
            final int intValue = this.a.get(0).intValue();
            while ((this.a.isEmpty() ^ true) && this.a.get(0).intValue() == intValue) {
                final List a = this.a;
                a.set(0, CollectionsKt___CollectionsKt.A1(a));
                final List a2 = this.a;
                a2.remove(a2.size() - 1);
                final int size = this.a.size();
                final int size2 = this.a.size();
                int i = 0;
                while (i < size2 >>> 1) {
                    final int intValue2 = this.a.get(i).intValue();
                    final int n = (i + 1) * 2;
                    final int n2 = n - 1;
                    final int intValue3 = this.a.get(n2).intValue();
                    if (n < size) {
                        final int intValue4 = this.a.get(n).intValue();
                        if (intValue4 > intValue3) {
                            if (intValue4 > intValue2) {
                                this.a.set(i, intValue4);
                                this.a.set(n, intValue2);
                                i = n;
                                continue;
                            }
                            break;
                        }
                    }
                    if (intValue3 <= intValue2) {
                        break;
                    }
                    this.a.set(i, intValue3);
                    this.a.set(n2, intValue2);
                    i = n2;
                }
            }
            return intValue;
        }
        ComposerKt.c("Set is empty".toString());
        throw null;
    }
}
