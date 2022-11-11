// 
// Decompiled by Procyon v0.6.0
// 

package bd0;

import java.util.LinkedHashSet;
import al0.f0;
import java.util.ArrayList;
import java.util.Iterator;
import android.os.Parcel;
import aw.b;
import sg2.e;
import com.reddit.domain.powerups.PowerupsBenefit;
import java.util.Set;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class m implements Parcelable
{
    public static final Parcelable$Creator<m> CREATOR;
    public final int f;
    public final int g;
    public final int h;
    public final List<n> i;
    public final Set<PowerupsBenefit> j;
    public final Set<PowerupsBenefit> k;
    public final int l;
    public final Set<PowerupsBenefit> m;
    public final List<d> n;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public m(final int f, final int g, final int h, final List<n> i, final Set<? extends PowerupsBenefit> j, final Set<? extends PowerupsBenefit> k, final int l, final Set<? extends PowerupsBenefit> m, final List<d> n) {
        e.f((Object)i, "tiers");
        e.f((Object)j, "userBenefits");
        e.f((Object)k, "allUnlockableBenefits");
        e.f((Object)m, "allBenefits");
        e.f((Object)n, "benefitStatuses");
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = (Set<PowerupsBenefit>)j;
        this.k = (Set<PowerupsBenefit>)k;
        this.l = l;
        this.m = (Set<PowerupsBenefit>)m;
        this.n = n;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof m)) {
            return false;
        }
        final m m = (m)o;
        return this.f == m.f && this.g == m.g && this.h == m.h && e.a((Object)this.i, (Object)m.i) && e.a((Object)this.j, (Object)m.j) && e.a((Object)this.k, (Object)m.k) && this.l == m.l && e.a((Object)this.m, (Object)m.m) && e.a((Object)this.n, (Object)m.n);
    }
    
    @Override
    public final int hashCode() {
        return this.n.hashCode() + b.d((Set)this.m, a.c(this.l, b.d((Set)this.k, b.d((Set)this.j, b.c((List)this.i, a.c(this.h, a.c(this.g, Integer.hashCode(this.f) * 31, 31), 31), 31), 31), 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("PowerupsStatus(currentTier=");
        r.append(this.f);
        r.append(", powerupsCount=");
        r.append(this.g);
        r.append(", supportersCount=");
        r.append(this.h);
        r.append(", tiers=");
        r.append(this.i);
        r.append(", userBenefits=");
        r.append(this.j);
        r.append(", allUnlockableBenefits=");
        r.append(this.k);
        r.append(", powerupsNeeded=");
        r.append(this.l);
        r.append(", allBenefits=");
        r.append(this.m);
        r.append(", benefitStatuses=");
        return d.o(r, (List)this.n, ')');
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        final Iterator s = al0.a.s((List)this.i, parcel);
        while (s.hasNext()) {
            ((n)s.next()).writeToParcel(parcel, n);
        }
        final Set<PowerupsBenefit> j = this.j;
        parcel.writeInt(j.size());
        final Iterator iterator = j.iterator();
        while (iterator.hasNext()) {
            parcel.writeString(((Enum)iterator.next()).name());
        }
        final Set<PowerupsBenefit> k = this.k;
        parcel.writeInt(k.size());
        final Iterator iterator2 = k.iterator();
        while (iterator2.hasNext()) {
            parcel.writeString(((Enum)iterator2.next()).name());
        }
        parcel.writeInt(this.l);
        final Set<PowerupsBenefit> m = this.m;
        parcel.writeInt(m.size());
        final Iterator iterator3 = m.iterator();
        while (iterator3.hasNext()) {
            parcel.writeString(((Enum)iterator3.next()).name());
        }
        final Iterator s2 = al0.a.s((List)this.n, parcel);
        while (s2.hasNext()) {
            ((d)s2.next()).writeToParcel(parcel, n);
        }
    }
    
    public static final class a implements Parcelable$Creator<m>
    {
        public final Object createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            final int int1 = parcel.readInt();
            final int int2 = parcel.readInt();
            final int int3 = parcel.readInt();
            final int int4 = parcel.readInt();
            final ArrayList list = new ArrayList(int4);
            final int n = 0;
            for (int i = 0; i != int4; i = f0.b((Parcelable$Creator)bd0.n.CREATOR, parcel, list, i, 1)) {}
            final int int5 = parcel.readInt();
            final LinkedHashSet set = new LinkedHashSet<PowerupsBenefit>(int5);
            for (int j = 0; j != int5; ++j) {
                set.add(PowerupsBenefit.valueOf(parcel.readString()));
            }
            final int int6 = parcel.readInt();
            final LinkedHashSet set2 = new LinkedHashSet<PowerupsBenefit>(int6);
            for (int k = 0; k != int6; ++k) {
                set2.add(PowerupsBenefit.valueOf(parcel.readString()));
            }
            final int int7 = parcel.readInt();
            final int int8 = parcel.readInt();
            final LinkedHashSet set3 = new LinkedHashSet<PowerupsBenefit>(int8);
            for (int l = 0; l != int8; ++l) {
                set3.add(PowerupsBenefit.valueOf(parcel.readString()));
            }
            final int int9 = parcel.readInt();
            final ArrayList list2 = new ArrayList<d>(int9);
            for (int b = n; b != int9; b = f0.b((Parcelable$Creator)d.CREATOR, parcel, list2, b, 1)) {}
            return new m(int1, int2, int3, (List<n>)list, (Set<? extends PowerupsBenefit>)set, (Set<? extends PowerupsBenefit>)set2, int7, (Set<? extends PowerupsBenefit>)set3, (List<d>)list2);
        }
        
        public final Object[] newArray(final int n) {
            return new m[n];
        }
    }
}
