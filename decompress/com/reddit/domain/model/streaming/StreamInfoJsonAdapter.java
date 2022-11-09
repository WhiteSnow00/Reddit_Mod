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

@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001c" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/streaming/StreamInfo;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class StreamInfoJsonAdapter extends JsonAdapter<StreamInfo>
{
    private volatile Constructor<StreamInfo> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public StreamInfoJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "title", "published_at", "publish_end_at", "publisher_id", "channel_id", "transcoder_hostname", "created_at", "updated_at", "update_at", "publish_url", "url" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "publishEndAt");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "channelId");
    }
    
    public StreamInfo fromJson(final JsonReader jsonReader) {
        final Class<String> clazz = String.class;
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        Integer n2 = null;
        String s = null;
        Object o = null;
        String s2 = null;
        Object o2 = null;
        String s3 = null;
        String s4 = null;
        Object o3 = null;
        Object o4 = null;
        String s5 = null;
        Object o5 = null;
        Object o6 = null;
        while (jsonReader.hasNext()) {
            String s6 = null;
            String s7 = null;
            Integer n4 = null;
            String s11 = null;
            Label_0593: {
                String s9 = null;
                Label_0589: {
                    Label_0585: {
                        Label_0581: {
                            Label_0577: {
                                Label_0573: {
                                    switch (jsonReader.F(this.options)) {
                                        case 11: {
                                            o6 = this.stringAdapter.fromJson(jsonReader);
                                            if (o6 != null) {
                                                break;
                                            }
                                            throw a.n("url", "url", jsonReader);
                                        }
                                        case 10: {
                                            o5 = this.stringAdapter.fromJson(jsonReader);
                                            if (o5 != null) {
                                                break;
                                            }
                                            throw a.n("publishUrl", "publish_url", jsonReader);
                                        }
                                        case 9: {
                                            s6 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                                            n &= 0xFFFFFDFF;
                                            break Label_0573;
                                        }
                                        case 8: {
                                            o4 = this.stringAdapter.fromJson(jsonReader);
                                            if (o4 != null) {
                                                s7 = s4;
                                                s6 = s5;
                                                break Label_0577;
                                            }
                                            throw a.n("updatedAt", "updated_at", jsonReader);
                                        }
                                        case 7: {
                                            o3 = this.stringAdapter.fromJson(jsonReader);
                                            if (o3 != null) {
                                                s7 = s4;
                                                s6 = s5;
                                                break Label_0577;
                                            }
                                            throw a.n("createdAt", "created_at", jsonReader);
                                        }
                                        case 6: {
                                            s7 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                                            n &= 0xFFFFFFBF;
                                            s6 = s5;
                                            break Label_0577;
                                        }
                                        case 5: {
                                            final Integer n3 = (Integer)this.intAdapter.fromJson(jsonReader);
                                            if (n3 != null) {
                                                s6 = s5;
                                                n4 = n3;
                                                s7 = s4;
                                                break Label_0581;
                                            }
                                            throw a.n("channelId", "channel_id", jsonReader);
                                        }
                                        case 4: {
                                            final String s8 = (String)this.stringAdapter.fromJson(jsonReader);
                                            if (s8 != null) {
                                                s6 = s5;
                                                n4 = n2;
                                                s9 = s8;
                                                s7 = s4;
                                                break Label_0585;
                                            }
                                            throw a.n("publisherId", "publisher_id", jsonReader);
                                        }
                                        case 3: {
                                            o2 = this.nullableStringAdapter.fromJson(jsonReader);
                                            n &= 0xFFFFFFF7;
                                            s7 = s4;
                                            s6 = s5;
                                            break Label_0577;
                                        }
                                        case 2: {
                                            final String s10 = (String)this.stringAdapter.fromJson(jsonReader);
                                            if (s10 != null) {
                                                s6 = s5;
                                                s7 = s4;
                                                n4 = n2;
                                                s9 = s3;
                                                s11 = s10;
                                                break Label_0589;
                                            }
                                            throw a.n("publishedAt", "published_at", jsonReader);
                                        }
                                        case 1: {
                                            o = this.stringAdapter.fromJson(jsonReader);
                                            if (o != null) {
                                                s6 = s5;
                                                s7 = s4;
                                                n4 = n2;
                                                s11 = s2;
                                                break Label_0593;
                                            }
                                            throw a.n("title", "title", jsonReader);
                                        }
                                        case 0: {
                                            s = (String)this.stringAdapter.fromJson(jsonReader);
                                            if (s != null) {
                                                continue;
                                            }
                                            throw a.n("id", "id", jsonReader);
                                        }
                                        case -1: {
                                            jsonReader.J();
                                            jsonReader.z1();
                                            break;
                                        }
                                    }
                                    s6 = s5;
                                }
                                s7 = s4;
                            }
                            n4 = n2;
                        }
                        s9 = s3;
                    }
                    s11 = s2;
                }
                s3 = s9;
            }
            n2 = n4;
            s2 = s11;
            s4 = s7;
            s5 = s6;
        }
        jsonReader.r();
        if (n == -585) {
            if (s == null) {
                throw a.h("id", "id", jsonReader);
            }
            if (o == null) {
                throw a.h("title", "title", jsonReader);
            }
            if (s2 == null) {
                throw a.h("publishedAt", "published_at", jsonReader);
            }
            if (s3 == null) {
                throw a.h("publisherId", "publisher_id", jsonReader);
            }
            if (n2 == null) {
                throw a.h("channelId", "channel_id", jsonReader);
            }
            final int intValue = n2;
            if (o3 == null) {
                throw a.h("createdAt", "created_at", jsonReader);
            }
            if (o4 == null) {
                throw a.h("updatedAt", "updated_at", jsonReader);
            }
            if (o5 == null) {
                throw a.h("publishUrl", "publish_url", jsonReader);
            }
            if (o6 != null) {
                return new StreamInfo(s, (String)o, s2, (String)o2, s3, intValue, s4, (String)o3, (String)o4, s5, (String)o5, (String)o6);
            }
            throw a.h("url", "url", jsonReader);
        }
        else {
            final Constructor<StreamInfo> constructorRef = this.constructorRef;
            Constructor<StreamInfo> declaredConstructor;
            if (constructorRef == null) {
                final Class<Integer> type = Integer.TYPE;
                declaredConstructor = StreamInfo.class.getDeclaredConstructor(clazz, clazz, clazz, clazz, clazz, type, clazz, clazz, clazz, clazz, clazz, clazz, type, a.c);
                f.e((Object)(this.constructorRef = declaredConstructor), "StreamInfo::class.java.g\u2026his.constructorRef = it }");
            }
            else {
                declaredConstructor = constructorRef;
            }
            if (s == null) {
                throw a.h("id", "id", jsonReader);
            }
            if (o == null) {
                throw a.h("title", "title", jsonReader);
            }
            if (s2 == null) {
                throw a.h("publishedAt", "published_at", jsonReader);
            }
            if (s3 == null) {
                throw a.h("publisherId", "publisher_id", jsonReader);
            }
            if (n2 == null) {
                throw a.h("channelId", "channel_id", jsonReader);
            }
            final int intValue2 = n2;
            if (o3 == null) {
                throw a.h("createdAt", "created_at", jsonReader);
            }
            if (o4 == null) {
                throw a.h("updatedAt", "updated_at", jsonReader);
            }
            if (o5 == null) {
                throw a.h("publishUrl", "publish_url", jsonReader);
            }
            if (o6 != null) {
                final StreamInfo instance = declaredConstructor.newInstance(s, o, s2, o2, s3, intValue2, s4, o3, o4, s5, o5, o6, n, null);
                f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
                return instance;
            }
            throw a.h("url", "url", jsonReader);
        }
    }
    
    public void toJson(final x x, final StreamInfo streamInfo) {
        f.f((Object)x, "writer");
        if (streamInfo != null) {
            x.h();
            x.w("id");
            this.stringAdapter.toJson(x, (Object)streamInfo.getId());
            x.w("title");
            this.stringAdapter.toJson(x, (Object)streamInfo.getTitle());
            x.w("published_at");
            this.stringAdapter.toJson(x, (Object)streamInfo.getPublishedAt());
            x.w("publish_end_at");
            this.nullableStringAdapter.toJson(x, (Object)streamInfo.getPublishEndAt());
            x.w("publisher_id");
            this.stringAdapter.toJson(x, (Object)streamInfo.getPublisherId());
            x.w("channel_id");
            this.intAdapter.toJson(x, (Object)streamInfo.getChannelId());
            x.w("transcoder_hostname");
            this.nullableStringAdapter.toJson(x, (Object)streamInfo.getTranscoderHostname());
            x.w("created_at");
            this.stringAdapter.toJson(x, (Object)streamInfo.getCreatedAt());
            x.w("updated_at");
            this.stringAdapter.toJson(x, (Object)streamInfo.getUpdatedAt());
            x.w("update_at");
            this.nullableStringAdapter.toJson(x, (Object)streamInfo.getUpdateAt());
            x.w("publish_url");
            this.stringAdapter.toJson(x, (Object)streamInfo.getPublishUrl());
            x.w("url");
            this.stringAdapter.toJson(x, (Object)streamInfo.getUrl());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(StreamInfo)";
    }
}
