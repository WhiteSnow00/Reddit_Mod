// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.discoveryunits.data;

import android.os.Parcel;
import androidx.appcompat.widget.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/discoveryunits/data/OrderBy;", "Landroid/os/Parcelable;", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class OrderBy implements Parcelable
{
    public static final Parcelable$Creator<OrderBy> CREATOR;
    public final int f;
    public final int g;
    public final int h;
    public final OrderType i;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public OrderBy(final int f, final int g, final int h, final OrderType i) {
        ah2.f.f((Object)i, "orderType");
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
        if (!(o instanceof OrderBy)) {
            return false;
        }
        final OrderBy orderBy = (OrderBy)o;
        return this.f == orderBy.f && this.g == orderBy.g && this.h == orderBy.h && this.i == orderBy.i;
    }
    
    @Override
    public final int hashCode() {
        return this.i.hashCode() + s0.e(this.h, s0.e(this.g, Integer.hashCode(this.f) * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("OrderBy(start=");
        k.append(this.f);
        k.append(", distance=");
        k.append(this.g);
        k.append(", index=");
        k.append(this.h);
        k.append(", orderType=");
        k.append(this.i);
        k.append(')');
        return k.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        ah2.f.f((Object)parcel, "out");
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeString(this.i.name());
    }
    
    public static final class a implements Parcelable$Creator<OrderBy>
    {
        public final Object createFromParcel(final Parcel parcel) {
            ah2.f.f((Object)parcel, "parcel");
            return new OrderBy(parcel.readInt(), parcel.readInt(), parcel.readInt(), OrderType.valueOf(parcel.readString()));
        }
        
        public final Object[] newArray(final int n) {
            return new OrderBy[n];
        }
    }
}
