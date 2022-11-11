// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import com.squareup.moshi.x;
import id2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import sg2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001b" }, d2 = { "Lcom/reddit/domain/model/SnoomojiJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/Snoomoji;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lhg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class SnoomojiJsonAdapter extends JsonAdapter<Snoomoji>
{
    private volatile Constructor<Snoomoji> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public SnoomojiJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "url", "created_by", "user_flair_allowed", "post_flair_allowed", "mod_flair_only" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "url");
        this.nullableBooleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.class, (Set)instance, "userFlairAllowed");
    }
    
    public Snoomoji fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        String s = null;
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        Object o4 = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    if (e != 1) {
                        if (e != 2) {
                            if (e != 3) {
                                if (e != 4) {
                                    continue;
                                }
                                o4 = this.nullableBooleanAdapter.fromJson(jsonReader);
                                n &= 0xFFFFFFEF;
                            }
                            else {
                                o3 = this.nullableBooleanAdapter.fromJson(jsonReader);
                                n &= 0xFFFFFFF7;
                            }
                        }
                        else {
                            o2 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n &= 0xFFFFFFFB;
                        }
                    }
                    else {
                        o = this.stringAdapter.fromJson(jsonReader);
                        if (o != null) {
                            continue;
                        }
                        throw a.n("createdBy", "created_by", jsonReader);
                    }
                }
                else {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("url", "url", jsonReader);
                }
            }
            else {
                jsonReader.H();
                jsonReader.F1();
            }
        }
        jsonReader.r();
        if (n == -29) {
            if (s == null) {
                throw a.h("url", "url", jsonReader);
            }
            if (o != null) {
                return new Snoomoji(s, (String)o, (Boolean)o2, (Boolean)o3, (Boolean)o4);
            }
            throw a.h("createdBy", "created_by", jsonReader);
        }
        else {
            Constructor<Snoomoji> constructorRef = this.constructorRef;
            if (constructorRef == null) {
                constructorRef = Snoomoji.class.getDeclaredConstructor(String.class, String.class, Boolean.class, Boolean.class, Boolean.class, Integer.TYPE, a.c);
                e.e((Object)(this.constructorRef = constructorRef), "Snoomoji::class.java.get\u2026his.constructorRef = it }");
            }
            if (s == null) {
                throw a.h("url", "url", jsonReader);
            }
            if (o != null) {
                final Snoomoji instance = constructorRef.newInstance(s, o, o2, o3, o4, n, null);
                e.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
                return instance;
            }
            throw a.h("createdBy", "created_by", jsonReader);
        }
    }
    
    public void toJson(final x x, final Snoomoji snoomoji) {
        e.f((Object)x, "writer");
        if (snoomoji != null) {
            x.h();
            x.u("url");
            this.stringAdapter.toJson(x, (Object)snoomoji.getUrl());
            x.u("created_by");
            this.stringAdapter.toJson(x, (Object)snoomoji.getCreatedBy());
            x.u("user_flair_allowed");
            this.nullableBooleanAdapter.toJson(x, (Object)snoomoji.getUserFlairAllowed());
            x.u("post_flair_allowed");
            this.nullableBooleanAdapter.toJson(x, (Object)snoomoji.getPostFlairAllowed());
            x.u("mod_flair_only");
            this.nullableBooleanAdapter.toJson(x, (Object)snoomoji.getModFlairOnly());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(Snoomoji)";
    }
}
