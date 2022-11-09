// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import com.squareup.moshi.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import xw.a;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004\u00f8\u0001\u0000¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d" }, d2 = { "Lcom/reddit/domain/model/AnnouncementJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/Announcement;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "Lxw/a;", "announcementIdAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "stringAdapter", "nullableStringAdapter", "", "intAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class AnnouncementJsonAdapter extends JsonAdapter<Announcement>
{
    private final JsonAdapter<a> announcementIdAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public AnnouncementJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "announcementId", "created_utc", "description", "title", "iconUrl", "announcement_url", "maxImpressionsCount", "experimentName" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.announcementIdAdapter = (JsonAdapter<a>)y.c((Type)a.class, (Set)instance, "announcementId");
        this.longAdapter = (JsonAdapter<Long>)y.c((Type)Long.TYPE, (Set)instance, "createdUtc");
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "description");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "iconUrl");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "maxImpressionsCount");
    }
    
    public Announcement fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Long n = null;
        String a = null;
        Integer n2 = null;
        String s = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 7: {
                    s5 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 6: {
                    n2 = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (n2 != null) {
                        continue;
                    }
                    throw qd2.a.n("maxImpressionsCount", "maxImpressionsCount", jsonReader);
                }
                case 5: {
                    s4 = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s4 != null) {
                        continue;
                    }
                    throw qd2.a.n("announcementUrl", "announcement_url", jsonReader);
                }
                case 4: {
                    s3 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 3: {
                    s2 = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s2 != null) {
                        continue;
                    }
                    throw qd2.a.n("title", "title", jsonReader);
                }
                case 2: {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw qd2.a.n("description", "description", jsonReader);
                }
                case 1: {
                    n = (Long)this.longAdapter.fromJson(jsonReader);
                    if (n != null) {
                        continue;
                    }
                    throw qd2.a.n("createdUtc", "created_utc", jsonReader);
                }
                case 0: {
                    final a a2 = (a)this.announcementIdAdapter.fromJson(jsonReader);
                    if (a2 != null) {
                        a = a2.a;
                    }
                    else {
                        a = null;
                    }
                    if (a != null) {
                        continue;
                    }
                    throw qd2.a.n("announcementId", "announcementId", jsonReader);
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
        }
        jsonReader.r();
        if (a == null) {
            throw qd2.a.h("announcementId", "announcementId", jsonReader);
        }
        if (n == null) {
            throw qd2.a.h("createdUtc", "created_utc", jsonReader);
        }
        final long longValue = n;
        if (s == null) {
            throw qd2.a.h("description", "description", jsonReader);
        }
        if (s2 == null) {
            throw qd2.a.h("title", "title", jsonReader);
        }
        if (s4 == null) {
            throw qd2.a.h("announcementUrl", "announcement_url", jsonReader);
        }
        if (n2 != null) {
            return new Announcement(a, longValue, s, s2, s3, s4, n2, s5, null);
        }
        throw qd2.a.h("maxImpressionsCount", "maxImpressionsCount", jsonReader);
    }
    
    public void toJson(final x x, final Announcement announcement) {
        f.f((Object)x, "writer");
        if (announcement != null) {
            x.h();
            x.w("announcementId");
            this.announcementIdAdapter.toJson(x, (Object)new a(announcement.getAnnouncementId-ldun5Zw()));
            x.w("created_utc");
            this.longAdapter.toJson(x, (Object)announcement.getCreatedUtc());
            x.w("description");
            this.stringAdapter.toJson(x, (Object)announcement.getDescription());
            x.w("title");
            this.stringAdapter.toJson(x, (Object)announcement.getTitle());
            x.w("iconUrl");
            this.nullableStringAdapter.toJson(x, (Object)announcement.getIconUrl());
            x.w("announcement_url");
            this.stringAdapter.toJson(x, (Object)announcement.getAnnouncementUrl());
            x.w("maxImpressionsCount");
            this.intAdapter.toJson(x, (Object)announcement.getMaxImpressionsCount());
            x.w("experimentName");
            this.nullableStringAdapter.toJson(x, (Object)announcement.getExperimentName());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(Announcement)";
    }
}
