// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamListingConfigurationJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/streaming/StreamListingConfiguration;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "Lcom/reddit/domain/model/streaming/StreamConfiguration;", "streamConfigurationAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/streaming/StreamListingConfiguration$Subreddit;", "nullableSubredditAdapter", "Lcom/reddit/domain/model/streaming/ListingInfo;", "listingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class StreamListingConfigurationJsonAdapter extends JsonAdapter<StreamListingConfiguration>
{
    private volatile Constructor<StreamListingConfiguration> constructorRef;
    private final JsonAdapter<ListingInfo> listingInfoAdapter;
    private final JsonAdapter<StreamListingConfiguration.Subreddit> nullableSubredditAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<StreamConfiguration> streamConfigurationAdapter;
    
    public StreamListingConfigurationJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "global", "subreddit", "listing_info" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.streamConfigurationAdapter = (JsonAdapter<StreamConfiguration>)y.c((Type)StreamConfiguration.class, (Set)instance, "global");
        this.nullableSubredditAdapter = (JsonAdapter<StreamListingConfiguration.Subreddit>)y.c((Type)StreamListingConfiguration.Subreddit.class, (Set)instance, "subreddit");
        this.listingInfoAdapter = (JsonAdapter<ListingInfo>)y.c((Type)ListingInfo.class, (Set)instance, "listingInfo");
    }
    
    public StreamListingConfiguration fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        Object o = null;
        Object o3;
        Object o2 = o3 = o;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            continue;
                        }
                        o3 = this.listingInfoAdapter.fromJson(jsonReader);
                        if (o3 == null) {
                            throw a.n("listingInfo", "listing_info", jsonReader);
                        }
                        n &= 0xFFFFFFFB;
                    }
                    else {
                        o2 = this.nullableSubredditAdapter.fromJson(jsonReader);
                        n &= 0xFFFFFFFD;
                    }
                }
                else {
                    o = this.streamConfigurationAdapter.fromJson(jsonReader);
                    if (o == null) {
                        throw a.n("global", "global", jsonReader);
                    }
                    n &= 0xFFFFFFFE;
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        if (n == -8) {
            f.d(o, "null cannot be cast to non-null type com.reddit.domain.model.streaming.StreamConfiguration");
            f.d(o3, "null cannot be cast to non-null type com.reddit.domain.model.streaming.ListingInfo");
            return new StreamListingConfiguration((StreamConfiguration)o, (StreamListingConfiguration.Subreddit)o2, (ListingInfo)o3);
        }
        Constructor<StreamListingConfiguration> constructorRef;
        if ((constructorRef = this.constructorRef) == null) {
            constructorRef = StreamListingConfiguration.class.getDeclaredConstructor(StreamConfiguration.class, StreamListingConfiguration.Subreddit.class, ListingInfo.class, Integer.TYPE, a.c);
            f.e((Object)(this.constructorRef = constructorRef), "StreamListingConfigurati\u2026his.constructorRef = it }");
        }
        final StreamListingConfiguration instance = constructorRef.newInstance(o, o2, o3, n, null);
        f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
        return instance;
    }
    
    public void toJson(final x x, final StreamListingConfiguration streamListingConfiguration) {
        f.f((Object)x, "writer");
        if (streamListingConfiguration != null) {
            x.h();
            x.w("global");
            this.streamConfigurationAdapter.toJson(x, (Object)streamListingConfiguration.getGlobal());
            x.w("subreddit");
            this.nullableSubredditAdapter.toJson(x, (Object)streamListingConfiguration.getSubreddit());
            x.w("listing_info");
            this.listingInfoAdapter.toJson(x, (Object)streamListingConfiguration.getListingInfo());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(StreamListingConfiguration)";
    }
}
