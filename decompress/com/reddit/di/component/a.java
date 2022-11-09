// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.di.component;

import la1.n;
import ah2.f;
import la1.k;
import db0.e;
import com.reddit.domain.model.listing.ReportLinkAnalytics;
import q20.b;
import oa0.d;
import com.reddit.session.q;
import ge0.h0;
import wk0.c;

public final class a
{
    public static k a(final c c, final h0 h0, final r20.c c2, final q q, final d d, final b b, final ReportLinkAnalytics reportLinkAnalytics, final oa1.a a, final e e) {
        f.f((Object)c, "view");
        f.f((Object)h0, "rulesRepository");
        f.f((Object)c2, "postExecutionThread");
        f.f((Object)q, "sessionManager");
        f.f((Object)d, "accountUtilDelegate");
        f.f((Object)b, "resourceProvider");
        f.f((Object)reportLinkAnalytics, "reportLinkAnalytics");
        f.f((Object)a, "netzDgReportingUseCase");
        f.f((Object)e, "consumerSafetyFeatures");
        return new k((n)c, (zg2.a)new ViewStreamModule$providesReportLinkAction$1(q), (zg2.a)new ViewStreamModule$providesReportLinkAction$2(d), reportLinkAnalytics, a, e);
    }
}
