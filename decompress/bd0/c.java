// 
// Decompiled by Procyon v0.6.0
// 

package bd0;

import android.os.Parcel;
import ng2.e;
import com.reddit.domain.powerups.PowerupsBenefit;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class c implements Parcelable
{
    public static final Parcelable$Creator<c> CREATOR;
    public final PowerupsBenefit f;
    public final boolean g;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public c(final PowerupsBenefit f, final boolean g) {
        e.f((Object)f, "benefit");
        this.f = f;
        this.g = g;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        return this.f == c.f && this.g == c.g;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.f.hashCode();
        int g;
        if ((g = (this.g ? 1 : 0)) != 0) {
            g = 1;
        }
        return hashCode * 31 + g;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("BenefitStatus(benefit=");
        t.append(this.f);
        t.append(", isEnabled=");
        return d.n(t, this.g, ')');
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.f.name());
        parcel.writeInt((int)(this.g ? 1 : 0));
    }
    
    public static final class a implements Parcelable$Creator<c>
    {
        public final Object createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new c(PowerupsBenefit.valueOf(parcel.readString()), parcel.readInt() != 0);
        }
        
        public final Object[] newArray(final int n) {
            return new c[n];
        }
    }
}
