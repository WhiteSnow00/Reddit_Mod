// 
// Decompiled by Procyon v0.6.0
// 

package bd0;

import java.util.LinkedHashSet;
import java.util.Iterator;
import android.os.Parcel;
import sg2.e;
import com.reddit.domain.powerups.PowerupsBenefit;
import java.util.Set;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class n implements Parcelable
{
    public static final Parcelable$Creator<n> CREATOR;
    public final int f;
    public final Set<PowerupsBenefit> g;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public n(final int f, final Set<? extends PowerupsBenefit> g) {
        e.f((Object)g, "benefits");
        this.f = f;
        this.g = (Set<PowerupsBenefit>)g;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof n)) {
            return false;
        }
        final n n = (n)o;
        return this.f == n.f && e.a((Object)this.g, (Object)n.g);
    }
    
    @Override
    public final int hashCode() {
        return this.g.hashCode() + Integer.hashCode(this.f) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("PowerupsTier(tierLevel=");
        r.append(this.f);
        r.append(", benefits=");
        r.append(this.g);
        r.append(')');
        return r.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeInt(this.f);
        final Set<PowerupsBenefit> g = this.g;
        parcel.writeInt(g.size());
        final Iterator iterator = g.iterator();
        while (iterator.hasNext()) {
            parcel.writeString(((Enum)iterator.next()).name());
        }
    }
    
    public static final class a implements Parcelable$Creator<n>
    {
        public final Object createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            final int int1 = parcel.readInt();
            final int int2 = parcel.readInt();
            final LinkedHashSet set = new LinkedHashSet(int2);
            for (int i = 0; i != int2; ++i) {
                set.add((Object)PowerupsBenefit.valueOf(parcel.readString()));
            }
            return new n(int1, (Set<? extends PowerupsBenefit>)set);
        }
        
        public final Object[] newArray(final int n) {
            return new n[n];
        }
    }
}
