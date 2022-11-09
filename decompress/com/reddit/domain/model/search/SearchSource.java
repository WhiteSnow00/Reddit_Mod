// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.search;

import android.os.Parcel;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002H\u00d6\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u00d6\u0001R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011" }, d2 = { "Lcom/reddit/domain/model/search/SearchSource;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Companion", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class SearchSource implements Parcelable
{
    public static final Parcelable$Creator<SearchSource> CREATOR;
    public static final Companion Companion;
    public static final SearchSource DEFAULT;
    private static final SearchSource PROMOTED_TREND;
    private static final SearchSource TRENDING;
    private final String value;
    
    static {
        Companion = new Companion(null);
        CREATOR = (Parcelable$Creator)new Creator();
        TRENDING = new SearchSource("trending");
        PROMOTED_TREND = new SearchSource("promoted_trend");
        DEFAULT = new SearchSource("default");
    }
    
    public SearchSource(final String value) {
        f.f((Object)value, "value");
        this.value = value;
    }
    
    public static final /* synthetic */ SearchSource access$getPROMOTED_TREND$cp() {
        return SearchSource.PROMOTED_TREND;
    }
    
    public static final /* synthetic */ SearchSource access$getTRENDING$cp() {
        return SearchSource.TRENDING;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public final String getValue() {
        return this.value;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.value);
    }
    
    @Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n" }, d2 = { "Lcom/reddit/domain/model/search/SearchSource$Companion;", "", "()V", "DEFAULT", "Lcom/reddit/domain/model/search/SearchSource;", "PROMOTED_TREND", "getPROMOTED_TREND", "()Lcom/reddit/domain/model/search/SearchSource;", "TRENDING", "getTRENDING", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final SearchSource getPROMOTED_TREND() {
            return SearchSource.access$getPROMOTED_TREND$cp();
        }
        
        public final SearchSource getTRENDING() {
            return SearchSource.access$getTRENDING$cp();
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<SearchSource>
    {
        public final SearchSource createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            return new SearchSource(parcel.readString());
        }
        
        public final SearchSource[] newArray(final int n) {
            return new SearchSource[n];
        }
    }
}
