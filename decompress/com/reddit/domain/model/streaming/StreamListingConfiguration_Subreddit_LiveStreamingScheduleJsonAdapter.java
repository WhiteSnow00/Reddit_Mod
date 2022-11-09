// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import kotlin.collections.EmptySet;
import com.squareup.moshi.a0;
import java.lang.reflect.Type;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.util.List;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001b" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamListingConfiguration_Subreddit_LiveStreamingScheduleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/streaming/StreamListingConfiguration$Subreddit$LiveStreamingSchedule;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "Lcom/reddit/domain/model/streaming/StreamListingConfiguration$Subreddit$TimeSpan;", "listOfTimeSpanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class StreamListingConfiguration_Subreddit_LiveStreamingScheduleJsonAdapter extends JsonAdapter<StreamListingConfiguration.Subreddit.LiveStreamingSchedule>
{
    private volatile Constructor<StreamListingConfiguration.Subreddit.LiveStreamingSchedule> constructorRef;
    private final JsonAdapter<List<StreamListingConfiguration.Subreddit.TimeSpan>> listOfTimeSpanAdapter;
    private final JsonReader$b options;
    
    public StreamListingConfiguration_Subreddit_LiveStreamingScheduleJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" });
        this.listOfTimeSpanAdapter = (JsonAdapter<List<StreamListingConfiguration.Subreddit.TimeSpan>>)y.c((Type)a0.d((Class)List.class, new Type[] { StreamListingConfiguration.Subreddit.TimeSpan.class }), (Set)EmptySet.INSTANCE, "sunday");
    }
    
    public StreamListingConfiguration.Subreddit.LiveStreamingSchedule fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        Object o4 = null;
        Object o5 = null;
        Object o6 = null;
        Object o7 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 6: {
                    o7 = this.listOfTimeSpanAdapter.fromJson(jsonReader);
                    if (o7 != null) {
                        n &= 0xFFFFFFBF;
                        continue;
                    }
                    throw a.n("saturday", "saturday", jsonReader);
                }
                case 5: {
                    o6 = this.listOfTimeSpanAdapter.fromJson(jsonReader);
                    if (o6 != null) {
                        n &= 0xFFFFFFDF;
                        continue;
                    }
                    throw a.n("friday", "friday", jsonReader);
                }
                case 4: {
                    o5 = this.listOfTimeSpanAdapter.fromJson(jsonReader);
                    if (o5 != null) {
                        n &= 0xFFFFFFEF;
                        continue;
                    }
                    throw a.n("thursday", "thursday", jsonReader);
                }
                case 3: {
                    o4 = this.listOfTimeSpanAdapter.fromJson(jsonReader);
                    if (o4 != null) {
                        n &= 0xFFFFFFF7;
                        continue;
                    }
                    throw a.n("wednesday", "wednesday", jsonReader);
                }
                case 2: {
                    o3 = this.listOfTimeSpanAdapter.fromJson(jsonReader);
                    if (o3 != null) {
                        n &= 0xFFFFFFFB;
                        continue;
                    }
                    throw a.n("tuesday", "tuesday", jsonReader);
                }
                case 1: {
                    o2 = this.listOfTimeSpanAdapter.fromJson(jsonReader);
                    if (o2 != null) {
                        n &= 0xFFFFFFFD;
                        continue;
                    }
                    throw a.n("monday", "monday", jsonReader);
                }
                case 0: {
                    o = this.listOfTimeSpanAdapter.fromJson(jsonReader);
                    if (o != null) {
                        n &= 0xFFFFFFFE;
                        continue;
                    }
                    throw a.n("sunday", "sunday", jsonReader);
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
        }
        jsonReader.r();
        if (n == -128) {
            f.d(o, "null cannot be cast to non-null type kotlin.collections.List<com.reddit.domain.model.streaming.StreamListingConfiguration.Subreddit.TimeSpan>");
            f.d(o2, "null cannot be cast to non-null type kotlin.collections.List<com.reddit.domain.model.streaming.StreamListingConfiguration.Subreddit.TimeSpan>");
            f.d(o3, "null cannot be cast to non-null type kotlin.collections.List<com.reddit.domain.model.streaming.StreamListingConfiguration.Subreddit.TimeSpan>");
            f.d(o4, "null cannot be cast to non-null type kotlin.collections.List<com.reddit.domain.model.streaming.StreamListingConfiguration.Subreddit.TimeSpan>");
            f.d(o5, "null cannot be cast to non-null type kotlin.collections.List<com.reddit.domain.model.streaming.StreamListingConfiguration.Subreddit.TimeSpan>");
            f.d(o6, "null cannot be cast to non-null type kotlin.collections.List<com.reddit.domain.model.streaming.StreamListingConfiguration.Subreddit.TimeSpan>");
            f.d(o7, "null cannot be cast to non-null type kotlin.collections.List<com.reddit.domain.model.streaming.StreamListingConfiguration.Subreddit.TimeSpan>");
            return new StreamListingConfiguration.Subreddit.LiveStreamingSchedule((List<StreamListingConfiguration.Subreddit.TimeSpan>)o, (List<StreamListingConfiguration.Subreddit.TimeSpan>)o2, (List<StreamListingConfiguration.Subreddit.TimeSpan>)o3, (List<StreamListingConfiguration.Subreddit.TimeSpan>)o4, (List<StreamListingConfiguration.Subreddit.TimeSpan>)o5, (List<StreamListingConfiguration.Subreddit.TimeSpan>)o6, (List<StreamListingConfiguration.Subreddit.TimeSpan>)o7);
        }
        Constructor<StreamListingConfiguration.Subreddit.LiveStreamingSchedule> constructorRef;
        if ((constructorRef = this.constructorRef) == null) {
            constructorRef = StreamListingConfiguration.Subreddit.LiveStreamingSchedule.class.getDeclaredConstructor(List.class, List.class, List.class, List.class, List.class, List.class, List.class, Integer.TYPE, a.c);
            f.e((Object)(this.constructorRef = constructorRef), "StreamListingConfigurati\u2026his.constructorRef = it }");
        }
        final StreamListingConfiguration.Subreddit.LiveStreamingSchedule instance = constructorRef.newInstance(o, o2, o3, o4, o5, o6, o7, n, null);
        f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
        return instance;
    }
    
    public void toJson(final x x, final StreamListingConfiguration.Subreddit.LiveStreamingSchedule liveStreamingSchedule) {
        f.f((Object)x, "writer");
        if (liveStreamingSchedule != null) {
            x.h();
            x.w("sunday");
            this.listOfTimeSpanAdapter.toJson(x, (Object)liveStreamingSchedule.getSunday());
            x.w("monday");
            this.listOfTimeSpanAdapter.toJson(x, (Object)liveStreamingSchedule.getMonday());
            x.w("tuesday");
            this.listOfTimeSpanAdapter.toJson(x, (Object)liveStreamingSchedule.getTuesday());
            x.w("wednesday");
            this.listOfTimeSpanAdapter.toJson(x, (Object)liveStreamingSchedule.getWednesday());
            x.w("thursday");
            this.listOfTimeSpanAdapter.toJson(x, (Object)liveStreamingSchedule.getThursday());
            x.w("friday");
            this.listOfTimeSpanAdapter.toJson(x, (Object)liveStreamingSchedule.getFriday());
            x.w("saturday");
            this.listOfTimeSpanAdapter.toJson(x, (Object)liveStreamingSchedule.getSaturday());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(StreamListingConfiguration.Subreddit.LiveStreamingSchedule)";
    }
}
