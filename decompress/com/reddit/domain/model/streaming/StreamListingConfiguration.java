// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import a2.b;
import ah2.c;
import ak0.m;
import androidx.appcompat.widget.s0;
import kotlin.collections.EmptyList;
import java.util.List;
import ah2.f;
import com.squareup.moshi.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamListingConfiguration;", "", "global", "Lcom/reddit/domain/model/streaming/StreamConfiguration;", "subreddit", "Lcom/reddit/domain/model/streaming/StreamListingConfiguration$Subreddit;", "listingInfo", "Lcom/reddit/domain/model/streaming/ListingInfo;", "(Lcom/reddit/domain/model/streaming/StreamConfiguration;Lcom/reddit/domain/model/streaming/StreamListingConfiguration$Subreddit;Lcom/reddit/domain/model/streaming/ListingInfo;)V", "getGlobal", "()Lcom/reddit/domain/model/streaming/StreamConfiguration;", "getListingInfo", "()Lcom/reddit/domain/model/streaming/ListingInfo;", "getSubreddit", "()Lcom/reddit/domain/model/streaming/StreamListingConfiguration$Subreddit;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "Subreddit", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class StreamListingConfiguration
{
    public static final Companion Companion;
    private static final StreamListingConfiguration DEFAULT;
    private final StreamConfiguration global;
    private final ListingInfo listingInfo;
    private final Subreddit subreddit;
    
    static {
        Companion = new Companion(null);
        DEFAULT = new StreamListingConfiguration(null, null, null, 7, null);
    }
    
    public StreamListingConfiguration() {
        this(null, null, null, 7, null);
    }
    
    public StreamListingConfiguration(final StreamConfiguration global, final Subreddit subreddit, @n(name = "listing_info") final ListingInfo listingInfo) {
        f.f((Object)global, "global");
        f.f((Object)listingInfo, "listingInfo");
        this.global = global;
        this.subreddit = subreddit;
        this.listingInfo = listingInfo;
    }
    
    public static final /* synthetic */ StreamListingConfiguration access$getDEFAULT$cp() {
        return StreamListingConfiguration.DEFAULT;
    }
    
    public final StreamConfiguration component1() {
        return this.global;
    }
    
    public final Subreddit component2() {
        return this.subreddit;
    }
    
    public final ListingInfo component3() {
        return this.listingInfo;
    }
    
    public final StreamListingConfiguration copy(final StreamConfiguration streamConfiguration, final Subreddit subreddit, @n(name = "listing_info") final ListingInfo listingInfo) {
        f.f((Object)streamConfiguration, "global");
        f.f((Object)listingInfo, "listingInfo");
        return new StreamListingConfiguration(streamConfiguration, subreddit, listingInfo);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StreamListingConfiguration)) {
            return false;
        }
        final StreamListingConfiguration streamListingConfiguration = (StreamListingConfiguration)o;
        return f.a((Object)this.global, (Object)streamListingConfiguration.global) && f.a((Object)this.subreddit, (Object)streamListingConfiguration.subreddit) && f.a((Object)this.listingInfo, (Object)streamListingConfiguration.listingInfo);
    }
    
    public final StreamConfiguration getGlobal() {
        return this.global;
    }
    
    public final ListingInfo getListingInfo() {
        return this.listingInfo;
    }
    
    public final Subreddit getSubreddit() {
        return this.subreddit;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.global.hashCode();
        final Subreddit subreddit = this.subreddit;
        int hashCode2;
        if (subreddit == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = subreddit.hashCode();
        }
        return this.listingInfo.hashCode() + (hashCode * 31 + hashCode2) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("StreamListingConfiguration(global=");
        k.append(this.global);
        k.append(", subreddit=");
        k.append(this.subreddit);
        k.append(", listingInfo=");
        k.append(this.listingInfo);
        k.append(')');
        return k.toString();
    }
    
    @Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamListingConfiguration$Companion;", "", "()V", "DEFAULT", "Lcom/reddit/domain/model/streaming/StreamListingConfiguration;", "getDEFAULT", "()Lcom/reddit/domain/model/streaming/StreamListingConfiguration;", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final StreamListingConfiguration getDEFAULT() {
            return StreamListingConfiguration.access$getDEFAULT$cp();
        }
    }
    
    @o(generateAdapter = true)
    @Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0004&'()BQ\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0005\u0012\b\b\u0003\u0010\t\u001a\u00020\n\u0012\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\nH\u00c6\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\fH\u00c6\u0003JU\u0010!\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\n2\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u00c6\u0001J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\u0005H\u00d6\u0001J\t\u0010%\u001a\u00020\rH\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006*" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamListingConfiguration$Subreddit;", "", "liveStreamingEnabled", "", "maxLiveStreams", "", "minKarma", "minAccountAgeDays", "durationLimitSeconds", "onAirSchedule", "Lcom/reddit/domain/model/streaming/StreamListingConfiguration$Subreddit$LiveStreamingSchedule;", "whitelistUsers", "", "", "(ZIIIILcom/reddit/domain/model/streaming/StreamListingConfiguration$Subreddit$LiveStreamingSchedule;Ljava/util/List;)V", "getDurationLimitSeconds", "()I", "getLiveStreamingEnabled", "()Z", "getMaxLiveStreams", "getMinAccountAgeDays", "getMinKarma", "getOnAirSchedule", "()Lcom/reddit/domain/model/streaming/StreamListingConfiguration$Subreddit$LiveStreamingSchedule;", "getWhitelistUsers", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "Companion", "LiveStreamingSchedule", "TimeOfDay", "TimeSpan", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Subreddit
    {
        public static final Companion Companion;
        private static final Subreddit DEFAULT;
        private final int durationLimitSeconds;
        private final boolean liveStreamingEnabled;
        private final int maxLiveStreams;
        private final int minAccountAgeDays;
        private final int minKarma;
        private final LiveStreamingSchedule onAirSchedule;
        private final List<String> whitelistUsers;
        
        static {
            Companion = new Companion(null);
            DEFAULT = new Subreddit(false, 0, 0, 0, 0, null, null, 127, null);
        }
        
        public Subreddit() {
            this(false, 0, 0, 0, 0, null, null, 127, null);
        }
        
        public Subreddit(@n(name = "live_streaming_enabled") final boolean liveStreamingEnabled, @n(name = "max_live_streams") final int maxLiveStreams, @n(name = "min_karma") final int minKarma, @n(name = "min_account_age_days") final int minAccountAgeDays, @n(name = "duration_limit_seconds") final int durationLimitSeconds, @n(name = "on_air_schedule") final LiveStreamingSchedule onAirSchedule, @n(name = "whitelist_users") final List<String> whitelistUsers) {
            f.f((Object)onAirSchedule, "onAirSchedule");
            f.f((Object)whitelistUsers, "whitelistUsers");
            this.liveStreamingEnabled = liveStreamingEnabled;
            this.maxLiveStreams = maxLiveStreams;
            this.minKarma = minKarma;
            this.minAccountAgeDays = minAccountAgeDays;
            this.durationLimitSeconds = durationLimitSeconds;
            this.onAirSchedule = onAirSchedule;
            this.whitelistUsers = whitelistUsers;
        }
        
        public Subreddit(boolean b, int n, int n2, int n3, int n4, LiveStreamingSchedule liveStreamingSchedule, List instance, final int n5, final DefaultConstructorMarker defaultConstructorMarker) {
            if ((n5 & 0x1) != 0x0) {
                b = false;
            }
            if ((n5 & 0x2) != 0x0) {
                n = 10;
            }
            if ((n5 & 0x4) != 0x0) {
                n2 = 999;
            }
            if ((n5 & 0x8) != 0x0) {
                n3 = 30;
            }
            if ((n5 & 0x10) != 0x0) {
                n4 = 1800;
            }
            if ((n5 & 0x20) != 0x0) {
                liveStreamingSchedule = new LiveStreamingSchedule(null, null, null, null, null, null, null, 127, null);
            }
            if ((n5 & 0x40) != 0x0) {
                instance = EmptyList.INSTANCE;
            }
            this(b, n, n2, n3, n4, liveStreamingSchedule, (List<String>)instance);
        }
        
        public static final /* synthetic */ Subreddit access$getDEFAULT$cp() {
            return Subreddit.DEFAULT;
        }
        
        public final boolean component1() {
            return this.liveStreamingEnabled;
        }
        
        public final int component2() {
            return this.maxLiveStreams;
        }
        
        public final int component3() {
            return this.minKarma;
        }
        
        public final int component4() {
            return this.minAccountAgeDays;
        }
        
        public final int component5() {
            return this.durationLimitSeconds;
        }
        
        public final LiveStreamingSchedule component6() {
            return this.onAirSchedule;
        }
        
        public final List<String> component7() {
            return this.whitelistUsers;
        }
        
        public final Subreddit copy(@n(name = "live_streaming_enabled") final boolean b, @n(name = "max_live_streams") final int n, @n(name = "min_karma") final int n2, @n(name = "min_account_age_days") final int n3, @n(name = "duration_limit_seconds") final int n4, @n(name = "on_air_schedule") final LiveStreamingSchedule liveStreamingSchedule, @n(name = "whitelist_users") final List<String> list) {
            f.f((Object)liveStreamingSchedule, "onAirSchedule");
            f.f((Object)list, "whitelistUsers");
            return new Subreddit(b, n, n2, n3, n4, liveStreamingSchedule, list);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Subreddit)) {
                return false;
            }
            final Subreddit subreddit = (Subreddit)o;
            return this.liveStreamingEnabled == subreddit.liveStreamingEnabled && this.maxLiveStreams == subreddit.maxLiveStreams && this.minKarma == subreddit.minKarma && this.minAccountAgeDays == subreddit.minAccountAgeDays && this.durationLimitSeconds == subreddit.durationLimitSeconds && f.a((Object)this.onAirSchedule, (Object)subreddit.onAirSchedule) && f.a((Object)this.whitelistUsers, (Object)subreddit.whitelistUsers);
        }
        
        public final int getDurationLimitSeconds() {
            return this.durationLimitSeconds;
        }
        
        public final boolean getLiveStreamingEnabled() {
            return this.liveStreamingEnabled;
        }
        
        public final int getMaxLiveStreams() {
            return this.maxLiveStreams;
        }
        
        public final int getMinAccountAgeDays() {
            return this.minAccountAgeDays;
        }
        
        public final int getMinKarma() {
            return this.minKarma;
        }
        
        public final LiveStreamingSchedule getOnAirSchedule() {
            return this.onAirSchedule;
        }
        
        public final List<String> getWhitelistUsers() {
            return this.whitelistUsers;
        }
        
        @Override
        public int hashCode() {
            int liveStreamingEnabled;
            if ((liveStreamingEnabled = (this.liveStreamingEnabled ? 1 : 0)) != 0) {
                liveStreamingEnabled = 1;
            }
            return this.whitelistUsers.hashCode() + (this.onAirSchedule.hashCode() + s0.e(this.durationLimitSeconds, s0.e(this.minAccountAgeDays, s0.e(this.minKarma, s0.e(this.maxLiveStreams, liveStreamingEnabled * 31, 31), 31), 31), 31)) * 31;
        }
        
        @Override
        public String toString() {
            final StringBuilder k = a.k("Subreddit(liveStreamingEnabled=");
            k.append(this.liveStreamingEnabled);
            k.append(", maxLiveStreams=");
            k.append(this.maxLiveStreams);
            k.append(", minKarma=");
            k.append(this.minKarma);
            k.append(", minAccountAgeDays=");
            k.append(this.minAccountAgeDays);
            k.append(", durationLimitSeconds=");
            k.append(this.durationLimitSeconds);
            k.append(", onAirSchedule=");
            k.append(this.onAirSchedule);
            k.append(", whitelistUsers=");
            return m.n(k, (List)this.whitelistUsers, ')');
        }
        
        @Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamListingConfiguration$Subreddit$Companion;", "", "()V", "DEFAULT", "Lcom/reddit/domain/model/streaming/StreamListingConfiguration$Subreddit;", "getDEFAULT", "()Lcom/reddit/domain/model/streaming/StreamListingConfiguration$Subreddit;", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
        public static final class Companion
        {
            private Companion() {
            }
            
            public final Subreddit getDEFAULT() {
                return Subreddit.access$getDEFAULT$cp();
            }
        }
        
        @o(generateAdapter = true)
        @Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#Bu\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003Jy\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006$" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamListingConfiguration$Subreddit$LiveStreamingSchedule;", "", "sunday", "", "Lcom/reddit/domain/model/streaming/StreamListingConfiguration$Subreddit$TimeSpan;", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getFriday", "()Ljava/util/List;", "getMonday", "getSaturday", "getSunday", "getThursday", "getTuesday", "getWednesday", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
        public static final class LiveStreamingSchedule
        {
            public static final Companion Companion;
            private static final List<TimeSpan> DEFAULT;
            private final List<TimeSpan> friday;
            private final List<TimeSpan> monday;
            private final List<TimeSpan> saturday;
            private final List<TimeSpan> sunday;
            private final List<TimeSpan> thursday;
            private final List<TimeSpan> tuesday;
            private final List<TimeSpan> wednesday;
            
            static {
                Companion = new Companion(null);
                DEFAULT = c.X((Object)new TimeSpan(null, null, 3, null));
            }
            
            public LiveStreamingSchedule() {
                this(null, null, null, null, null, null, null, 127, null);
            }
            
            public LiveStreamingSchedule(final List<TimeSpan> sunday, final List<TimeSpan> monday, final List<TimeSpan> tuesday, final List<TimeSpan> wednesday, final List<TimeSpan> thursday, final List<TimeSpan> friday, final List<TimeSpan> saturday) {
                f.f((Object)sunday, "sunday");
                f.f((Object)monday, "monday");
                f.f((Object)tuesday, "tuesday");
                f.f((Object)wednesday, "wednesday");
                f.f((Object)thursday, "thursday");
                f.f((Object)friday, "friday");
                f.f((Object)saturday, "saturday");
                this.sunday = sunday;
                this.monday = monday;
                this.tuesday = tuesday;
                this.wednesday = wednesday;
                this.thursday = thursday;
                this.friday = friday;
                this.saturday = saturday;
            }
            
            public final List<TimeSpan> component1() {
                return this.sunday;
            }
            
            public final List<TimeSpan> component2() {
                return this.monday;
            }
            
            public final List<TimeSpan> component3() {
                return this.tuesday;
            }
            
            public final List<TimeSpan> component4() {
                return this.wednesday;
            }
            
            public final List<TimeSpan> component5() {
                return this.thursday;
            }
            
            public final List<TimeSpan> component6() {
                return this.friday;
            }
            
            public final List<TimeSpan> component7() {
                return this.saturday;
            }
            
            public final LiveStreamingSchedule copy(final List<TimeSpan> list, final List<TimeSpan> list2, final List<TimeSpan> list3, final List<TimeSpan> list4, final List<TimeSpan> list5, final List<TimeSpan> list6, final List<TimeSpan> list7) {
                f.f((Object)list, "sunday");
                f.f((Object)list2, "monday");
                f.f((Object)list3, "tuesday");
                f.f((Object)list4, "wednesday");
                f.f((Object)list5, "thursday");
                f.f((Object)list6, "friday");
                f.f((Object)list7, "saturday");
                return new LiveStreamingSchedule(list, list2, list3, list4, list5, list6, list7);
            }
            
            @Override
            public boolean equals(final Object o) {
                if (this == o) {
                    return true;
                }
                if (!(o instanceof LiveStreamingSchedule)) {
                    return false;
                }
                final LiveStreamingSchedule liveStreamingSchedule = (LiveStreamingSchedule)o;
                return f.a((Object)this.sunday, (Object)liveStreamingSchedule.sunday) && f.a((Object)this.monday, (Object)liveStreamingSchedule.monday) && f.a((Object)this.tuesday, (Object)liveStreamingSchedule.tuesday) && f.a((Object)this.wednesday, (Object)liveStreamingSchedule.wednesday) && f.a((Object)this.thursday, (Object)liveStreamingSchedule.thursday) && f.a((Object)this.friday, (Object)liveStreamingSchedule.friday) && f.a((Object)this.saturday, (Object)liveStreamingSchedule.saturday);
            }
            
            public final List<TimeSpan> getFriday() {
                return this.friday;
            }
            
            public final List<TimeSpan> getMonday() {
                return this.monday;
            }
            
            public final List<TimeSpan> getSaturday() {
                return this.saturday;
            }
            
            public final List<TimeSpan> getSunday() {
                return this.sunday;
            }
            
            public final List<TimeSpan> getThursday() {
                return this.thursday;
            }
            
            public final List<TimeSpan> getTuesday() {
                return this.tuesday;
            }
            
            public final List<TimeSpan> getWednesday() {
                return this.wednesday;
            }
            
            @Override
            public int hashCode() {
                return this.saturday.hashCode() + b.a((List)this.friday, b.a((List)this.thursday, b.a((List)this.wednesday, b.a((List)this.tuesday, b.a((List)this.monday, this.sunday.hashCode() * 31, 31), 31), 31), 31), 31);
            }
            
            @Override
            public String toString() {
                final StringBuilder k = a.k("LiveStreamingSchedule(sunday=");
                k.append(this.sunday);
                k.append(", monday=");
                k.append(this.monday);
                k.append(", tuesday=");
                k.append(this.tuesday);
                k.append(", wednesday=");
                k.append(this.wednesday);
                k.append(", thursday=");
                k.append(this.thursday);
                k.append(", friday=");
                k.append(this.friday);
                k.append(", saturday=");
                return m.n(k, (List)this.saturday, ')');
            }
            
            @Metadata(d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamListingConfiguration$Subreddit$LiveStreamingSchedule$Companion;", "", "()V", "DEFAULT", "", "Lcom/reddit/domain/model/streaming/StreamListingConfiguration$Subreddit$TimeSpan;", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
            public static final class Companion
            {
                private Companion() {
                }
            }
        }
        
        @o(generateAdapter = true)
        @Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamListingConfiguration$Subreddit$TimeOfDay;", "", "hour", "", "minute", "(II)V", "getHour", "()I", "getMinute", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
        public static final class TimeOfDay
        {
            private final int hour;
            private final int minute;
            
            public TimeOfDay(final int hour, final int minute) {
                this.hour = hour;
                this.minute = minute;
            }
            
            public final int component1() {
                return this.hour;
            }
            
            public final int component2() {
                return this.minute;
            }
            
            public final TimeOfDay copy(final int n, final int n2) {
                return new TimeOfDay(n, n2);
            }
            
            @Override
            public boolean equals(final Object o) {
                if (this == o) {
                    return true;
                }
                if (!(o instanceof TimeOfDay)) {
                    return false;
                }
                final TimeOfDay timeOfDay = (TimeOfDay)o;
                return this.hour == timeOfDay.hour && this.minute == timeOfDay.minute;
            }
            
            public final int getHour() {
                return this.hour;
            }
            
            public final int getMinute() {
                return this.minute;
            }
            
            @Override
            public int hashCode() {
                return Integer.hashCode(this.minute) + Integer.hashCode(this.hour) * 31;
            }
            
            @Override
            public String toString() {
                final StringBuilder k = a.k("TimeOfDay(hour=");
                k.append(this.hour);
                k.append(", minute=");
                return d.k(k, this.minute, ')');
            }
        }
        
        @o(generateAdapter = true)
        @Metadata(d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0019\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamListingConfiguration$Subreddit$TimeSpan;", "", "startTimeUtc", "Lcom/reddit/domain/model/streaming/StreamListingConfiguration$Subreddit$TimeOfDay;", "endTimeUtc", "(Lcom/reddit/domain/model/streaming/StreamListingConfiguration$Subreddit$TimeOfDay;Lcom/reddit/domain/model/streaming/StreamListingConfiguration$Subreddit$TimeOfDay;)V", "getEndTimeUtc", "()Lcom/reddit/domain/model/streaming/StreamListingConfiguration$Subreddit$TimeOfDay;", "getStartTimeUtc", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
        public static final class TimeSpan
        {
            public static final Companion Companion;
            private static final TimeOfDay DEFAULT_END;
            private static final TimeOfDay DEFAULT_START;
            private final TimeOfDay endTimeUtc;
            private final TimeOfDay startTimeUtc;
            
            static {
                Companion = new Companion(null);
                DEFAULT_START = new TimeOfDay(9, 0);
                DEFAULT_END = new TimeOfDay(17, 0);
            }
            
            public TimeSpan() {
                this(null, null, 3, null);
            }
            
            public TimeSpan(@n(name = "start_time_utc") final TimeOfDay startTimeUtc, @n(name = "end_time_utc") final TimeOfDay endTimeUtc) {
                f.f((Object)startTimeUtc, "startTimeUtc");
                f.f((Object)endTimeUtc, "endTimeUtc");
                this.startTimeUtc = startTimeUtc;
                this.endTimeUtc = endTimeUtc;
            }
            
            public final TimeOfDay component1() {
                return this.startTimeUtc;
            }
            
            public final TimeOfDay component2() {
                return this.endTimeUtc;
            }
            
            public final TimeSpan copy(@n(name = "start_time_utc") final TimeOfDay timeOfDay, @n(name = "end_time_utc") final TimeOfDay timeOfDay2) {
                f.f((Object)timeOfDay, "startTimeUtc");
                f.f((Object)timeOfDay2, "endTimeUtc");
                return new TimeSpan(timeOfDay, timeOfDay2);
            }
            
            @Override
            public boolean equals(final Object o) {
                if (this == o) {
                    return true;
                }
                if (!(o instanceof TimeSpan)) {
                    return false;
                }
                final TimeSpan timeSpan = (TimeSpan)o;
                return f.a((Object)this.startTimeUtc, (Object)timeSpan.startTimeUtc) && f.a((Object)this.endTimeUtc, (Object)timeSpan.endTimeUtc);
            }
            
            public final TimeOfDay getEndTimeUtc() {
                return this.endTimeUtc;
            }
            
            public final TimeOfDay getStartTimeUtc() {
                return this.startTimeUtc;
            }
            
            @Override
            public int hashCode() {
                return this.endTimeUtc.hashCode() + this.startTimeUtc.hashCode() * 31;
            }
            
            @Override
            public String toString() {
                final StringBuilder k = a.k("TimeSpan(startTimeUtc=");
                k.append(this.startTimeUtc);
                k.append(", endTimeUtc=");
                k.append(this.endTimeUtc);
                k.append(')');
                return k.toString();
            }
            
            @Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamListingConfiguration$Subreddit$TimeSpan$Companion;", "", "()V", "DEFAULT_END", "Lcom/reddit/domain/model/streaming/StreamListingConfiguration$Subreddit$TimeOfDay;", "DEFAULT_START", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
            public static final class Companion
            {
                private Companion() {
                }
            }
        }
    }
}
