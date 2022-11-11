// 
// Decompiled by Procyon v0.6.0
// 

package com.wdullaer.materialdatetimepicker.time;

import android.os.Parcelable;
import java.util.SortedSet;
import java.util.Collection;
import java.util.Arrays;
import android.os.Parcel;
import java.util.TreeSet;
import android.os.Parcelable$Creator;

public final class b implements f
{
    public static final Parcelable$Creator<b> CREATOR;
    public TreeSet<Timepoint> f;
    public TreeSet<Timepoint> g;
    public TreeSet<Timepoint> h;
    public Timepoint i;
    public Timepoint j;
    
    static {
        CREATOR = (Parcelable$Creator)new b$a();
    }
    
    public b() {
        this.f = new TreeSet<Timepoint>();
        this.g = new TreeSet<Timepoint>();
        this.h = new TreeSet<Timepoint>();
    }
    
    public b(final Parcel parcel) {
        this.f = new TreeSet<Timepoint>();
        this.g = new TreeSet<Timepoint>();
        this.h = new TreeSet<Timepoint>();
        this.i = (Timepoint)parcel.readParcelable(Timepoint.class.getClassLoader());
        this.j = (Timepoint)parcel.readParcelable(Timepoint.class.getClassLoader());
        final TreeSet<Timepoint> f = this.f;
        final Parcelable$Creator creator = Timepoint.CREATOR;
        f.addAll((Collection<? extends Timepoint>)Arrays.asList(parcel.createTypedArray(creator)));
        this.g.addAll((Collection<? extends Timepoint>)Arrays.asList(parcel.createTypedArray(creator)));
        final TreeSet<Timepoint> f2 = this.f;
        final TreeSet<Timepoint> g = this.g;
        final TreeSet h = new TreeSet((SortedSet<Object>)f2);
        h.removeAll(g);
        this.h = (TreeSet<Timepoint>)h;
    }
    
    public final Timepoint L(final Timepoint timepoint, final Timepoint$TYPE timepoint$TYPE, final Timepoint$TYPE timepoint$TYPE2) {
        final Timepoint i = this.i;
        if (i != null && i.e() - timepoint.e() > 0) {
            return this.i;
        }
        final Timepoint j = this.j;
        if (j != null && j.e() - timepoint.e() < 0) {
            return this.j;
        }
        final Timepoint$TYPE second = Timepoint$TYPE.SECOND;
        if (timepoint$TYPE == second) {
            return timepoint;
        }
        if (this.h.isEmpty()) {
            Timepoint a = timepoint;
            if (!this.g.isEmpty()) {
                if (timepoint$TYPE != null && timepoint$TYPE == timepoint$TYPE2) {
                    return timepoint;
                }
                if (timepoint$TYPE2 == second) {
                    if (!this.g.contains(timepoint)) {
                        return timepoint;
                    }
                    return this.a(timepoint, timepoint$TYPE, timepoint$TYPE2);
                }
                else {
                    final Timepoint$TYPE minute = Timepoint$TYPE.MINUTE;
                    if (timepoint$TYPE2 == minute) {
                        final Timepoint timepoint2 = this.g.ceiling(timepoint);
                        final Timepoint timepoint3 = this.g.floor(timepoint);
                        final boolean c = timepoint.c(timepoint2, minute);
                        final boolean c2 = timepoint.c(timepoint3, minute);
                        if (!c && !c2) {
                            return timepoint;
                        }
                        return this.a(timepoint, timepoint$TYPE, timepoint$TYPE2);
                    }
                    else {
                        final Timepoint$TYPE hour = Timepoint$TYPE.HOUR;
                        a = timepoint;
                        if (timepoint$TYPE2 == hour) {
                            final Timepoint timepoint4 = this.g.ceiling(timepoint);
                            final Timepoint timepoint5 = this.g.floor(timepoint);
                            final boolean c3 = timepoint.c(timepoint4, hour);
                            final boolean c4 = timepoint.c(timepoint5, hour);
                            if (!c3 && !c4) {
                                return timepoint;
                            }
                            a = this.a(timepoint, timepoint$TYPE, timepoint$TYPE2);
                        }
                    }
                }
            }
            return a;
        }
        Timepoint timepoint6 = this.h.floor(timepoint);
        final Timepoint timepoint7 = this.h.ceiling(timepoint);
        if (timepoint6 != null && timepoint7 != null) {
            if (timepoint$TYPE == Timepoint$TYPE.HOUR) {
                final int f = timepoint6.f;
                final int f2 = timepoint.f;
                if (f != f2 && timepoint7.f == f2) {
                    return timepoint7;
                }
                if (f == f2 && timepoint7.f != f2) {
                    return timepoint6;
                }
                if (f != f2 && timepoint7.f != f2) {
                    return timepoint;
                }
            }
            if (timepoint$TYPE == Timepoint$TYPE.MINUTE) {
                final int f3 = timepoint6.f;
                final int f4 = timepoint.f;
                if (f3 != f4 && timepoint7.f != f4) {
                    return timepoint;
                }
                if (f3 != f4 && timepoint7.f == f4) {
                    Timepoint timepoint8 = timepoint;
                    if (timepoint7.g == timepoint.g) {
                        timepoint8 = timepoint7;
                    }
                    return timepoint8;
                }
                if (f3 == f4 && timepoint7.f != f4) {
                    Timepoint timepoint9 = timepoint;
                    if (timepoint6.g == timepoint.g) {
                        timepoint9 = timepoint6;
                    }
                    return timepoint9;
                }
                final int g = timepoint6.g;
                final int g2 = timepoint.g;
                if (g != g2 && timepoint7.g == g2) {
                    return timepoint7;
                }
                if (g == g2 && timepoint7.g != g2) {
                    return timepoint6;
                }
                if (g != g2 && timepoint7.g != g2) {
                    return timepoint;
                }
            }
            if (Math.abs(timepoint.e() - timepoint6.e()) >= Math.abs(timepoint.e() - timepoint7.e())) {
                timepoint6 = timepoint7;
            }
            return timepoint6;
        }
        Timepoint timepoint10;
        if ((timepoint10 = timepoint6) == null) {
            timepoint10 = timepoint7;
        }
        if (timepoint$TYPE == null) {
            return timepoint10;
        }
        if (timepoint10.f != timepoint.f) {
            return timepoint;
        }
        if (timepoint$TYPE == Timepoint$TYPE.MINUTE && timepoint10.g != timepoint.g) {
            return timepoint;
        }
        return timepoint10;
    }
    
