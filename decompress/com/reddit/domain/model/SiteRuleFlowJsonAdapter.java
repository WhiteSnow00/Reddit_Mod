// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import com.squareup.moshi.x;
import dd2.a;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.a0;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ng2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.util.List;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e" }, d2 = { "Lcom/reddit/domain/model/SiteRuleFlowJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/SiteRuleFlow;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lcg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableListOfSiteRuleFlowAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class SiteRuleFlowJsonAdapter extends JsonAdapter<SiteRuleFlow>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<SiteRuleFlow> constructorRef;
    private final JsonAdapter<List<SiteRuleFlow>> nullableListOfSiteRuleFlowAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public SiteRuleFlowJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "reasonTextToShow", "reasonText", "nextStepHeader", "nextStepReasons", "fileComplaint", "complaintUrl", "complaintPrompt", "complaintPageTitle", "complaintButtonText", "requestCrisisSupport" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "reasonTextToShow");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "nextStepHeader");
        this.nullableListOfSiteRuleFlowAdapter = (JsonAdapter<List<SiteRuleFlow>>)y.c((Type)a0.d((Class)List.class, new Type[] { SiteRuleFlow.class }), (Set)instance, "nextStepReasons");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "fileComplaint");
    }
    
    public SiteRuleFlow fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        Boolean false = Boolean.FALSE;
        jsonReader.h();
        int n = -1;
        String s = null;
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        Object o4 = null;
        Object o5 = null;
        Object o6 = null;
        Object o7 = null;
        Boolean b = false;
        while (jsonReader.hasNext()) {
            switch (jsonReader.E(this.options)) {
                default: {
                    continue;
                }
                case 9: {
                    b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b != null) {
                        n &= 0xFFFFFDFF;
                        continue;
                    }
                    throw a.n("requestCrisisSupport", "requestCrisisSupport", jsonReader);
                }
                case 8: {
                    o7 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFEFF;
                    continue;
                }
                case 7: {
                    o6 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFF7F;
                    continue;
                }
                case 6: {
                    o5 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFBF;
                    continue;
                }
                case 5: {
                    o4 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFDF;
                    continue;
                }
                case 4: {
                    false = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (false != null) {
                        n &= 0xFFFFFFEF;
                        continue;
                    }
                    throw a.n("fileComplaint", "fileComplaint", jsonReader);
                }
                case 3: {
                    o3 = this.nullableListOfSiteRuleFlowAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFF7;
                    continue;
                }
                case 2: {
                    o2 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFB;
                    continue;
                }
                case 1: {
                    o = this.stringAdapter.fromJson(jsonReader);
                    if (o != null) {
                        continue;
                    }
                    throw a.n("reasonText", "reasonText", jsonReader);
                }
                case 0: {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("reasonTextToShow", "reasonTextToShow", jsonReader);
                }
                case -1: {
                    jsonReader.H();
                    jsonReader.G1();
                    continue;
                }
            }
        }
        jsonReader.r();
        if (n == -1021) {
            if (s == null) {
                throw a.h("reasonTextToShow", "reasonTextToShow", jsonReader);
            }
            if (o != null) {
                return new SiteRuleFlow(s, (String)o, (String)o2, (List<SiteRuleFlow>)o3, false, (String)o4, (String)o5, (String)o6, (String)o7, b);
            }
            throw a.h("reasonText", "reasonText", jsonReader);
        }
        else {
            Constructor<SiteRuleFlow> constructorRef;
            if ((constructorRef = this.constructorRef) == null) {
                final Class<Boolean> type = Boolean.TYPE;
                constructorRef = SiteRuleFlow.class.getDeclaredConstructor(String.class, String.class, String.class, List.class, type, String.class, String.class, String.class, String.class, type, Integer.TYPE, a.c);
                e.e((Object)(this.constructorRef = constructorRef), "SiteRuleFlow::class.java\u2026his.constructorRef = it }");
            }
            if (s == null) {
                throw a.h("reasonTextToShow", "reasonTextToShow", jsonReader);
            }
            if (o != null) {
                final SiteRuleFlow instance = constructorRef.newInstance(s, o, o2, o3, false, o4, o5, o6, o7, b, n, null);
                e.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
                return instance;
            }
            throw a.h("reasonText", "reasonText", jsonReader);
        }
    }
    
    public /* bridge */ Object fromJson(final JsonReader jsonReader) {
        return this.fromJson(jsonReader);
    }
    
    public void toJson(final x x, final SiteRuleFlow siteRuleFlow) {
        e.f((Object)x, "writer");
        if (siteRuleFlow != null) {
            x.h();
            x.v("reasonTextToShow");
            this.stringAdapter.toJson(x, (Object)siteRuleFlow.getReasonTextToShow());
            x.v("reasonText");
            this.stringAdapter.toJson(x, (Object)siteRuleFlow.getReasonText());
            x.v("nextStepHeader");
            this.nullableStringAdapter.toJson(x, (Object)siteRuleFlow.getNextStepHeader());
            x.v("nextStepReasons");
            this.nullableListOfSiteRuleFlowAdapter.toJson(x, (Object)siteRuleFlow.getNextStepReasons());
            x.v("fileComplaint");
            this.booleanAdapter.toJson(x, (Object)siteRuleFlow.getFileComplaint());
            x.v("complaintUrl");
            this.nullableStringAdapter.toJson(x, (Object)siteRuleFlow.getComplaintUrl());
            x.v("complaintPrompt");
            this.nullableStringAdapter.toJson(x, (Object)siteRuleFlow.getComplaintPrompt());
            x.v("complaintPageTitle");
            this.nullableStringAdapter.toJson(x, (Object)siteRuleFlow.getComplaintPageTitle());
            x.v("complaintButtonText");
            this.nullableStringAdapter.toJson(x, (Object)siteRuleFlow.getComplaintButtonText());
            x.v("requestCrisisSupport");
            this.booleanAdapter.toJson(x, (Object)siteRuleFlow.getRequestCrisisSupport());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public /* bridge */ void toJson(final x x, final Object o) {
        this.toJson(x, (SiteRuleFlow)o);
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(SiteRuleFlow)";
    }
}
