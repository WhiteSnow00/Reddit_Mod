// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.onboardingModel;

import java.util.ArrayList;
import java.util.Iterator;
import android.os.Parcel;
import p1.h;
import ng2.e;
import com.reddit.domain.model.topic.InterestTopic;
import java.util.List;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/domain/onboardingModel/InterestTopics;", "Landroid/os/Parcelable;", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class InterestTopics implements Parcelable
{
    public static final Parcelable$Creator<InterestTopics> CREATOR;
    public final String f;
    public final List<InterestTopic> g;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public InterestTopics(final String f, final List<InterestTopic> g) {
        e.f((Object)g, "topics");
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
        if (!(o instanceof InterestTopics)) {
            return false;
        }
        final InterestTopics interestTopics = (InterestTopics)o;
        return e.a((Object)this.f, (Object)interestTopics.f) && e.a((Object)this.g, (Object)interestTopics.g);
    }
    
    @Override
    public final int hashCode() {
        final String f = this.f;
        int hashCode;
        if (f == null) {
            hashCode = 0;
        }
        else {
            hashCode = f.hashCode();
        }
        return this.g.hashCode() + hashCode * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("InterestTopics(schemeName=");
        t.append(this.f);
        t.append(", topics=");
        return h.d(t, (List)this.g, ')');
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.f);
        final Iterator r = android.support.v4.media.a.r((List)this.g, parcel);
        while (r.hasNext()) {
            parcel.writeParcelable((Parcelable)r.next(), n);
        }
    }
    
    public static final class a implements Parcelable$Creator<InterestTopics>
    {
        public final Object createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final int int1 = parcel.readInt();
            final ArrayList list = new ArrayList(int1);
            for (int i = 0; i != int1; i = android.support.v4.media.a.f((Class)InterestTopics.class, parcel, list, i, 1)) {}
            return new InterestTopics(string, (List<InterestTopic>)list);
        }
        
        public final Object[] newArray(final int n) {
            return new InterestTopics[n];
        }
    }
}
