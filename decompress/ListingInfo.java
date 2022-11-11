// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import androidx.appcompat.widget.s0;
import ah2.f;
import com.squareup.moshi.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB=\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003JF\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\t\u001a\u00020\u0007H\u00c6\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0006\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 " }, d2 = { "Lcom/reddit/domain/model/streaming/ListingInfo;", "", "discoveryUnitIndex", "", "id", "", "isStreamingEnabled", "", "name", "showDiscoveryUnit", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Z)V", "getDiscoveryUnitIndex", "()I", "getId", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getName", "getShowDiscoveryUnit", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Z)Lcom/reddit/domain/model/streaming/ListingInfo;", "equals", "other", "hashCode", "toString", "Companion", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ListingInfo
{
    public static final Companion Companion;
    private static final ListingInfo DEFAULT;
    private final int discoveryUnitIndex;
    private final String id;
    private final Boolean isStreamingEnabled;
    private final String name;
    private final boolean showDiscoveryUnit;
    
    static {
        Companion = new Companion(null);
        DEFAULT = new ListingInfo(0, null, null, null, false, 31, null);
    }
    
    public ListingInfo() {
        this(0, null, null, null, false, 31, null);
    }
    
    public ListingInfo(@n(name = "discovery_unit_index") final int discoveryUnitIndex, final String id, @n(name = "is_streaming_enabled") final Boolean isStreamingEnabled, String name, @n(name = "show_discovery_unit") final boolean showDiscoveryUnit) {
        this.discoveryUnitIndex = discoveryUnitIndex;
        this.id = id;
        this.isStreamingEnabled = isStreamingEnabled;
        this.name = name;
        this.showDiscoveryUnit = showDiscoveryUnit;
    }
    
    public static final /* synthetic */ ListingInfo access$getDEFAULT$cp() {
        return ListingInfo.DEFAULT;
    }
    
    public final int component1() {
        return this.discoveryUnitIndex;
    }
    
    public final String component2() {
        return this.id;
    }
    
    public final Boolean component3() {
        return this.isStreamingEnabled;
    }
    
    public final String component4() {
        return this.name;
    }
    
    public final boolean component5() {
        return this.showDiscoveryUnit;
    }
    
    public final ListingInfo copy(@n(name = "discovery_unit_index") final int n, final String s, @n(name = "is_streaming_enabled") final Boolean b, final String s2, @n(name = "show_discovery_unit") final boolean b2) {
        return new ListingInfo(n, s, b, s2, b2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListingInfo)) {
            return false;
        }
        final ListingInfo listingInfo = (ListingInfo)o;
        return this.discoveryUnitIndex == listingInfo.discoveryUnitIndex && f.a((Object)this.id, (Object)listingInfo.id) && f.a((Object)this.isStreamingEnabled, (Object)listingInfo.isStreamingEnabled) && f.a((Object)this.name, (Object)listingInfo.name) && this.showDiscoveryUnit == listingInfo.showDiscoveryUnit;
    }
    
    public final int getDiscoveryUnitIndex() {
        return this.discoveryUnitIndex;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final String getName() {
        return this.name;
    }
    
    public final boolean getShowDiscoveryUnit() {
        return this.showDiscoveryUnit;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = Integer.hashCode(this.discoveryUnitIndex);
        final String id = this.id;
        int hashCode2 = 0;
        int hashCode3;
        if (id == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = id.hashCode();
        }
        final Boolean isStreamingEnabled = this.isStreamingEnabled;
        int hashCode4;
        if (isStreamingEnabled == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = isStreamingEnabled.hashCode();
        }
        final String name = this.name;
        if (name != null) {
            hashCode2 = name.hashCode();
        }
        int showDiscoveryUnit;
        if ((showDiscoveryUnit = (this.showDiscoveryUnit ? 1 : 0)) != 0) {
            showDiscoveryUnit = 1;
        }
        return (((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode2) * 31 + showDiscoveryUnit;
    }
    
    public final Boolean isStreamingEnabled() {
        return this.isStreamingEnabled;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("ListingInfo(discoveryUnitIndex=");
        k.append(this.discoveryUnitIndex);
        k.append(", id=");
        k.append(this.id);
        k.append(", isStreamingEnabled=");
        k.append(this.isStreamingEnabled);
        k.append(", name=");
        k.append(this.name);
        k.append(", showDiscoveryUnit=");
        return s0.o(k, this.showDiscoveryUnit, ')');
    }
    
    @Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/model/streaming/ListingInfo$Companion;", "", "()V", "DEFAULT", "Lcom/reddit/domain/model/streaming/ListingInfo;", "getDEFAULT", "()Lcom/reddit/domain/model/streaming/ListingInfo;", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final ListingInfo getDEFAULT() {
            return ListingInfo.access$getDEFAULT$cp();
        }
    }
}
