// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.onboardingModel;

import java.util.ArrayList;
import java.util.Iterator;
import a2.b;
import android.os.Parcel;
import ak0.m;
import ah2.f;
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
        ah2.f.f((Object)g, "topics");
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
        return ah2.f.a((Object)this.f, (Object)interestTopics.f) && ah2.f.a((Object)this.g, (Object)interestTopics.g);
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
        final StringBuilder k = a.k("InterestTopics(schemeName=");
        k.append(this.f);
        k.append(", topics=");
        return m.n(k, (List)this.g, ')');
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        ah2.f.f((Object)parcel, "out");
        parcel.writeString(this.f);
        final Iterator n2 = b.n((List)this.g, parcel);
        while (n2.hasNext()) {
            parcel.writeParcelable((Parcelable)n2.next(), n);
        }
    }
    
    public static final class a implements Parcelable$Creator<InterestTopics>
    {
        public final Object createFromParcel(final Parcel parcel) {
            ah2.f.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final int int1 = parcel.readInt();
            final ArrayList list = new ArrayList(int1);
            for (int i = 0; i != int1; i = d.e((Class)InterestTopics.class, parcel, list, i, 1)) {}
            return new InterestTopics(string, (List<InterestTopic>)list);
        }
        
        public final Object[] newArray(final int n) {
            return new InterestTopics[n];
        }
    }
}
