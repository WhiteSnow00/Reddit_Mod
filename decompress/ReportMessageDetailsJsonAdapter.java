// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

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

@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0019" }, d2 = { "Lcom/reddit/domain/chat/model/ReportMessageDetailsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/chat/model/ReportMessageDetails;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "Lcom/reddit/domain/chat/model/ReportMessageFields;", "reportMessageFieldsAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableListOfReportMessageFieldsAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class ReportMessageDetailsJsonAdapter extends JsonAdapter<ReportMessageDetails>
{
    private final JsonAdapter<List<ReportMessageFields>> nullableListOfReportMessageFieldsAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<ReportMessageFields> reportMessageFieldsAdapter;
    
    public ReportMessageDetailsJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "sendbirdChatMessage", "sendbirdEphemeralChatLog" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.reportMessageFieldsAdapter = (JsonAdapter<ReportMessageFields>)y.c((Type)ReportMessageFields.class, (Set)instance, "sendbirdChatMessage");
        this.nullableListOfReportMessageFieldsAdapter = (JsonAdapter<List<ReportMessageFields>>)y.c((Type)a0.d((Class)List.class, new Type[] { ReportMessageFields.class }), (Set)instance, "sendbirdEphemeralChatLog");
    }
    
    public ReportMessageDetails fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        ReportMessageFields reportMessageFields = null;
        List list = null;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        continue;
                    }
                    list = (List)this.nullableListOfReportMessageFieldsAdapter.fromJson(jsonReader);
                }
                else {
                    reportMessageFields = (ReportMessageFields)this.reportMessageFieldsAdapter.fromJson(jsonReader);
                    if (reportMessageFields != null) {
                        continue;
                    }
                    throw a.n("sendbirdChatMessage", "sendbirdChatMessage", jsonReader);
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        if (reportMessageFields != null) {
            return new ReportMessageDetails(reportMessageFields, list);
        }
        throw a.h("sendbirdChatMessage", "sendbirdChatMessage", jsonReader);
    }
    
    public void toJson(final x x, final ReportMessageDetails reportMessageDetails) {
        f.f((Object)x, "writer");
        if (reportMessageDetails != null) {
            x.h();
            x.w("sendbirdChatMessage");
            this.reportMessageFieldsAdapter.toJson(x, (Object)reportMessageDetails.getSendbirdChatMessage());
            x.w("sendbirdEphemeralChatLog");
            this.nullableListOfReportMessageFieldsAdapter.toJson(x, (Object)reportMessageDetails.getSendbirdEphemeralChatLog());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(ReportMessageDetails)";
    }
}
