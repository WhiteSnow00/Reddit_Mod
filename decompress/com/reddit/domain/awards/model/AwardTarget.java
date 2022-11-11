// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.awards.model;

import kotlin.Metadata;
import android.os.Parcel;
import sg2.e;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class AwardTarget implements Parcelable
{
    public static final Parcelable$Creator<AwardTarget> CREATOR;
    public final String f;
    public final String g;
    public final String h;
    public final Type i;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public AwardTarget(final String f, final String g, final String h, final Type i) {
        e.f((Object)f, "id");
        e.f((Object)i, "type");
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
        if (!(o instanceof AwardTarget)) {
            return false;
        }
        final AwardTarget awardTarget = (AwardTarget)o;
        return e.a((Object)this.f, (Object)awardTarget.f) && e.a((Object)this.g, (Object)awardTarget.g) && e.a((Object)this.h, (Object)awardTarget.h) && this.i == awardTarget.i;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.f.hashCode();
        final String g = this.g;
        int hashCode2 = 0;
        int hashCode3;
        if (g == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = g.hashCode();
        }
        final String h = this.h;
        if (h != null) {
            hashCode2 = h.hashCode();
        }
        return this.i.hashCode() + ((hashCode * 31 + hashCode3) * 31 + hashCode2) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("AwardTarget(id=");
        r.append(this.f);
        r.append(", authorName=");
        r.append(this.g);
        r.append(", authorId=");
        r.append(this.h);
        r.append(", type=");
        r.append(this.i);
        r.append(')');
        return r.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i.name());
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005" }, d2 = { "Lcom/reddit/domain/awards/model/AwardTarget$Type;", "", "(Ljava/lang/String;I)V", "POST", "COMMENT", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum Type
    {
        COMMENT, 
        POST;
    }
    
    public static final class a implements Parcelable$Creator<AwardTarget>
    {
        public final Object createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new AwardTarget(parcel.readString(), parcel.readString(), parcel.readString(), Type.valueOf(parcel.readString()));
        }
        
        public final Object[] newArray(final int n) {
            return new AwardTarget[n];
        }
    }
}
