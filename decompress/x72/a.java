// 
// Decompiled by Procyon v0.6.0
// 

package x72;

import android.os.Parcel;
import ng2.e;
import com.reddit.utilityscreens.richinfobottomsheet.model.Type;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class a implements Parcelable
{
    public static final Parcelable$Creator<a> CREATOR;
    public final String f;
    public final String g;
    public final Type h;
    public final Integer i;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public a(final String f, final String g, final Type h, final Integer i) {
        e.f((Object)f, "heading");
        e.f((Object)g, "description");
        e.f((Object)h, "type");
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return e.a((Object)this.f, (Object)a.f) && e.a((Object)this.g, (Object)a.g) && this.h == a.h && e.a((Object)this.i, (Object)a.i);
    }
    
    @Override
    public final int hashCode() {
        final int e = a.e(this.g, this.f.hashCode() * 31, 31);
        final int hashCode = this.h.hashCode();
        final Integer i = this.i;
        int hashCode2;
        if (i == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = i.hashCode();
        }
        return (hashCode + e) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("RichInfoBottomSheetItemModel(heading=");
        t.append(this.f);
        t.append(", description=");
        t.append(this.g);
        t.append(", type=");
        t.append(this.h);
        t.append(", drawableRes=");
        return m5.a.h(t, this.i, ')');
    }
    
    public final void writeToParcel(final Parcel parcel, int intValue) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h.name());
        final Integer i = this.i;
        if (i == null) {
            intValue = 0;
        }
        else {
            parcel.writeInt(1);
            intValue = i;
        }
        parcel.writeInt(intValue);
    }
    
    public static final class a implements Parcelable$Creator<x72.a>
    {
        public final Object createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final Type value = Type.valueOf(parcel.readString());
            Integer value2;
            if (parcel.readInt() == 0) {
                value2 = null;
            }
            else {
                value2 = parcel.readInt();
            }
            return new x72.a(string, string2, value, value2);
        }
        
        public final Object[] newArray(final int n) {
            return new x72.a[n];
        }
    }
}
