// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.search;

import android.os.Parcel;
import ah2.f;
import com.squareup.moshi.n;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\b\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\tH\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u00d6\u0001R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b" }, d2 = { "Lcom/reddit/domain/model/search/SuggestedQuery;", "Landroid/os/Parcelable;", "", "component1", "component2", "url", "text", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "getText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class SuggestedQuery implements Parcelable
{
    public static final Parcelable$Creator<SuggestedQuery> CREATOR;
    private final String text;
    private final String url;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public SuggestedQuery(@n(name = "url") final String url, @n(name = "text") final String text) {
        f.f((Object)url, "url");
        f.f((Object)text, "text");
        this.url = url;
        this.text = text;
    }
    
    public final String component1() {
        return this.url;
    }
    
    public final String component2() {
        return this.text;
    }
    
    public final SuggestedQuery copy(@n(name = "url") final String s, @n(name = "text") final String s2) {
        f.f((Object)s, "url");
        f.f((Object)s2, "text");
        return new SuggestedQuery(s, s2);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SuggestedQuery)) {
            return false;
        }
        final SuggestedQuery suggestedQuery = (SuggestedQuery)o;
        return f.a((Object)this.url, (Object)suggestedQuery.url) && f.a((Object)this.text, (Object)suggestedQuery.text);
    }
    
    public final String getText() {
        return this.text;
    }
    
    public final String getUrl() {
        return this.url;
    }
    
    @Override
    public int hashCode() {
        return this.text.hashCode() + this.url.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SuggestedQuery(url=");
        k.append(this.url);
        k.append(", text=");
        return b.k(k, this.text, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.url);
        parcel.writeString(this.text);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<SuggestedQuery>
    {
        public final SuggestedQuery createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            return new SuggestedQuery(parcel.readString(), parcel.readString());
        }
        
        public final SuggestedQuery[] newArray(final int n) {
            return new SuggestedQuery[n];
        }
    }
}
