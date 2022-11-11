// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.model;

import com.squareup.moshi.x;
import id2.a;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.a0;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import sg2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\b¨\u0006\u0014" }, d2 = { "Lcom/reddit/vault/model/CopyResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/vault/model/CopyResponse;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "Lcom/reddit/vault/model/IntroCopyResponse;", "introCopyResponseAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/reddit/vault/model/FaqCopyGroupResponse;", "listOfFaqCopyGroupResponseAdapter", "Lcom/reddit/vault/model/LearnMoreCopyResponse;", "learnMoreCopyResponseAdapter", "Lcom/reddit/vault/model/ClaimCtaCopyResponse;", "claimCtaCopyResponseAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "impl_release" }, k = 1, mv = { 1, 7, 1 })
public final class CopyResponseJsonAdapter extends JsonAdapter<CopyResponse>
{
    public static final int $stable = 8;
    private final JsonAdapter<ClaimCtaCopyResponse> claimCtaCopyResponseAdapter;
    private final JsonAdapter<IntroCopyResponse> introCopyResponseAdapter;
    private final JsonAdapter<LearnMoreCopyResponse> learnMoreCopyResponseAdapter;
    private final JsonAdapter<List<FaqCopyGroupResponse>> listOfFaqCopyGroupResponseAdapter;
    private final JsonReader$b options;
    
    public CopyResponseJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "intro", "faq", "learnMore", "claimCta" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.introCopyResponseAdapter = (JsonAdapter<IntroCopyResponse>)y.c((Type)IntroCopyResponse.class, (Set)instance, "intro");
        this.listOfFaqCopyGroupResponseAdapter = (JsonAdapter<List<FaqCopyGroupResponse>>)y.c((Type)a0.d((Class)List.class, new Type[] { FaqCopyGroupResponse.class }), (Set)instance, "faq");
        this.learnMoreCopyResponseAdapter = (JsonAdapter<LearnMoreCopyResponse>)y.c((Type)LearnMoreCopyResponse.class, (Set)instance, "learnMore");
        this.claimCtaCopyResponseAdapter = (JsonAdapter<ClaimCtaCopyResponse>)y.c((Type)ClaimCtaCopyResponse.class, (Set)instance, "claimCta");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        IntroCopyResponse introCopyResponse = null;
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
                                continue;
                            }
                            o3 = this.claimCtaCopyResponseAdapter.fromJson(jsonReader);
                            if (o3 != null) {
                                continue;
                            }
                            throw a.n("claimCta", "claimCta", jsonReader);
                        }
                        else {
                            o2 = this.learnMoreCopyResponseAdapter.fromJson(jsonReader);
                            if (o2 != null) {
                                continue;
                            }
                            throw a.n("learnMore", "learnMore", jsonReader);
                        }
                    }
                    else {
                        o = this.listOfFaqCopyGroupResponseAdapter.fromJson(jsonReader);
                        if (o != null) {
                            continue;
                        }
                        throw a.n("faq", "faq", jsonReader);
                    }
                }
                else {
                    introCopyResponse = (IntroCopyResponse)this.introCopyResponseAdapter.fromJson(jsonReader);
                    if (introCopyResponse != null) {
                        continue;
                    }
                    throw a.n("intro", "intro", jsonReader);
                }
            }
            else {
                jsonReader.H();
                jsonReader.F1();
            }
        }
        jsonReader.r();
        if (introCopyResponse == null) {
            throw a.h("intro", "intro", jsonReader);
        }
        if (o == null) {
            throw a.h("faq", "faq", jsonReader);
        }
        if (o2 == null) {
            throw a.h("learnMore", "learnMore", jsonReader);
        }
        if (o3 != null) {
            return new CopyResponse(introCopyResponse, (List)o, (LearnMoreCopyResponse)o2, (ClaimCtaCopyResponse)o3);
        }
        throw a.h("claimCta", "claimCta", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final CopyResponse copyResponse = (CopyResponse)o;
        e.f((Object)x, "writer");
        if (copyResponse != null) {
            x.h();
            x.u("intro");
            this.introCopyResponseAdapter.toJson(x, (Object)copyResponse.a);
            x.u("faq");
            this.listOfFaqCopyGroupResponseAdapter.toJson(x, (Object)copyResponse.b);
            x.u("learnMore");
            this.learnMoreCopyResponseAdapter.toJson(x, (Object)copyResponse.c);
            x.u("claimCta");
            this.claimCtaCopyResponseAdapter.toJson(x, (Object)copyResponse.d);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(CopyResponse)";
    }
}
