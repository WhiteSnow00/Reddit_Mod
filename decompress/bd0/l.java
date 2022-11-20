// 
// Decompiled by Procyon v0.6.0
// 

package bd0;

import java.util.LinkedHashSet;
import u10.o;
import java.util.ArrayList;
import java.util.Iterator;
import android.os.Parcel;
import p1.h;
import aq2.a;
import ng2.e;
import com.reddit.domain.powerups.PowerupsBenefit;
import java.util.Set;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class l implements Parcelable
{
    public static final Parcelable$Creator<l> CREATOR;
    public final int f;
    public final int g;
    public final int h;
    public final List<m> i;
    public final Set<PowerupsBenefit> j;
    public final Set<PowerupsBenefit> k;
    public final int l;
    public final Set<PowerupsBenefit> m;
    public final List<c> n;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public l(final int f, final int g, final int h, final List<m> i, final Set<? extends PowerupsBenefit> j, final Set<? extends PowerupsBenefit> k, final int l, final Set<? extends PowerupsBenefit> m, final List<c> n) {
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
        if (!(o instanceof l)) {
            return false;
        }
        final l l = (l)o;
        return this.f == l.f && this.g == l.g && this.h == l.h && e.a((Object)this.i, (Object)l.i) && e.a((Object)this.j, (Object)l.j) && e.a((Object)this.k, (Object)l.k) && this.l == l.l && e.a((Object)this.m, (Object)l.m) && e.a((Object)this.n, (Object)l.n);
    }
    
    @Override
    public final int hashCode() {
        return this.n.hashCode() + android.support.v4.media.a.h((Set)this.m, aq2.a.c(this.l, android.support.v4.media.a.h((Set)this.k, android.support.v4.media.a.h((Set)this.j, ph0.a.b((List)this.i, aq2.a.c(this.h, aq2.a.c(this.g, Integer.hashCode(this.f) * 31, 31), 31), 31), 31), 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("PowerupsStatus(currentTier=");
        t.append(this.f);
        t.append(", powerupsCount=");
        t.append(this.g);
        t.append(", supportersCount=");
        t.append(this.h);
        t.append(", tiers=");
        t.append(this.i);
        t.append(", userBenefits=");
        t.append(this.j);
        t.append(", allUnlockableBenefits=");
        t.append(this.k);
        t.append(", powerupsNeeded=");
        t.append(this.l);
        t.append(", allBenefits=");
        t.append(this.m);
        t.append(", benefitStatuses=");
        return p1.h.d(t, (List)this.n, ')');
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        final Iterator r = android.support.v4.media.a.r((List)this.i, parcel);
        while (r.hasNext()) {
            ((m)r.next()).writeToParcel(parcel, n);
        }
        final Set<PowerupsBenefit> j = this.j;
        parcel.writeInt(j.size());
        final Iterator iterator = j.iterator();
        while (iterator.hasNext()) {
            parcel.writeString(((PowerupsBenefit)iterator.next()).name());
        }
        final Set<PowerupsBenefit> k = this.k;
        parcel.writeInt(k.size());
        final Iterator iterator2 = k.iterator();
        while (iterator2.hasNext()) {
            parcel.writeString(((PowerupsBenefit)iterator2.next()).name());
        }
        parcel.writeInt(this.l);
        final Set<PowerupsBenefit> m = this.m;
        parcel.writeInt(m.size());
        final Iterator iterator3 = m.iterator();
        while (iterator3.hasNext()) {
            parcel.writeString(((PowerupsBenefit)iterator3.next()).name());
        }
        final Iterator r2 = android.support.v4.media.a.r((List)this.n, parcel);
        while (r2.hasNext()) {
            ((c)r2.next()).writeToParcel(parcel, n);
        }
    }
    
    public static final class a implements Parcelable$Creator<l>
    {
        public final Object createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            final int int1 = parcel.readInt();
            final int int2 = parcel.readInt();
            final int int3 = parcel.readInt();
            final int int4 = parcel.readInt();
            final ArrayList list = new ArrayList(int4);
            final int n = 0;
            for (int i = 0; i != int4; i = o.c(bd0.m.CREATOR, parcel, list, i, 1)) {}
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
            final ArrayList list2 = new ArrayList<c>(int9);
            for (int c = n; c != int9; c = o.c((Parcelable$Creator)c.CREATOR, parcel, list2, c, 1)) {}
            return new l(int1, int2, int3, (List<m>)list, (Set<? extends PowerupsBenefit>)set, (Set<? extends PowerupsBenefit>)set2, int7, (Set<? extends PowerupsBenefit>)set3, (List<c>)list2);
        }
        
        public final Object[] newArray(final int n) {
            return new l[n];
        }
    }
}
