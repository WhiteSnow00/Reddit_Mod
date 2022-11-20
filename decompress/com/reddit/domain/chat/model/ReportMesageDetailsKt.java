// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import java.util.Iterator;
import java.util.ArrayList;
import dg2.m;
import ng2.e;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¨\u0006\u0006" }, d2 = { "getMessageDetailsReportFrom", "Lcom/reddit/domain/chat/model/ReportMessageDetails;", "message", "Lcom/reddit/domain/chat/model/HasUserMessageData;", "log", "", "domain_release" }, k = 2, mv = { 1, 7, 1 }, xi = 48)
public final class ReportMesageDetailsKt
{
    public static final ReportMessageDetails getMessageDetailsReportFrom(final HasUserMessageData hasUserMessageData, final List<? extends HasUserMessageData> list) {
        e.f((Object)hasUserMessageData, "message");
        final ReportMessageFields reportMessageFields = ReportMessageKt.getReportMessageFieldsFrom(hasUserMessageData);
        ArrayList list3;
        if (list != null) {
            final ArrayList list2 = new ArrayList(m.u4((Iterable)list, 10));
            final Iterator<Object> iterator = list.iterator();
            while (true) {
                list3 = list2;
                if (!iterator.hasNext()) {
                    break;
                }
                list2.add((Object)ReportMessageKt.getReportMessageFieldsFrom(iterator.next()));
            }
        }
        else {
            list3 = null;
        }
        return new ReportMessageDetails(reportMessageFields, list3);
    }
}
