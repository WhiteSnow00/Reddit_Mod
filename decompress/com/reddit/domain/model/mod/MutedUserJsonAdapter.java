// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.mod;

import com.squareup.moshi.x;
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

@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011¨\u0006\u0019" }, d2 = { "Lcom/reddit/domain/model/mod/MutedUserJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/mod/MutedUser;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lcg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "nullableStringAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class MutedUserJsonAdapter extends JsonAdapter<MutedUser>
{
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public MutedUserJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "username", "mutedAtUTC", "id", "accountIcon", "reason", "mutedBy" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "username");
        this.longAdapter = (JsonAdapter<Long>)y.c((Type)Long.TYPE, (Set)instance, "atUtc");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "accountIcon");
    }
    
    public MutedUser fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        Long n = null;
        String s = null;
        String s3;
        String s2 = s3 = null;
        String s5;
        String s4 = s5 = s3;
        while (jsonReader.hasNext()) {
            switch (jsonReader.E(this.options)) {
                default: {
                    continue;
                }
                case 5: {
                    s5 = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s5 != null) {
                        continue;
                    }
                    throw a.n("mutedBy", "mutedBy", jsonReader);
                }
                case 4: {
                    s4 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 3: {
                    s3 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 2: {
                    s2 = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s2 != null) {
                        continue;
                    }
                    throw a.n("id", "id", jsonReader);
                }
                case 1: {
                    n = (Long)this.longAdapter.fromJson(jsonReader);
                    if (n != null) {
                        continue;
                    }
                    throw a.n("atUtc", "mutedAtUTC", jsonReader);
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
            throw a.h("atUtc", "mutedAtUTC", jsonReader);
        }
        final long longValue = n;
        if (s2 == null) {
            throw a.h("id", "id", jsonReader);
        }
        if (s5 != null) {
            return new MutedUser(s, longValue, s2, s3, s4, s5);
        }
        throw a.h("mutedBy", "mutedBy", jsonReader);
    }
    
    public /* bridge */ Object fromJson(final JsonReader jsonReader) {
        return this.fromJson(jsonReader);
    }
    
    public void toJson(final x x, final MutedUser mutedUser) {
        e.f((Object)x, "writer");
        if (mutedUser != null) {
            x.h();
            x.v("username");
            this.stringAdapter.toJson(x, (Object)mutedUser.getUsername());
            x.v("mutedAtUTC");
            this.longAdapter.toJson(x, (Object)mutedUser.getAtUtc());
            x.v("id");
            this.stringAdapter.toJson(x, (Object)mutedUser.getId());
            x.v("accountIcon");
            this.nullableStringAdapter.toJson(x, (Object)mutedUser.getAccountIcon());
            x.v("reason");
            this.nullableStringAdapter.toJson(x, (Object)mutedUser.getReason());
            x.v("mutedBy");
            this.stringAdapter.toJson(x, (Object)mutedUser.getMutedBy());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public /* bridge */ void toJson(final x x, final Object o) {
        this.toJson(x, (MutedUser)o);
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(MutedUser)";
    }
}
