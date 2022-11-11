// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import androidx.appcompat.widget.s0;
import ah2.f;
import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\f\u001a\u00020\u0007\u0012\b\b\u0001\u0010\r\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0007¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0007H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0007H\u00c6\u0003J\t\u0010#\u001a\u00020\u0007H\u00c6\u0003J\t\u0010$\u001a\u00020\u0007H\u00c6\u0003J\t\u0010%\u001a\u00020\u0007H\u00c6\u0003J\t\u0010&\u001a\u00020\u0007H\u00c6\u0003Jm\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\u00072\b\b\u0003\u0010\u000b\u001a\u00020\u00072\b\b\u0003\u0010\f\u001a\u00020\u00072\b\b\u0003\u0010\r\u001a\u00020\u00072\b\b\u0003\u0010\u000e\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020\u0005H\u00d6\u0001J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015¨\u0006-" }, d2 = { "Lcom/reddit/data/model/GroupAwardTier;", "", "awardId", "", "awardingsRequired", "", "icon16", "Lcom/reddit/data/model/MediaSource;", "icon24", "icon32", "icon48", "icon64", "icon72", "icon96", "icon128", "(Ljava/lang/String;ILcom/reddit/data/model/MediaSource;Lcom/reddit/data/model/MediaSource;Lcom/reddit/data/model/MediaSource;Lcom/reddit/data/model/MediaSource;Lcom/reddit/data/model/MediaSource;Lcom/reddit/data/model/MediaSource;Lcom/reddit/data/model/MediaSource;Lcom/reddit/data/model/MediaSource;)V", "getAwardId", "()Ljava/lang/String;", "getAwardingsRequired", "()I", "getIcon128", "()Lcom/reddit/data/model/MediaSource;", "getIcon16", "getIcon24", "getIcon32", "getIcon48", "getIcon64", "getIcon72", "getIcon96", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class GroupAwardTier
{
    private final String awardId;
    private final int awardingsRequired;
    private final MediaSource icon128;
    private final MediaSource icon16;
    private final MediaSource icon24;
    private final MediaSource icon32;
    private final MediaSource icon48;
    private final MediaSource icon64;
    private final MediaSource icon72;
    private final MediaSource icon96;
    
    public GroupAwardTier(final String awardId, final int awardingsRequired, @n(name = "icon_16") final MediaSource icon16, @n(name = "icon_24") final MediaSource icon17, @n(name = "icon_32") final MediaSource icon18, @n(name = "icon_48") final MediaSource icon19, @n(name = "icon_64") final MediaSource icon20, @n(name = "icon_72") final MediaSource icon21, @n(name = "icon_96") final MediaSource icon22, @n(name = "icon_128") final MediaSource icon23) {
        f.f((Object)awardId, "awardId");
        f.f((Object)icon16, "icon16");
        f.f((Object)icon17, "icon24");
        f.f((Object)icon18, "icon32");
        f.f((Object)icon19, "icon48");
        f.f((Object)icon20, "icon64");
        f.f((Object)icon21, "icon72");
        f.f((Object)icon22, "icon96");
        f.f((Object)icon23, "icon128");
        this.awardId = awardId;
        this.awardingsRequired = awardingsRequired;
        this.icon16 = icon16;
        this.icon24 = icon17;
        this.icon32 = icon18;
        this.icon48 = icon19;
        this.icon64 = icon20;
        this.icon72 = icon21;
        this.icon96 = icon22;
        this.icon128 = icon23;
    }
    
    public final String component1() {
        return this.awardId;
    }
    
    public final MediaSource component10() {
        return this.icon128;
    }
    
    public final int component2() {
        return this.awardingsRequired;
    }
    
    public final MediaSource component3() {
        return this.icon16;
    }
    
    public final MediaSource component4() {
        return this.icon24;
    }
    
    public final MediaSource component5() {
        return this.icon32;
    }
    
    public final MediaSource component6() {
        return this.icon48;
    }
    
    public final MediaSource component7() {
        return this.icon64;
    }
    
    public final MediaSource component8() {
        return this.icon72;
    }
    
    public final MediaSource component9() {
        return this.icon96;
    }
    
    public final GroupAwardTier copy(final String s, final int n, @n(name = "icon_16") final MediaSource mediaSource, @n(name = "icon_24") final MediaSource mediaSource2, @n(name = "icon_32") final MediaSource mediaSource3, @n(name = "icon_48") final MediaSource mediaSource4, @n(name = "icon_64") final MediaSource mediaSource5, @n(name = "icon_72") final MediaSource mediaSource6, @n(name = "icon_96") final MediaSource mediaSource7, @n(name = "icon_128") final MediaSource mediaSource8) {
        f.f((Object)s, "awardId");
        f.f((Object)mediaSource, "icon16");
        f.f((Object)mediaSource2, "icon24");
        f.f((Object)mediaSource3, "icon32");
        f.f((Object)mediaSource4, "icon48");
        f.f((Object)mediaSource5, "icon64");
        f.f((Object)mediaSource6, "icon72");
        f.f((Object)mediaSource7, "icon96");
        f.f((Object)mediaSource8, "icon128");
        return new GroupAwardTier(s, n, mediaSource, mediaSource2, mediaSource3, mediaSource4, mediaSource5, mediaSource6, mediaSource7, mediaSource8);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GroupAwardTier)) {
            return false;
        }
        final GroupAwardTier groupAwardTier = (GroupAwardTier)o;
        return f.a((Object)this.awardId, (Object)groupAwardTier.awardId) && this.awardingsRequired == groupAwardTier.awardingsRequired && f.a((Object)this.icon16, (Object)groupAwardTier.icon16) && f.a((Object)this.icon24, (Object)groupAwardTier.icon24) && f.a((Object)this.icon32, (Object)groupAwardTier.icon32) && f.a((Object)this.icon48, (Object)groupAwardTier.icon48) && f.a((Object)this.icon64, (Object)groupAwardTier.icon64) && f.a((Object)this.icon72, (Object)groupAwardTier.icon72) && f.a((Object)this.icon96, (Object)groupAwardTier.icon96) && f.a((Object)this.icon128, (Object)groupAwardTier.icon128);
    }
    
    public final String getAwardId() {
        return this.awardId;
    }
    
    public final int getAwardingsRequired() {
        return this.awardingsRequired;
    }
    
    public final MediaSource getIcon128() {
        return this.icon128;
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
    
    public final MediaSource getIcon72() {
        return this.icon72;
    }
    
    public final MediaSource getIcon96() {
        return this.icon96;
    }
    
    @Override
    public int hashCode() {
        return this.icon128.hashCode() + (this.icon96.hashCode() + (this.icon72.hashCode() + (this.icon64.hashCode() + (this.icon48.hashCode() + (this.icon32.hashCode() + (this.icon24.hashCode() + (this.icon16.hashCode() + s0.e(this.awardingsRequired, this.awardId.hashCode() * 31, 31)) * 31) * 31) * 31) * 31) * 31) * 31) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("GroupAwardTier(awardId=");
        k.append(this.awardId);
        k.append(", awardingsRequired=");
        k.append(this.awardingsRequired);
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
        k.append(", icon72=");
        k.append(this.icon72);
        k.append(", icon96=");
        k.append(this.icon96);
        k.append(", icon128=");
        k.append(this.icon128);
        k.append(')');
        return k.toString();
    }
}
