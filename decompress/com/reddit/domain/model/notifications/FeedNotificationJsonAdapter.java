// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.notifications;

import com.squareup.moshi.x;
import java.io.Serializable;
import dd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ng2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011¨\u0006\u001c" }, d2 = { "Lcom/reddit/domain/model/notifications/FeedNotificationJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/notifications/FeedNotification;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lcg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "longAdapter", "nullableLongAdapter", "", "nullableBooleanAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class FeedNotificationJsonAdapter extends JsonAdapter<FeedNotification>
{
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public FeedNotificationJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "title", "body", "sentAtUtcMillis", "readAtUtcMillis", "viewedAtUtcMillis", "deeplinkUrl", "notificationIcon", "avatarUrl", "isAvatarNsfw", "mailRoomMessageType", "actionTargetUserId", "thumbnailUrl" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "body");
        this.longAdapter = (JsonAdapter<Long>)y.c((Type)Long.TYPE, (Set)instance, "sentAtUtcMillis");
        this.nullableLongAdapter = (JsonAdapter<Long>)y.c((Type)Long.class, (Set)instance, "readAtUtcMillis");
        this.nullableBooleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.class, (Set)instance, "isAvatarNsfw");
    }
    
    public FeedNotification fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        Long n = null;
        String s = null;
        Serializable s2 = null;
        Serializable s4;
        String s3 = (String)(s4 = s2);
        Serializable s5;
        Long n2 = (Long)(s5 = s4);
        Serializable s7;
        String s6 = (String)(s7 = s5);
        Serializable s9;
        Serializable s8 = s9 = s7;
        Serializable s11;
        String s10 = (String)(s11 = s9);
        while (jsonReader.hasNext()) {
            switch (jsonReader.E(this.options)) {
                default: {
                    continue;
                }
                case 12: {
                    s11 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 11: {
                    s10 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 10: {
                    s9 = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s9 != null) {
                        continue;
                    }
                    throw a.n("mailRoomMessageType", "mailRoomMessageType", jsonReader);
                }
                case 9: {
                    s8 = (Boolean)this.nullableBooleanAdapter.fromJson(jsonReader);
                    continue;
                }
                case 8: {
                    s7 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 7: {
                    s6 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 6: {
                    s5 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 5: {
                    n2 = (Long)this.nullableLongAdapter.fromJson(jsonReader);
                    continue;
                }
                case 4: {
                    s4 = (Long)this.nullableLongAdapter.fromJson(jsonReader);
                    continue;
                }
                case 3: {
                    n = (Long)this.longAdapter.fromJson(jsonReader);
                    if (n != null) {
                        continue;
                    }
                    throw a.n("sentAtUtcMillis", "sentAtUtcMillis", jsonReader);
                }
                case 2: {
                    s3 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 1: {
                    s2 = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s2 != null) {
                        continue;
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
                    jsonReader.H();
                    jsonReader.G1();
                    continue;
                }
            }
        }
        jsonReader.r();
        if (s == null) {
            throw a.h("id", "id", jsonReader);
        }
        if (s2 == null) {
            throw a.h("title", "title", jsonReader);
        }
        if (n == null) {
            throw a.h("sentAtUtcMillis", "sentAtUtcMillis", jsonReader);
        }
        final long longValue = n;
        if (s9 != null) {
            return new FeedNotification(s, (String)s2, s3, longValue, (Long)s4, n2, (String)s5, s6, (String)s7, (Boolean)s8, (String)s9, s10, (String)s11);
        }
        throw a.h("mailRoomMessageType", "mailRoomMessageType", jsonReader);
    }
    
    public /* bridge */ Object fromJson(final JsonReader jsonReader) {
        return this.fromJson(jsonReader);
    }
    
    public void toJson(final x x, final FeedNotification feedNotification) {
        e.f((Object)x, "writer");
        if (feedNotification != null) {
            x.h();
            x.v("id");
            this.stringAdapter.toJson(x, (Object)feedNotification.getId());
            x.v("title");
            this.stringAdapter.toJson(x, (Object)feedNotification.getTitle());
            x.v("body");
            this.nullableStringAdapter.toJson(x, (Object)feedNotification.getBody());
            x.v("sentAtUtcMillis");
            this.longAdapter.toJson(x, (Object)feedNotification.getSentAtUtcMillis());
            x.v("readAtUtcMillis");
            this.nullableLongAdapter.toJson(x, (Object)feedNotification.getReadAtUtcMillis());
            x.v("viewedAtUtcMillis");
            this.nullableLongAdapter.toJson(x, (Object)feedNotification.getViewedAtUtcMillis());
            x.v("deeplinkUrl");
            this.nullableStringAdapter.toJson(x, (Object)feedNotification.getDeeplinkUrl());
            x.v("notificationIcon");
            this.nullableStringAdapter.toJson(x, (Object)feedNotification.getNotificationIcon());
            x.v("avatarUrl");
            this.nullableStringAdapter.toJson(x, (Object)feedNotification.getAvatarUrl());
            x.v("isAvatarNsfw");
            this.nullableBooleanAdapter.toJson(x, (Object)feedNotification.isAvatarNsfw());
            x.v("mailRoomMessageType");
            this.stringAdapter.toJson(x, (Object)feedNotification.getMailRoomMessageType());
            x.v("actionTargetUserId");
            this.nullableStringAdapter.toJson(x, (Object)feedNotification.getActionTargetUserId());
            x.v("thumbnailUrl");
            this.nullableStringAdapter.toJson(x, (Object)feedNotification.getThumbnailUrl());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public /* bridge */ void toJson(final x x, final Object o) {
        this.toJson(x, (FeedNotification)o);
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(FeedNotification)";
    }
}
