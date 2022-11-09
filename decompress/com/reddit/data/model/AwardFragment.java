// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import ag0.a;
import ah2.f;
import com.squareup.moshi.n;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u000e¢\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u000eH\u00c6\u0003J\t\u0010'\u001a\u00020\u000eH\u00c6\u0003J\t\u0010(\u001a\u00020\u000eH\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u00c6\u0003J\t\u0010/\u001a\u00020\u000eH\u00c6\u0003J\t\u00100\u001a\u00020\u000eH\u00c6\u0003J\u0094\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0010\u001a\u00020\u000e2\b\b\u0003\u0010\u0011\u001a\u00020\u000e2\b\b\u0003\u0010\u0012\u001a\u00020\u000eH\u00c6\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00106\u001a\u000207H\u00d6\u0001J\t\u00108\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00069" }, d2 = { "Lcom/reddit/data/model/AwardFragment;", "", "id", "", "name", "awardType", "coinPrice", "", "iconFormat", "awardSubType", "tiers", "", "Lcom/reddit/data/model/GroupAwardTier;", "icon16", "Lcom/reddit/data/model/MediaSource;", "icon24", "icon32", "icon48", "icon64", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/reddit/data/model/MediaSource;Lcom/reddit/data/model/MediaSource;Lcom/reddit/data/model/MediaSource;Lcom/reddit/data/model/MediaSource;Lcom/reddit/data/model/MediaSource;)V", "getAwardSubType", "()Ljava/lang/String;", "getAwardType", "getCoinPrice", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getIcon16", "()Lcom/reddit/data/model/MediaSource;", "getIcon24", "getIcon32", "getIcon48", "getIcon64", "getIconFormat", "getId", "getName", "getTiers", "()Ljava/util/List;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/reddit/data/model/MediaSource;Lcom/reddit/data/model/MediaSource;Lcom/reddit/data/model/MediaSource;Lcom/reddit/data/model/MediaSource;Lcom/reddit/data/model/MediaSource;)Lcom/reddit/data/model/AwardFragment;", "equals", "", "other", "hashCode", "", "toString", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class AwardFragment
{
    private final String awardSubType;
    private final String awardType;
    private final Long coinPrice;
    private final MediaSource icon16;
    private final MediaSource icon24;
    private final MediaSource icon32;
    private final MediaSource icon48;
    private final MediaSource icon64;
    private final String iconFormat;
    private final String id;
    private final String name;
    private final List<GroupAwardTier> tiers;
    
    public AwardFragment(final String id, String name, final String awardType, final Long coinPrice, final String iconFormat, final String awardSubType, final List<GroupAwardTier> tiers, @n(name = "icon_16") final MediaSource icon16, @n(name = "icon_24") final MediaSource icon17, @n(name = "icon_32") final MediaSource icon18, @n(name = "icon_48") final MediaSource icon19, @n(name = "icon_64") final MediaSource icon20) {
        f.f((Object)id, "id");
        f.f((Object)name, "name");
        f.f((Object)awardType, "awardType");
        f.f((Object)icon16, "icon16");
        f.f((Object)icon17, "icon24");
        f.f((Object)icon18, "icon32");
        f.f((Object)icon19, "icon48");
        f.f((Object)icon20, "icon64");
        this.id = id;
        this.name = name;
        this.awardType = awardType;
        this.coinPrice = coinPrice;
        this.iconFormat = iconFormat;
        this.awardSubType = awardSubType;
        this.tiers = tiers;
        this.icon16 = icon16;
        this.icon24 = icon17;
        this.icon32 = icon18;
        this.icon48 = icon19;
        this.icon64 = icon20;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final MediaSource component10() {
        return this.icon32;
    }
    
    public final MediaSource component11() {
        return this.icon48;
    }
    
    public final MediaSource component12() {
        return this.icon64;
    }
    
    public final String component2() {
        return this.name;
    }
    
    public final String component3() {
        return this.awardType;
    }
    
    public final Long component4() {
        return this.coinPrice;
    }
    
    public final String component5() {
        return this.iconFormat;
    }
    
    public final String component6() {
        return this.awardSubType;
    }
    
    public final List<GroupAwardTier> component7() {
        return this.tiers;
    }
    
    public final MediaSource component8() {
        return this.icon16;
    }
    
    public final MediaSource component9() {
        return this.icon24;
    }
    
    public final AwardFragment copy(final String s, final String s2, final String s3, final Long n, final String s4, final String s5, final List<GroupAwardTier> list, @n(name = "icon_16") final MediaSource mediaSource, @n(name = "icon_24") final MediaSource mediaSource2, @n(name = "icon_32") final MediaSource mediaSource3, @n(name = "icon_48") final MediaSource mediaSource4, @n(name = "icon_64") final MediaSource mediaSource5) {
        f.f((Object)s, "id");
        f.f((Object)s2, "name");
        f.f((Object)s3, "awardType");
        f.f((Object)mediaSource, "icon16");
        f.f((Object)mediaSource2, "icon24");
        f.f((Object)mediaSource3, "icon32");
        f.f((Object)mediaSource4, "icon48");
        f.f((Object)mediaSource5, "icon64");
        return new AwardFragment(s, s2, s3, n, s4, s5, list, mediaSource, mediaSource2, mediaSource3, mediaSource4, mediaSource5);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwardFragment)) {
            return false;
        }
        final AwardFragment awardFragment = (AwardFragment)o;
        return f.a((Object)this.id, (Object)awardFragment.id) && f.a((Object)this.name, (Object)awardFragment.name) && f.a((Object)this.awardType, (Object)awardFragment.awardType) && f.a((Object)this.coinPrice, (Object)awardFragment.coinPrice) && f.a((Object)this.iconFormat, (Object)awardFragment.iconFormat) && f.a((Object)this.awardSubType, (Object)awardFragment.awardSubType) && f.a((Object)this.tiers, (Object)awardFragment.tiers) && f.a((Object)this.icon16, (Object)awardFragment.icon16) && f.a((Object)this.icon24, (Object)awardFragment.icon24) && f.a((Object)this.icon32, (Object)awardFragment.icon32) && f.a((Object)this.icon48, (Object)awardFragment.icon48) && f.a((Object)this.icon64, (Object)awardFragment.icon64);
    }
    
    public final String getAwardSubType() {
        return this.awardSubType;
    }
    
    public final String getAwardType() {
        return this.awardType;
    }
    
    public final Long getCoinPrice() {
        return this.coinPrice;
    }
    
    public final MediaSource getIcon16() {
        return this.icon16;
    }
    
    public final MediaSource getIcon24() {
        return this.icon24;
    }
    
    public final MediaSource getIcon32() {
        return this.icon32;
    }
    
    public final MediaSource getIcon48() {
        return this.icon48;
    }
    
    public final MediaSource getIcon64() {
        return this.icon64;
    }
    
    public final String getIconFormat() {
        return this.iconFormat;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final String getName() {
        return this.name;
    }
    
    public final List<GroupAwardTier> getTiers() {
        return this.tiers;
    }
    
    @Override
    public int hashCode() {
        final int f = a.f(this.awardType, a.f(this.name, this.id.hashCode() * 31, 31), 31);
        final Long coinPrice = this.coinPrice;
        int hashCode = 0;
        int hashCode2;
        if (coinPrice == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = coinPrice.hashCode();
        }
        final String iconFormat = this.iconFormat;
        int hashCode3;
        if (iconFormat == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = iconFormat.hashCode();
        }
        final String awardSubType = this.awardSubType;
        int hashCode4;
        if (awardSubType == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = awardSubType.hashCode();
        }
        final List<GroupAwardTier> tiers = this.tiers;
        if (tiers != null) {
            hashCode = tiers.hashCode();
        }
        return this.icon64.hashCode() + (this.icon48.hashCode() + (this.icon32.hashCode() + (this.icon24.hashCode() + (this.icon16.hashCode() + ((((f + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode) * 31) * 31) * 31) * 31) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("AwardFragment(id=");
        k.append(this.id);
        k.append(", name=");
        k.append(this.name);
        k.append(", awardType=");
        k.append(this.awardType);
        k.append(", coinPrice=");
        k.append(this.coinPrice);
        k.append(", iconFormat=");
        k.append(this.iconFormat);
        k.append(", awardSubType=");
        k.append(this.awardSubType);
        k.append(", tiers=");
        k.append(this.tiers);
        k.append(", icon16=");
        k.append(this.icon16);
        k.append(", icon24=");
        k.append(this.icon24);
        k.append(", icon32=");
        k.append(this.icon32);
        k.append(", icon48=");
        k.append(this.icon48);
        k.append(", icon64=");
        k.append(this.icon64);
        k.append(')');
        return k.toString();
    }
}
