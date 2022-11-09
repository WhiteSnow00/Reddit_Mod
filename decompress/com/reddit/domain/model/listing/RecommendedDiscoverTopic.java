// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.listing;

import android.os.Parcel;
import androidx.appcompat.widget.s0;
import ah2.f;
import com.squareup.moshi.n;
import com.reddit.domain.model.DiscoverTopic;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u000bH\u00d6\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000bH\u00d6\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u0007\u0010\u001a¨\u0006\u001d" }, d2 = { "Lcom/reddit/domain/model/listing/RecommendedDiscoverTopic;", "Landroid/os/Parcelable;", "Lcom/reddit/domain/model/DiscoverTopic;", "component1", "", "component2", "topic", "isFunny", "copy", "", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Lcom/reddit/domain/model/DiscoverTopic;", "getTopic", "()Lcom/reddit/domain/model/DiscoverTopic;", "Z", "()Z", "<init>", "(Lcom/reddit/domain/model/DiscoverTopic;Z)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class RecommendedDiscoverTopic implements Parcelable
{
    public static final Parcelable$Creator<RecommendedDiscoverTopic> CREATOR;
    private final boolean isFunny;
    private final DiscoverTopic topic;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public RecommendedDiscoverTopic(@n(name = "discover_topic") final DiscoverTopic topic, @n(name = "is_funny") final boolean isFunny) {
        f.f((Object)topic, "topic");
        this.topic = topic;
        this.isFunny = isFunny;
    }
    
    public final DiscoverTopic component1() {
        return this.topic;
    }
    
    public final boolean component2() {
        return this.isFunny;
    }
    
    public final RecommendedDiscoverTopic copy(@n(name = "discover_topic") final DiscoverTopic discoverTopic, @n(name = "is_funny") final boolean b) {
        f.f((Object)discoverTopic, "topic");
        return new RecommendedDiscoverTopic(discoverTopic, b);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecommendedDiscoverTopic)) {
            return false;
        }
        final RecommendedDiscoverTopic recommendedDiscoverTopic = (RecommendedDiscoverTopic)o;
        return f.a((Object)this.topic, (Object)recommendedDiscoverTopic.topic) && this.isFunny == recommendedDiscoverTopic.isFunny;
    }
    
    public final DiscoverTopic getTopic() {
        return this.topic;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.topic.hashCode();
        int isFunny;
        if ((isFunny = (this.isFunny ? 1 : 0)) != 0) {
            isFunny = 1;
        }
        return hashCode * 31 + isFunny;
    }
    
    public final boolean isFunny() {
        return this.isFunny;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("RecommendedDiscoverTopic(topic=");
        k.append(this.topic);
        k.append(", isFunny=");
        return s0.o(k, this.isFunny, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        this.topic.writeToParcel(parcel, n);
        parcel.writeInt((int)(this.isFunny ? 1 : 0));
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<RecommendedDiscoverTopic>
    {
        public final RecommendedDiscoverTopic createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            return new RecommendedDiscoverTopic((DiscoverTopic)DiscoverTopic.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }
        
        public final RecommendedDiscoverTopic[] newArray(final int n) {
            return new RecommendedDiscoverTopic[n];
        }
    }
}
