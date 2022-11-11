// 
// Decompiled by Procyon v0.6.0
// 

package zd0;

import android.os.Parcel;
import sg2.e;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class f implements Parcelable
{
    public static final Parcelable$Creator<f> CREATOR;
    public final String f;
    public final boolean g;
    public final int h;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public f(final String f, final boolean g, final int h) {
        e.f((Object)f, "optionName");
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f)) {
            return false;
        }
        final f f = (f)o;
        return e.a((Object)this.f, (Object)f.f) && this.g == f.g && this.h == f.h;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.f.hashCode();
        int g;
        if ((g = (this.g ? 1 : 0)) != 0) {
            g = 1;
        }
        return Integer.hashCode(this.h) + (hashCode * 31 + g) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("ReasonSelectListModel(optionName=");
        r.append(this.f);
        r.append(", isChecked=");
        r.append(this.g);
        r.append(", drawableRes=");
        return d.l(r, this.h, ')');
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.f);
        parcel.writeInt((int)(this.g ? 1 : 0));
        parcel.writeInt(this.h);
    }
    
    public static final class a implements Parcelable$Creator<f>
    {
        public final Object createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new f(parcel.readString(), parcel.readInt() != 0, parcel.readInt());
        }
        
        public final Object[] newArray(final int n) {
            return new f[n];
        }
    }
}
