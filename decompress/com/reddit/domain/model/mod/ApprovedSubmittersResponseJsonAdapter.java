// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.mod;

import com.squareup.moshi.x;
import dd2.a;
import com.squareup.moshi.JsonReader;
import dd2.a$b;
import java.util.Set;
import kotlin.collections.EmptySet;
import com.squareup.moshi.a0;
import java.lang.reflect.Type;
import ng2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.util.Map;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a�\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004�\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00100\u00018\u0002X\u0082\u0004�\u0006\u0006\n\u0004\b\u0011\u0010\u0012R&\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u00130\u00018\u0002X\u0082\u0004�\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004�\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004�\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004�\u0006\u0006\n\u0004\b\u0019\u0010\u0012�\u0006\u001e" }, d2 = { "Lcom/reddit/domain/model/mod/ApprovedSubmittersResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/mod/ApprovedSubmittersResponse;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lcg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "listOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/reddit/domain/model/mod/ApprovedSubmitter;", "mapOfStringApprovedSubmitterAdapter", "nullableStringAdapter", "", "booleanAdapter", "stringAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class ApprovedSubmittersResponseJsonAdapter extends JsonAdapter<ApprovedSubmittersResponse>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<Map<String, ApprovedSubmitter>> mapOfStringApprovedSubmitterAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public ApprovedSubmittersResponseJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "approvedSubmitterIds", "approvedSubmitters", "after", "allUsersLoaded", "subredditId" });
        final a$b d = a0.d((Class)List.class, new Type[] { String.class });
        final EmptySet instance = EmptySet.INSTANCE;
        this.listOfStringAdapter = (JsonAdapter<List<String>>)y.c((Type)d, (Set)instance, "approvedSubmitterIds");
        this.mapOfStringApprovedSubmitterAdapter = (JsonAdapter<Map<String, ApprovedSubmitter>>)y.c((Type)a0.d((Class)Map.class, new Type[] { String.class, ApprovedSubmitter.class }), (Set)instance, "approvedSubmittersMap");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "token");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "allUsersLoaded");
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "subredditId");
    }
    
    public ApprovedSubmittersResponse fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        Boolean b = null;
        List list = null;
        Object o = null;
        Object o3;
        Object o2 = o3 = o;
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
                                o3 = this.stringAdapter.fromJson(jsonReader);
                                if (o3 != null) {
                                    continue;
                                }
                                throw a.n("subredditId", "subredditId", jsonReader);
                            }
                            else {
                                b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                if (b != null) {
                                    continue;
                                }
                                throw a.n("allUsersLoaded", "allUsersLoaded", jsonReader);
                            }
                        }
                        else {
                            o2 = this.nullableStringAdapter.fromJson(jsonReader);
                        }
                    }
                    else {
                        o = this.mapOfStringApprovedSubmitterAdapter.fromJson(jsonReader);
                        if (o != null) {
                            continue;
                        }
                        throw a.n("approvedSubmittersMap", "approvedSubmitters", jsonReader);
                    }
                }
                else {
                    list = (List)this.listOfStringAdapter.fromJson(jsonReader);
                    if (list != null) {
                        continue;
                    }
                    throw a.n("approvedSubmitterIds", "approvedSubmitterIds", jsonReader);
                }
            }
            else {
                jsonReader.H();
                jsonReader.G1();
            }
        }
        jsonReader.r();
        if (list == null) {
            throw a.h("approvedSubmitterIds", "approvedSubmitterIds", jsonReader);
        }
        if (o == null) {
            throw a.h("approvedSubmittersMap", "approvedSubmitters", jsonReader);
        }
        if (b == null) {
            throw a.h("allUsersLoaded", "allUsersLoaded", jsonReader);
        }
        final boolean booleanValue = b;
        if (o3 != null) {
            return new ApprovedSubmittersResponse(list, (Map)o, (String)o2, booleanValue, (String)o3);
        }
        throw a.h("subredditId", "subredditId", jsonReader);
    }
    
    public /* bridge */ Object fromJson(final JsonReader jsonReader) {
        return this.fromJson(jsonReader);
    }
    
    public void toJson(final x x, final ApprovedSubmittersResponse approvedSubmittersResponse) {
        e.f((Object)x, "writer");
        if (approvedSubmittersResponse != null) {
            x.h();
            x.v("approvedSubmitterIds");
            this.listOfStringAdapter.toJson(x, (Object)approvedSubmittersResponse.getApprovedSubmitterIds());
            x.v("approvedSubmitters");
            this.mapOfStringApprovedSubmitterAdapter.toJson(x, (Object)approvedSubmittersResponse.getApprovedSubmittersMap());
            x.v("after");
            this.nullableStringAdapter.toJson(x, (Object)approvedSubmittersResponse.getToken());
            x.v("allUsersLoaded");
            this.booleanAdapter.toJson(x, (Object)approvedSubmittersResponse.getAllUsersLoaded());
            x.v("subredditId");
            this.stringAdapter.toJson(x, (Object)approvedSubmittersResponse.getSubredditId());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public /* bridge */ void toJson(final x x, final Object o) {
        this.toJson(x, (ApprovedSubmittersResponse)o);
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(ApprovedSubmittersResponse)";
    }
}
