// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

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
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\b¨\u0006\u0015" }, d2 = { "Lcom/reddit/data/snoovatar/entity/AccountJsonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/snoovatar/entity/AccountJson;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/snoovatar/entity/SnoovatarJson;", "nullableSnoovatarJsonAdapter", "", "booleanAdapter", "", "listOfStringAdapter", "Lcom/reddit/data/snoovatar/entity/WebsocketUrlsJson;", "nullableWebsocketUrlsJsonAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class AccountJsonJsonAdapter extends JsonAdapter<AccountJson>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<SnoovatarJson> nullableSnoovatarJsonAdapter;
    private final JsonAdapter<WebsocketUrlsJson> nullableWebsocketUrlsJsonAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public AccountJsonJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "snoovatar", "csrf_token", "has_active_closet_subscription", "capabilities", "websockets_urls" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.nullableSnoovatarJsonAdapter = (JsonAdapter<SnoovatarJson>)y.c((Type)SnoovatarJson.class, (Set)instance, "snoovatar");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "hasActiveClosetSubscription");
        this.listOfStringAdapter = (JsonAdapter<List<String>>)y.c((Type)a0.d((Class)List.class, new Type[] { String.class }), (Set)instance, "capabilities");
        this.nullableWebsocketUrlsJsonAdapter = (JsonAdapter<WebsocketUrlsJson>)y.c((Type)WebsocketUrlsJson.class, (Set)instance, "websocketUrls");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Boolean b = null;
        Object o = null;
        Object o3;
        Object o2 = o3 = o;
        Object o5;
        Object o4 = o5 = o3;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 5: {
                    o5 = this.nullableWebsocketUrlsJsonAdapter.fromJson(jsonReader);
                    continue;
                }
                case 4: {
                    o4 = this.listOfStringAdapter.fromJson(jsonReader);
                    if (o4 != null) {
                        continue;
                    }
                    throw a.n("capabilities", "capabilities", jsonReader);
                }
                case 3: {
                    b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b != null) {
                        continue;
                    }
                    throw a.n("hasActiveClosetSubscription", "has_active_closet_subscription", jsonReader);
                }
                case 2: {
                    o3 = this.stringAdapter.fromJson(jsonReader);
                    if (o3 != null) {
                        continue;
                    }
                    throw a.n("csrfToken", "csrf_token", jsonReader);
                }
                case 1: {
                    o2 = this.nullableSnoovatarJsonAdapter.fromJson(jsonReader);
                    continue;
                }
                case 0: {
                    o = this.stringAdapter.fromJson(jsonReader);
                    if (o != null) {
                        continue;
                    }
                    throw a.n("id", "id", jsonReader);
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
        }
        jsonReader.r();
        if (o == null) {
            throw a.h("id", "id", jsonReader);
        }
        if (o3 == null) {
            throw a.h("csrfToken", "csrf_token", jsonReader);
        }
        if (b == null) {
            throw a.h("hasActiveClosetSubscription", "has_active_closet_subscription", jsonReader);
        }
        final boolean booleanValue = b;
        if (o4 != null) {
            return new AccountJson((String)o, (SnoovatarJson)o2, (String)o3, booleanValue, (List<String>)o4, (WebsocketUrlsJson)o5);
        }
        throw a.h("capabilities", "capabilities", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final AccountJson accountJson = (AccountJson)o;
        f.f((Object)x, "writer");
        if (accountJson != null) {
            x.h();
            x.w("id");
            this.stringAdapter.toJson(x, (Object)accountJson.a);
            x.w("snoovatar");
            this.nullableSnoovatarJsonAdapter.toJson(x, (Object)accountJson.b);
            x.w("csrf_token");
            this.stringAdapter.toJson(x, (Object)accountJson.c);
            x.w("has_active_closet_subscription");
            a.v(accountJson.d, (JsonAdapter)this.booleanAdapter, x, "capabilities");
            this.listOfStringAdapter.toJson(x, (Object)accountJson.e);
            x.w("websockets_urls");
            this.nullableWebsocketUrlsJsonAdapter.toJson(x, (Object)accountJson.f);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(AccountJson)";
    }
}
