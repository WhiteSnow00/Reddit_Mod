// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.search;

import android.os.Parcel;
import kj2.a;
import a2.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.UUID;
import ah2.f;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b*\u0010+B#\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b*\u0010,J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\t\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\nH\u00c6\u0003J1\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\nH\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0012H\u00d6\u0001J\u0019\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0012H\u00d6\u0001R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b(\u0010)¨\u0006-" }, d2 = { "Lcom/reddit/domain/model/search/SearchCorrelation;", "Landroid/os/Parcelable;", "", "query", "queryId", "component1", "Lcom/reddit/domain/model/search/OriginElement;", "component2", "Lcom/reddit/domain/model/search/OriginPageType;", "component3", "Lcom/reddit/domain/model/search/SearchSource;", "component4", "id", "originElement", "originPageType", "source", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/reddit/domain/model/search/OriginElement;", "getOriginElement", "()Lcom/reddit/domain/model/search/OriginElement;", "Lcom/reddit/domain/model/search/OriginPageType;", "getOriginPageType", "()Lcom/reddit/domain/model/search/OriginPageType;", "Lcom/reddit/domain/model/search/SearchSource;", "getSource", "()Lcom/reddit/domain/model/search/SearchSource;", "<init>", "(Ljava/lang/String;Lcom/reddit/domain/model/search/OriginElement;Lcom/reddit/domain/model/search/OriginPageType;Lcom/reddit/domain/model/search/SearchSource;)V", "(Lcom/reddit/domain/model/search/OriginElement;Lcom/reddit/domain/model/search/OriginPageType;Lcom/reddit/domain/model/search/SearchSource;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class SearchCorrelation implements Parcelable
{
    public static final Parcelable$Creator<SearchCorrelation> CREATOR;
    private final String id;
    private final OriginElement originElement;
    private final OriginPageType originPageType;
    private final SearchSource source;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public SearchCorrelation(final OriginElement originElement, final OriginPageType originPageType, final SearchSource searchSource) {
        f.f((Object)originElement, "originElement");
        f.f((Object)originPageType, "originPageType");
        f.f((Object)searchSource, "source");
        final String string = UUID.randomUUID().toString();
        f.e((Object)string, "randomUUID().toString()");
        this(string, originElement, originPageType, searchSource);
    }
    
    public SearchCorrelation(final String id, final OriginElement originElement, final OriginPageType originPageType, final SearchSource source) {
        f.f((Object)id, "id");
        f.f((Object)originElement, "originElement");
        f.f((Object)originPageType, "originPageType");
        f.f((Object)source, "source");
        this.id = id;
        this.originElement = originElement;
        this.originPageType = originPageType;
        this.source = source;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final OriginElement component2() {
        return this.originElement;
    }
    
    public final OriginPageType component3() {
        return this.originPageType;
    }
    
    public final SearchSource component4() {
        return this.source;
    }
    
    public final SearchCorrelation copy(final String s, final OriginElement originElement, final OriginPageType originPageType, final SearchSource searchSource) {
        f.f((Object)s, "id");
        f.f((Object)originElement, "originElement");
        f.f((Object)originPageType, "originPageType");
        f.f((Object)searchSource, "source");
        return new SearchCorrelation(s, originElement, originPageType, searchSource);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchCorrelation)) {
            return false;
        }
        final SearchCorrelation searchCorrelation = (SearchCorrelation)o;
        return f.a((Object)this.id, (Object)searchCorrelation.id) && this.originElement == searchCorrelation.originElement && this.originPageType == searchCorrelation.originPageType && f.a((Object)this.source, (Object)searchCorrelation.source);
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final OriginElement getOriginElement() {
        return this.originElement;
    }
    
    public final OriginPageType getOriginPageType() {
        return this.originPageType;
    }
    
    public final SearchSource getSource() {
        return this.source;
    }
    
    @Override
    public int hashCode() {
        return this.source.hashCode() + (this.originPageType.hashCode() + (this.originElement.hashCode() + this.id.hashCode() * 31) * 31) * 31;
    }
    
    public final String queryId(String string) {
        f.f((Object)string, "query");
        final byte[] bytes = b.j(new StringBuilder(), this.id, string).getBytes(a.b);
        f.e((Object)bytes, "this as java.lang.String).getBytes(charset)");
        string = UUID.nameUUIDFromBytes(bytes).toString();
        f.e((Object)string, "nameUUIDFromBytes((id + \u2026toByteArray()).toString()");
        return string;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SearchCorrelation(id=");
        k.append(this.id);
        k.append(", originElement=");
        k.append(this.originElement);
        k.append(", originPageType=");
        k.append(this.originPageType);
        k.append(", source=");
        k.append(this.source);
        k.append(')');
        return k.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(((Enum)this.originElement).name());
        parcel.writeString(((Enum)this.originPageType).name());
        this.source.writeToParcel(parcel, n);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<SearchCorrelation>
    {
        public final SearchCorrelation createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            return new SearchCorrelation(parcel.readString(), OriginElement.valueOf(parcel.readString()), OriginPageType.valueOf(parcel.readString()), (SearchSource)SearchSource.CREATOR.createFromParcel(parcel));
        }
        
        public final SearchCorrelation[] newArray(final int n) {
            return new SearchCorrelation[n];
        }
    }
}
