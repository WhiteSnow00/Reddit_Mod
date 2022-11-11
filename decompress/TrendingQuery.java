// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.search;

import android.os.Parcel;
import androidx.appcompat.widget.s0;
import ah2.f;
import com.reddit.domain.model.Link;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bH\u00c6\u0003J3\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0004H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0004H\u00d6\u0001R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&¨\u0006)" }, d2 = { "Lcom/reddit/domain/model/search/TrendingQuery;", "Landroid/os/Parcelable;", "Lcom/reddit/domain/model/search/Query;", "component1", "", "component2", "", "component3", "Lcom/reddit/domain/model/Link;", "component4", "query", "subredditOccurrences", "subredditWhiteListed", "link", "copy", "", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Lcom/reddit/domain/model/search/Query;", "getQuery", "()Lcom/reddit/domain/model/search/Query;", "I", "getSubredditOccurrences", "()I", "Z", "getSubredditWhiteListed", "()Z", "Lcom/reddit/domain/model/Link;", "getLink", "()Lcom/reddit/domain/model/Link;", "<init>", "(Lcom/reddit/domain/model/search/Query;IZLcom/reddit/domain/model/Link;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class TrendingQuery implements Parcelable
{
    public static final Parcelable$Creator<TrendingQuery> CREATOR;
    private final Link link;
    private final Query query;
    private final int subredditOccurrences;
    private final boolean subredditWhiteListed;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public TrendingQuery(final Query query, final int subredditOccurrences, final boolean subredditWhiteListed, final Link link) {
        f.f((Object)query, "query");
        this.query = query;
        this.subredditOccurrences = subredditOccurrences;
        this.subredditWhiteListed = subredditWhiteListed;
        this.link = link;
    }
    
    public final Query component1() {
        return this.query;
    }
    
    public final int component2() {
        return this.subredditOccurrences;
    }
    
    public final boolean component3() {
        return this.subredditWhiteListed;
    }
    
    public final Link component4() {
        return this.link;
    }
    
    public final TrendingQuery copy(final Query query, final int n, final boolean b, final Link link) {
        f.f((Object)query, "query");
        return new TrendingQuery(query, n, b, link);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TrendingQuery)) {
            return false;
        }
        final TrendingQuery trendingQuery = (TrendingQuery)o;
        return f.a((Object)this.query, (Object)trendingQuery.query) && this.subredditOccurrences == trendingQuery.subredditOccurrences && this.subredditWhiteListed == trendingQuery.subredditWhiteListed && f.a((Object)this.link, (Object)trendingQuery.link);
    }
    
    public final Link getLink() {
        return this.link;
    }
    
    public final Query getQuery() {
        return this.query;
    }
    
    public final int getSubredditOccurrences() {
        return this.subredditOccurrences;
    }
    
    public final boolean getSubredditWhiteListed() {
        return this.subredditWhiteListed;
    }
    
    @Override
    public int hashCode() {
        final int e = s0.e(this.subredditOccurrences, this.query.hashCode() * 31, 31);
        int subredditWhiteListed;
        if ((subredditWhiteListed = (this.subredditWhiteListed ? 1 : 0)) != 0) {
            subredditWhiteListed = 1;
        }
        final Link link = this.link;
        int hashCode;
        if (link == null) {
            hashCode = 0;
        }
        else {
            hashCode = link.hashCode();
        }
        return (e + subredditWhiteListed) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("TrendingQuery(query=");
        k.append(this.query);
        k.append(", subredditOccurrences=");
        k.append(this.subredditOccurrences);
        k.append(", subredditWhiteListed=");
        k.append(this.subredditWhiteListed);
        k.append(", link=");
        k.append(this.link);
        k.append(')');
        return k.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        this.query.writeToParcel(parcel, n);
        parcel.writeInt(this.subredditOccurrences);
        parcel.writeInt((int)(this.subredditWhiteListed ? 1 : 0));
        final Link link = this.link;
        if (link == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            link.writeToParcel(parcel, n);
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<TrendingQuery>
    {
        public final TrendingQuery createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            final Query query = (Query)Query.CREATOR.createFromParcel(parcel);
            final int int1 = parcel.readInt();
            final boolean b = parcel.readInt() != 0;
            Object fromParcel;
            if (parcel.readInt() == 0) {
                fromParcel = null;
            }
            else {
                fromParcel = Link.CREATOR.createFromParcel(parcel);
            }
            return new TrendingQuery(query, int1, b, (Link)fromParcel);
        }
        
        public final TrendingQuery[] newArray(final int n) {
            return new TrendingQuery[n];
        }
    }
}
