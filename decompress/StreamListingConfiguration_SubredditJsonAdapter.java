// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.a0;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.util.List;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 " }, d2 = { "Lcom/reddit/domain/model/streaming/StreamListingConfiguration_SubredditJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/streaming/StreamListingConfiguration$Subreddit;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Lcom/reddit/domain/model/streaming/StreamListingConfiguration$Subreddit$LiveStreamingSchedule;", "liveStreamingScheduleAdapter", "", "listOfStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class StreamListingConfiguration_SubredditJsonAdapter extends JsonAdapter<StreamListingConfiguration.Subreddit>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<StreamListingConfiguration.Subreddit> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<StreamListingConfiguration.Subreddit.LiveStreamingSchedule> liveStreamingScheduleAdapter;
    private final JsonReader$b options;
    
    public StreamListingConfiguration_SubredditJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "live_streaming_enabled", "max_live_streams", "min_karma", "min_account_age_days", "duration_limit_seconds", "on_air_schedule", "whitelist_users" });
        final Class<Boolean> type = Boolean.TYPE;
        final EmptySet instance = EmptySet.INSTANCE;
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)type, (Set)instance, "liveStreamingEnabled");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "maxLiveStreams");
        this.liveStreamingScheduleAdapter = (JsonAdapter<StreamListingConfiguration.Subreddit.LiveStreamingSchedule>)y.c((Type)StreamListingConfiguration.Subreddit.LiveStreamingSchedule.class, (Set)instance, "onAirSchedule");
        this.listOfStringAdapter = (JsonAdapter<List<String>>)y.c((Type)a0.d((Class)List.class, new Type[] { String.class }), (Set)instance, "whitelistUsers");
    }
    
    public StreamListingConfiguration.Subreddit fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        Boolean false = Boolean.FALSE;
        Integer value = 0;
        jsonReader.h();
        Integer n2;
        Integer n = n2 = value;
        int n3 = -1;
        Object o = null;
        Object o2 = null;
        Integer n4 = n2;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 6: {
                    o = this.listOfStringAdapter.fromJson(jsonReader);
                    if (o != null) {
                        n3 &= 0xFFFFFFBF;
                        continue;
                    }
                    throw a.n("whitelistUsers", "whitelist_users", jsonReader);
                }
                case 5: {
                    o2 = this.liveStreamingScheduleAdapter.fromJson(jsonReader);
                    if (o2 != null) {
                        n3 &= 0xFFFFFFDF;
                        continue;
                    }
                    throw a.n("onAirSchedule", "on_air_schedule", jsonReader);
                }
                case 4: {
                    n2 = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (n2 != null) {
                        n3 &= 0xFFFFFFEF;
                        continue;
                    }
                    throw a.n("durationLimitSeconds", "duration_limit_seconds", jsonReader);
                }
                case 3: {
                    n = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (n != null) {
                        n3 &= 0xFFFFFFF7;
                        continue;
                    }
                    throw a.n("minAccountAgeDays", "min_account_age_days", jsonReader);
                }
                case 2: {
                    n4 = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (n4 != null) {
                        n3 &= 0xFFFFFFFB;
                        continue;
                    }
                    throw a.n("minKarma", "min_karma", jsonReader);
                }
                case 1: {
                    value = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (value != null) {
                        n3 &= 0xFFFFFFFD;
                        continue;
                    }
                    throw a.n("maxLiveStreams", "max_live_streams", jsonReader);
                }
                case 0: {
                    false = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (false != null) {
                        n3 &= 0xFFFFFFFE;
                        continue;
                    }
                    throw a.n("liveStreamingEnabled", "live_streaming_enabled", jsonReader);
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
        }
        jsonReader.r();
        if (n3 == -128) {
            final boolean booleanValue = false;
            final int intValue = value;
            final int intValue2 = n4;
            final int intValue3 = n;
            final int intValue4 = n2;
            f.d(o2, "null cannot be cast to non-null type com.reddit.domain.model.streaming.StreamListingConfiguration.Subreddit.LiveStreamingSchedule");
            f.d(o, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            return new StreamListingConfiguration.Subreddit(booleanValue, intValue, intValue2, intValue3, intValue4, (StreamListingConfiguration.Subreddit.LiveStreamingSchedule)o2, (List<String>)o);
        }
        Constructor<StreamListingConfiguration.Subreddit> constructorRef;
        if ((constructorRef = this.constructorRef) == null) {
            final Class<Boolean> type = Boolean.TYPE;
            final Class<Integer> type2 = Integer.TYPE;
            constructorRef = StreamListingConfiguration.Subreddit.class.getDeclaredConstructor(type, type2, type2, type2, type2, StreamListingConfiguration.Subreddit.LiveStreamingSchedule.class, List.class, type2, a.c);
            f.e((Object)(this.constructorRef = constructorRef), "StreamListingConfigurati\u2026his.constructorRef = it }");
        }
        final StreamListingConfiguration.Subreddit instance = constructorRef.newInstance(false, value, n4, n, n2, o2, o, n3, null);
        f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
        return instance;
    }
    
    public void toJson(final x x, final StreamListingConfiguration.Subreddit subreddit) {
        f.f((Object)x, "writer");
        if (subreddit != null) {
            x.h();
            x.w("live_streaming_enabled");
            this.booleanAdapter.toJson(x, (Object)subreddit.getLiveStreamingEnabled());
            x.w("max_live_streams");
            this.intAdapter.toJson(x, (Object)subreddit.getMaxLiveStreams());
            x.w("min_karma");
            this.intAdapter.toJson(x, (Object)subreddit.getMinKarma());
            x.w("min_account_age_days");
            this.intAdapter.toJson(x, (Object)subreddit.getMinAccountAgeDays());
            x.w("duration_limit_seconds");
            this.intAdapter.toJson(x, (Object)subreddit.getDurationLimitSeconds());
            x.w("on_air_schedule");
            this.liveStreamingScheduleAdapter.toJson(x, (Object)subreddit.getOnAirSchedule());
            x.w("whitelist_users");
            this.listOfStringAdapter.toJson(x, (Object)subreddit.getWhitelistUsers());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(StreamListingConfiguration.Subreddit)";
    }
}
