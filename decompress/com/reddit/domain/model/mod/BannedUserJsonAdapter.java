// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.mod;

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

@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011¨\u0006\u001a" }, d2 = { "Lcom/reddit/domain/model/mod/BannedUserJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/mod/BannedUser;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lcg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "nullableStringAdapter", "nullableLongAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class BannedUserJsonAdapter extends JsonAdapter<BannedUser>
{
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public BannedUserJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "username", "bannedAtUTC", "banMessage", "bannedBy", "reason", "duration", "post", "id", "modNote", "accountIcon", "commentId", "subredditId" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "username");
        this.longAdapter = (JsonAdapter<Long>)y.c((Type)Long.TYPE, (Set)instance, "atUtc");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "reason");
        this.nullableLongAdapter = (JsonAdapter<Long>)y.c((Type)Long.class, (Set)instance, "duration");
    }
    
    public BannedUser fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        Long n = null;
        String s = null;
        Serializable s3;
        Serializable s2 = s3 = null;
        Serializable s5;
        String s4 = (String)(s5 = s3);
        Serializable s7;
        Serializable s6 = s7 = s5;
        Serializable s9;
        String s8 = (String)(s9 = s7);
        Serializable s11;
        String s10 = (String)(s11 = s9);
        while (jsonReader.hasNext()) {
            switch (jsonReader.E(this.options)) {
                default: {
                    continue;
                }
                case 11: {
                    s11 = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s11 != null) {
                        continue;
                    }
                    throw a.n("subredditId", "subredditId", jsonReader);
                }
                case 10: {
                    s10 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 9: {
                    s9 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 8: {
                    s8 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 7: {
                    s7 = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s7 != null) {
                        continue;
                    }
                    throw a.n("id", "id", jsonReader);
                }
                case 6: {
                    s6 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 5: {
                    s5 = (Long)this.nullableLongAdapter.fromJson(jsonReader);
                    continue;
                }
                case 4: {
                    s4 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 3: {
                    s3 = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s3 != null) {
                        continue;
                    }
                    throw a.n("bannedBy", "bannedBy", jsonReader);
                }
                case 2: {
                    s2 = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s2 != null) {
                        continue;
                    }
                    throw a.n("banMessage", "banMessage", jsonReader);
                }
                case 1: {
                    n = (Long)this.longAdapter.fromJson(jsonReader);
                    if (n != null) {
                        continue;
                    }
                    throw a.n("atUtc", "bannedAtUTC", jsonReader);
                }
                case 0: {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("username", "username", jsonReader);
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
            throw a.h("username", "username", jsonReader);
        }
        if (n == null) {
            throw a.h("atUtc", "bannedAtUTC", jsonReader);
        }
        final long longValue = n;
        if (s2 == null) {
            throw a.h("banMessage", "banMessage", jsonReader);
        }
        if (s3 == null) {
            throw a.h("bannedBy", "bannedBy", jsonReader);
        }
        if (s7 == null) {
            throw a.h("id", "id", jsonReader);
        }
        if (s11 != null) {
            return new BannedUser(s, longValue, (String)s2, (String)s3, s4, (Long)s5, (String)s6, (String)s7, s8, (String)s9, s10, (String)s11);
        }
        throw a.h("subredditId", "subredditId", jsonReader);
    }
    
    public /* bridge */ Object fromJson(final JsonReader jsonReader) {
        return this.fromJson(jsonReader);
    }
    
    public void toJson(final x x, final BannedUser bannedUser) {
        e.f((Object)x, "writer");
        if (bannedUser != null) {
            x.h();
            x.v("username");
            this.stringAdapter.toJson(x, (Object)bannedUser.getUsername());
            x.v("bannedAtUTC");
            this.longAdapter.toJson(x, (Object)bannedUser.getAtUtc());
            x.v("banMessage");
            this.stringAdapter.toJson(x, (Object)bannedUser.getBanMessage());
            x.v("bannedBy");
            this.stringAdapter.toJson(x, (Object)bannedUser.getBannedBy());
            x.v("reason");
            this.nullableStringAdapter.toJson(x, (Object)bannedUser.getReason());
            x.v("duration");
            this.nullableLongAdapter.toJson(x, (Object)bannedUser.getDuration());
            x.v("post");
            this.nullableStringAdapter.toJson(x, (Object)bannedUser.getPostId());
            x.v("id");
            this.stringAdapter.toJson(x, (Object)bannedUser.getId());
            x.v("modNote");
            this.nullableStringAdapter.toJson(x, (Object)bannedUser.getModNote());
            x.v("accountIcon");
            this.nullableStringAdapter.toJson(x, (Object)bannedUser.getAccountIcon());
            x.v("commentId");
            this.nullableStringAdapter.toJson(x, (Object)bannedUser.getCommentId());
            x.v("subredditId");
            this.stringAdapter.toJson(x, (Object)bannedUser.getSubredditId());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public /* bridge */ void toJson(final x x, final Object o) {
        this.toJson(x, (BannedUser)o);
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(BannedUser)";
    }
}
