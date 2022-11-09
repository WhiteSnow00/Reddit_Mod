// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import com.squareup.moshi.x;
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

@Metadata(bv = {}, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u0011" }, d2 = { "Lcom/reddit/data/snoovatar/entity/QuickCreateWebsocketResponseJsonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/snoovatar/entity/QuickCreateWebsocketResponseJson;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/snoovatar/entity/RandomSnoovatarJson;", "nullableRandomSnoovatarJsonAdapter", "Lcom/reddit/data/snoovatar/entity/QuickCreateError;", "nullableQuickCreateErrorAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class QuickCreateWebsocketResponseJsonJsonAdapter extends JsonAdapter<QuickCreateWebsocketResponseJson>
{
    private final JsonAdapter<QuickCreateError> nullableQuickCreateErrorAdapter;
    private final JsonAdapter<RandomSnoovatarJson> nullableRandomSnoovatarJsonAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public QuickCreateWebsocketResponseJsonJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "code", "response", "error" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "code");
        this.nullableRandomSnoovatarJsonAdapter = (JsonAdapter<RandomSnoovatarJson>)y.c((Type)RandomSnoovatarJson.class, (Set)instance, "response");
        this.nullableQuickCreateErrorAdapter = (JsonAdapter<QuickCreateError>)y.c((Type)QuickCreateError.class, (Set)instance, "error");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        String s = null;
        Object o2;
        Object o = o2 = null;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            continue;
                        }
                        o2 = this.nullableQuickCreateErrorAdapter.fromJson(jsonReader);
                    }
                    else {
                        o = this.nullableRandomSnoovatarJsonAdapter.fromJson(jsonReader);
                    }
                }
                else {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("code", "code", jsonReader);
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        if (s != null) {
            return new QuickCreateWebsocketResponseJson(s, (RandomSnoovatarJson)o, (QuickCreateError)o2);
        }
        throw a.h("code", "code", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final QuickCreateWebsocketResponseJson quickCreateWebsocketResponseJson = (QuickCreateWebsocketResponseJson)o;
        f.f((Object)x, "writer");
        if (quickCreateWebsocketResponseJson != null) {
            x.h();
            x.w("code");
            this.stringAdapter.toJson(x, (Object)quickCreateWebsocketResponseJson.a);
            x.w("response");
            this.nullableRandomSnoovatarJsonAdapter.toJson(x, (Object)quickCreateWebsocketResponseJson.b);
            x.w("error");
            this.nullableQuickCreateErrorAdapter.toJson(x, (Object)quickCreateWebsocketResponseJson.c);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(QuickCreateWebsocketResponseJson)";
    }
}