    public final Timepoint a(final Timepoint timepoint, final Timepoint$TYPE timepoint$TYPE, final Timepoint$TYPE timepoint$TYPE2) {
        final Timepoint timepoint2 = new Timepoint(timepoint);
        final Timepoint timepoint3 = new Timepoint(timepoint);
        int n;
        if (timepoint$TYPE2 == Timepoint$TYPE.MINUTE) {
            n = 60;
        }
        else {
            n = 1;
        }
        final Timepoint$TYPE second = Timepoint$TYPE.SECOND;
        final int n2 = 0;
        int n3 = n;
        int i = n2;
        if (timepoint$TYPE2 == second) {
            n3 = 3600;
            i = n2;
        }
        while (i < n3 * 24) {
            final int n4 = i + 1;
            timepoint2.a(timepoint$TYPE2, 1);
            timepoint3.a(timepoint$TYPE2, -1);
            if (timepoint$TYPE == null || timepoint2.d(timepoint$TYPE) == timepoint.d(timepoint$TYPE)) {
                final Timepoint timepoint4 = this.g.ceiling(timepoint2);
                final Timepoint timepoint5 = this.g.floor(timepoint2);
                if (!timepoint2.c(timepoint4, timepoint$TYPE2) && !timepoint2.c(timepoint5, timepoint$TYPE2)) {
                    return timepoint2;
                }
            }
            if (timepoint$TYPE == null || timepoint3.d(timepoint$TYPE) == timepoint.d(timepoint$TYPE)) {
                final Timepoint timepoint6 = this.g.ceiling(timepoint3);
                final Timepoint timepoint7 = this.g.floor(timepoint3);
                if (!timepoint3.c(timepoint6, timepoint$TYPE2) && !timepoint3.c(timepoint7, timepoint$TYPE2)) {
                    return timepoint3;
                }
            }
            i = n4;
            if (timepoint$TYPE != null) {
                i = n4;
                if (timepoint3.d(timepoint$TYPE) == timepoint.d(timepoint$TYPE)) {
                    continue;
                }
                i = n4;
                if (timepoint2.d(timepoint$TYPE) != timepoint.d(timepoint$TYPE)) {
                    break;
                }
                continue;
            }
        }
        return timepoint;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final boolean g0(final Timepoint timepoint, final int n, final Timepoint$TYPE timepoint$TYPE) {
        final boolean b = false;
        final boolean b2 = false;
        final boolean b3 = false;
        final boolean b4 = false;
        if (timepoint == null) {
            return false;
        }
        boolean contains = true;
        if (n == 0) {
            final Timepoint i = this.i;
            if (i != null && i.f > timepoint.f) {
                return true;
            }
            final Timepoint j = this.j;
            if (j != null && j.f + 1 <= timepoint.f) {
                return true;
            }
            if (!this.h.isEmpty()) {
                final Timepoint timepoint2 = this.h.ceiling(timepoint);
                final Timepoint timepoint3 = this.h.floor(timepoint);
                final Timepoint$TYPE hour = Timepoint$TYPE.HOUR;
                boolean b5 = b4;
                if (!timepoint.c(timepoint2, hour)) {
                    b5 = b4;
                    if (!timepoint.c(timepoint3, hour)) {
                        b5 = true;
                    }
                }
                return b5;
            }
            boolean b6 = b;
            if (!this.g.isEmpty()) {
                final Timepoint$TYPE hour2 = Timepoint$TYPE.HOUR;
                b6 = b;
                if (timepoint$TYPE == hour2) {
                    final Timepoint timepoint4 = this.g.ceiling(timepoint);
                    final Timepoint timepoint5 = this.g.floor(timepoint);
                    if (!timepoint.c(timepoint4, hour2)) {
                        b6 = b;
                        if (!timepoint.c(timepoint5, hour2)) {
                            return b6;
                        }
                    }
                    b6 = true;
                }
            }
            return b6;
        }
        else {
            if (n != 1) {
                final Timepoint k = this.i;
                if (k == null || k.e() - timepoint.e() <= 0) {
                    final Timepoint l = this.j;
                    if (l == null || l.e() - timepoint.e() >= 0) {
                        if (!this.h.isEmpty()) {
                            contains = (true ^ this.h.contains(timepoint));
                        }
                        else {
                            contains = this.g.contains(timepoint);
                        }
                    }
                }
                return contains;
            }
            final Timepoint m = this.i;
            if (m != null && new Timepoint(m.f, m.g, 0).e() - timepoint.e() > 0) {
                return true;
            }
            final Timepoint j2 = this.j;
            if (j2 != null && new Timepoint(j2.f, j2.g, 59).e() - timepoint.e() < 0) {
                return true;
            }
            if (!this.h.isEmpty()) {
                final Timepoint timepoint6 = this.h.ceiling(timepoint);
                final Timepoint timepoint7 = this.h.floor(timepoint);
                final Timepoint$TYPE minute = Timepoint$TYPE.MINUTE;
                boolean b7 = b2;
                if (!timepoint.c(timepoint6, minute)) {
                    b7 = b2;
                    if (!timepoint.c(timepoint7, minute)) {
                        b7 = true;
                    }
                }
                return b7;
            }
            boolean b8 = b3;
            if (!this.g.isEmpty()) {
                final Timepoint$TYPE minute2 = Timepoint$TYPE.MINUTE;
                b8 = b3;
                if (timepoint$TYPE == minute2) {
                    final Timepoint timepoint8 = this.g.ceiling(timepoint);
                    final Timepoint timepoint9 = this.g.floor(timepoint);
                    final boolean c = timepoint.c(timepoint8, minute2);
                    final boolean c2 = timepoint.c(timepoint9, minute2);
                    if (!c) {
                        b8 = b3;
                        if (!c2) {
                            return b8;
                        }
                    }
                    b8 = true;
                }
            }
            return b8;
        }
    }
    
    public final boolean m0() {
        final boolean b = false;
        final Timepoint timepoint = new Timepoint(12, 0, 0);
        final Timepoint j = this.j;
        if (j != null && j.e() - timepoint.e() < 0) {
            return true;
        }
        boolean b2 = b;
        if (!this.h.isEmpty()) {
            b2 = b;
            if (this.h.last().e() - timepoint.e() < 0) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public final boolean o() {
        final boolean b = false;
        final Timepoint timepoint = new Timepoint(12, 0, 0);
        final Timepoint i = this.i;
        if (i != null && i.e() - timepoint.e() >= 0) {
            return true;
        }
        boolean b2 = b;
        if (!this.h.isEmpty()) {
            b2 = b;
            if (this.h.first().e() - timepoint.e() >= 0) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.i, n);
        parcel.writeParcelable((Parcelable)this.j, n);
        final TreeSet<Timepoint> f = this.f;
        parcel.writeTypedArray((Parcelable[])f.toArray((Object[])new Timepoint[f.size()]), n);
        final TreeSet<Timepoint> g = this.g;
        parcel.writeTypedArray((Parcelable[])g.toArray((Object[])new Timepoint[g.size()]), n);
    }
}
