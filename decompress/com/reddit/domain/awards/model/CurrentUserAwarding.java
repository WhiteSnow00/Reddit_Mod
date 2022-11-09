// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.awards.model;

import android.os.Parcel;
import ah2.f;
import com.squareup.moshi.n;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002H\u00c6\u0001¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/awards/model/CurrentUserAwarding;", "Landroid/os/Parcelable;", "", "awardingId", "copy", "<init>", "(Ljava/lang/String;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class CurrentUserAwarding implements Parcelable
{
    public static final Parcelable$Creator<CurrentUserAwarding> CREATOR;
    public final String f;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public CurrentUserAwarding(@n(name = "id") final String f) {
        ah2.f.f((Object)f, "awardingId");
        this.f = f;
    }
    
    public final CurrentUserAwarding copy(@n(name = "id") final String s) {
        ah2.f.f((Object)s, "awardingId");
        return new CurrentUserAwarding(s);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof CurrentUserAwarding && ah2.f.a((Object)this.f, (Object)((CurrentUserAwarding)o).f));
    }
    
    @Override
    public final int hashCode() {
        return this.f.hashCode();
    }
    
    @Override
    public final String toString() {
        return b.k(a.k("CurrentUserAwarding(awardingId="), this.f, ')');
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        ah2.f.f((Object)parcel, "out");
        parcel.writeString(this.f);
    }
    
    public static final class a implements Parcelable$Creator<CurrentUserAwarding>
    {
        public final Object createFromParcel(final Parcel parcel) {
            ah2.f.f((Object)parcel, "parcel");
            return new CurrentUserAwarding(parcel.readString());
        }
        
        public final Object[] newArray(final int n) {
            return new CurrentUserAwarding[n];
        }
    }
}
