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

@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a" }, d2 = { "Lcom/reddit/domain/model/SubredditCategoryJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/SubredditCategory;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lhg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class SubredditCategoryJsonAdapter extends JsonAdapter<SubredditCategory>
{
    private volatile Constructor<SubredditCategory> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public SubredditCategoryJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "category_id", "category_name", "category_color", "category_icon" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "color");
    }
    
    public SubredditCategory fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        String s = null;
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    if (e != 1) {
                        if (e != 2) {
                            if (e != 3) {
                                continue;
                            }
                            o3 = this.nullableStringAdapter.fromJson(jsonReader);
                            n &= 0xFFFFFFF7;
                        }
                        else {
                            o2 = this.nullableStringAdapter.fromJson(jsonReader);
                            n &= 0xFFFFFFFB;
                        }
                    }
                    else {
                        o = this.stringAdapter.fromJson(jsonReader);
                        if (o != null) {
                            continue;
                        }
                        throw a.n("name", "category_name", jsonReader);
                    }
                }
                else {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("id", "category_id", jsonReader);
                }
            }
            else {
                jsonReader.H();
                jsonReader.F1();
            }
        }
        jsonReader.r();
        if (n == -13) {
            if (s == null) {
                throw a.h("id", "category_id", jsonReader);
            }
            if (o != null) {
                return new SubredditCategory(s, (String)o, (String)o2, (String)o3);
            }
            throw a.h("name", "category_name", jsonReader);
        }
        else {
            Constructor<SubredditCategory> constructorRef;
            if ((constructorRef = this.constructorRef) == null) {
                constructorRef = SubredditCategory.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, Integer.TYPE, a.c);
                e.e((Object)(this.constructorRef = constructorRef), "SubredditCategory::class\u2026his.constructorRef = it }");
            }
            if (s == null) {
                throw a.h("id", "category_id", jsonReader);
            }
            if (o != null) {
                final SubredditCategory instance = constructorRef.newInstance(s, o, o2, o3, n, null);
                e.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
                return instance;
            }
            throw a.h("name", "category_name", jsonReader);
        }
    }
    
    public void toJson(final x x, final SubredditCategory subredditCategory) {
        e.f((Object)x, "writer");
        if (subredditCategory != null) {
            x.h();
            x.u("category_id");
            this.stringAdapter.toJson(x, (Object)subredditCategory.getId());
            x.u("category_name");
            this.stringAdapter.toJson(x, (Object)subredditCategory.getName());
            x.u("category_color");
            this.nullableStringAdapter.toJson(x, (Object)subredditCategory.getColor());
            x.u("category_icon");
            this.nullableStringAdapter.toJson(x, (Object)subredditCategory.getIcon());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(SubredditCategory)";
    }
}
