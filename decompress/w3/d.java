// 
// Decompiled by Procyon v0.6.0
// 

package w3;

import com.google.common.collect.Ordering;
import bd.c0;
import zb.b;
import j2.g;
import com.google.common.collect.h$a;
import e2.n;
import java.util.Collection;
import java.util.Collections;
import ec.a;
import java.util.List;
import xc.d$h;
import com.google.android.exoplayer2.ui.d$b;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.util.Comparator;

public final class d implements Comparator
{
    public final int f;
    
    public d(final int f) {
        this.f = f;
    }
    
    @Override
    public final int compare(final Object o, final Object o2) {
        final int f = this.f;
        int n = -1;
        final int n2 = 0;
        switch (f) {
            default: {
                return CrashlyticsReportPersistence.c((File)o, (File)o2);
            }
            case 6: {
                final d$b d$b = (d$b)o;
                final d$b d$b2 = (d$b)o2;
                int n3 = Integer.compare(d$b2.a, d$b.a);
                if (n3 == 0) {
                    n3 = d$b2.c.compareTo(d$b.c);
                    if (n3 == 0) {
                        n3 = d$b2.d.compareTo(d$b.d);
                    }
                }
                return n3;
            }
            case 5: {
                return d$h.e((d$h)o, (d$h)o2);
            }
            case 4: {
                return d$h.d((d$h)o, (d$h)o2);
            }
            case 3: {
                final List list = (List)o;
                final List list2 = (List)o2;
                return h$a.f(new a(2).compare((Object)Collections.max((Collection<? extends d$h>)list, (Comparator<? super d$h>)new d(4)), (Object)Collections.max((Collection<?>)list2, (Comparator<? super Object>)new n(5)))).a(list.size(), list2.size()).b((Comparator)new d(5), (Object)Collections.max((Collection<? extends d$h>)list, (Comparator<? super d$h>)new kc.d(3)), (Object)Collections.max((Collection<?>)list2, (Comparator<? super Object>)new g(4))).e();
            }
            case 2: {
                final Integer n4 = (Integer)o;
                final Integer n5 = (Integer)o2;
                final Ordering<Integer> e = xc.d.e;
                if (n4 == -1) {
                    if (n5 == -1) {
                        n = 0;
                    }
                }
                else if (n5 == -1) {
                    n = 1;
                }
                else {
                    n = n4 - n5;
                }
                return n;
            }
            case 1: {
                final b b = (b)o;
                final b b2 = (b)o2;
                final int l = zb.d.b.l;
                final long c = b.c;
                final long c2 = b2.c;
                final int a = c0.a;
                final long n6 = lcmp(c, c2);
                if (n6 >= 0) {
                    if (n6 == 0) {
                        n = 0;
                    }
                    else {
                        n = 1;
                    }
                }
                return n;
            }
            case 0: {
                final byte[] array = (byte[])o;
                final byte[] array2 = (byte[])o2;
                int n7;
                if (array.length != array2.length) {
                    n7 = array.length - array2.length;
                }
                else {
                    int n8 = 0;
                    while (true) {
                        n7 = n2;
                        if (n8 >= array.length) {
                            break;
                        }
                        final byte b3 = array[n8];
                        final byte b4 = array2[n8];
                        if (b3 != b4) {
                            n7 = b3 - b4;
                            break;
                        }
                        ++n8;
                    }
                }
                return n7;
            }
        }
    }
}
