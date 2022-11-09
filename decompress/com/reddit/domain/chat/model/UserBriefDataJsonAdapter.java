// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import com.squareup.moshi.x;
import java.io.Serializable;
import qd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011¨\u0006\u001d" }, d2 = { "Lcom/reddit/domain/chat/model/UserBriefDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/chat/model/UserBriefData;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "", "intAdapter", "nullableStringAdapter", "", "booleanAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class UserBriefDataJsonAdapter extends JsonAdapter<UserBriefData>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public UserBriefDataJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "name", "created_utc", "link_karma", "comment_karma", "profile_img", "profile_over_18" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "name");
        this.longAdapter = (JsonAdapter<Long>)y.c((Type)Long.TYPE, (Set)instance, "createdUtc");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "linkKarma");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "profileIcon");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "isNsfw");
    }
    
    public UserBriefData fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Long n = null;
        Serializable s = null;
        Serializable s3;
        Serializable s2 = s3 = s;
        Serializable s5;
        Serializable s4 = s5 = s3;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 5: {
                    s4 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (s4 != null) {
                        continue;
                    }
                    throw a.n("isNsfw", "profile_over_18", jsonReader);
                }
                case 4: {
                    s5 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 3: {
                    s3 = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (s3 != null) {
                        continue;
                    }
                    throw a.n("commentKarma", "comment_karma", jsonReader);
                }
                case 2: {
                    s = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("linkKarma", "link_karma", jsonReader);
                }
                case 1: {
                    n = (Long)this.longAdapter.fromJson(jsonReader);
                    if (n != null) {
                        continue;
                    }
                    throw a.n("createdUtc", "created_utc", jsonReader);
                }
                case 0: {
                    s2 = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s2 != null) {
                        continue;
                    }
                    throw a.n("name", "name", jsonReader);
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
        }
        jsonReader.r();
        if (s2 == null) {
            throw a.h("name", "name", jsonReader);
        }
        if (n == null) {
            throw a.h("createdUtc", "created_utc", jsonReader);
        }
        final long longValue = n;
        if (s == null) {
            throw a.h("linkKarma", "link_karma", jsonReader);
        }
        final int intValue = (int)s;
        if (s3 == null) {
            throw a.h("commentKarma", "comment_karma", jsonReader);
        }
        final int intValue2 = (int)s3;
        if (s4 != null) {
            return new UserBriefData((String)s2, longValue, intValue, intValue2, (String)s5, (boolean)s4);
        }
        throw a.h("isNsfw", "profile_over_18", jsonReader);
    }
    
    public void toJson(final x x, final UserBriefData userBriefData) {
        f.f((Object)x, "writer");
        if (userBriefData != null) {
            x.h();
            x.w("name");
            this.stringAdapter.toJson(x, (Object)userBriefData.getName());
            x.w("created_utc");
            this.longAdapter.toJson(x, (Object)userBriefData.getCreatedUtc());
            x.w("link_karma");
            this.intAdapter.toJson(x, (Object)userBriefData.getLinkKarma());
            x.w("comment_karma");
            this.intAdapter.toJson(x, (Object)userBriefData.getCommentKarma());
            x.w("profile_img");
            this.nullableStringAdapter.toJson(x, (Object)userBriefData.getProfileIcon());
            x.w("profile_over_18");
            this.booleanAdapter.toJson(x, (Object)userBriefData.isNsfw());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(UserBriefData)";
    }
}
